package be.derdelinckx.RestControllers;

import be.derdelinckx.DAL.DAO.FactionDAO;
import be.derdelinckx.DAL.entities.Faction;
import be.derdelinckx.DTO.Faction.FactionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api/faction")
public class FactionController {

    public final FactionDAO factionDAO;

    public FactionController(FactionDAO factionDAO) {
        this.factionDAO = factionDAO;
    }

    @GetMapping("")
    public ResponseEntity<List<FactionDTO>> getAll(){
        List<Faction> factions = factionDAO.findAll();

        return ResponseEntity.ok(factions.stream().map(FactionDTO::new).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Faction> getById(@PathVariable Long id){
        Faction faction = factionDAO.findById(id).orElse(null);

        return ResponseEntity.ok(faction);
    }
}
