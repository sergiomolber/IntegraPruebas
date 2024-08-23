package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraInstruccionesRecibidasObject extends PageObject {
    By btnActualizarPage = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]");
    By btnVistaLista = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/i[1]");
    public By getBtnActualizarPage() {return btnActualizarPage;}

    public By getBtnVistaLista() {return btnVistaLista;}
}
