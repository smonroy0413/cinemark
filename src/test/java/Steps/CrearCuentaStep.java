package Steps;

import Pages.CrearCuentaPage;
import net.thucydides.core.annotations.Step;

public class CrearCuentaStep {

    CrearCuentaPage crearCuentaPage;

    @Step
    public void crearCuenta(String tipoPersona, String tipoDocumento, String nombres, String apellidos, String genero, String numeroDocumento, String fechaNacimiento, String celular, String direccion, String correoElectronico, String confirmarCorreo, String pass, String confirmarPass, String ciudad) throws InterruptedException {
        crearCuentaPage.cerrarPopUpMenbrecia();
        crearCuentaPage.completarDAtosDeRegistro(tipoPersona, tipoDocumento, nombres, apellidos, genero, numeroDocumento, fechaNacimiento, celular, direccion, correoElectronico, confirmarCorreo, pass, confirmarPass, ciudad);
    }

    @Step
    public void mensajeRegistro(){
        crearCuentaPage.mensajeRegistro();
    }
}
