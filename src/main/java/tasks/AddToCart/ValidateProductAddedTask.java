package tasks.AddToCart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ValidateProductAddedTask implements Task {

    String mensaje;

    public ValidateProductAddedTask(String mensaje) {
        this.mensaje = mensaje;
    }
    public static Performable validateProductAddedTask(String mensaje) {
        return instrumented(ValidateProductAddedTask.class, mensaje);
    }

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(ExpectedConditions.alertIsPresent())
        );

        Alert alert = getDriver().switchTo().alert();
        String text = alert.getText();
        System.out.println("texto de la alerta: " +text);
        System.out.println("texto de la alerta2: " +mensaje);




//        alert.accept();
    }
}
