package be.derdelinckx.DAL.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;
    private String email;
    private String password;
    private Integer gold;
    private Integer crystals;

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Hero> heroes = new HashSet<Hero>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getCrystals() {
        return crystals;
    }

    public void setCrystals(Integer crystals) {
        this.crystals = crystals;
    }

    public Set<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(Set<Hero> heroes) {
        this.heroes = heroes;
    }

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
