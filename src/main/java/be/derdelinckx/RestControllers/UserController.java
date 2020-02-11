package be.derdelinckx.RestControllers;

import be.derdelinckx.DAL.DAO.UserDAO;
import be.derdelinckx.DAL.entities.User;
import be.derdelinckx.DTO.User.UserDTO;
import org.omg.CORBA.RepositoryIdHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserDAO userDao;

    public UserController(UserDAO userDao) {
        this.userDao = userDao;
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

}
