package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraCierreDeCicloStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class CierreDeCicloExitosoStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraCierreDeCicloStep integraCierreDeCicloStep;

    @When("^Ingresar a cierre de ciclo y busca el ciclo a cerrar$")
    public void ingresarACierreDeCicloYBuscaElCicloACerrar() throws AWTException {
        integraMenuPrincipalStep.clickModuloDeCiclos();
        integraMenuPrincipalStep.clickCierreDeCiclo();
        integraCierreDeCicloStep.escribirFechaDelCicloAcerrar();
        integraCierreDeCicloStep.clickBotonBuscarCiclo();
        integraCierreDeCicloStep.clickBotonCerrar();
        integraCierreDeCicloStep.clickBotonSi();
    }
    @When("^Ingresar a cierre de ciclo y busca los ciclos a cerrar$")
    public void ingresarACierreDeCicloYBuscaLosCiclosACerrar() throws AWTException {
        integraMenuPrincipalStep.clickModuloDeCiclos();
        integraMenuPrincipalStep.clickCierreDeCiclo();
        integraCierreDeCicloStep.escribirFechaDelCicloAcerrar();
        integraCierreDeCicloStep.clickBotonBuscarCiclo();
        integraCierreDeCicloStep.clickBotonCerrar();
        integraCierreDeCicloStep.clickBotonSi();
        integraCierreDeCicloStep.validarCierreDeCiclo();
        integraMenuPrincipalStep.clickCierreDeCiclo();
        integraCierreDeCicloStep.escribirFechaDelCicloAcerrar();
        integraCierreDeCicloStep.clickBotonBuscarCiclo();
        integraCierreDeCicloStep.clickBotonCerrar();
        integraCierreDeCicloStep.clickBotonSi();

    }


    @Then("^Valido mensaje de cierre exitoso$")
    public void validoMensajeDeCierreExitoso() {
        integraCierreDeCicloStep.validarCierreDeCiclo();
    }


}
