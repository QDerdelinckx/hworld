package be.derdelinckx.DTO.Episode;

import be.derdelinckx.DAL.entities.Archetypes;
import be.derdelinckx.DAL.entities.Requirement;

public class RequirementDTO {

    private Long id;
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

    public RequirementDTO() {}
    public RequirementDTO(Requirement requirement){
        this.id = requirement.getId();
        this.archetype = requirement.getArchetype();
        this.requiredScore = requirement.getRequiredScore();
    }


}
