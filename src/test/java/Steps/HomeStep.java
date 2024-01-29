package Steps;

import Pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeStep {

    HomePage homePage;

    @Step
    public void openPage(){
        homePage.open();
    }

    @Step
    public void crearCuenta() throws InterruptedException{
        homePage.cerrarPopUP();
        homePage.clickBtnCrearCuenta();
    }

    @Step
    public void iniciarSesion()throws InterruptedException{
        homePage.cerrarPopUP();
        homePage.clickBtnIniciarSesion();
    }

}
