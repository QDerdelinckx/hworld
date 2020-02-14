package be.derdelinckx.DAL.DAO;

import be.derdelinckx.DAL.entities.PlayingHero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayingHeroDAO extends JpaRepository<PlayingHero, Long> {
}
