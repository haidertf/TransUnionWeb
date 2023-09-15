package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoblaze.com/")
//@DefaultUrl(environments.QA)
public class AddToCartUI extends PageObject {


    public static final Target LBL_PRODUCTO_A_SELECCIONAR = Target.the("producto a seleccionar").located(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));

    public static final Target BTN_ADD_TO_CART = Target.the("botón para agregar a la cesta de compras").located(By.xpath("//a[contains(text(),'Add to cart')]"));

}
