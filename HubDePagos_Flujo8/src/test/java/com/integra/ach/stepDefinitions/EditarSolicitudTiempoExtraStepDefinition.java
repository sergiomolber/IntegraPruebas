package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraSolicitudTiempoExtraStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class EditarSolicitudTiempoExtraStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraSolicitudTiempoExtraStep integraLimitesStep;

    @When("^Ingresar a solicitud de tiempo extra y edito la informacion \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"$")
    public void ingresarASolicitudDeTiempoExtraYEditoLaInformacion(String solicitudAEditar, String minutosAEditar, String sancionAEditar, String justificacionAEditar, String estadoAEditar) throws AWTException {
        //integraMenuPrincipalStep.clickCatalogo();
        //integraMenuPrincipalStep.clickSolicitudTiempoExtra();
        integraLimitesStep.clickEnFiltrar();
        integraLimitesStep.filtroPorJustificacion();
        integraLimitesStep.justificacionABuscar(solicitudAEditar);
        integraLimitesStep.clickEnBuscar();
        integraLimitesStep.clickEnEditar();
        integraLimitesStep.editarMinutos(minutosAEditar);
        integraLimitesStep.editarSancion(sancionAEditar);
        integraLimitesStep.editarJustificacion(justificacionAEditar);
        integraLimitesStep.editarFechaSolicitud();
        integraLimitesStep.editarEstado(estadoAEditar);
        integraLimitesStep.editarCiclo();
        integraLimitesStep.guardarCambios();
    }

    @Then("^Valido mensaje de edicion exitosa$")
    public void validoMensajeDeEdicionExitosa() {
        integraLimitesStep.validarEdicionDeSolicitudTiempoExtra();
    }
}
