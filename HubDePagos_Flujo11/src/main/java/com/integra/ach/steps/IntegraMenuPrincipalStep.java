package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraMenuPrincipalObject;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import com.integra.ach.utils.Utilidades;
import net.thucydides.core.annotations.Step;
import java.awt.*;

public class IntegraMenuPrincipalStep {
    Robot robot = new Robot();
    IntegraMenuPrincipalObject integraMenuPrincipalObject;

    public IntegraMenuPrincipalStep() throws AWTException {
    }

    @Step
    public void clickModuloDeTransferencias() {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeTransferencias()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(2);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeTransferencias()).click();
    }

    @Step
    public void clickSubirArchivo() {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnSubirArchivo()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickModuloDeCiclos() throws AWTException {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeCiclos()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(3);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeCiclos()).click();
    }

    @Step
    public void clickCierreDeCiclo() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCierreDeCiclo()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickEnModuloDeSeguridad() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(3);
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloSeguridad()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(3);
        robot.control_Menos();
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloSeguridad()).click();
    }

    @Step
    public void clickAprobaciones() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnAprobaciones()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickEnModuloDeTransferencia() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(3);
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloTransferencias()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(3);
        robot.control_Menos();
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloTransferencias()).click();
    }

    @Step
    public void clickInstruccionesDistribuidas() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnInstruccionesDistribuidas()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(5);
    }

    @Step
    public void clickCatalogo() throws AWTException {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCatalogos()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(5);
        robot.control_Menos();
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCatalogos()).click();
    }

    @Step
    public void IngresarInscripcionDeCuentas() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnInscripcionDeCuentas()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }
    @Step
    public void IngresarAprobacionDeCuentas() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnAprobacionDeCuentas()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }


    @Step
    public void IngresarAutorizacionDeCuentas() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnAutorizacionDeCuentas()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickIntegrarERP() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnIntegrarERP()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickRestricciones() throws AWTException {
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnRestricciones()).click();
        robot.control_Mas();
        EsperaImplicita.esperaImplicitaWeb(2);
    }

    @Step
    public void clickUsuariosYRoles() throws AWTException {
        Utilidades.esperarExplicito30( integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getBtnUsuariosRoles());
        EsperaImplicita.esperaImplicitaWeb(3);
        Utilidades.esperar(2000);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnUsuariosRoles()).click();
    }

    @Step
    public void clickResstriccionHorarios() throws AWTException {
        Utilidades.esperarExplicito30( integraMenuPrincipalObject.getDriver(), integraMenuPrincipalObject.getBtnRestriccionHorarios());
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnRestriccionHorarios()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }
}


