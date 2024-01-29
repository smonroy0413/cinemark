package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(xpath = "//*[@class = 'ant-modal-close-x']")
    WebElementFacade popUpRedeban;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/header/div[2]/div[2]/div[1]/span[1]/button")
    WebElementFacade btnCrearCuenta;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/header/div[2]/div[2]/div[1]/span[2]/div/button")
    WebElementFacade btnIniciarSesion;

    public void cerrarPopUP() throws InterruptedException {
        Thread.sleep(7000);
        popUpRedeban.click();
        Thread.sleep(2000);


    }

    public void clickBtnCrearCuenta(){
        btnCrearCuenta.click();
    }

    public void clickBtnIniciarSesion(){
        btnIniciarSesion.click();
    }

}
