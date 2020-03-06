package be.derdelinckx.DAL.entities;

import javax.persistence.*;

@Entity
public class Requirement {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Archetypes archetype;
    private Integer requiredScore;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Archetypes getArchetype() {
        return archetype;
    }

    public void setArchetype(Archetypes archetype) {
        this.archetype = archetype;
    }

    public Integer getRequiredScore() {
        return requiredScore;
    }

    public void setRequiredScore(Integer requiredScore) {
        this.requiredScore = requiredScore;
    }

    public Requirement(Archetypes archetype, Integer requiredScore) {
        this.archetype = archetype;
        this.requiredScore = requiredScore;
    }

    public Requirement() {
    }
}
