package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraInscribirCuentaObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.ListaDesplegable;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;

public class IntegraInscribirCuentasStep {
    IntegraInscribirCuentaObject integraInscribirCuentaObject;
    Robot robot = new Robot();
    ListaDesplegable listaDesplegable;

    @Step
    public void clickBotonMas() {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getBtnMas());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnMas()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void ingresarNITEntidadReceptora(String NitEntidadReceptora) {
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtNITEntidadReceptora()).click();
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtNITEntidadReceptora()).clear();
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtNITEntidadReceptora()).sendKeys(NitEntidadReceptora);
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void ingresoEntidadReceptora(String entidadReceptora) {
        EsperaExplicita.esperaExplicitaTexto(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getSelectEntidadReceptora());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getSelectEntidadReceptora()).click();
        integraInscribirCuentaObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+ entidadReceptora +"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void ingresoCodigoTransaccion(String codigoTransaccion) {
        EsperaExplicita.esperaExplicitaTexto(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getSelectCodigoTransaccion());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getSelectCodigoTransaccion()).click();
        integraInscribirCuentaObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+ codigoTransaccion +"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void ingresarNumeroCuentaDestino(String cuentaDestino) {
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtNumeroCuentaDestino()).click();
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtNumeroCuentaDestino()).clear();
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtNumeroCuentaDestino()).sendKeys(cuentaDestino);
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraInscribirCuentaObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void ingresarNITEntidadOriginadora(String NitEntidadOriginadora) {
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtNITEntidadOriginadora()).click();
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtNITEntidadOriginadora()).clear();
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtNITEntidadOriginadora()).sendKeys(NitEntidadOriginadora);
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraInscribirCuentaObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void ingresoLimiteAsociar(String limiteAsociar) {
        EsperaExplicita.esperaExplicitaTexto(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getSelectLimiteAsociar());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getSelectLimiteAsociar()).click();
        integraInscribirCuentaObject.getDriver().findElement(By.xpath("//li[contains(text(),'"+ limiteAsociar +"')]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraInscribirCuentaObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void seleccionarEstado(String estado) {
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnEstado()).click();
        integraInscribirCuentaObject.getDriver().findElement(By.xpath("(//*[text()='" + estado + "'])[2]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraInscribirCuentaObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }
    @Step
    public void seleccionarEstado1(String estado) {
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBntEstado1()).click();
        integraInscribirCuentaObject.getDriver().findElement(By.xpath("(//*[text()='" + estado + "'])[2]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraInscribirCuentaObject.getDriver();
        jse.executeScript("window.scrollBy(0,400)");
    }
    @Step
    public void escribirActivoDesde(String activoDesde) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getTxtFechaDesde());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtFechaDesde()).clear();
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtFechaDesde()).sendKeys(activoDesde);
        robot.hacerTap1();
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraInscribirCuentaObject.getDriver();
        jse.executeScript("window.scrollBy(0,400)");
    }
    @Step
    public void escribirActivoHasta(String activoHasta) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getTxtFechaHasta());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtFechaHasta()).clear();
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtFechaHasta()).sendKeys(activoHasta);
        robot.hacerTap1();
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraInscribirCuentaObject.getDriver();
        jse.executeScript("window.scrollBy(0,400)");
    }
    @Step
    public void clickEnCrear() {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getBtnCrear());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnCrear()).click();
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraInscribirCuentaObject.getDriver();
        jse.executeScript("window.scrollBy(0,400)");
    }
    @Step
    public void validarCreacionDeTiposTransaccion() {
        EsperaExplicita.esperaExplicitaTexto(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getTxtValidarCreacion());
        Assert.assertThat(integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtValidarCreacion()).isDisplayed(), Matchers.is(true));
    }
    /**
     * Editar Un Evento
     **/
    @Step
    public void clickEnFiltrar() {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getBtnFiltro());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnFiltro()).click();
    }
    @Step
    public void filtroPorNitEntidadReceptora() {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getLblSeleccionarFiltro());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getLblSeleccionarFiltro()).click();
        //EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getOptNitEntidadReceptora());
        //integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getOptNitEntidadReceptora()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void NITAbuscar(String NITABuscar) {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getLblNombreABuscar());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getLblNombreABuscar()).click();
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getLblNombreABuscar()).sendKeys(NITABuscar);
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void seleccionarEditar() {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getBtnEditarParaAprobar());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnEditarParaAprobar()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void clickEnBuscar() throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getBtnBuscar());
        try {
            integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnBuscar()).click();
            EsperaImplicita.esperaImplicitaWeb(10);
        } catch (Exception e) {
            robot.hacerEnter();

        }
    }
    @Step
    public void clickEnEditar() {
        //EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getBtnEditar());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnEditar()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void editarActivoDesde(String activoDesde) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getTxtFechaDesde());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtFechaDesde()).clear();
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtFechaDesde()).sendKeys(activoDesde);
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraInscribirCuentaObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
//        robot.hacerTap1();
    }
    @Step
    public void editarActivoHasta(String activoHasta) throws AWTException {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getTxtFechaHasta());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtFechaHasta()).clear();
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtFechaHasta()).sendKeys(activoHasta);
        EsperaImplicita.esperaImplicitaWeb(3);
