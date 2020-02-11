package be.derdelinckx.DTO.Faction;

import be.derdelinckx.DAL.entities.Faction;
import be.derdelinckx.DTO.Hero.HeroDTO;

import java.util.List;
import java.util.stream.Collectors;

public class FactionDTO {
    private Long id;
    private String faction_name;
    private String faction_alignment;
    private String faction_skin;
//    private List<HeroDTO> heroes;

    public Long getId() {
        return id;
    }

    public String getFaction_name() {
        return faction_name;
    }

    public void setFaction_name(String faction_name) {
        this.faction_name = faction_name;
    }

    public String getFaction_alignment() {
        return faction_alignment;
    }

    public void setFaction_alignment(String faction_alignment) {
        this.faction_alignment = faction_alignment;
    }

    public String getFaction_skin() {
        return faction_skin;
    }

    public void setFaction_skin(String faction_skin) {
        this.faction_skin = faction_skin;
    }

//    public List<HeroDTO> getHeroes() {
//        return heroes;
//    }

    public FactionDTO(){};
    public FactionDTO(Faction faction){
        this.id = faction.getId();
        this.faction_name = faction.getFaction_name();
        this.faction_alignment = faction.getFaction_alignment();
        this.faction_skin = faction.getFaction_skin();
//        this.heroes = faction.getHeroes().stream().map(HeroDTO::new).collect(Collectors.toList());
    }
}
