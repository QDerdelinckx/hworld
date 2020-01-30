package be.derdelinckx.hectorsworld.models;

import javax.persistence.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nickname;
    private String email;
    private String password;
    private Integer gold;
    private Integer crystals;

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Hero> heroes = new HashSet<Hero>();

    public User(String nickname, String email, String password){
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.gold = 100;
        this.crystals = 100;
    }

    public User() {
    }
}
