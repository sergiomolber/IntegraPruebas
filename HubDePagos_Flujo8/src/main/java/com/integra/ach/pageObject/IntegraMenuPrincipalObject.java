package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraMenuPrincipalObject extends PageObject {
    By btnCatalogos = By.xpath("//span[contains(text(),'Catálogos')]");
    By btnSolicitudTiempoExtra = By.xpath("//span[contains(text(),'Solicitud Tiempo Extra ACH')]");

    public By getBtnCatalogos() {
        return btnCatalogos;
    }

    public By getBtnSolicitudTiempoExtra() {
        return btnSolicitudTiempoExtra;
    }
}
