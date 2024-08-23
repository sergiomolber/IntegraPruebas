package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraPlanillaDeCompensacionObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.ListaDesplegable;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class IntegraPlanillaDeCompensacionStep {
    IntegraPlanillaDeCompensacionObject integraPlanillaDeCompensacionObject;
    ListaDesplegable listaDesplegable;

    /**
     * Consultar por fecha y ciclo
     **/
    @Step
    public void escribirFecha(String fecha) {
        EsperaExplicita.esperaexplilicitaClick(integraPlanillaDeCompensacionObject.getDriver(), integraPlanillaDeCompensacionObject.getLblFecha());
        integraPlanillaDeCompensacionObject.getDriver().findElement(integraPlanillaDeCompensacionObject.getLblFecha()).clear();
        integraPlanillaDeCompensacionObject.getDriver().findElement(integraPlanillaDeCompensacionObject.getLblFecha()).sendKeys(fecha);
    }

    @Step
    public void seleccionarCiclo(String ciclo) {
        EsperaExplicita.esperaexplilicitaClick(integraPlanillaDeCompensacionObject.getDriver(), integraPlanillaDeCompensacionObject.getSelectCiclo());
        integraPlanillaDeCompensacionObject.getDriver().findElement(integraPlanillaDeCompensacionObject.getSelectCiclo()).click();
//        listaDesplegable.seleccionarTextoVisible(integraPlanillaDeCompensacionObject.getDriver(), integraPlanillaDeCompensacionObject.getSelectCiclo(), ciclo);
        integraPlanillaDeCompensacionObject.getDriver().findElement(By.xpath("(//*[text()='" + ciclo + "'])")).click();
    }

    @Step
    public void seleccionarEntidad(String entidad) {
        integraPlanillaDeCompensacionObject.getDriver().findElement(integraPlanillaDeCompensacionObject.getSelectEntidad()).click();
        integraPlanillaDeCompensacionObject.getDriver().findElement(By.xpath("(//*[contains(text(),'" + entidad + "')])")).click();
    }

    @Step
    public void clickBotonEnviar() {
        EsperaExplicita.esperaexplilicitaClick(integraPlanillaDeCompensacionObject.getDriver(), integraPlanillaDeCompensacionObject.getBtnEnviar());
        integraPlanillaDeCompensacionObject.getDriver().findElement(integraPlanillaDeCompensacionObject.getBtnEnviar()).click();
    }

    @Step
    public void validarConsulta() {
        EsperaExplicita.esperaExplicitaTexto(integraPlanillaDeCompensacionObject.getDriver(), integraPlanillaDeCompensacionObject.getTxtValidacionPlanilla());
        Assert.assertThat(integraPlanillaDeCompensacionObject.getDriver().findElement(integraPlanillaDeCompensacionObject.getTxtValidacionPlanilla()).isDisplayed(), Matchers.is(true));
    }

    /**
     * Validar campo reversiones
     **/
    @Step
    public void validarCampoReversiones() {
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraPlanillaDeCompensacionObject.getDriver();
        jse.executeScript("window.scrollBy(0,1000)");
        EsperaExplicita.esperaExplicitaTexto(integraPlanillaDeCompensacionObject.getDriver(), integraPlanillaDeCompensacionObject.getTxtValidacionDelCampoReversiones());
        Assert.assertThat(integraPlanillaDeCompensacionObject.getDriver().findElement(integraPlanillaDeCompensacionObject.getTxtValidacionDelCampoReversiones()).isDisplayed(), Matchers.is(true));
    }

    /**
     * Validar campo pago de comisiones
     **/
    @Step
    public void validarCampoPagoDeComisiones() {
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraPlanillaDeCompensacionObject.getDriver();
        jse.executeScript("window.scrollBy(0,1500)");
        EsperaExplicita.esperaExplicitaTexto(integraPlanillaDeCompensacionObject.getDriver(), integraPlanillaDeCompensacionObject.getTxtValidacionDelCampoPagoDeComisiones());
        Assert.assertThat(integraPlanillaDeCompensacionObject.getDriver().findElement(integraPlanillaDeCompensacionObject.getTxtValidacionDelCampoPagoDeComisiones()).isDisplayed(), Matchers.is(true));
    }
}
