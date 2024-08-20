package com.integra.ach.steps;


import com.integra.ach.pageObject.IntegraInicioObject;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Utilidades;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class IntegraInicioStep {
    IntegraInicioObject integraInicioObject;
    EsperaImplicita esperaImplicita;

    @Step
    public void abrirWeb() {
        integraInicioObject.open();
    }

    @Step
    public void SeleccionarTipoEntidad() {
        integraInicioObject.getDriver().findElement(integraInicioObject.getBtnSelect()).click();
        integraInicioObject.getDriver().findElement(integraInicioObject.getOptTipoEntidad()).click();
    }

    @Step
    public void clickBotonVamos() {
        integraInicioObject.getDriver().findElement(integraInicioObject.getBtnVamos()).click();
    }



    @Step
    public void escribirUsuarioYContrasena(String usuario, String clave) {
        integraInicioObject.getDriver().findElement(integraInicioObject.getLblUsuario()).sendKeys(usuario);
        integraInicioObject.getDriver().findElement(integraInicioObject.getLblContraseña()).sendKeys(clave);
    }

    @Step
    public void clickIngresar() {
        Utilidades.esperarExplicito30( integraInicioObject.getDriver(),integraInicioObject.getBtnIngresar());
        Utilidades.esperar(5000);
        integraInicioObject.getDriver().findElement(integraInicioObject.getBtnIngresar()).click();
    }

    @Step
    public void validarInicioDeSesionExitoso() {
        Utilidades.esperarExplicito30( integraInicioObject.getDriver(),integraInicioObject.getTxtBienvenido());
        Utilidades.esperar(5000);
        Assert.assertTrue(integraInicioObject.getDriver().findElement(integraInicioObject.getTxtBienvenido()).getText(), true);
    }

    @Step
    public void validarInicioDeSesionFallidoCredenciales() {
        Utilidades.esperar(5000);
        Assert.assertTrue(integraInicioObject.getDriver().findElement(integraInicioObject.getTxtDatosNoValidos()).getText(), true);
    }

    @Step
    public void validarInicioDeSesionFallidoBloqueado() {

        Utilidades.esperar(5000);
        Assert.assertTrue(integraInicioObject.getDriver().findElement(integraInicioObject.getTxtDatosNoValidos()).getText(), true);
    }

    @Step
    public void validarInicioDeSesionFallidoUsuarioNoRegistrado() {

        Utilidades.esperar(5000);
        Assert.assertTrue(integraInicioObject.getDriver().findElement(integraInicioObject.getTxtDatosNoValidos()).getText(), true);
    }

    @Step
    public void RecuperarContraseña() {
        integraInicioObject.getDriver().findElement(integraInicioObject.getbtnRecuperarContraseña()).click();
    }

    @Step
    public void IdDelUsuario(String IdUsuario) {
        Utilidades.esperarExplicito30( integraInicioObject.getDriver(),integraInicioObject.gettxtIdUsuario());
        integraInicioObject.getDriver().findElement(integraInicioObject.gettxtIdUsuario()).sendKeys(IdUsuario);

    }

    @Step
    public void IdDelCorreo(String IdCorreo) {
        Utilidades.esperarExplicito30( integraInicioObject.getDriver(),integraInicioObject.gettxtIdCorreo());
        integraInicioObject.getDriver().findElement(integraInicioObject.gettxtIdCorreo()).sendKeys(IdCorreo);

    }

    @Step
    public void btnBuscar() {
        integraInicioObject.getDriver().findElement(integraInicioObject.getbtnBuscar()).click();
    }

    @Step
    public void seleccionarTipoEntidad(String tipoDeEntidad) {
        Utilidades.esperarExplicito30(integraInicioObject.getDriver(), integraInicioObject.getBtnSelect());
        integraInicioObject.getDriver().findElement(integraInicioObject.getBtnSelect()).click();
        Select s = new Select(integraInicioObject.getDriver().findElement(integraInicioObject.getOptTipoEntidad()));
        s.selectByValue(tipoDeEntidad);
    }



}
