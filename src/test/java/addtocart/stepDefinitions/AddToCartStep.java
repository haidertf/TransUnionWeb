package addtocart.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidateText;
import tasks.AddToCart.AddToCartTask;
import tasks.AddToCart.Browse;
import tasks.AddToCart.SelectItemTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class AddToCartStep {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Se ingresa a la URL de DemoBlaze")
    public void seIngresaALaURLDeDemoBlaze() {
        // Write code here that turns the phrase above into concrete actions
        theActorCalled("actor").wasAbleTo(Browse.openUrl());
    }
    @When("Se selecicona el producto a comprar")
    public void seSeleciconaElProductoAComprar() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().attemptsTo(SelectItemTask.selectItemTask());
    }

    @When("Se agrega el producto a la cesta de compras")
    public void seAgregaElProductoALaCestaDeCompras() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().attemptsTo(AddToCartTask.addToCartTask());
    }

    @Then("^Se valida que el producto se agrego de forma exitosa (.*)$")
    public void seValidaQueElProductoSeAgregoDeFormaExitosa(String mensaje) {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(seeThat(ValidateText.obtenido(), equalTo(mensaje)));
    }

}
