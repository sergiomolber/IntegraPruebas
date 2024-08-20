package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraSolicitudTiempoExtraStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class EliminarSolicitudTiempoExtraStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraSolicitudTiempoExtraStep integraLimitesStep;

    @When("^Ingresar a solicitud de tiempo extra busca y eliminar \"([^\"]*)\"$")
    public void ingresarALimitesYBuscaElLimiteAEliminar(String solicitudAEliminar) throws AWTException {
        //integraMenuPrincipalStep.clickCatalogo();
        //integraMenuPrincipalStep.clickSolicitudTiempoExtra();
        integraLimitesStep.clickEnFiltrar();
        integraLimitesStep.filtroPorJustificacion();
        integraLimitesStep.nombreDeSolicitudAEliminar(solicitudAEliminar);
        integraLimitesStep.clickEnBuscar();
        integraLimitesStep.clickEnBorrar();
        integraLimitesStep.clickEnSi();
    }

    @Then("^Valido mensaje de eliminacion exitosa$")
    public void validoMensajeDeEliminacionExitosa() {
        integraLimitesStep.validarEliminacionDelaSolicitud();
    }
}
