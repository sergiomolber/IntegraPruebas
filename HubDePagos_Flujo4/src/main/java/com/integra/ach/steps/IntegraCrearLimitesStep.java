package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraCrearLimiteObject;
import com.integra.ach.pageObject.IntegraInicioObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class IntegraCrearLimitesStep {
    IntegraCrearLimiteObject integraCrearLimiteObject;



    @Step
    public void escribirNombre(String nombre) {
        EsperaExplicita.esperaexplilicitaClick(integraCrearLimiteObject.getDriver(),integraCrearLimiteObject.gettxtNombre());
        integraCrearLimiteObject.getDriver().findElement(integraCrearLimiteObject.gettxtNombre()).sendKeys(nombre);

    }

    @Step
    public void escribirTopeMinimo(String topeMinimo) {
        EsperaExplicita.esperaexplilicitaClick(integraCrearLimiteObject.getDriver(),integraCrearLimiteObject.gettxtTopeMinimo());
        integraCrearLimiteObject.getDriver().findElement(integraCrearLimiteObject.gettxtTopeMinimo()).sendKeys(topeMinimo);

    }

    @Step
    public void escribirTopeMaximo(String topeMaximo) {
        EsperaExplicita.esperaexplilicitaClick(integraCrearLimiteObject.getDriver(),integraCrearLimiteObject.gettxtTopeMaximo());
        integraCrearLimiteObject.getDriver().findElement(integraCrearLimiteObject.gettxtTopeMaximo()).sendKeys(topeMaximo);

    }

    @Step
    public void escribirVigenciaDeLaCuenta(String vigenciaDeLaCuenta) {
        EsperaExplicita.esperaexplilicitaClick(integraCrearLimiteObject.getDriver(),integraCrearLimiteObject.gettxtVigenciaDeLaCuenta());
        integraCrearLimiteObject.getDriver().findElement(integraCrearLimiteObject.gettxtVigenciaDeLaCuenta()).sendKeys(vigenciaDeLaCuenta);

    }

    @Step
    public void escribirPendiente(String pendiente) {
        EsperaExplicita.esperaexplilicitaClick(integraCrearLimiteObject.getDriver(),integraCrearLimiteObject.gettxtPendiente());
        integraCrearLimiteObject.getDriver().findElement(integraCrearLimiteObject.gettxtPendiente()).sendKeys(pendiente);

    }

    @Step
    public void escribirPreaviso(String preaviso) {
        EsperaExplicita.esperaexplilicitaClick(integraCrearLimiteObject.getDriver(),integraCrearLimiteObject.gettxtPreaviso());
        integraCrearLimiteObject.getDriver().findElement(integraCrearLimiteObject.gettxtPreaviso()).sendKeys(preaviso);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraCrearLimiteObject.getDriver();
        jse.executeScript("window.scrollBy(0,900)");


    }

    @Step
    public void seleccionartipoDeTransacciones(String tipoDeTransacciones) {
        EsperaExplicita.esperaexplilicitaClick(integraCrearLimiteObject.getDriver(), integraCrearLimiteObject.getlblTipoTransaccion());
        integraCrearLimiteObject.getDriver().findElement(integraCrearLimiteObject.getlblTipoTransaccion()).click();
        integraCrearLimiteObject.getDriver().findElement(By.xpath("//li[contains(text(),'" + tipoDeTransacciones + "')]")).click();
    }

    @Step
    public void seleccionarEstado(String estado) {
        EsperaExplicita.esperaexplilicitaClick(integraCrearLimiteObject.getDriver(), integraCrearLimiteObject.getlblEstado());
        integraCrearLimiteObject.getDriver().findElement(integraCrearLimiteObject.getlblEstado()).click();
        integraCrearLimiteObject.getDriver().findElement(By.xpath("//li[contains(text(),'" + estado + "')]")).click();
    }

    @Step
    public void escribirFechaActvoDesde() {
        String fechaDeCicloACerrar = Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraCrearLimiteObject.getDriver(), integraCrearLimiteObject.getcmbFecha());
        integraCrearLimiteObject.getDriver().findElement(integraCrearLimiteObject.getcmbFecha()).clear();
        integraCrearLimiteObject.getDriver().findElement(integraCrearLimiteObject.getcmbFecha()).sendKeys(fechaDeCicloACerrar);
        EsperaImplicita.esperaImplicitaWeb(5);
    }

    @Step
    public void clickBotonCrear() {
        EsperaExplicita.esperaexplilicitaClick(integraCrearLimiteObject.getDriver(), integraCrearLimiteObject.getbtnCrear());
        integraCrearLimiteObject.getDriver().findElement(integraCrearLimiteObject.getbtnCrear()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void validarCreacionDeTiposTransaccion() {
        EsperaExplicita.esperaExplicitaTexto(integraCrearLimiteObject.getDriver(), integraCrearLimiteObject.gettxtLimiteCreado());
        Assert.assertThat(integraCrearLimiteObject.getDriver().findElement(integraCrearLimiteObject.gettxtLimiteCreado()).isDisplayed(), Matchers.is(true));
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void AplicarReporte(String BuscarReporte) {
        EsperaExplicita.esperaexplilicitaClick(integraCrearLimiteObject.getDriver(), integraCrearLimiteObject.getlblNombreABuscar());
        integraCrearLimiteObject.getDriver().findElement(integraCrearLimiteObject.getlblNombreABuscar()).click();
        integraCrearLimiteObject.getDriver().findElement(By.xpath("//li[contains(text(),'" + BuscarReporte + "')]")).click();
    }





}
