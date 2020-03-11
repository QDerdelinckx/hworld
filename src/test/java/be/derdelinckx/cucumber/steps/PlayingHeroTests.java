package be.derdelinckx.cucumber.steps;

import be.derdelinckx.BL.PlayingHeroService;
import be.derdelinckx.DAL.entities.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.Set;
import java.util.stream.Stream;

public class PlayingHeroTests {

    private PlayingHero hero = new PlayingHero();
    private PlayingHeroService playingHeroService = new PlayingHeroService();

    @Given("the hero has a skill named {string} with {string} and {string} bonuses and a base score of {int}")
    public void a_hero_with_a_skill(String name, String archetype1, String archetype2, Integer score){
        Skill newSkill = new Skill();
        newSkill.setName(name);
        newSkill.setScore(score);
        newSkill.setArchetype1(Archetypes.valueOf(archetype1));
        newSkill.setArchetype2(Archetypes.valueOf(archetype2));
        this.hero.getSkills().add(newSkill);
    }

    @When("the hero is assigned a role")
    public void the_hero_is_assigned_a_role(){
        RoleCrew newRole = new RoleCrew();
        newRole.setName("Role Test");
        this.hero.setRoleCrew(newRole);
    }

    @When("said role has a bonus of {int} on archetype {string}")
    public void said_role_has_a_bonus_of(int bonus, String affected){
        RoleCrew heroRole = this.hero.getRoleCrew();
        Bonus newBonus = new Bonus(Archetypes.valueOf(affected), bonus);
        heroRole.getBonus().add(newBonus);
    }

    @When("the hero is powered Up")
    public void the_hero_is_powered_up(){
        this.hero = playingHeroService.powerUp(this.hero);
    }

    @Then("the skill named {string} has a score of {int}")
    public void the_skill_named_has_a_score_of(String name, Integer score){
        for(Skill skill : this.hero.getSkills()) {
            if(skill.getName().equals(name)) {
                Assert.assertEquals(score, skill.getScore());
            }
        }
    }

}
