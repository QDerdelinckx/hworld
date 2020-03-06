package be.derdelinckx.DTO.Episode;

import be.derdelinckx.DAL.entities.Episode;
import be.derdelinckx.DAL.entities.EpisodeOption;
import be.derdelinckx.DAL.entities.Requirement;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EpisodeOptionDTO {

    private Long id;
    private String description;
    private List<RequirementDTO> requirements;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RequirementDTO> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<RequirementDTO> requirements) {
        this.requirements = requirements;
    }

    public EpisodeOptionDTO() { }

    public EpisodeOptionDTO(EpisodeOption episodeOption) {
        this.id = episodeOption.getId();
        this.description = episodeOption.getDescription();
        this.requirements = episodeOption.getRequirements().stream().map(RequirementDTO::new).collect(Collectors.toList());
    }
}
