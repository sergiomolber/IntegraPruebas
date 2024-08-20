package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraSolicitudTiempoExtraObject extends PageObject {
    /**
     * Crear Un SOlicitud de tiempo extra
     **/
    By btnMas = By.xpath("//*[@Class='fa fa-plus-square']");
    By btnSelectEntidad = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]");
    By txtMinutos = By.xpath("//input[@id='VPHCYCLEEXTENSIONACH.Minutes']");
    By btnSelectSancion = By.xpath("//select[@id='VPHCYCLEEXTENSIONACH.Sanction']");
    By txtJustificación = By.xpath("//textarea[@id='VPHCYCLEEXTENSIONACH.Justification']");
    By txtFechaSolicitud = By.xpath("//input[@id='VPHCYCLEEXTENSIONACH.RequestDate']");
    By btnSelectEstado = By.xpath("//select[@id='VPHCYCLEEXTENSIONACH.Status']");
    By btnSelectCiclo = By.xpath("//span[contains(text(),'Seleccionar')]");
    By btnCrear= By.xpath("//span[contains(text(),'Crear')]");
    By txtValidarCreacion = By.xpath("//span[contains(text(),'Solicitud de tiempo extra creado satisfactoriament')]");
    /**
     * /**
     * Editar Un Limite
     **/
    By btnFiltro = By.xpath("//button[contains(@data-original-title,'Filtro')]");
    By lblSeleccionarFiltro = By.xpath("//span[@id='select2-SearchSelect-container']");
    By optJustificacion = By.xpath("(//*[text()='Justificación'])[3]");
    By txtJustificacionABuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[1]/input[1]");
    By btnBuscar = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/ul[1]/form[1]/div[2]/span[2]");
    By btnEditar = By.xpath("//tbody/tr[@id='displayingWindow_0']/td[1]/div[1]/a[2]");

    By btnEliminarCiclo = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[7]/form[1]/div[1]/div[13]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]");
    By btnGuardarCambios = By.xpath("//span[contains(text(),'Guardar Cambios')]");
    By txtValidarEdicion = By.xpath("//span[contains(text(),'Solicitud de tiempo extra actualizado satisfactori')]");

    /**
     * Eliminar Un Limite
     **/
    By btnBorrar = By.xpath("//tr//td//div//a[contains(@class,'actionIcons ng-scope')][2]");
    By btnSiBorrar = By.xpath("//button[contains(text(),'Sí, borrarlo')]");
    By btnValidarBorrado = By.xpath("//span[contains(text(),'Solicitud de tiempo extra eliminado satisfactoriam')]");

    /**
     * Crear Un SOlicitud de tiempo extra
     **/
    public By getBtnMas() {
        return btnMas;
    }
    public By getTxtMinutos() {return txtMinutos;}
    public By getBtnSelectSancion() {return btnSelectSancion;}
    public By getTxtJustificación() {return txtJustificación;}
    public By getTxtFechaSolicitud() {return txtFechaSolicitud;}
    public By getBtnSelectEstado() {return btnSelectEstado;}
    public By getBtnSelectCiclo() {return btnSelectCiclo;}
    public By getBtnSelectEntidad() {
        return btnSelectEntidad;
    }
    public By getBtnCrear() {return btnCrear;}
    public By getTxtValidarCreacion() {return txtValidarCreacion;}

    /**
     * Editar Un Limite
     **/
    public By getBtnFiltro() {
        return btnFiltro;
    }
    public By getLblSeleccionarFiltro() {
        return lblSeleccionarFiltro;
    }
    public By getOptJustificacion() {
        return optJustificacion;
    }
    public By getTxtJustificacionABuscar() {return txtJustificacionABuscar;}
    public By getBtnBuscar() {
        return btnBuscar;
    }
    public By getBtnEditar() {
        return btnEditar;
    }

    public By getBtnEliminarCiclo() {return btnEliminarCiclo;}
    public By getBtnGuardarCambios() {
        return btnGuardarCambios;
    }
    public By getTxtValidarEdicion() {
        return txtValidarEdicion;
    }

    /**
     * Eliminar Un Limite
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
