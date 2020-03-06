package be.derdelinckx.DTO.Episode;

import be.derdelinckx.DAL.DAO.EpisodeDAO;
import be.derdelinckx.DAL.entities.Episode;
import be.derdelinckx.DAL.entities.EpisodeOption;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EpisodeDTO {
    private Long id;
    private String story;
    private List<EpisodeOptionDTO> episodeOptions;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public List<EpisodeOptionDTO> getEpisodeOptions() {
        return episodeOptions;
    }

    public void setEpisodeOptions(List<EpisodeOptionDTO> episodeOptions) {
        this.episodeOptions = episodeOptions;
    }

    public EpisodeDTO(){}
    public EpisodeDTO(Episode episode){
        this.id = episode.getId();
        this.story = episode.getStory();
        this.episodeOptions = episode.getEpisodeOptions().stream().map(EpisodeOptionDTO::new).collect(Collectors.toList());
    }
}
