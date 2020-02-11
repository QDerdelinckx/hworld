package be.derdelinckx.DAL.DAO;

import be.derdelinckx.DAL.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
}
