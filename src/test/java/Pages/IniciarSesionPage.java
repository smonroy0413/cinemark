package Pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class IniciarSesionPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"MemberEmail\"]")
    WebElementFacade txtCorreoElectronico;

    @FindBy(xpath = "//*[@id=\"MemberPassword\"]")
    WebElementFacade txtContrasena;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/div/div[2]/div/form/div[3]/a")
    WebElementFacade lblOlvideMiContrasena;

    @FindBy(xpath = "//*[@title='Ingresar']")
    WebElementFacade btnIngresar;

    @FindBy(xpath = "//*[@class=\"ant-avatar ant-avatar-circle\"]")
    WebElementFacade avatarUsuario;

    public void login(String correo, String pass) throws InterruptedException {
        //Serenity.takeScreenshot();
        Thread.sleep(4000);
        txtCorreoElectronico.sendKeys(correo);
        txtContrasena.sendKeys(pass);
        Thread.sleep(2000);
        btnIngresar.click();
        Thread.sleep(10000);
    }

    public void validarAvatar(){
        Assert.assertTrue(avatarUsuario.isVisible());
    }
}
