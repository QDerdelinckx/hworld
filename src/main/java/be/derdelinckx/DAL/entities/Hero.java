package be.derdelinckx.DAL.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Hero {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String skin;
    private String name;
    private String description;
    private Integer level;
    private Integer strength;
    private Integer intelligence;
    private Integer charisma;
    private Integer luck;
    private Integer price;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<Skill> skills = new HashSet<Skill>();

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Faction faction;

    public Long getId() {
        return id;
    }

    public String getSkin() {
        return skin;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public Integer getLuck() {
        return luck;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public Faction getFaction() { return faction; }

    public Integer getPrice() { return price; }

    public Hero(String skin, String name, String description, Integer strength, Integer intelligence, Integer charisma, Integer luck, Integer price){
        this.skin = skin;
        this.name = name;
        this.description = description;
        this.level = 1;
        this.strength = strength;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.luck = luck;
        this.price = price;
    }

    public Hero() {
    }
}
