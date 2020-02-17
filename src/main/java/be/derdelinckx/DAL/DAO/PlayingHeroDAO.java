package be.derdelinckx.DAL.DAO;

import be.derdelinckx.DAL.entities.PlayingHero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayingHeroDAO extends JpaRepository<PlayingHero, Long> {
}
