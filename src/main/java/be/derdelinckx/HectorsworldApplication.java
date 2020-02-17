package be.derdelinckx;

import be.derdelinckx.DAL.DAO.HeroDAO;
import be.derdelinckx.DAL.DAO.UserDAO;
import be.derdelinckx.DAL.entities.Hero;
import be.derdelinckx.DAL.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class HectorsworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HectorsworldApplication.class, args);
	}

	@Autowired
	private UserDAO userDAO;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@EventListener(ApplicationReadyEvent.class)
	public void addUser(){
		User user = new User();
		user.setUsername("a");
		user.setPassword(passwordEncoder.encode("a"));
		user.setEmail("a@a");
		user.setCrystals(99999);
		user.setGold(99999);
		User user2 = new User();
		user2.setUsername("ManiaxSkell");
		user2.setPassword(passwordEncoder.encode("spiraleyes27"));
		user2.setEmail("quentin.derdelinckx@gmail.com");
		user2.setCrystals(99999);
		user2.setGold(99999);
		userDAO.save(user);
		userDAO.save(user2);
	}
}
