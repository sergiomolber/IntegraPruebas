package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraInstruccionesRecibidasStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import com.integra.ach.steps.IntegraSubirArchivoStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class SubirArchivoExitosoStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraSubirArchivoStep integraSubirArchivoStep;


    @Steps
    IntegraInstruccionesRecibidasStep integraInstruccionesRecibidasStep;



    @Given("^Login exitoso \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void login_exitoso_Aprover (String tipoDeEntidad, String usuario, String clave) {
        integraInicioStep.abrirWeb();
        integraInicioStep.seleccionarTipoEntidad(tipoDeEntidad);
        integraInicioStep.clickBotonVamos();
        integraInicioStep.escribirUsuarioYContrasena(usuario, clave);
        integraInicioStep.clickIngresar();
        integraInicioStep.validarInicioDeSesion();
    }


    @When("^Ingresar a subir archivo exitoso y diligenciar el formulario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresar_a_subir_archivo_exitoso_y_diligenciar_el_formulario(String entidad, String servicio, String formato, String urlArchivo) throws AWTException, InterruptedException {
        integraMenuPrincipalStep.clickModuloDeTransferencias();
        integraMenuPrincipalStep.clickSubirArchivo();
        integraSubirArchivoStep.seleccionarEntidad(entidad);
        integraSubirArchivoStep.seleccionarServicio(servicio);
        integraSubirArchivoStep.seleccionarFormato(formato);
        integraSubirArchivoStep.clickEnSeleccionarArchivo(urlArchivo);
        integraSubirArchivoStep.subirArchivo();
        integraSubirArchivoStep.validarMsjExitoso();
        integraSubirArchivoStep.clickEnInstruccionesRecibidas();
        integraSubirArchivoStep.IngresarTransacciones();

    }


    @Then("^Valido el cargue y el estado del archivo exitoso \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void valido_el_cargue_y_el_estado_del_archivo_exitoso(String usuario, String clave, String tipoDeEntidad) {
        integraInicioStep.ingresarAutorizacionAprover(usuario, clave);
        //integraCerrarSesionObject.CerrarSesion();


    }






}




