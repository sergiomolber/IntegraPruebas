package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class SubirVariosArchivosStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraSubirArchivoStep integraSubirArchivoStep;


    @Steps
    IntegraInstruccionesRecibidasStep integraInstruccionesRecibidasStep;

    @When("^Subir archivo y diligenciar formulario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void subir_archivo_y_diligenciar_formulario(String entidad, String servicio, String formato, String urlArchivo) throws AWTException, InterruptedException {

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

    @When("^Subir Segundo archivo y diligenciar formulario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void subirSegundoArchivoYDiligenciarFormularioEntidadServicioFormatoUrlArchivo(String entidad2, String servicio, String formato, String urlArchivo2) throws AWTException, InterruptedException {
        integraMenuPrincipalStep.clickSubirArchivo();
        integraSubirArchivoStep.seleccionarEntidad(entidad2);
        integraSubirArchivoStep.seleccionarServicio(servicio);
        integraSubirArchivoStep.seleccionarFormato(formato);
        integraSubirArchivoStep.clickEnSeleccionarArchivo(urlArchivo2);
        integraSubirArchivoStep.subirArchivo();
        integraSubirArchivoStep.clickEnInstruccionesRecibidas();
        integraSubirArchivoStep.IngresarTransacciones();


    }

    @When("^Subir Tercer archivo y diligenciar formulario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void subirTercerArchivoYDiligenciarFormularioEntidadServicioFormatoUrlArchivo(String entidad3, String servicio, String formato, String urlArchivo3) throws AWTException, InterruptedException {
        integraMenuPrincipalStep.clickSubirArchivo();
        integraSubirArchivoStep.seleccionarEntidad(entidad3);
        integraSubirArchivoStep.seleccionarServicio(servicio);
        integraSubirArchivoStep.seleccionarFormato(formato);
        integraSubirArchivoStep.clickEnSeleccionarArchivo(urlArchivo3);
        integraSubirArchivoStep.subirArchivo();
        integraSubirArchivoStep.clickEnInstruccionesRecibidas();
        integraSubirArchivoStep.IngresarTransacciones();


    }

    @When("^Subir Cuarto archivo y diligenciar formulario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void subirCuartoArchivoYDiligenciarFormularioEntidadServicioFormatoUrlArchivo(String entidad4, String servicio, String formato, String urlArchivo4) throws AWTException, InterruptedException {
        integraMenuPrincipalStep.clickSubirArchivo();
        integraSubirArchivoStep.seleccionarEntidad(entidad4);
        integraSubirArchivoStep.seleccionarServicio(servicio);
        integraSubirArchivoStep.seleccionarFormato(formato);
        integraSubirArchivoStep.clickEnSeleccionarArchivo(urlArchivo4);
        integraSubirArchivoStep.subirArchivo();
        integraSubirArchivoStep.clickEnInstruccionesRecibidas();
        integraSubirArchivoStep.IngresarTransacciones();


    }

    @Then("^Validar autorización y estado del archivo exitoso \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void validar_autorizacion_y_estado_del_archivo_exitoso(String usuario, String clave, String tipoDeEntidad) {
        integraInicioStep.ingresarAutorizacionAprover(usuario, clave);
        //integraCerrarSesionObject.CerrarSesion();
    }



}




