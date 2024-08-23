package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraInscribirCuentaObject extends PageObject {
    /**
     * Crear Una Restriccion
     **/
    By btnMas = By.xpath("//*[@Class='fa fa-plus-square']");
    By txtNITEntidadReceptora = By.xpath("//input[@id='RegisterAccounts.CredtorClientID']");
    By selectEntidadReceptora = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[4]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By selectCodigoTransaccion = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[5]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By txtNumeroCuentaDestino = By.xpath("//input[@id='RegisterAccounts.DebtorClientAccount']");
    By txtNITEntidadOriginadora = By.xpath("//input[@id='RegisterAccounts.DebtorClientID']");
    By selectLimiteAsociar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[8]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By txtFechaDesde = By.xpath("//input[@id='RegisterAccounts.EffectiveFromDate']");
    By txtFechaHasta = By.xpath("//input[@id='RegisterAccounts.EffectiveTillDate']");
    By btnEstado = By.id("select2-{{fieldLabel}}-container");
    By bntEstado1 = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[14]/div[1]/div[1]/span[1]/span[1]/span[1]");
    By btnCrear = By.xpath("//span[contains(text(),'Crear')]");
    By txtValidarCreacion = By.xpath("//span[contains(text(),'Cuenta registrada con éxito.')]");
    /**
     * Editar Una Restriccion
     **/
    By btnFiltro = By.xpath("//button[contains(@data-original-title,'Filtro')]");
    By lblSeleccionarFiltro = By.xpath("//span[@id='select2-SearchSelect-container']");
    By optNitEntidadReceptora = By.xpath("(//*[text()='NIT Entidad Receptora'])[3]");
    By lblNombreABuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[1]/input[1]");
    By txtBusquedaRapida = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[3]/input[1]");
    By btnEditarParaAprobar = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[6]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/a[1]");
    By btnAutorizarCuenta = By.xpath("//button[contains(text(),'Autorizar')]");
    By btnBuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[2]");
    By btnEditar = By.xpath("//tbody/tr[@id='displayingWindow_0']/td[1]/div[1]/a[2]");
    By btnGuardarCambios = By.xpath("//span[contains(text(),'Guardar Cambios')]");
    By btnGuardarCambiosAprobación = By.xpath("(//span[contains(text(),'Guardar Cambios')])[2]");
    By txtValidarEdicion = By.xpath("//span[contains(text(),'Las modificaciones han sido guardadas con éxito.')]");
    /**
     * Eliminar Una Restriccion
     **/
    By btnBorrar = By.xpath("//tr//td//div//a[contains(@class,'actionIcons ng-scope')][2]");
    By btnSiBorrar = By.xpath("//button[contains(text(),'Sí, borrarlo')]");
    By btnValidarBorrado = By.xpath("//span[contains(text(),'Cuenta eliminada. Las cuentas eliminadas serán vis')]");

    By lblEstadoOperador = By.xpath("//*[@id=\"dynamicModuleForm\"]/div[1]/div[14]/div/div[1]/span/span[1]/span");
    By lblEstadoOperadorCreate = By.xpath ("/html/body/span/span/span[2]/ul/li[2]");

    By lblEstadoActive = By.xpath("/html/body/span/span/span[2]/ul/li[2]");

    By lblAprobadoPorACH = By.xpath("//*[@id=\"select2-{{fieldLabel}}-container\"]");
    By lblEstadoAprobadoPorACH = By.xpath("/html/body/span/span/span[2]/ul/li[1]");


    /**
     * Crear Una Restriccion
     **/
    public By getBtnMas() {
        return btnMas;
    }
    public By getTxtNITEntidadReceptora() {
        return txtNITEntidadReceptora;
    }
    public By getSelectEntidadReceptora() {return selectEntidadReceptora;}
    public By getSelectCodigoTransaccion() {return selectCodigoTransaccion;}
    public By getTxtNumeroCuentaDestino() {
        return txtNumeroCuentaDestino;
    }
    public By getTxtNITEntidadOriginadora() {return txtNITEntidadOriginadora;}
    public By getSelectLimiteAsociar() {return selectLimiteAsociar;}
    public By getBtnEstado() {return btnEstado;}
    public By getTxtFechaDesde() {return txtFechaDesde;}
    public By getTxtFechaHasta() {return txtFechaHasta;}
    public By getBtnCrear() {
        return btnCrear;
    }
    public By getTxtValidarCreacion() {return txtValidarCreacion;}

    public By getBntEstado1() {return bntEstado1;}

    /**
     * Editar Un Evento
     **/

    public By getBtnFiltro() {
        return btnFiltro;
    }
    public By getLblSeleccionarFiltro() {
        return lblSeleccionarFiltro;
    }
    public By getOptNitEntidadReceptora() {
        return optNitEntidadReceptora;
    }
    public By getLblNombreABuscar() {return lblNombreABuscar;}
    public By getTxtBusquedaRapida() {return txtBusquedaRapida;}
    public By getBtnEditarParaAprobar() {return btnEditarParaAprobar;}
    public By getBtnGuardarCambiosAprobación() {return btnGuardarCambiosAprobación;}

    public By getBtnAutorizarCuenta() {return btnAutorizarCuenta;}
    public By getBtnBuscar() {
        return btnBuscar;
    }
    public By getBtnEditar() {return btnEditar;}
    public By getBtnGuardarCambios() {
        return btnGuardarCambios;
    }
    public By getTxtValidarEdicion() {
        return txtValidarEdicion;
    }

    public By getLblEstadoOperador() {
        return lblEstadoOperador;
    }
    public By getLblEstadoOperadorCreate() {
        return lblEstadoOperadorCreate;
    }

    public By getLblEstadoActive() {
        return lblEstadoActive;
    }

    public By getLblAprobadoPorACH() {
        return lblAprobadoPorACH;

    }
    public By getLblEstadoAprobadoPorACH() {
        return lblEstadoAprobadoPorACH;

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
