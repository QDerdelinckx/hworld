package be.derdelinckx.DAL.DAO;

import be.derdelinckx.DAL.entities.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HeroDAO extends JpaRepository<Hero, Long> {
    @Query("SELECT h FROM Hero h WHERE h.faction.id = :id")
    public List<Hero> findByFactionId(@Param("id") Long id);

    @Query("SELECT h FROM Hero h WHERE :#{#crystals} is null OR h.price <= :#{#crystals}")
    public List<Hero> filterByCost(@Param("crystals") Integer crystals);
}
