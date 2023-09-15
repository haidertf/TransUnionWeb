package tasks.AddToCart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import userinterface.AddToCartUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Browse implements Task {

    AddToCartUI url;

    @Step("{0} navega a la url ")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(url)
        );
    }

    public static Browse openUrl() {
        return instrumented(Browse.class);
    }
}
