package be.derdelinckx.cucumber.steps;

import be.derdelinckx.BL.ShopService;
import be.derdelinckx.DAL.entities.Hero;
import be.derdelinckx.DAL.entities.PlayingHero;
import be.derdelinckx.DAL.entities.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BaseHeroTests {

    private User user;
    private Hero hero;
    private PlayingHero playingHero;
    private ShopService shopService = new ShopService();

    @Given("a user with a budget of {int} crystals")
    public void a_user_with_a_budget_of_crystals(int crystals) {
        this.user = new User();
        this.user.setCrystals(crystals);
    }

    @Given("the user owns the hero named {string}")
    public void the_user_owns_the_hero_named(String name){
        PlayingHero newHero = new PlayingHero();
        newHero.setName(name);
        this.user.getHeroes().add(newHero);
    }

    @Given("a hero with the name {string} and cost of {int} crystals")
    public void a_hero_with_a_cost_of_crystals(String name, int crystals){
        this.hero = new Hero();
        this.hero.setName(name);
        this.hero.setPrice(crystals);
    }

    @When("the hero is evaluated for purchase")
    public void the_hero_is_evaluated_for_purchase(){
        PlayingHero newhero = this.shopService.cloneHero(hero);
        this.shopService.buyAndUpdate(this.user, newhero, this.hero);
    }

    @Then("the hero can be bought")
    public void the_hero_can_be_bought(){
        Assert.assertTrue(shopService.verifyCrystals(this.user, this.hero));
    }

    @Then("the hero cannot be bought")
    public void the_hero_cannot_be_bought(){
        Assert.assertFalse(shopService.verifyCrystals(this.user, this.hero));
    }

    @Then("the user has a balance of {int} crystals")
    public void the_hero_has_a_balance_of_crystals(Integer crystals){
        Assert.assertEquals(crystals, this.user.getCrystals());
    }

    @Then("the user has a roster of {int} characters")
    public void the_user_has_a_roster_of_characters(int rostersize){
        Assert.assertEquals(rostersize, this.user.getHeroes().size());
    }

}
