package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraMenuPrincipalObject extends PageObject {
    By btnModuloDeTransferencias = By.xpath("//span[contains(text(),'Módulo de Transferencias')]");
    By btnSubirArchivo = By.xpath("//span[contains(text(),'Subir Archivo')]");

    By btnModuloDeCiclos = By.xpath("//span[contains(text(),'Módulo de Ciclos')]");
    By btnCierreDeCiclo = By.xpath("//span[contains(text(),'Cierre de Ciclo')]");
    By btnModuloSeguridad = By.xpath("//span[contains(text(),'Seguridad')]");
    By btnAprobaciones = By.xpath("(//span[contains(text(),'Aprobaciones')])[1]");

    By btnModuloTransferencias = By.xpath("//li[@id='PaymentModule']/a/span");
    By btnInstruccionesDistribuidas = By.xpath("//li[@id='DistributedInstructions']/a");

    By btnCatalogos = By.xpath("//span[contains(text(),'Catálogos')]");
    By btnInscripcionDeCuentas = By.xpath("//span[contains(text(),'Inscripción de Cuentas')]");
    By btnAprobacionDeCuentas = By.xpath("//span[contains(text(),'Aprobación de Cuentas')]");

    By btnAutorizacionDeCuentas = By.xpath("//*[@id=\"ACHRegisterAccounts\"]/a/span");


    By btnIntegrarERP = By.xpath("(//span[contains(text(),'Integrar ERP')])[1]");

    By btnRestricciones = By.xpath("//span[contains(text(),'Restricciones')]");

    By btnUsuariosRoles = By.xpath("//span[contains(text(),'Usuarios y Roles')]");
    By btnResstriccionHorarios = By.xpath("//a[contains(.,'Restricción de Horarios')]");
    public By getBtnModuloDeTransferencias() {
        return btnModuloDeTransferencias;
    }

    public By getBtnSubirArchivo() {
        return btnSubirArchivo;
    }

    public By getBtnModuloDeCiclos() {
        return btnModuloDeCiclos;
    }

    public By getBtnCierreDeCiclo() {
        return btnCierreDeCiclo;
    }

    public By getBtnModuloSeguridad() {
        return btnModuloSeguridad;
    }

    public By getBtnAprobaciones() {
        return btnAprobaciones;
    }

    public By getBtnModuloTransferencias() {
        return btnModuloTransferencias;
    }

    public By getBtnInstruccionesDistribuidas() {
        return btnInstruccionesDistribuidas;
    }

    public By getBtnCatalogos() {
        return btnCatalogos;
    }

    public By getBtnInscripcionDeCuentas() {
        return btnInscripcionDeCuentas;
    }

    public By getBtnAprobacionDeCuentas() {
        return btnAprobacionDeCuentas;
    }

    public By getBtnAutorizacionDeCuentas() {
        return btnAutorizacionDeCuentas;
    }

    public By getBtnIntegrarERP() {
        return btnIntegrarERP;
    }

    public By getBtnRestricciones() {
        return btnRestricciones;
    }

    public By getBtnUsuariosRoles() {return btnUsuariosRoles;}

    public By getBtnRestriccionHorarios() {return btnResstriccionHorarios;}
}







