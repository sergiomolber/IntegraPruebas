package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraSolicitudTiempoExtraObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class IntegraSolicitudTiempoExtraStep {
    IntegraSolicitudTiempoExtraObject integraSolicitudTiempoExtraObject;
    Robot robot = new Robot();


    @Step
    public void clickBotonMas() {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnMas());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnMas()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }
        @Step
    public void seleccionarEntidad(String entidadSolicitudTiempoExtra) {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnSelectEntidad());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnSelectEntidad()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        integraSolicitudTiempoExtraObject.getDriver().findElement(By.xpath("//ul[@id='select2-VPHCYCLEEXTENSIONACHEntity-results']//li[contains(text(),'" + entidadSolicitudTiempoExtra + "')]")).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void escribirMinutos(String minutos) {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getTxtMinutos());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtMinutos()).sendKeys(minutos);
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void seleccionarSancion(String sancion) {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnSelectSancion());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnSelectSancion()).click();
        integraSolicitudTiempoExtraObject.getDriver().findElement(By.xpath("//*[text()='" + sancion + "']")).click();
        EsperaImplicita.esperaImplicitaWeb(2);

    }

    @Step
    public void escribirJustifiacion(String justificacion) {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getTxtJustificación());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtJustificación()).sendKeys(justificacion);
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void escribirfecha()throws AWTException {
        String ActivoDesde = Robot.fechahora();
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getTxtFechaSolicitud());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtFechaSolicitud()).sendKeys(ActivoDesde);
        EsperaImplicita.esperaImplicitaWeb(2);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraSolicitudTiempoExtraObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void seleccionarEstado(String estado) {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnSelectEstado());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnSelectEstado()).click();
        Select s = new Select(integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnSelectEstado()));
        s.selectByValue(estado);
        EsperaImplicita.esperaImplicitaWeb(2);
    }

     @Step
        public void seleccionarCiclo() {
            EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnSelectCiclo());
            integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnSelectCiclo()).click();
            EsperaImplicita.esperaImplicitaWeb(2);
            // Ajusta el XPath para seleccionar el ítem activo
         integraSolicitudTiempoExtraObject.getDriver().findElement(By.xpath("//ul[@id='select2-VPHCYCLEEXTENSIONACHCycleName-results']//li[contains(@class, 'select2-results__option--highlighted')]")).click();
         EsperaImplicita.esperaImplicitaWeb(2);
        }


    @Step
    public void clickEnCrear() {
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraSolicitudTiempoExtraObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnCrear());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnCrear()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void validarCreacionDelLimite() {
        EsperaExplicita.esperaExplicitaTexto(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getTxtValidarCreacion());
        Assert.assertThat(integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtValidarCreacion()).isDisplayed(), Matchers.is(true));
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    /**
     * Editar Un Limite
     **/
    @Step
    public void clickEnFiltrar() {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnFiltro());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnFiltro()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void filtroPorJustificacion() {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getLblSeleccionarFiltro());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getLblSeleccionarFiltro()).click();
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getOptJustificacion());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getOptJustificacion()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void justificacionABuscar(String solicitudAEditar) {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getTxtJustificacionABuscar());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtJustificacionABuscar()).click();
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtJustificacionABuscar()).sendKeys(solicitudAEditar);
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickEnBuscar() throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnBuscar());
        try {
            integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnBuscar()).click();
        } catch (Exception e) {
            robot.hacerEnter();
        }
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickEnEditar() {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnEditar());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnEditar()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void editarMinutos(String minutosEditar) {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getTxtMinutos());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtMinutos()).clear();
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtMinutos()).sendKeys(minutosEditar);
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void editarSancion(String sancionAEditar) {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnSelectSancion());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnSelectSancion()).click();
        integraSolicitudTiempoExtraObject.getDriver().findElement(By.xpath("//*[text()='" + sancionAEditar + "']")).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void editarJustificacion(String justificacionAEditar) {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getTxtJustificación());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtJustificación()).clear();
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtJustificación()).sendKeys(justificacionAEditar);
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void editarFechaSolicitud()throws AWTException {
        String ActivoDesde = Robot.fechahora();
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getTxtFechaSolicitud());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtFechaSolicitud()).clear();
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtFechaSolicitud()).sendKeys(ActivoDesde);
        EsperaImplicita.esperaImplicitaWeb(2);
        robot.hacerTap1();
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraSolicitudTiempoExtraObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void editarEstado(String estadoAEditar) {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnSelectEstado());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnSelectEstado()).click();
        Select s = new Select(integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnSelectEstado()));
        s.selectByValue(estadoAEditar);
        EsperaImplicita.esperaImplicitaWeb(2);
    }
    @Step
    public void editarCiclo() {
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnEliminarCiclo()).click();
        //EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnSelectCiclo());
        //integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnSelectCiclo()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        // Ajusta el XPath para seleccionar el ítem activo
        integraSolicitudTiempoExtraObject.getDriver().findElement(By.xpath("//ul[@id='select2-VPHCYCLEEXTENSIONACHCycleName-results']//li[contains(@class, 'select2-results__option--highlighted')]")).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }


    @Step
    public void guardarCambios() {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnGuardarCambios());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnGuardarCambios()).click();
    }

    @Step
    public void validarEdicionDeSolicitudTiempoExtra() {
        EsperaExplicita.esperaExplicitaTexto(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getTxtValidarEdicion());
        Assert.assertThat(integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtValidarEdicion()).isDisplayed(), Matchers.is(true));

    }
    /**
     * Eliminar Un Limite
     **/
    @Step
    public void nombreDeSolicitudAEliminar(String solicitudAEliminar) {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getTxtJustificacionABuscar());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtJustificacionABuscar()).click();
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getTxtJustificacionABuscar()).sendKeys(solicitudAEliminar);
        EsperaImplicita.esperaImplicitaWeb(2);
    }
    @Step
    public void clickEnBorrar() {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnBorrar());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnBorrar()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }
    @Step
    public void clickEnSi() {
        EsperaExplicita.esperaexplilicitaClick(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnSiBorrar());
        integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnSiBorrar()).click();
    }

    @Step
    public void validarEliminacionDelaSolicitud() {
        EsperaExplicita.esperaExplicitaTexto(integraSolicitudTiempoExtraObject.getDriver(), integraSolicitudTiempoExtraObject.getBtnValidarBorrado());
        Assert.assertThat(integraSolicitudTiempoExtraObject.getDriver().findElement(integraSolicitudTiempoExtraObject.getBtnValidarBorrado()).isDisplayed(), Matchers.is(true));
    }
}
