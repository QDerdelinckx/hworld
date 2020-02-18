package be.derdelinckx;

import be.derdelinckx.DAL.DAO.HeroDAO;
import be.derdelinckx.DAL.DAO.UserDAO;
import be.derdelinckx.DAL.entities.Hero;
import be.derdelinckx.DAL.entities.PlayingHero;
import be.derdelinckx.DAL.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Set;

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
			User user = new User("a", "a@a", null, 99999, 99999);
			user.setPassword(passwordEncoder.encode("a"));
			User user2 = new User("ManiaxSkell", "quentin.derdelinckx@gmail.com", null, 99999, 99999);
			user2.setPassword(passwordEncoder.encode("spiraleyes27"));

		//        PlayingHero playingHero = new PlayingHero("hector.png", "Hector", "Illustre Commandant", 2, 6, 8, 4);
		//        PlayingHero playingHero2 = new PlayingHero("lewies.png", "Lewie Scarowl", "Contrebandier Illusionniste", 4, 10, 3, 3);
		//        Set<PlayingHero> userHeroes = new HashSet<PlayingHero>();
		//        userHeroes.add(playingHero);
		//        userHeroes.add(playingHero2);
		//        user.setHeroes(userHeroes);
		//
		        userDAO.save(user);
		       userDAO.save(user2);
		}
}
