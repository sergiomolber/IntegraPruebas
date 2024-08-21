package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraCierreDeCicloStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import com.integra.ach.pageObject.IntegraCierreDeCicloObject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class CierreDeTodosLosCiclosStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraCierreDeCicloStep integraCierreDeCicloStep;
    @Steps
    IntegraCierreDeCicloObject integraCierreDeCicloObject;

    @When("^Ingresar a cierre de ciclo Para el ciclo a cerrar$")
    public void ingresarACierreDeCicloParaElCicloACerrar() throws AWTException {
        integraMenuPrincipalStep.clickModuloDeCiclos();
        integraMenuPrincipalStep.clickCierreDeCiclo();
        integraCierreDeCicloStep.escribirFechaDelCicloAcerrar();
        integraCierreDeCicloStep.clickBotonBuscarCiclo();
    }

    @Then("^El sistema cierra todos los ciclos del dia$")
    public void elSistemaCierraTodosLosCiclosDelDia() {

    }
}




