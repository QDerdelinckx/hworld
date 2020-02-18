package be.derdelinckx.RestControllers;

import be.derdelinckx.DAL.DAO.HeroDAO;
import be.derdelinckx.DAL.DAO.PlayingHeroDAO;
import be.derdelinckx.DAL.DAO.UserDAO;
import be.derdelinckx.DAL.entities.Hero;
import be.derdelinckx.DAL.entities.PlayingHero;
import be.derdelinckx.DAL.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

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

        Hero chosenHero = heroDAO.findById(id).orElse(null);
        PlayingHero newHero = new PlayingHero();

        newHero.setSkin(chosenHero.getSkin());
        newHero.setName(chosenHero.getName());
        newHero.setDescription(chosenHero.getDescription());
        newHero.setLevel(1);
        newHero.setStrength(chosenHero.getStrength());
        newHero.setIntelligence(chosenHero.getIntelligence());
        newHero.setCharisma(chosenHero.getCharisma());
        newHero.setLuck(chosenHero.getLuck());
        newHero.setFaction(chosenHero.getFaction());

        playingHeroDAO.save(newHero);

        User currentUser = userDAO.findById(userId).orElse(null);
        Integer currentUserGold = currentUser.getGold();
        Set<PlayingHero> currentUserHeroes = currentUser.getHeroes();

        currentUserHeroes.add(newHero);
        currentUser.setGold(currentUserGold - chosenHero.getPrice());

        userDAO.save(currentUser);

        return ResponseEntity.ok(null);
    }

}
