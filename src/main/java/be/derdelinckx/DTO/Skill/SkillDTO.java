package be.derdelinckx.DTO.Skill;

import be.derdelinckx.DAL.entities.Archetypes;
import be.derdelinckx.DAL.entities.Skill;

public class SkillDTO {
    private Long id;
    private String name;
    private String skin;
    private Integer score;
    private String archetype1;
    private String archetype2;

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
        return archetype1;
    }

    public void setArchetype1(String archetype1) {
        this.archetype1 = archetype1;
    }

    public String getArchetype2() {
        return archetype2;
    }

    public void setArchetype2(String archetype2) {
        this.archetype2 = archetype2;
    }

    public SkillDTO(){};
    public SkillDTO(Skill skill){
        this.id = skill.getId();
        this.name = skill.getName();
        this.skin = skill.getSkin();
        this.score = skill.getScore();
        this.archetype1 = skill.getArchetype1();
        this.archetype2 = skill.getArchetype2();
    }
}
