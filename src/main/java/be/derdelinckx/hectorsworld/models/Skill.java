package be.derdelinckx.hectorsworld.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String skin;
    private Integer score;

    public Skill(String name, String skin, Integer score) {
        this.name = name;
        this.skin = skin;
        this.score = score;
    }

    public Skill() {
    }
}
