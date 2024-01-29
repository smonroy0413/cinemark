package Steps;

import Pages.IniciarSesionPage;
import net.thucydides.core.annotations.Step;

public class InicioSesionStep {

    IniciarSesionPage iniciarSesionPage;

    @Step
    public void inicioDeSesion(String correo, String pass) throws InterruptedException {
        iniciarSesionPage.login(correo,pass);

    }
    @Step
    public void validarAvatar(){
        iniciarSesionPage.validarAvatar();
    }
}
