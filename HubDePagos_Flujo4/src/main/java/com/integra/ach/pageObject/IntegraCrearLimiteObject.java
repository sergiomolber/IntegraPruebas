package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraCrearLimiteObject extends PageObject {
    By txtNombre = By.xpath("//*[@id=\"Limits.Nombre\"]");
    By txtTopeMinimo = By.xpath("//*[@id=\"Limits.TopeMinimo\"]");
    By txtTopeMaximo = By.xpath("//*[@id=\"Limits.TopeMaximo\"]");
    By txtVigenciaDeLaCuenta = By.xpath("//*[@id=\"Limits.VigenciadelaCuenta(Dias)\"]");
    By txtPendiente = By.xpath("//*[@id=\"Limits.Pendiente(Dias)\"]");
    By txtPreaviso = By.xpath("//*[@id=\"Limits.Preaviso(Dias)\"]");

    By lblTipoTransaccion = By.xpath("//*[@id=\"dynamicModuleForm\"]/div[1]/div[13]/div[2]/div[1]/span/span[1]/span");
    By lblEstado = By.xpath("//*[@id=\"select2-{{fieldLabel}}-container\"]");

    By cmbFecha = By.xpath("//*[@id=\"Limits.FechaDesde\"]");
    By btnCrear = By.xpath("//*[@id=\"dynamicModuleForm\"]/div[2]/button[2]");


    By txtLimiteCreado = By.xpath("//*[@id=\"statusBox\"]");

    By lblNombreABuscar = By.xpath("//span[@id='select2-SearchSelect-container']");

    public By gettxtNombre() {
        return txtNombre;
    }
    public By gettxtTopeMinimo() {
        return txtTopeMinimo;
    }
    public By gettxtTopeMaximo() {
        return txtTopeMaximo;
    }
    public By gettxtVigenciaDeLaCuenta() {
        return txtVigenciaDeLaCuenta;
    }
    public By gettxtPendiente() {
        return txtPendiente;
    }

    public By gettxtPreaviso() {
        return txtPreaviso;
    }
    public By getlblTipoTransaccion() {
        return lblTipoTransaccion;
    }
    public By getlblEstado() {
        return lblEstado;
    }

    public By getcmbFecha() {
        return cmbFecha;
    }
    public By getbtnCrear() {
        return btnCrear;
    }

    public By gettxtLimiteCreado() {
        return txtLimiteCreado;
    }

    public By getlblNombreABuscar() {
        return lblNombreABuscar;
    }





}







