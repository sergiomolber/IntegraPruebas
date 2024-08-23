package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraCuadreYConciliacionStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import com.integra.ach.steps.IntegraPlanillaConsolidadaStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ConsultaDeValidacionDeMontosStepDefinition {
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraCuadreYConciliacionStep integraCuadreYConciliacionStep;

    @Steps
    IntegraPlanillaConsolidadaStep integraPlanillaConsolidadaStep;

    @When("^Ingresar a cuadre y conciliacion y diligenciar formulario de consulta \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarACuadreYConciliacionYDiligenciarFormularioDeConsulta(String fecha, String ciclo, String entidad) {
        integraMenuPrincipalStep.clickReportesDeCompensacion();
        integraMenuPrincipalStep.clickCuadreYConciliacion();
        integraCuadreYConciliacionStep.escribirFecha(fecha);
        integraCuadreYConciliacionStep.seleccionarCiclo(ciclo);
        integraCuadreYConciliacionStep.clickBotonEnviar();
        integraCuadreYConciliacionStep.obtenerMontos(entidad);

        integraCuadreYConciliacionStep.clickPlanillaDeCompensacion();
        integraCuadreYConciliacionStep.escribirFechaa(fecha);
        integraCuadreYConciliacionStep.seleccionarCicloo(ciclo);
        integraCuadreYConciliacionStep.seleccionarEntidad(entidad);
        integraCuadreYConciliacionStep.clickBotonEnviarr();
        integraCuadreYConciliacionStep.obtenerMontosCompensacion();
    }

    @When("^Ingresar a planilla consolidada y diligenciar formulario de consulta \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarAPlanillaConsolidadaYDiligenciarFormularioDeConsulta(String fecha, String ciclo, String entidad) {
        integraMenuPrincipalStep.clickReportesDeCompensacion();
        integraMenuPrincipalStep.clickPlanillaConsolidada();
        integraPlanillaConsolidadaStep.escribirFecha(fecha);
        integraPlanillaConsolidadaStep.seleccionarCiclo(ciclo);
        integraPlanillaConsolidadaStep.clickBotonEnviar();
        integraPlanillaConsolidadaStep.obtenerMontos(entidad);

        integraPlanillaConsolidadaStep.clickPlanillaDeCompensacion();
        integraPlanillaConsolidadaStep.escribirFechaa(fecha);
        integraPlanillaConsolidadaStep.seleccionarCicloo(ciclo);
        integraPlanillaConsolidadaStep.seleccionarEntidad(entidad);
        integraPlanillaConsolidadaStep.clickBotonEnviarr();
        integraPlanillaConsolidadaStep.obtenerMontosCompensacion();
    }


    @Then("^Valido el monto a favor y el monto en contra$")
    public void validoElMontoAFavorYElMontoEnContra() {
        integraCuadreYConciliacionStep.validacionDeMontos();
    }
}
