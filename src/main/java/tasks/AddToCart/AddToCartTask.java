package tasks.AddToCart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.AddToCartUI.BTN_ADD_TO_CART;

public class AddToCartTask implements Task {

    public static Performable addToCartTask() {
        return instrumented(AddToCartTask.class);
    }

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_ADD_TO_CART, WebElementStateMatchers.isVisible()).forNoMoreThan(5000).milliseconds(),
                Click.on(BTN_ADD_TO_CART)
        );

    }
}
