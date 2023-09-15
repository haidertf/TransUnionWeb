package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ValidateText implements Question<String> {

    public static Question<String> obtenido() {
        return new ValidateText();
    }

    @Override
    public String answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(ExpectedConditions.alertIsPresent())
        );

        Alert alert = getDriver().switchTo().alert();
        String text = alert.getText();
        System.out.println("texto de la alerta: " +text);

        return text;
    }
}
