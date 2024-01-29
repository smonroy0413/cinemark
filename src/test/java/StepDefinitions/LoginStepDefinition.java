package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import Steps.InicioSesionStep;
import Steps.HomeStep;
import Steps.CrearCuentaStep;
import Steps.ComprarPeliculaStep;

public class LoginStepDefinition {

    @Steps
    InicioSesionStep inicioSesionStep;

    @Steps
    HomeStep homeStep;

    @Steps
    CrearCuentaStep crearCuentaStep;

    @Steps
    ComprarPeliculaStep comprarPeliculaStep;


    @Given("^Esta en la pagina de inicio de sesion$")
    public void estaEnLaPaginaDeInicioDeSesion() throws Exception {
        homeStep.openPage();
    }


    @When("^me registro con los datos$")
    public void meRegistroConLosDatos() throws Exception {
        //homeStep.crearCuenta();
        //crearCuentaStep.crearCuenta();
    }

    @When("^me registro con los datos \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void me_registro_con_los_datos(String tipoPersona, String tipoDocumento, String nombres, String apellidos, String genero, String numeroDocumento, String fechaNacimiento, String celular, String direccion, String correoElectronico, String confirmarCorreo, String pass, String confirmarPass, String ciudad) throws Exception {
        homeStep.crearCuenta();
        crearCuentaStep.crearCuenta(tipoPersona, tipoDocumento, nombres, apellidos, genero, numeroDocumento, fechaNacimiento, celular, direccion, correoElectronico, confirmarCorreo, pass, confirmarPass, ciudad);
    }

    @Then("^valido el correcto registro$")
    public void validoElCorrectoRegistro() throws Exception {
        crearCuentaStep.mensajeRegistro();
    }

    @When("^Se introducen los datos de inicio de sesion$")
    public void seIntroducenLosDatos() throws Exception {

    }

    @When("^Se introducen los datos de inicio de sesion \"([^\"]*)\", Correo \"([^\"]*)\", contrasena$")
    public void se_introducen_los_datos_de_inicio_de_sesion_Correo_contrasena(String correo, String pass) throws Exception {
        homeStep.iniciarSesion();
        inicioSesionStep.inicioDeSesion(correo,pass);
    }


    @Then("^validacion de ingreso$")
    public void validacionDeIngreso() throws Exception {
        inicioSesionStep.validarAvatar();
    }

    @Given("^El usuario selecciona una pelicula$")
    public void elUsuarioSeleccionaUnaPelicula() throws Exception {
        comprarPeliculaStep.seleccionarPelicula();
    }


    @Given("^Selecciona teatro y horario$")
    public void seleccionaTeatroYHorario() throws Exception {
        comprarPeliculaStep.seleccionarCiudad();
        comprarPeliculaStep.seleccionaFechayHoraFuncion();
    }

    @Given("^Selecciona las sillas y continua$")
    public void seleccionaLasSillasYContinua() throws Exception {
        comprarPeliculaStep.seleccionaLugares();
    }

    @Given("^El usuario selecciona la comida y continua$")
    public void elUsuarioSeleccionaLaComidaYContinua() throws Exception {
        comprarPeliculaStep.seleccionarComida();
    }

    @Given("^Se completan los datos faltantes$")
    public void seCompletanLosDatosFaltantes() throws Exception {

    }

    @When("^Se paga con tarjeta de credito$")
    public void sePagaConTarjetaDeCredito() throws Exception {
        comprarPeliculaStep.metodoDePagoTc();
    }

    @Then("^Se visualiza el codigo qr$")
    public void seVisualizaElCodigoQr() throws Exception {

    }
}
