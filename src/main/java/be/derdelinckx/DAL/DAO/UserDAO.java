package be.derdelinckx.DAL.DAO;

import be.derdelinckx.DAL.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDAO extends JpaRepository<User, Long> {
    Optional<User> findByNickname(String login);
}
