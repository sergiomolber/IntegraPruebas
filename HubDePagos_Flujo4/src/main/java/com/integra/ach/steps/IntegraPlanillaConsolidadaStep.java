package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraPlanillaConsolidadaObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class IntegraPlanillaConsolidadaStep {
    IntegraPlanillaConsolidadaObject integraPlanillaConsolidadaObject;
    String montoafavorConsolidada;
    String montoencontraConsolidada;
    String montoafavorCompensacion;
    String montoencontraCompensacion;

    /**
     * Consultar por fecha y ciclo
     **/

    @Step
    public void escribirFecha(String fecha) {
        EsperaExplicita.esperaexplilicitaClick(integraPlanillaConsolidadaObject.getDriver(), integraPlanillaConsolidadaObject.getLblFecha());
        integraPlanillaConsolidadaObject.getDriver().findElement(integraPlanillaConsolidadaObject.getLblFecha()).clear();
        integraPlanillaConsolidadaObject.getDriver().findElement(integraPlanillaConsolidadaObject.getLblFecha()).sendKeys(fecha);
    }

    @Step
    public void seleccionarCiclo(String ciclo) {
        EsperaExplicita.esperaexplilicitaClick(integraPlanillaConsolidadaObject.getDriver(), integraPlanillaConsolidadaObject.getSelectCiclo());
        integraPlanillaConsolidadaObject.getDriver().findElement(integraPlanillaConsolidadaObject.getSelectCiclo()).click();
//        listaDesplegable.seleccionarTextoVisible(integraPlanillaDeCompensacionObject.getDriver(), integraPlanillaDeCompensacionObject.getSelectCiclo(), ciclo);
        integraPlanillaConsolidadaObject.getDriver().findElement(By.xpath("//option[contains(text(),'" + ciclo + "')]")).click();
    }

    @Step
    public void clickBotonEnviar() {
        EsperaExplicita.esperaexplilicitaClick(integraPlanillaConsolidadaObject.getDriver(), integraPlanillaConsolidadaObject.getBtnEnviar());
        integraPlanillaConsolidadaObject.getDriver().findElement(integraPlanillaConsolidadaObject.getBtnEnviar()).click();
    }

    @Step
    public void validarConsulta() {
        EsperaExplicita.esperaExplicitaTexto(integraPlanillaConsolidadaObject.getDriver(), integraPlanillaConsolidadaObject.getTxtValidacionPlanilla());
        Assert.assertThat(integraPlanillaConsolidadaObject.getDriver().findElement(integraPlanillaConsolidadaObject.getTxtValidacionPlanilla()).isDisplayed(), Matchers.is(true));
    }

    /**
     * Optener Montos
     **/

    @Step
    public void obtenerMontos(String entidad) {
        try {
            integraPlanillaConsolidadaObject.getDriver().findElement(By.xpath("//table[@id='cntrlID']//tbody//tr/td[text()='" + entidad + "']")).isDisplayed();
            /**Monto a Favor**/
            montoafavorConsolidada = integraPlanillaConsolidadaObject.getDriver().findElement(By.xpath("//table[@id='cntrlID']//tbody//tr/td[text()='" + entidad + "']/following-sibling::td[1]")).getText();
            System.out.println("El monto a favor es: " + montoafavorConsolidada);
            /**Monto en Contra**/
            montoencontraConsolidada = integraPlanillaConsolidadaObject.getDriver().findElement(By.xpath("//table[@id='cntrlID']//tbody//tr/td[text()='" + entidad + "']/following-sibling::td[2]")).getText();
            System.out.println("El monto en contra es: " + montoencontraConsolidada);
        } catch (Exception e) {
            System.out.println("NO SE ENCONTRO LA ENTIDAD");
        }
    }

    @Step
    public void clickPlanillaDeCompensacion() {
        EsperaExplicita.esperaexplilicitaClick(integraPlanillaConsolidadaObject.getDriver(), integraPlanillaConsolidadaObject.getBtnPlanillaDeCompensacion());
        integraPlanillaConsolidadaObject.getDriver().findElement(integraPlanillaConsolidadaObject.getBtnPlanillaDeCompensacion()).click();
    }

    @Step
    public void escribirFechaa(String fecha) {
        EsperaImplicita.esperaImplicitaWeb(3);
        integraPlanillaConsolidadaObject.getDriver().findElement(integraPlanillaConsolidadaObject.getLblFecha()).clear();
        integraPlanillaConsolidadaObject.getDriver().findElement(integraPlanillaConsolidadaObject.getLblFecha()).sendKeys(fecha);
    }

    @Step
    public void seleccionarCicloo(String ciclo) {
        EsperaExplicita.esperaexplilicitaClick(integraPlanillaConsolidadaObject.getDriver(), integraPlanillaConsolidadaObject.getSelectCiclo());
        integraPlanillaConsolidadaObject.getDriver().findElement(integraPlanillaConsolidadaObject.getSelectCiclo()).click();
//        listaDesplegable.seleccionarTextoVisible(integraPlanillaDeCompensacionObject.getDriver(), integraPlanillaDeCompensacionObject.getSelectCiclo(), ciclo);
        integraPlanillaConsolidadaObject.getDriver().findElement(By.xpath("//option[contains(text(),'" + ciclo + "')]")).click();
    }

    @Step
    public void seleccionarEntidad(String entidad) {
        EsperaExplicita.esperaexplilicitaClick(integraPlanillaConsolidadaObject.getDriver(), integraPlanillaConsolidadaObject.getSelectEntidad());
        integraPlanillaConsolidadaObject.getDriver().findElement(integraPlanillaConsolidadaObject.getSelectEntidad()).click();
//        listaDesplegable.seleccionarTextoVisible(integraPlanillaDeCompensacionObject.getDriver(), integraPlanillaDeCompensacionObject.getSelectCiclo(), ciclo);
        integraPlanillaConsolidadaObject.getDriver().findElement(By.xpath("//option[contains(text(),'" + entidad + "')]")).click();
    }

    @Step
    public void clickBotonEnviarr() {
        try {
            EsperaExplicita.esperaexplilicitaClick(integraPlanillaConsolidadaObject.getDriver(), integraPlanillaConsolidadaObject.getBtnEnviar());
            integraPlanillaConsolidadaObject.getDriver().findElement(integraPlanillaConsolidadaObject.getBtnEnviar()).click();
            /**Hacer Scroll**/
            JavascriptExecutor jse = (JavascriptExecutor) integraPlanillaConsolidadaObject.getDriver();
            jse.executeScript("window.scrollBy(0,500)");
            EsperaImplicita.esperaImplicitaWeb(3);
        } catch (Exception e) {
            integraPlanillaConsolidadaObject.getDriver().findElement(integraPlanillaConsolidadaObject.getBtnEnviar()).click();
            /**Hacer Scroll**/
            JavascriptExecutor jse = (JavascriptExecutor) integraPlanillaConsolidadaObject.getDriver();
            jse.executeScript("window.scrollBy(0,500)");
            EsperaImplicita.esperaImplicitaWeb(3);
        }
    }

    @Step
    public void obtenerMontosCompensacion() {
        montoafavorCompensacion = integraPlanillaConsolidadaObject.getDriver().findElement(By.xpath("//table[@id='cntrlID']//tr//td[text()='Total ACH']/following-sibling::td[2]")).getText();
        montoencontraCompensacion = integraPlanillaConsolidadaObject.getDriver().findElement(By.xpath("//table[@id='cntrlID']//tr//td[text()='Total ACH']/following-sibling::td[4]")).getText();
        System.out.println("El monto a favor de compensacion es: " + montoafavorCompensacion);
        System.out.println("El monto en contra de compensacion es: " + montoencontraCompensacion);
    }

    @Step
    public void validacionDeMontos() {
        Assert.assertEquals(montoafavorConsolidada, montoencontraCompensacion);
        Assert.assertEquals(montoencontraConsolidada, montoafavorCompensacion);
    }
}
