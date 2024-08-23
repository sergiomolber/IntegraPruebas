package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://internal-aws-prb-elb-integra-232973454.us-east-1.elb.amazonaws.com:8443/VolPayHubUI/#/hybridlogin")
//@DefaultUrl("https://internal-AWS-PRB-ELB-INTEGRA-232973454.us-east-1.elb.amazonaws.com:8443/VolPayHubUI/#/hybridlogin")
public class IntegraInicioObject extends PageObject {

    By btnSelect = By.xpath("//body/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/select[1]");
    By optTipoEntidad = By.xpath("//body/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/select[1]");
    By btnVamos = By.xpath("//*[text()='Vamos']");
    By lblUsuario = By.id("username");
    By lblContraseña = By.id("password");
    By btnIngresar = By.xpath("//*[text()='Ingresar']");
    By txtBienvenido = By.xpath("//h2[contains(text(),'Bienvenido a ACH Colombia')]");


    By txtUsuarioApro = By.xpath("//input[@name='UserID']");
    By txtClaveApro = By.xpath("(//input[@name='UserID'])[2]");
    By txtbtnAceptarApro = By.xpath("//*[@id=\"ViewFXDetails\"]/div/div/div[2]/div/div/div/form/div[2]/button[2]");

    public By getBtnSelect() {
        return btnSelect;
    }

    public By getOptTipoEntidad() {
        return optTipoEntidad;
    }

    public By getBtnVamos() {
        return btnVamos;
    }

    public By getLblUsuario() {
        return lblUsuario;
    }

    public By getLblContraseña() {
        return lblContraseña;
    }

    public By getBtnIngresar() {
        return btnIngresar;
    }

    public By getTxtBienvenido() {
        return txtBienvenido;
    }

    public By gettxtUsuarioApro() {
        return txtUsuarioApro;
    }

    public By gettxtClaveApro() {
        return txtClaveApro;
    }
    public By gettxtbtnAceptarApro() {
        return txtbtnAceptarApro;
    }

}
