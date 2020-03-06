package be.derdelinckx.cucumber.steps;

import be.derdelinckx.BL.ShopService;
import be.derdelinckx.DAL.entities.Hero;
import be.derdelinckx.DAL.entities.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BaseHeroTests {

    private User user;
    private Hero hero;
    private ShopService shopService;

    @Given("a user with a budget of {int} crystals")
    public void a_user_with_a_budget_of_crystals(int crystals) {
        this.user = new User();
        this.user.setCrystals(crystals);
    }

    @Given("a hero with the name {string} cost of {int} crystals")
    public void a_hero_with_a_cost_of_crystals(int crystals){
        this.hero = new Hero();
        this.hero.setPrice(crystals);
    }

    @When("I want the hero")
    public boolean i_want_the_hero(){
        if(shopService.verifyCrystals(this.user, this.hero)){
            return true;
        }
        return false;
    }

    @Then("The hero is unlocked")
    public void the_hero_is_unlocked(){
        Assert.assertTrue(i_want_the_hero());
    }

}
