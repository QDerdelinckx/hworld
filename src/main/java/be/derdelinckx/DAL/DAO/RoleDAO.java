package be.derdelinckx.DAL.DAO;

import be.derdelinckx.DAL.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDAO extends JpaRepository<Role,Long> {
}
