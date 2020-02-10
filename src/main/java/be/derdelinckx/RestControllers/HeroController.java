package be.derdelinckx.RestControllers;

import be.derdelinckx.DAL.DAO.HeroDAO;
import be.derdelinckx.DAL.entities.Hero;
import be.derdelinckx.DTO.Hero.HeroDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/hero")
public class HeroController {

    private final HeroDAO heroDAO;

    public HeroController(HeroDAO heroDAO) {
        this.heroDAO = heroDAO;
    }

    @GetMapping("")
    public ResponseEntity<List<HeroDTO>> getAll(){
        List<Hero> heroes = heroDAO.findAll();
        System.out.println(heroes);

        return ResponseEntity.ok(heroes.stream().map(HeroDTO::new).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hero> getById(@PathVariable Long id){
        Hero hero = heroDAO.findById(id).orElse(null);

        return ResponseEntity.ok(hero);
    }

}
