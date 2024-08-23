package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraPlanillaConsolidadaObject extends PageObject {

    /**
     * Consultar por fecha y ciclo
     **/
    By lblFecha = By.id("FromDate");
    By selectCiclo = By.id("CycleSelect");
    By selectEntidad = By.xpath("//select[@id='EntitySelect']");
    By btnEnviar = By.id("okBtn");
    By btnPlanillaDeCompensacion = By.xpath("(//span[contains(text(),'Planilla de Compensación')])[1]");
    By txtValidacionPlanilla = By.xpath("//th[contains(text(),'Entidad')]");

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

    public By getBtnPlanillaDeCompensacion() {
        return btnPlanillaDeCompensacion;
    }

    public By getTxtValidacionPlanilla() {
        return txtValidacionPlanilla;
    }

}
