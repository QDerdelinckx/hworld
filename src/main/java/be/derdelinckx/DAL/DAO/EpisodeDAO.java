package be.derdelinckx.DAL.DAO;

import be.derdelinckx.DAL.entities.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeDAO extends JpaRepository<Episode, Long> {
}
