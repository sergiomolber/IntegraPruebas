package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraCierreDeCicloStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class ConsultaDeCierresDeCicloStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraCierreDeCicloStep integraCierreDeCicloStep;

    @Given("^Login exitoso para cierre de ciclo \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void loginExitosoParaCierreDeCiclo(String tipoDeEntidad, String usuario, String clave) {
        integraInicioStep.abrirWeb();
        integraInicioStep.seleccionarTipoEntidad(tipoDeEntidad);
        integraInicioStep.clickBotonVamos();
        integraInicioStep.escribirUsuarioYContrasena(usuario, clave);
        integraInicioStep.clickIngresar();
        integraInicioStep.validarInicioDeSesion();
    }

    @When("^Ingresar a modulo de ciclo luego cierre de ciclo y digita$")
    public void ingresarAModuloDeCicloLuegoCierreDeCicloYDigita() throws AWTException {
        integraMenuPrincipalStep.clickModuloDeCiclos();
        integraMenuPrincipalStep.clickCierreDeCiclo();
        integraCierreDeCicloStep.escribirFechaDelCicloAConsultar();
        integraCierreDeCicloStep.clickBotonBuscar();
    }

    @Then("^Valido el estado$")
    public void validoElEstado() {
        integraCierreDeCicloStep.validarEstado();
    }
}
