package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraCuadreYConciliacionObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.util.ArrayList;

public class IntegraCuadreYConciliacionStep {
    IntegraCuadreYConciliacionObject integraCuadreYConciliacionObject;
    Robot robot = new Robot();
    String montoafavorCuadre;
    String montoencontraCuadre;
    String montoafavorCompensacion;
    String montoencontraCompensacion;

    /**
     * Consultar por fecha y ciclo
     **/
    @Step
    public void escribirFecha(String fecha) {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getLblFecha());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getLblFecha()).clear();
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getLblFecha()).sendKeys(fecha);
    }

    @Step
    public void seleccionarCiclo(String ciclo) {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getSelectCiclo1());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getSelectCiclo1()).click();
        integraCuadreYConciliacionObject.getDriver().findElement(By.xpath("//option[contains(text(),'" + ciclo + "')]")).click();
    }

    @Step
    public void seleccionarEntidad(String entidad) {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getSelectEntidad());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getSelectEntidad()).click();
        integraCuadreYConciliacionObject.getDriver().findElement(By.xpath("//option[contains(text(),'" + entidad + "')]")).click();
    }

    @Step
    public void clickBotonEnviar() {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getBtnEnviar());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getBtnEnviar()).click();
        EsperaImplicita.esperaImplicitaWeb(3);
    }

    @Step
    public void validarConsulta() {
        EsperaExplicita.esperaExplicitaTexto(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getTxtValidacionPlanilla());
        Assert.assertThat(integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getTxtValidacionPlanilla()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void clickBotonExportarTxt() {
//        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getBtnExportar());
        EsperaImplicita.esperaImplicitaWeb(6);
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getBtnExportar()).click();
    }

    @Step
    public void clickSeleccionarTxt() {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getSelectTxt());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getSelectTxt()).click();
    }

    @Step
    public void clickBotonDescargarTxt() {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getBtnDescargar());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getBtnDescargar()).click();
        EsperaImplicita.esperaImplicitaWeb(7);
    }

    @Step
    public void clickBotonExportarCsv() {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getBtnExportar());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getBtnExportar()).click();
    }

    @Step
    public void clickSeleccionarCsv() {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getSelectCsv());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getSelectCsv()).click();
    }

    @Step
    public void clickBotonDescargarCsv() {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getBtnDescargar());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getBtnDescargar()).click();
        EsperaImplicita.esperaImplicitaWeb(7);
    }

    @Step
    public void clickBotonExportarPdf() {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getBtnExportar());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getBtnExportar()).click();
    }

    @Step
    public void clickSeleccionarPdf() {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getSelectPdf());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getSelectPdf()).click();
    }

    @Step
    public void clickBotonDescargarPdf() {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getBtnDescargar());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getBtnDescargar()).click();
        EsperaImplicita.esperaImplicitaWeb(7);
    }

    @Step
    public void clickBotonExportarXls() {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getBtnExportar());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getBtnExportar()).click();
    }

    @Step
    public void clickSeleccionarXls() {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getSelectXls());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getSelectXls()).click();
    }

    @Step
    public void clickBotonDescargarXls() {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getBtnDescargar());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getBtnDescargar()).click();
        EsperaImplicita.esperaImplicitaWeb(7);
    }

    @Step
    public void validarDescargas() throws AWTException {
        robot.control_J();
        EsperaImplicita.esperaImplicitaWeb(5);
        /** Metodo para cambiar el foco de pestanha **/
        ArrayList<String> tabs2 = new ArrayList<String>(integraCuadreYConciliacionObject.getDriver().getWindowHandles());
        integraCuadreYConciliacionObject.getDriver().switchTo().window(tabs2.get(1));
    }


    /**
     * Optener Montos
     **/

    @Step
    public void obtenerMontos(String entidad) {
        EsperaImplicita.esperaImplicitaWeb(3);
        try {
            integraCuadreYConciliacionObject.getDriver().findElement(By.xpath("//table[@id='cntrlID']//tr//td[text()='" + entidad + "']")).isDisplayed();
            /**Monto a Favor**/
            montoafavorCuadre = integraCuadreYConciliacionObject.getDriver().findElement(By.xpath("//table[@id='cntrlID']//tr//td[text()='" + entidad + "']//following-sibling::td[65]")).getText();
            System.out.println("El monto a favor es: " + montoafavorCuadre);
            /**Monto en Contra**/
            montoencontraCuadre = integraCuadreYConciliacionObject.getDriver().findElement(By.xpath("//table[@id='cntrlID']//tr//td[text()='" + entidad + "']//following-sibling::td[66]")).getText();
            System.out.println("El monto en contra es: " + montoencontraCuadre);
        } catch (Exception e) {
            System.out.println("NO SE ENCONTRO LA ENTIDAD");
        }
    }

    @Step
    public void clickPlanillaDeCompensacion() {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getBtnPlanillaDeCompensacion());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getBtnPlanillaDeCompensacion()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void escribirFechaa(String fecha) {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getLblFecha());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getLblFecha()).clear();
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getLblFecha()).sendKeys(fecha);
    }

    @Step
    public void seleccionarCicloo(String ciclo) {
        EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getSelectCiclo());
        integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getSelectCiclo()).click();
        integraCuadreYConciliacionObject.getDriver().findElement(By.xpath("//option[contains(text(),'" + ciclo + "')]")).click();
    }


    @Step
    public void clickBotonEnviarr() {
        try {
            EsperaExplicita.esperaexplilicitaClick(integraCuadreYConciliacionObject.getDriver(), integraCuadreYConciliacionObject.getBtnEnviar());
            integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getBtnEnviar()).click();
            /**Hacer Scroll**/
            JavascriptExecutor jse = (JavascriptExecutor) integraCuadreYConciliacionObject.getDriver();
            jse.executeScript("window.scrollBy(0,1500)");
            EsperaImplicita.esperaImplicitaWeb(3);
        } catch (Exception e) {
            integraCuadreYConciliacionObject.getDriver().findElement(integraCuadreYConciliacionObject.getBtnEnviar()).click();
            /**Hacer Scroll**/
            JavascriptExecutor jse = (JavascriptExecutor) integraCuadreYConciliacionObject.getDriver();
            jse.executeScript("window.scrollBy(0,1500)");
            EsperaImplicita.esperaImplicitaWeb(3);
        }
    }

    @Step
    public void obtenerMontosCompensacion() {
        montoafavorCompensacion = integraCuadreYConciliacionObject.getDriver().findElement(By.xpath("//td[contains(text(),'VALOR NETO')]//following-sibling::td[1]")).getText();
        montoencontraCompensacion = integraCuadreYConciliacionObject.getDriver().findElement(By.xpath("//td[contains(text(),'VALOR NETO')]//following-sibling::td[2]")).getText();
        System.out.println("El monto a favor de compensacion es: " + montoafavorCompensacion);
        System.out.println("El monto en contra de compensacion es: " + montoencontraCompensacion);
    }

    @Step
    public void validacionDeMontos() {
        Assert.assertEquals(montoafavorCuadre, montoencontraCompensacion);
        Assert.assertEquals(montoencontraCuadre, montoafavorCompensacion);
    }
}
