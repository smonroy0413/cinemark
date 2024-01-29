package Steps;

import Pages.ComprarPeliculaPage;
import net.thucydides.core.annotations.Step;

public class ComprarPeliculaStep {

    ComprarPeliculaPage comprarPeliculaPage;

    @Step
    public void seleccionarPelicula() throws InterruptedException {
        comprarPeliculaPage.seleccionarPelicula();
    }

    @Step
    public void seleccionarCiudad() throws InterruptedException {
        comprarPeliculaPage.seleccionarCiudad();
    }

    @Step
    public void seleccionaFechayHoraFuncion() throws InterruptedException{
        comprarPeliculaPage.seleccionaFechayHoraFuncion();
    }

    @Step
    public void seleccionaLugares() throws InterruptedException{
        comprarPeliculaPage.seleccionaLugares();
    }

    @Step
    public void seleccionarComida() throws InterruptedException{
        comprarPeliculaPage.seleccionarComida();
    }

    @Step
    public void metodoDePagoTc() throws InterruptedException{
        comprarPeliculaPage.metodoDePagoTc();
    }
}
