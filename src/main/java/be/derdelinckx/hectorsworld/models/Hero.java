package be.derdelinckx.hectorsworld.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Hero {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String skin;
    private String name;
    private String description;
    private Integer level;
    private Integer strength;
    private Integer intelligence;
    private Integer charisma;
    private Integer luck;

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Skill> skills = new HashSet<Skill>();

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Item> items = new HashSet<Item>();

    public Hero(String skin, String name, String description, Integer strength, Integer intelligence, Integer charisma, Integer luck){
        this.skin = skin;
        this.name = name;
        this.description = description;
        this.level = 1;
        this.strength = strength;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.luck = luck;
    }

    public Hero() {
    }
}
