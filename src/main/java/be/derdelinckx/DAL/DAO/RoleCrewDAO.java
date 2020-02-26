package be.derdelinckx.DAL.DAO;

import be.derdelinckx.DAL.entities.RoleCrew;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleCrewDAO extends JpaRepository<RoleCrew,Long> {

    RoleCrew findByName(String name);
}
