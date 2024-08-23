package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraRestriccionesObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.ListaDesplegable;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.awt.*;

public class IntegraRestriccionesStep {
    IntegraRestriccionesObject integraRestriccionesObject;
    Robot robot = new Robot();
    ListaDesplegable listaDesplegable;

    @Step
    public void clickBotonMas() {
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getBtnMas());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnMas()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void seleccionarEFOriginadora(String eFOriginadora) {
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getSelectorEFOriginadora()).click();
        integraRestriccionesObject.getDriver().findElement(By.xpath("//li[contains(text(),'" + eFOriginadora + "')]")).click();
    }
    @Step
    public void seleccionarEFReceptora(String eFReceptora) {
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getSelectorEFReceptora()).click();
        integraRestriccionesObject.getDriver().findElement(By.xpath("//li[contains(text(),'" + eFReceptora + "')]")).click();
    }
    @Step
    public void seleccionarCodigoTransaccion(String codigoTransaccion) {
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getSelectorCodigoTransaccion()).click();
        integraRestriccionesObject.getDriver().findElement(By.xpath("//li[contains(text(),'" + codigoTransaccion + "')]")).click();
    }
    @Step
    public void seleccionarEstado(String estado) {
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnEstado()).click();
        integraRestriccionesObject.getDriver().findElement(By.xpath("(//*[text()='" + estado + "'])[2]")).click();
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraRestriccionesObject.getDriver();
        jse.executeScript("window.scrollBy(0,900)");
    }
    @Step
    public void escribirActivoDesde(String activoDesde) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getTxtFechaDesde());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getTxtFechaDesde()).sendKeys(activoDesde);
        robot.hacerTap1();

    }
    @Step
    public void escribirActivoHasta(String activoHasta) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getTxtFechaHasta());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getTxtFechaHasta()).sendKeys(activoHasta);
        robot.hacerTap1();
    }
    @Step
    public void clickEnCrear() {
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getBtnCrear());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnCrear()).click();
    }
    @Step
    public void validarCreacionDeTiposTransaccion() {
        EsperaExplicita.esperaExplicitaTexto(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getTxtValidarCreacion());
        Assert.assertThat(integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getTxtValidarCreacion()).isDisplayed(), Matchers.is(true));
    }
    /**
     * Editar Un Evento
     **/
    @Step
    public void clickEnFiltrar() {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getBtnFiltro());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnFiltro()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }
    @Step
    public void filtroPorEFOriginadora() {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getLblSeleccionarFiltro());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getLblSeleccionarFiltro()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getOptEFOriginadora());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getOptEFOriginadora()).click();
    }
    @Step
    public void eFOriginadoraABuscar(String eFOriginadoraABuscar) {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getLblNombreABuscar());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getLblNombreABuscar()).click();
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getLblNombreABuscar()).sendKeys(eFOriginadoraABuscar);
    }
    @Step
    public void clickEnBuscar() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getBtnBuscar());
        try {
            integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnBuscar()).click();
        } catch (Exception e) {
            robot.hacerEnter();
        }
        EsperaImplicita.esperaImplicitaWeb(2);
    }
    @Step
    public void clickEnEditar() {
        EsperaImplicita.esperaImplicitaWeb(2);
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getBtnEditar());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnEditar()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void ingresoAEditarEFOriginadora(String eFOriginadora){
        EsperaImplicita.esperaImplicitaWeb(5);
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getBtnEliminarEFOriginadora());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnEliminarEFOriginadora()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        integraRestriccionesObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+eFOriginadora+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }
    @Step
    public void ingresoAEditarEFReceptora(String eFReceptora){
        EsperaImplicita.esperaImplicitaWeb(5);
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getBtnEliminarEFReceptora());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnEliminarEFReceptora()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        integraRestriccionesObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+eFReceptora+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }
    @Step
    public void ingresoAEditarCodigoTransaccion(String codigoTransaccion){
        EsperaImplicita.esperaImplicitaWeb(5);
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getBtnEliminarCodigoTransaccion());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnEliminarCodigoTransaccion()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        integraRestriccionesObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+codigoTransaccion+"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }
    @Step
    public void editarEstado(String estado) {
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnEstado()).click();
        integraRestriccionesObject.getDriver().findElement(By.xpath("(//*[text()='" + estado + "'])[2]")).click();
    }
    @Step
    public void editarActivoDesde(String activoDesde) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getTxtFechaDesde());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getTxtFechaDesde()).clear();
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getTxtFechaDesde()).sendKeys(activoDesde);
//        robot.hacerTap1();
    }
    @Step
    public void editarActivoHasta(String activoHasta) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getTxtFechaHasta());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getTxtFechaHasta()).clear();
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getTxtFechaHasta()).sendKeys(activoHasta+ Keys.ENTER);

    }
    @Step
    public void guardarCambios() throws AWTException {
        robot.control_Menos();
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnGuardarCambios()).click();
        robot.control_Mas();
    }
    @Step
    public void validarEdicionDeTipoTransaccion() {
        EsperaExplicita.esperaExplicitaTexto(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getTxtValidarEdicion());
        Assert.assertThat(integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getTxtValidarEdicion()).isDisplayed(), Matchers.is(true));
    }
    /**
     * Eliminar Un Evento
     **/
    @Step
    public void nombreDeEFOriginadoraAEliminarAEliminar(String eFOriginadoraAEliminar) {
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getLblNombreABuscar());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getLblNombreABuscar()).click();
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getLblNombreABuscar()).sendKeys(eFOriginadoraAEliminar);
    }
    @Step
    public void clickEnBorrar() {
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getBtnBorrar());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnBorrar()).click();
    }
    @Step
    public void clickEnSi() {
        EsperaExplicita.esperaexplilicitaClick(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getBtnSiBorrar());
        integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnSiBorrar()).click();
    }

    @Step
    public void validarEliminacionDeTipoTransaccion() {
        EsperaExplicita.esperaExplicitaTexto(integraRestriccionesObject.getDriver(), integraRestriccionesObject.getBtnValidarBorrado());
        Assert.assertThat(integraRestriccionesObject.getDriver().findElement(integraRestriccionesObject.getBtnValidarBorrado()).isDisplayed(), Matchers.is(true));
    }
}
