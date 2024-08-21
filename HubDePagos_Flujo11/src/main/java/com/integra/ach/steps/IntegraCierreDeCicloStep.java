package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraCierreDeCicloObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class IntegraCierreDeCicloStep {
    IntegraCierreDeCicloObject integraCierreDeCicloObject;

    /**
     * Consulta de cierres de ciclo
     **/
    @Step
    public void escribirFechaDelCicloAConsultar() {
        String fechaDeCicloAConsultar = Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraCierreDeCicloObject.getDriver(), integraCierreDeCicloObject.getLblFecha());
        integraCierreDeCicloObject.getDriver().findElement(integraCierreDeCicloObject.getLblFecha()).clear();
        integraCierreDeCicloObject.getDriver().findElement(integraCierreDeCicloObject.getLblFecha()).sendKeys(fechaDeCicloAConsultar);
    }

    @Step
    public void clickBotonBuscar() {
        EsperaExplicita.esperaexplilicitaClick(integraCierreDeCicloObject.getDriver(), integraCierreDeCicloObject.getBtnBuscar());
        integraCierreDeCicloObject.getDriver().findElement(integraCierreDeCicloObject.getBtnBuscar()).click();
    }

    @Step
    public void validarEstado() {
            EsperaExplicita.esperaexplilicitaClick(integraCierreDeCicloObject.getDriver(), integraCierreDeCicloObject.getTxtEstado());
            Assert.assertThat(integraCierreDeCicloObject.getDriver().findElement(integraCierreDeCicloObject.getTxtEstado()).isDisplayed(), Matchers.is(true));
    }

    /**
     * Cierre de ciclo exitoso
     **/
    @Step
    public void escribirFechaDelCicloAcerrar() {
        String fechaDeCicloACerrar = Robot.fechaHora();
        EsperaExplicita.esperaexplilicitaClick(integraCierreDeCicloObject.getDriver(), integraCierreDeCicloObject.getLblFecha());
        integraCierreDeCicloObject.getDriver().findElement(integraCierreDeCicloObject.getLblFecha()).clear();
        integraCierreDeCicloObject.getDriver().findElement(integraCierreDeCicloObject.getLblFecha()).sendKeys(fechaDeCicloACerrar);
        EsperaImplicita.esperaImplicitaWeb(5);
    }

    @Step
    public void clickBotonBuscarCiclo() {
        EsperaExplicita.esperaexplilicitaClick(integraCierreDeCicloObject.getDriver(), integraCierreDeCicloObject.getBtnBuscar());
        integraCierreDeCicloObject.getDriver().findElement(integraCierreDeCicloObject.getBtnBuscar()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }

    @Step
    public void clickBotonCerrar() {
        EsperaExplicita.esperaexplilicitaClick(integraCierreDeCicloObject.getDriver(), integraCierreDeCicloObject.getBtnCerrar());
        integraCierreDeCicloObject.getDriver().findElement(integraCierreDeCicloObject.getBtnCerrar()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }

    @Step
    public void clickBotonSi() {
        EsperaExplicita.esperaexplilicitaClick(integraCierreDeCicloObject.getDriver(), integraCierreDeCicloObject.getBtnSi());
        integraCierreDeCicloObject.getDriver().findElement(integraCierreDeCicloObject.getBtnSi()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void validarCierreDeCiclo() {
        EsperaExplicita.esperaexplilicitaClick(integraCierreDeCicloObject.getDriver(), integraCierreDeCicloObject.getTxtValidacionDeCierre());
        Assert.assertThat(integraCierreDeCicloObject.getDriver().findElement(integraCierreDeCicloObject.getTxtValidacionDeCierre()).isDisplayed(), Matchers.is(true));
    }

}
