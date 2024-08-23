package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraPlanillaDeCompensacionObject extends PageObject {
    /**
     * Consultar por fecha y ciclo
     **/
    By lblFecha = By.id("FromDate");
    By selectCiclo = By.id("CycleSelect");
    By selectEntidad = By.id("EntitySelect");
    By btnEnviar = By.id("okBtn");
    By txtValidacionPlanilla = By.xpath("//h2[contains(text(),'Planilla de Compensación')]");

    /**
     * Validar campo reversiones
     **/
    By txtValidacionDelCampoReversiones = By.xpath("//th[contains(text(),'Reversiones')]");

    /**
     * Validar campo pago de comisiones
     **/
    By txtValidacionDelCampoPagoDeComisiones = By.xpath("//th[contains(text(),'Pago Comisiones')]");

    public By getLblFecha() {
        return lblFecha;
    }

    public By getSelectCiclo() {
        return selectCiclo;
    }

    public By getSelectEntidad() {
        return selectEntidad;
    }

    public By getBtnEnviar() {
        return btnEnviar;
    }

    public By getTxtValidacionPlanilla() {
        return txtValidacionPlanilla;
    }

    /**
     * Validar campo reversiones
     **/
    public By getTxtValidacionDelCampoReversiones() {
        return txtValidacionDelCampoReversiones;
    }

    /**
     * Validar campo pago de comisiones
     **/
    public By getTxtValidacionDelCampoPagoDeComisiones() {
        return txtValidacionDelCampoPagoDeComisiones;
    }
}
