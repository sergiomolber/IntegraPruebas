package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraCuadreYConciliacionObject extends PageObject {
    /**
     * Consultar por fecha y ciclo
     **/
    By lblFecha = By.id("FromDate");
    By selectCiclo1 = By.id("CycleSelect1");
    By selectCiclo = By.id("CycleSelect");
    By selectEntidad = By.xpath("//select[@id='EntitySelect']");
    By btnEnviar = By.id("okBtn");
    By btnPlanillaDeCompensacion = By.xpath("(//span[contains(text(),'Planilla de Compensación')])[1]");
    By txtValidacionPlanilla = By.xpath("//th[contains(text(),'Entidad')]");

    By btnExportar = By.cssSelector(".fa-download");
    By selectTxt = By.xpath("(//*[@Class='radiobtns radioBtnAlighn'])[1]");
    By selectCsv = By.xpath("(//*[@Class='radiobtns radioBtnAlighn'])[2]");
    By selectPdf = By.xpath("(//*[@Class='radiobtns radioBtnAlighn'])[3]");
    By selectXls = By.xpath("(//*[@Class='radiobtns radioBtnAlighn'])[4]");
    By BtnDescargar = By.xpath("//*[@Class='fa fa-file-excel-o fa-fs14']");

    public By getLblFecha() {
        return lblFecha;
    }

    public By getSelectCiclo1() {
        return selectCiclo1;
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

    public By getBtnExportar() {
        return btnExportar;
    }

    public By getSelectTxt() {
        return selectTxt;
    }

    public By getSelectCsv() {
        return selectCsv;
    }

    public By getSelectPdf() {
        return selectPdf;
    }

    public By getSelectXls() {
        return selectXls;
    }

    public By getBtnDescargar() {
        return BtnDescargar;
    }
}
