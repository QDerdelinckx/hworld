package be.derdelinckx.DAL.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Item {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String skin;

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Bonus> bonus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Set<Bonus> getBonus() {
        return bonus;
    }

    public void setBonus(Set<Bonus> bonus) {
        this.bonus = bonus;
    }

    public Item(String name, String skin, Set<Bonus> bonus) {
        this.name = name;
        this.skin = skin;
        this.bonus = bonus;
    }

    public Item() {
    }
}
