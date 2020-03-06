package be.derdelinckx.RestControllers;

import be.derdelinckx.BL.ShopService;
import be.derdelinckx.DAL.DAO.HeroDAO;
import be.derdelinckx.DAL.DAO.PlayingHeroDAO;
import be.derdelinckx.DAL.DAO.UserDAO;
import be.derdelinckx.DAL.entities.Hero;
import be.derdelinckx.DAL.entities.PlayingHero;
import be.derdelinckx.DAL.entities.Skill;
import be.derdelinckx.DAL.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;
import java.util.stream.Collectors;

@Controller
@CrossOrigin
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private HeroDAO heroDAO;

    @Autowired
    private PlayingHeroDAO playingHeroDAO;

    @Autowired
    private UserDAO userDAO;

    @PostMapping("/buy/{id}/{userId}")
    public ResponseEntity getById(@PathVariable Long id, @PathVariable Long userId){

        //Récupération des données du héros choisi et de l'user courant
        Hero chosenHero = heroDAO.findById(id).orElse(null);
        User currentUser = userDAO.findById(userId).orElse(null);
        ShopService shopService = new ShopService();

        //Vérification du budget
        if(shopService.verifyCrystals(currentUser, chosenHero)) {

            //Clonage du héros
            PlayingHero newHero = shopService.cloneHero(chosenHero);
            playingHeroDAO.save(newHero);

            //Sauvegarde du héros dans la liste du joueur
            userDAO.save(shopService.buyAndUpdate(currentUser, newHero, chosenHero));

        }
        return ResponseEntity.ok(null);
    }

}
