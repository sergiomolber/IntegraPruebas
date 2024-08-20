package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

//@DefaultUrl("https://internal-aws-prb-alb-hubpagos-251357922.us-east-1.elb.amazonaws.com:8443//VolPayHubUI/#/hybridlogin")

@DefaultUrl("https://internal-AWS-PRB-ELB-INTEGRA-232973454.us-east-1.elb.amazonaws.com:8443/VolPayHubUI/#/hybridlogin")
public class IntegraInicioObject extends PageObject {

    By btnSelect = By.xpath("//body/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/select[1]");
    By optTipoEntidad = By.xpath("//*[text()='EF']");
    By btnVamos = By.xpath("//*[text()='Vamos']");
    By lblUsuario = By.id("username");
    By lblContraseña = By.id("password");
    By btnIngresar = By.xpath("//*[text()='Ingresar']");
    By txtBienvenido = By.xpath("//h2[contains(text(),'Bienvenido a ACH Colombia')]");

    By txtDatosNoValidos = By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]");

    By btnRecuperarContraseña = By.xpath("//a[contains(text(),'Recuperar Contraseña')]");

    By txtIdUsuario = By.xpath("//input[@name='UserId']");
    By txtIdCorreo = By.xpath("//input[@id='EmailId_ForgotPass']");

    By btnBuscar = By.xpath("//span[contains(.,'Buscar')]");





    public IntegraInicioObject() {
    }

    public By getTxtDatosNoValidos() {return txtDatosNoValidos; }

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

    public By getbtnRecuperarContraseña() {
        return btnRecuperarContraseña;

    }

    public By gettxtIdUsuario() {
        return txtIdUsuario;

    }
    public By gettxtIdCorreo() {
        return txtIdCorreo;

    }

    public By getbtnBuscar() {
        return btnBuscar;

    }

}
