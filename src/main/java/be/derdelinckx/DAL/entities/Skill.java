package be.derdelinckx.DAL.entities;

import javax.persistence.*;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String skin;
    private Integer score;
    @Enumerated(EnumType.STRING)
    private Archetypes archetype1;
    @Enumerated(EnumType.STRING)
    private Archetypes archetype2;

    public Long getId() {
        return id;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getArchetype1() {
        return archetype1.getArchetype_name();
    }

    public void setArchetype1(Archetypes archetype1) {
        this.archetype1 = archetype1;
    }

    public String getArchetype2() {
        return archetype2.getArchetype_name();
    }

    public void setArchetype2(Archetypes archetype2) {
        this.archetype2 = archetype2;
    }

    public Skill(String name, String skin, Integer score) {
        this.name = name;
        this.skin = skin;
        this.score = score;
    }

    public Skill() {
    }
}
