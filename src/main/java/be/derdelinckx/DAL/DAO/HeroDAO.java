package be.derdelinckx.DAL.DAO;

import be.derdelinckx.DAL.entities.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroDAO extends JpaRepository<Hero, Long> {
}
