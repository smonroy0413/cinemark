package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CrearCuentaPage extends PageObject {

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[4]/div[2]/div/div/div/div/div[4]/button")
    WebElementFacade btnCrearCuentaSinMenbrecia;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/form/div[1]/div[1]/div/div[2]/div/span/div/div/div")
    WebElementFacade listTipoDePersona;

    @FindBy(xpath = "//*[@class=\"ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical\"]/li[1]")
    WebElementFacade opPersonaNaturalList;

    @FindBy(xpath = "//*[@class=\"ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical\"]/li[2]")
    WebElementFacade opPersonaJuridicaList;

    @FindBy(xpath = "//*[@id=\"register_HouseholdIncome\"]/div/div")
    WebElementFacade listTipoDocumento;

    @FindBy(xpath = "(//*[@class=\"ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical\"])[2]//li[1]")
    WebElementFacade opCedulaCiudadaniaList;

    @FindBy(xpath = "(//*[@class=\"ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical\"])[2]//li[2]")
    WebElementFacade opCedulaExtranjeriaList;

    @FindBy(xpath = "(//*[@class=\"ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical\"])[2]//li[3]")
    WebElementFacade opPasaporteList;

    @FindBy(xpath = "//*[@id=\"register_FirstName\"]")
    WebElementFacade txtNombres;

    @FindBy(xpath = "//*[@id=\"register_LastName\"]")
    WebElementFacade txtApellidos;

    @FindBy(xpath = "//*[@id=\"register_Gender\"]/div/div")
    WebElementFacade listGenero;

    @FindBy(xpath = "(//*[@class=\"ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical\"])[3]//li[1]")
    WebElementFacade opMasculinoList;

    @FindBy(xpath = "(//*[@class=\"ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical\"])[3]//li[2]")
    WebElementFacade opFemeninoList;

    @FindBy(xpath = "//*[@id=\"register_NationalID\"]")
    WebElementFacade txtNumeroDocumento;

    @FindBy(xpath = "//*[@id=\"register_birthDay\"]/div/input")
    WebElementFacade calendarioFechaNacimiento;

    @FindBy(xpath = "//*[@class='ant-calendar-input ']")
    WebElementFacade txtFechaNacimiento;

    @FindBy(xpath = "//*[@id=\"register_MobilePhone\"]")
    WebElementFacade txtCelular;

    @FindBy(xpath = "//*[@id=\"register_Address1\"]")
    WebElementFacade txtDireccion;

    @FindBy(xpath = "//*[@id=\"register_Email\"]")
    WebElementFacade txtCorreoElectronico;

    @FindBy(xpath = "//*[@id=\"register_confirmEmail\"]")
    WebElementFacade txtConfirmarCorreoElectronico;

    @FindBy(xpath = "//*[@id=\"register_Password\"]")
    WebElementFacade txtContrasena;

    @FindBy(xpath = "//*[@id=\"register_confirmPassword\"]")
    WebElementFacade txtConfirmarContrasena;

    @FindBy(xpath = "//*[@id=\"register_PreferredComplexCity\"]/div/div")
    WebElementFacade listCiudad;

    @FindBy(xpath = "(//*[@class=\"ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical\"])[4]//li[2]")
    WebElementFacade opBogotaList;

    @FindBy(xpath = "//*[@id=\"register_PreferredComplex\"]/div/div")
    WebElementFacade listTeatro;

    @FindBy(xpath = "(//*[@class=\"ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical\"])[5]//li[2]")
    WebElementFacade opFlorestaList;

    @FindBy(xpath = "(//*[@class=\"ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical\"])[5]//li[3]")
    WebElementFacade opMultiPlazaList;

    @FindBy(xpath = "//*[@class='ant-checkbox-wrapper']/span[1]")
    WebElementFacade checkTerminosYCondiciones;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div/form/div[7]/button")
    WebElementFacade btnCrearCuenta;

    @FindBy(xpath = "//*[text()=\"Registro exitoso\"]")
    WebElementFacade lblRegistroExitoso;

    @FindBy(xpath = "//*[@title='continuar']")
    WebElementFacade btnContinuar;

    public void cerrarPopUpMenbrecia(){
        btnCrearCuentaSinMenbrecia.click();
    }


    public void completarDAtosDeRegistro(String tipoPersona, String tipoDocumento, String nombres, String apellidos, String genero, String numeroDocumento, String fechaNacimiento, String celular, String direccion, String correoElectronico, String confirmarCorreo, String pass, String confirmarPass, String ciudad) throws InterruptedException{

        listTipoDePersona.click();
        if(tipoPersona.equals("Natural")){
            opPersonaNaturalList.click();
        }else {
            //otro tipo de persona
        }
        listTipoDocumento.click();
        if (tipoDocumento.equals("Cédula de ciudadanía")){
            //cedula ciudadania

        }else if (tipoDocumento.equals("Cédula de extranjería")){
            //cedula Extramjeria

        }else {
            opPasaporteList.click();
        }
        txtNombres.sendKeys(nombres);
        txtApellidos.sendKeys(apellidos);
        listGenero.click();
        opMasculinoList.click();
        txtNumeroDocumento.sendKeys(numeroDocumento);
        calendarioFechaNacimiento.click();
        txtFechaNacimiento.clear();
        txtFechaNacimiento.sendKeys(fechaNacimiento);
        Thread.sleep(2000);
        txtCelular.click();
        txtCelular.sendKeys(celular);
        txtDireccion.sendKeys(direccion);
        txtCorreoElectronico.sendKeys(correoElectronico);
        txtConfirmarCorreoElectronico.sendKeys(confirmarCorreo);
        txtContrasena.sendKeys(pass);
        txtConfirmarContrasena.sendKeys(confirmarPass);
        listCiudad.click();
        opBogotaList.click();
        listTeatro.click();
        opFlorestaList.click();
        checkTerminosYCondiciones.click();
        Thread.sleep(3000);
        btnCrearCuenta.click();
        Thread.sleep(7000);
    }

    public void mensajeRegistro(){
        lblRegistroExitoso.getText().equals("Registro exitoso");
        btnContinuar.click();
    }
}
