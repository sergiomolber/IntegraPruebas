package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraInicioObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class IntegraInicioStep {
    IntegraInicioObject integraInicioObject;

    @Step
    public void abrirWeb() {
        integraInicioObject.open();
    }

    @Step
    public void seleccionarTipoEntidad(String tipoDeEntidad) {
        EsperaExplicita.esperaexplilicitaClick(integraInicioObject.getDriver(), integraInicioObject.getBtnSelect());
        integraInicioObject.getDriver().findElement(integraInicioObject.getBtnSelect()).click();
        Select s = new Select(integraInicioObject.getDriver().findElement(integraInicioObject.getOptTipoEntidad()));
        s.selectByValue(tipoDeEntidad);
    }

    @Step
    public void clickBotonVamos() {
        EsperaExplicita.esperaexplilicitaClick(integraInicioObject.getDriver(), integraInicioObject.getBtnVamos());
        integraInicioObject.getDriver().findElement(integraInicioObject.getBtnVamos()).click();
    }

    @Step
    public void escribirUsuarioYContrasena(String usuario, String clave) {
        EsperaExplicita.esperaexplilicitaClick(integraInicioObject.getDriver(),integraInicioObject.getLblUsuario());
        integraInicioObject.getDriver().findElement(integraInicioObject.getLblUsuario()).sendKeys(usuario);
        EsperaExplicita.esperaexplilicitaClick(integraInicioObject.getDriver(),integraInicioObject.getLblContraseña());
        integraInicioObject.getDriver().findElement(integraInicioObject.getLblContraseña()).sendKeys(clave);
    }

    @Step
    public void clickIngresar() {
        EsperaExplicita.esperaexplilicitaClick(integraInicioObject.getDriver(), integraInicioObject.getBtnIngresar());
        integraInicioObject.getDriver().findElement(integraInicioObject.getBtnIngresar()).click();
    }

    @Step
    public void validarInicioDeSesion() {
        EsperaExplicita.esperaExplicitaTexto(integraInicioObject.getDriver(), integraInicioObject.getTxtBienvenido());
        Assert.assertTrue(integraInicioObject.getDriver().findElement(integraInicioObject.getTxtBienvenido()).getText(), true);
    }

    @Step
    public void ingresarAutorizacionAprover(String usuario, String clave) {
        EsperaImplicita.esperaImplicitaWeb(4);
        integraInicioObject.getDriver().findElement(integraInicioObject.gettxtUsuarioApro()).click();
        integraInicioObject.getDriver().findElement(integraInicioObject.gettxtUsuarioApro()).sendKeys(usuario); // Aquí agregas el texto adicional
        integraInicioObject.getDriver().findElement(integraInicioObject.gettxtClaveApro()).click();
        integraInicioObject.getDriver().findElement(integraInicioObject.gettxtClaveApro()).sendKeys(clave);
        EsperaImplicita.esperaImplicitaWeb(3);
        integraInicioObject.getDriver().findElement(integraInicioObject.gettxtbtnAceptarApro()).click();
        EsperaImplicita.esperaImplicitaWeb(10);
        JavascriptExecutor jse = (JavascriptExecutor) integraInicioObject.getDriver();
        jse.executeScript("window.scrollBy(0,-900)");
        EsperaImplicita.esperaImplicitaWeb(5);

    }

}
