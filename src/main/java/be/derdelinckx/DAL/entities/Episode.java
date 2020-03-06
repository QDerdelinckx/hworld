package be.derdelinckx.DAL.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Episode {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quest_sequence;
    private String story;
    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<EpisodeOption> episodeOptions = new HashSet<EpisodeOption>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuest_sequence() {
        return quest_sequence;
    }

    public void setQuest_sequence(Integer quest_sequence) {
        this.quest_sequence = quest_sequence;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Set<EpisodeOption> getEpisodeOptions() {
        return episodeOptions;
    }

    public void setEpisodeOptions(Set<EpisodeOption> episodeOptions) {
        this.episodeOptions = episodeOptions;
    }

    public Episode(Integer quest_sequence, String story, Set<EpisodeOption> episodeOptions) {
        this.quest_sequence = quest_sequence;
        this.story = story;
        this.episodeOptions = episodeOptions;
    }

    public Episode() {
    }
}
