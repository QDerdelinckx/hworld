package be.derdelinckx.RestControllers;

import be.derdelinckx.DAL.DAO.UserDAO;
import be.derdelinckx.DAL.entities.User;
import be.derdelinckx.DTO.AuthenticationRequest;
import be.derdelinckx.config.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    UserDAO userDAO;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthenticationRequest data) {
        System.out.println(data);
        String username = data.getUsername();
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, data.getPassword()));
        User u = this.userDAO.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        String token = jwtTokenProvider.createToken(username);

        Map<Object, Object> model = new HashMap<>();
        model.put("id", u.getId());
        model.put("username", username);
        model.put("gold", u.getGold());
        model.put("crystals", u.getCrystals());
        model.put("token", token);
        return ResponseEntity.ok(model);
    }
}
