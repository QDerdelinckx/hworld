package be.derdelinckx.DAL.DAO;

import be.derdelinckx.DAL.entities.Faction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactionDAO extends JpaRepository<Faction, Long> {
}
