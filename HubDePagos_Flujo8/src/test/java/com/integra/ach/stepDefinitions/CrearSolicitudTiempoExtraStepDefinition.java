package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraSolicitudTiempoExtraStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class CrearSolicitudTiempoExtraStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraSolicitudTiempoExtraStep integraLimitesStep;

    @Given("^Login exitoso1 \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void loginExitoso(String tipoDeEntidad, String usuario, String clave) {
        integraInicioStep.abrirWeb();
        integraInicioStep.seleccionarTipoEntidad(tipoDeEntidad);
        integraInicioStep.clickBotonVamos();
        integraInicioStep.escribirUsuarioYContrasena(usuario, clave);
        integraInicioStep.clickIngresar();
        integraInicioStep.validarInicioDeSesionExitoso();
    }

    @When("^Ingresar a solicitud tiempo extra y diligenciar formulario de creacion \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"$")
    public void ingresarASolicitudTiempoExtraYDiligenciarFormularioDeCreacion(String entidadSolicitudTiempoExtra, String minutos, String sancion, String justificacion,  String estado) throws AWTException {
        integraMenuPrincipalStep.clickCatalogo();
        integraMenuPrincipalStep.clickSolicitudTiempoExtra();
        integraLimitesStep.clickBotonMas();
        integraLimitesStep.seleccionarEntidad(entidadSolicitudTiempoExtra);
        integraLimitesStep.escribirMinutos(minutos);
        integraLimitesStep.seleccionarSancion(sancion);
        integraLimitesStep.escribirJustifiacion(justificacion);
        integraLimitesStep.escribirfecha();
        integraLimitesStep.seleccionarEstado(estado);
        integraLimitesStep.seleccionarCiclo();
        integraLimitesStep.clickEnCrear();
    }

    @Then("^Valido mensaje de creacion exitosa$")
    public void validoMensajeDeCreacionExitosa() {
        integraLimitesStep.validarCreacionDelLimite();
    }
}
