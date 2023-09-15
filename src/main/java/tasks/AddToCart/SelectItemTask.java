package tasks.AddToCart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.AddToCartUI.LBL_PRODUCTO_A_SELECCIONAR;

public class SelectItemTask implements Task {

    public static Performable selectItemTask() {
        return instrumented(SelectItemTask.class);
    }

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_PRODUCTO_A_SELECCIONAR, WebElementStateMatchers.isVisible()).forNoMoreThan(5000).milliseconds(),
                Click.on(LBL_PRODUCTO_A_SELECCIONAR)
        );

    }
}
