package be.derdelinckx.RestControllers;

import be.derdelinckx.DAL.DAO.EpisodeDAO;
import be.derdelinckx.DAL.entities.Episode;
import be.derdelinckx.DTO.Episode.EpisodeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api/episode")
public class EpisodeController {

    private final EpisodeDAO episodeDAO;

    public EpisodeController(EpisodeDAO episodeDAO) {
        this.episodeDAO = episodeDAO;
    }

    @GetMapping("")
    public ResponseEntity<List<EpisodeDTO>> getAll(){
        List<Episode> roleCrewList = episodeDAO.findAll();

        return ResponseEntity.ok(roleCrewList.stream().map(EpisodeDTO::new).collect(Collectors.toList()));
    }
}
