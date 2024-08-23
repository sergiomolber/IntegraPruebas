package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraPlanillaDeCompensacionStep;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ValidacionCampoReversionesStepDefinition {

    @Steps
    IntegraPlanillaDeCompensacionStep integraPlanillaDeCompensacionStep;

    @Then("^Valido la existencia del campo reversiones$")
    public void validoLaExistenciaDelCampoReversiones() {
        integraPlanillaDeCompensacionStep.validarCampoReversiones();
    }
}
