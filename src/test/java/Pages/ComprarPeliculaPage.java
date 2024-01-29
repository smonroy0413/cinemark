package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ComprarPeliculaPage extends PageObject {

    @FindBy(xpath = "(//*[@class='jsx-1273177034 card-movie__state-bar-movie card-movie__state-bar-movie--default'])[1]")
    WebElementFacade primeraPeliculaCartelera;

    @FindBy(xpath = "(//*[@class=\"anticon anticon-close\"])[2]")
    WebElementFacade btnCerrarModalCiudad;

    @FindBy(xpath = "(//*[@class=\"ant-select-selection__rendered\"])[3]")
    WebElementFacade listUstedEstaEn;

    @FindBy(xpath = "//*[@class=\"ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical\"]/li")
    WebElementFacade itemBogotaList;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div[3]/div/div[2]")
    WebElementFacade btnDiaSiguiente;

    @FindBy(xpath = "//*[@class=\"jsx-1092747776 sessions__button--runtime \"][1]")
    WebElementFacade primeraHoraDeFuncionMasCerca;

    @FindBy(xpath = "//*[@title=\"CONFIRMAR\"]")
    WebElementFacade btnConfirmar;

    @FindBy(xpath = "//*[@class='ant-modal-close-x']")
    WebElementFacade btnCerrarModal;

    @FindBy(xpath = "(//*[@role='combobox'])[3]")
    WebElementFacade listBoletasGeneral;

    @FindBy(xpath = "//*[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li[2]")
    WebElementFacade cantidadUna;

    @FindBy(xpath = "//*[@title='continuar']")
    WebElementFacade btnContinuar;

    @FindBy(xpath = "//span[text()='O19']")
    WebElementFacade btnSillla;

    @FindBy(xpath = "//*[@title=\"confirmar\"]")
    WebElementFacade btnConfirmarModalSillas;

    @FindBy(xpath = "(//*[@alt='Add'])[1]")
    WebElementFacade btnMasComboMio;

    @FindBy(xpath = "(//*[@class='anticon anticon-credit-card'])[2]")
    WebElementFacade iconoTarjetaCredito;

    @FindBy(xpath = "//*[@id=\"payment_creditCard.number\"]")
    WebElementFacade txtNumeroTarjeta;

    @FindBy(xpath = "//*[@id=\"payment_creditCard.name\"]")
    WebElementFacade txtNombreTitularTarjeta;

    @FindBy(xpath = "//*[@id=\"payment_creditCard.expirationDate\"]/div/input")
    WebElementFacade CalendarioFechaExpiracionTc;

    @FindBy(xpath = "//*[@class='ant-calendar-month-panel-year-select']")
    WebElementFacade year;

    @FindBy(xpath = "//*[@class='ant-calendar-month-panel-next-year-btn']")
    WebElementFacade btnNextCalendario;

    @FindBy(xpath = "//*[@class='ant-calendar-month-panel-tbody']//td")
    List<WebElementFacade> mesList;

    @FindBy(xpath = "//*[@id=\"payment_creditCard.securityCode\"]")
    WebElementFacade txtCodigoCvv;

    @FindBy(xpath = "//*[@id=\"payment_creditCard.installments\"]/div/div")
    WebElementFacade listNumeroDeCuotas;

    @FindBy(xpath = "//*[@class=\"ant-select-dropdown-menu-item\"][2]")
    WebElementFacade itemNumeroDeCuotas;

    @FindBy(xpath = "(//*[@class='ant-checkbox-wrapper']/span[1])[2]")
    WebElementFacade checkHeRevisadoLaOrdenDeCompra;

    @FindBy(xpath = "//*[@title='ACEPTAR']")
    WebElementFacade btnAceptar;

    public void seleccionarPelicula()throws InterruptedException{
        Thread.sleep(6000);
        primeraPeliculaCartelera.click();
        Thread.sleep(5000);
    }

    public void seleccionarCiudad()throws InterruptedException{
        btnCerrarModalCiudad.click();
        listUstedEstaEn.click();
        itemBogotaList.click();
        Thread.sleep(4000);
    }

    public void seleccionaFechayHoraFuncion()throws InterruptedException{
        btnDiaSiguiente.click();
        Thread.sleep(5000);
        primeraHoraDeFuncionMasCerca.click();
        Thread.sleep(2000);
        btnConfirmar.click();
        Thread.sleep(6000);
    }

    public void seleccionaLugares()throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        Thread.sleep(3000);
        btnCerrarModal.click();

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,350)", "");
        listBoletasGeneral.click();
        cantidadUna.click();
        btnContinuar.click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,350)", "");
        btnSillla.click();
        btnContinuar.click();
        btnConfirmarModalSillas.click();
        Thread.sleep(8000);
    }

    public void seleccionarComida()throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(2000);
        btnMasComboMio.click();
        btnContinuar.click();
        Thread.sleep(8000);
        btnContinuar.click();
        Thread.sleep(5000);
    }

    public void metodoDePagoTc()throws InterruptedException{
        iconoTarjetaCredito.click();
        Thread.sleep(3000);
        txtNumeroTarjeta.sendKeys("376402004977124");
        txtNombreTitularTarjeta.sendKeys("APPROVED");

        CalendarioFechaExpiracionTc.click();

        String fechaExpiracionTc = "may./2026";

        String[] fechaData = fechaExpiracionTc.split("/");

        do {
            if (!year.getText().contains(fechaData[1])) {
                btnNextCalendario.click();
            }

        }while (!year.getText().contains(fechaData[1]));

        for(int i = 0; i < mesList.size(); i++) {
            if(mesList.get(i).getText().equalsIgnoreCase(fechaData[0])) {
                mesList.get(i).click();
                break;
            }
        }
        txtCodigoCvv.sendKeys("7777");
        listNumeroDeCuotas.click();
        itemNumeroDeCuotas.click();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(3000);
        checkHeRevisadoLaOrdenDeCompra.click();
        Thread.sleep(2000);
        btnContinuar.click();
        btnAceptar.click();
        Thread.sleep(8000);
    }

}