//        robot.hacerTap1();
    }
    @Step
    public void guardarCambios() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(3);
        robot.control_Menos();
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getBtnGuardarCambios());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnGuardarCambios()).click();
    }
    public void guardarCambiosAprobacion() {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getBtnGuardarCambiosAprobación());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnGuardarCambiosAprobación()).click();
    }
    public void seleccionarSiAutorizarCuenta() {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getBtnAutorizarCuenta());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnAutorizarCuenta()).click();
    }
    @Step
    public void validarEdicionDeTipoTransaccion() {
        EsperaExplicita.esperaExplicitaTexto(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getTxtValidarEdicion());
        Assert.assertThat(integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtValidarEdicion()).isDisplayed(), Matchers.is(true));
    }
    /**
     * Eliminar Un Evento
     **/
    @Step
    public void NITAAutorizar(String codigoABuscar) {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getLblNombreABuscar());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getLblNombreABuscar()).click();
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getLblNombreABuscar()).sendKeys(codigoABuscar);
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void clickEnBorrar() {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getBtnBorrar());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnBorrar()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void clickEnSi() {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getBtnSiBorrar());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnSiBorrar()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void validarEliminacionDeCuenta() {
        EsperaExplicita.esperaExplicitaTexto(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getBtnValidarBorrado());
        Assert.assertThat(integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnValidarBorrado()).isDisplayed(), Matchers.is(true));
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void validarAprobacionDeCuenta() {
        EsperaExplicita.esperaExplicitaTexto(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getTxtValidarEdicion());
        Assert.assertThat(integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtValidarEdicion()).isDisplayed(), Matchers.is(true));
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void NITEntidadRecetoraAAprobar(String NITEntidadRecpetoraAAprobar) {
        EsperaExplicita.esperaexplilicitaClick(integraInscribirCuentaObject.getDriver(), integraInscribirCuentaObject.getTxtBusquedaRapida());
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtBusquedaRapida()).clear();
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getTxtBusquedaRapida()).sendKeys(NITEntidadRecpetoraAAprobar);
        EsperaImplicita.esperaImplicitaWeb(3);
    }
    @Step
    public void seleccionarAprobar() {
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getBtnEstado()).click();
        integraInscribirCuentaObject.getDriver().findElement(By.xpath("(//*[text()='ACTIVE'])[2]")).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraInscribirCuentaObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
    }

    @Step
    public void EditarEstadoACreated() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(3);
        JavascriptExecutor jse = (JavascriptExecutor) integraInscribirCuentaObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getLblEstadoOperador()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getLblEstadoOperadorCreate()).click();

    }

    @Step
    public void EditarEstadoAActive() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(3);
        JavascriptExecutor jse = (JavascriptExecutor) integraInscribirCuentaObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getLblEstadoOperador()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getLblEstadoActive()).click();

    }


    @Step
    public void EditarEstadoAprobadoPorACH() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(3);
        JavascriptExecutor jse = (JavascriptExecutor) integraInscribirCuentaObject.getDriver();
        jse.executeScript("window.scrollBy(0,300)");
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getLblAprobadoPorACH()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
        integraInscribirCuentaObject.getDriver().findElement(integraInscribirCuentaObject.getLblEstadoAprobadoPorACH()).click();

    }
}
