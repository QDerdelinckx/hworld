package be.derdelinckx.DAL.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class EpisodeOption {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    @ManyToMany (cascade = CascadeType.PERSIST)
    private Set<Requirement> requirements = new HashSet<Requirement>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(Set<Requirement> requirements) {
        this.requirements = requirements;
    }

    public EpisodeOption(String description, Set<Requirement> requirements) {
        this.description = description;
        this.requirements = requirements;
    }

    public EpisodeOption() {
    }
}
