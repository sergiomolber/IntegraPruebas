package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class ConsultaPorFechaYCicloStepDefinition {
    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraCuadreYConciliacionStep integraCuadreYConciliacionStep;
    @Steps
    IntegraPlanillaConsolidadaStep integraPlanillaConsolidadaStep;
    @Steps
    IntegraPlanillaDeCompensacionStep integraPlanillaDeCompensacionStep;


    @When("^Ingresar a cuadre y conciliacion y diligenciar formulario de consulta \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarACuadreYConciliacionYDiligenciarFormularioDeConsulta(String fecha, String ciclo) {
        integraMenuPrincipalStep.clickReportesDeCompensacion();
        integraMenuPrincipalStep.clickCuadreYConciliacion();
        integraCuadreYConciliacionStep.escribirFecha(fecha);
        integraCuadreYConciliacionStep.seleccionarCiclo(ciclo);
        integraCuadreYConciliacionStep.clickBotonEnviar();
        integraCuadreYConciliacionStep.validarConsulta();
        integraCuadreYConciliacionStep.clickBotonExportarTxt();
        integraCuadreYConciliacionStep.clickSeleccionarTxt();
        integraCuadreYConciliacionStep.clickBotonDescargarTxt();
        integraCuadreYConciliacionStep.clickBotonExportarCsv();
        integraCuadreYConciliacionStep.clickSeleccionarCsv();
        integraCuadreYConciliacionStep.clickBotonDescargarCsv();
        integraCuadreYConciliacionStep.clickBotonExportarPdf();
        integraCuadreYConciliacionStep.clickSeleccionarPdf();
        integraCuadreYConciliacionStep.clickBotonDescargarPdf();
        integraCuadreYConciliacionStep.clickBotonExportarXls();
        integraCuadreYConciliacionStep.clickSeleccionarXls();
        integraCuadreYConciliacionStep.clickBotonDescargarXls();
    }



    @Then("^Valido la consulta y descarga de los export$")
    public void valido_la_consulta_y_descarga_de_los_export() throws AWTException {
        integraCuadreYConciliacionStep.validarDescargas();
    }

    @When("^Ingresar a planilla consolidada y diligenciar formulario de consulta \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarAPlanillaConsolidadaYDiligenciarFormularioDeConsulta(String fecha, String ciclo) {
        integraMenuPrincipalStep.clickReportesDeCompensacion();
        integraMenuPrincipalStep.clickPlanillaConsolidada();
        integraPlanillaConsolidadaStep.escribirFecha(fecha);
        integraPlanillaConsolidadaStep.seleccionarCiclo(ciclo);
        integraPlanillaConsolidadaStep.clickBotonEnviar();
    }

    @When("^Ingresar a planilla de compensacion y diligenciar formulario de consulta \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarAPlanillaDeCompensacionYDiligenciarFormularioDeConsulta(String fecha, String ciclo, String entidad) throws AWTException {
        integraMenuPrincipalStep.clickReportesDeCompensacion();
        integraMenuPrincipalStep.clickPlanillaDeCompensacion();
        integraPlanillaDeCompensacionStep.escribirFecha(fecha);
        integraPlanillaDeCompensacionStep.seleccionarCiclo(ciclo);
        integraPlanillaDeCompensacionStep.seleccionarEntidad(entidad);
        integraPlanillaDeCompensacionStep.clickBotonEnviar();
    }

    @Then("^Valido la consulta$")
    public void validoLaConsulta() {
        //integraPlanillaConsolidadaStep.validarConsulta();
        integraCuadreYConciliacionStep.clickBotonExportarTxt();
        integraCuadreYConciliacionStep.clickSeleccionarTxt();
        integraCuadreYConciliacionStep.clickBotonDescargarTxt();
        integraCuadreYConciliacionStep.clickBotonExportarCsv();
        integraCuadreYConciliacionStep.clickSeleccionarCsv();
        integraCuadreYConciliacionStep.clickBotonDescargarCsv();
        integraCuadreYConciliacionStep.clickBotonExportarPdf();
        integraCuadreYConciliacionStep.clickSeleccionarPdf();
        integraCuadreYConciliacionStep.clickBotonDescargarPdf();
        integraCuadreYConciliacionStep.clickBotonExportarXls();
        integraCuadreYConciliacionStep.clickSeleccionarXls();
        integraCuadreYConciliacionStep.clickBotonDescargarXls();
    }




}
