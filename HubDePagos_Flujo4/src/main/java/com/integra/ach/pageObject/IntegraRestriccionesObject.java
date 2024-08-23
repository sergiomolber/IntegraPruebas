package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraRestriccionesObject extends PageObject {
    /**
     * Crear Una Restriccion
     **/
    By btnMas = By.xpath("//*[@Class='fa fa-plus-square']");
    By selectorEFOriginadora = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By selectorEFReceptora = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[3]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By selectorCodigoTransaccion = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[4]/div[2]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By txtFechaDesde = By.xpath("//input[@id='VPH_TRXTYPE_CONSTRAINTS.EffectiveFromDate']");
    By txtFechaHasta = By.xpath("//input[@id='VPH_TRXTYPE_CONSTRAINTS.EffectiveTillDate']");
    By btnEstado = By.id("select2-{{fieldLabel}}-container");
    By btnCrear = By.xpath("//span[contains(text(),'Crear')]");
    By txtValidarCreacion = By.xpath("//span[contains(text(),'Restricción creada con éxito.')]");
    /**
     * Editar Una Restriccion
     **/
    By btnFiltro = By.xpath("//button[contains(@data-original-title,'Filtro')]");
    By lblSeleccionarFiltro = By.xpath("//span[@id='select2-SearchSelect-container']");
    By optEFOriginadora = By.xpath("(//*[text()='E.F. Originadora'])[3]");
    By lblNombreABuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[1]/input[1]");
    By btnBuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[2]");
    By btnEditar = By.xpath("//tbody/tr[@id='displayingWindow_0']/td[1]/div[1]/a[2]");
    By btnEliminarEFOriginadora = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/span[1]");
    By btnEliminarEFReceptora = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[3]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/span[1]");
    By btnEliminarCodigoTransaccion = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[4]/div[2]/div[1]/span[1]/span[1]/span[1]/ul[1]/span[1]");
    By btnGuardarCambios = By.xpath("//span[contains(text(),'Guardar Cambios')]");
    By txtValidarEdicion = By.xpath("//span[contains(text(),'Restricción Actualizada')]");
    /**
     * Eliminar Una Restriccion
     **/
    By btnBorrar = By.xpath("(//a[@title='Borrar'])[1]");
    By btnSiBorrar = By.xpath("//button[contains(text(),'Sí, borrarlo')]");
    By btnValidarBorrado = By.xpath("//span[contains(text(),'Restricción Eliminada Satisfactoriamente')]");

    /**
     * Crear Una Restriccion
     **/
    public By getBtnMas() {
        return btnMas;
    }
    public By getSelectorEFOriginadora() {
        return selectorEFOriginadora;
    }
    public By getSelectorEFReceptora() {
        return selectorEFReceptora;
    }
    public By getSelectorCodigoTransaccion() {
        return selectorCodigoTransaccion;
    }
    public By getBtnEstado() {return btnEstado;}
    public By getTxtFechaDesde() {return txtFechaDesde;}
    public By getTxtFechaHasta() {return txtFechaHasta;}
    public By getBtnCrear() {
        return btnCrear;
    }
    public By getTxtValidarCreacion() {return txtValidarCreacion;}
    /**
     * Editar Un Evento
     **/
    public By getBtnFiltro() {
        return btnFiltro;
    }
    public By getLblSeleccionarFiltro() {
        return lblSeleccionarFiltro;
    }
    public By getOptEFOriginadora() {
        return optEFOriginadora;
    }
    public By getLblNombreABuscar() {
        return lblNombreABuscar;
    }
    public By getBtnBuscar() {
        return btnBuscar;
    }
    public By getBtnEditar() {return btnEditar;}
    public By getBtnEliminarEFOriginadora() {return btnEliminarEFOriginadora;}
    public By getBtnEliminarEFReceptora() {return btnEliminarEFReceptora;}
    public By getBtnEliminarCodigoTransaccion() {return btnEliminarCodigoTransaccion;}
    public By getBtnGuardarCambios() {
        return btnGuardarCambios;
    }
    public By getTxtValidarEdicion() {
        return txtValidarEdicion;
    }
    /**
     * Eliminar Un Evento
     **/
    public By getBtnBorrar() {
        return btnBorrar;
    }
    public By getBtnSiBorrar() {
        return btnSiBorrar;
    }
    public By getBtnValidarBorrado() {
        return btnValidarBorrado;
    }
}
