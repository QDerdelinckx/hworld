package be.derdelinckx.RestControllers;

import be.derdelinckx.DAL.DAO.PlayingHeroDAO;
import be.derdelinckx.DAL.DAO.UserDAO;
import be.derdelinckx.DAL.entities.PlayingHero;
import be.derdelinckx.DAL.entities.User;
import be.derdelinckx.DTO.Hero.PlayingHeroDTO;
import be.derdelinckx.DTO.User.UserDTO;
import org.omg.CORBA.RepositoryIdHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserDAO userDao;
    private final PlayingHeroDAO playingHeroDao;

    public UserController(UserDAO userDao, PlayingHeroDAO playingHeroDao) {
        this.userDao = userDao;
        this.playingHeroDao = playingHeroDao;
    }

    @GetMapping("")
    public ResponseEntity<List<UserDTO>> getAll(){
        List<User> users = userDao.findAll();

        return ResponseEntity.ok(users.stream().map(UserDTO::new).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id){
        User user = userDao.findById(id).orElse(null);

        return ResponseEntity.ok(user);
    }

    @GetMapping("/{id}/heroes")
    public ResponseEntity<List<PlayingHeroDTO>> getAllHeroesByUser(@PathVariable Long id){
        User user = userDao.findById(id).orElse(null);

        return ResponseEntity.ok(user.getHeroes().stream().map(PlayingHeroDTO::new).collect(Collectors.toList()));
    }

}
