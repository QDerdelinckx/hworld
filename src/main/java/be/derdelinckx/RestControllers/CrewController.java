package be.derdelinckx.RestControllers;

import be.derdelinckx.DAL.DAO.HeroDAO;
import be.derdelinckx.DAL.DAO.PlayingHeroDAO;
import be.derdelinckx.DAL.DAO.RoleCrewDAO;
import be.derdelinckx.DAL.entities.PlayingHero;
import be.derdelinckx.DAL.entities.RoleCrew;
import be.derdelinckx.DTO.Hero.PlayingHeroDTO;
import be.derdelinckx.DTO.Role.RoleCrewDTO;
import javassist.compiler.NoFieldException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api/crew")
public class CrewController {

    private final RoleCrewDAO roleCrewDAO;
    private final HeroDAO heroDAO;
    private final PlayingHeroDAO playingHeroDAO;

    public CrewController(RoleCrewDAO roleCrewDAO, HeroDAO heroDAO, PlayingHeroDAO playingHeroDAO) {
        this.roleCrewDAO = roleCrewDAO;
        this.heroDAO = heroDAO;
        this.playingHeroDAO = playingHeroDAO;
    }

    @GetMapping("")
    public ResponseEntity<List<RoleCrewDTO>> getAll(){
        List<RoleCrew> roleCrewList = roleCrewDAO.findAll();

        return ResponseEntity.ok(roleCrewList.stream().map(RoleCrewDTO::new).collect(Collectors.toList()));
    }

    @PostMapping("")
    public ResponseEntity addRoleCrew (@RequestBody PlayingHeroDTO playingHeroDTO)
    {
        PlayingHero myHero = playingHeroDAO.findById(playingHeroDTO.getId()).orElse(null);
        RoleCrew roleCrew = roleCrewDAO.findByName(playingHeroDTO.getRoleCrew().getName());
        myHero.setRoleCrew(roleCrew);

        return ResponseEntity.ok( playingHeroDAO.save(myHero));
    }
}
