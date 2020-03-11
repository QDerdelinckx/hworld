package be.derdelinckx.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import javafx.application.Application;
//import javafx.stage.Stage;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/java/be/derdelinckx/cucumber/features")
public class CucumberTest{
}
