package be.derdelinckx.DTO.Hero;

import be.derdelinckx.DAL.entities.Faction;
import be.derdelinckx.DAL.entities.Hero;
import be.derdelinckx.DTO.Skill.SkillDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HeroDTO {
    private Long id;
    private String skin;
    private String name;
    private String description;
    private Integer level;
    private Integer strength;
    private Integer intelligence;
    private Integer charisma;
    private Integer luck;
    private List<SkillDTO> skills;
    private Faction faction;
    private Integer price;

    public HeroDTO(){};
    public HeroDTO(Hero hero){
        this.id = hero.getId();
        this.skin = hero.getSkin();
        this.name = hero.getName();
        this.description = hero.getDescription();
        this.level = hero.getLevel();
        this.strength = hero.getStrength();
        this.intelligence = hero.getIntelligence();
        this.charisma = hero.getCharisma();
        this.luck = hero.getLuck();
        this.skills = hero.getSkills().stream().map(SkillDTO::new).collect(Collectors.toList());
        this.faction = hero.getFaction();
        this.price = hero.getPrice();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public Integer getLuck() {
        return luck;
    }

    public void setLuck(Integer luck) {
        this.luck = luck;
    }

    public List<SkillDTO> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillDTO> skills) {
        this.skills = skills;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Faction getFaction() {
        return faction;
    }
}
