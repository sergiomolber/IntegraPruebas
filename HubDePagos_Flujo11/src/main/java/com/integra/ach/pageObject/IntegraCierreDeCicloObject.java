package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IntegraCierreDeCicloObject extends PageObject {
    /**
     * Consulta de cierres de ciclo
     **/
    By lblFecha = By.xpath("//input[@id='CstartDate']");
    By btnBuscar = By.id("okBtn");
    By txtEstado = By.xpath("//th[contains(text(),'Estado')]");
    /**
     * Cierre de ciclo exitoso
     **/
    By btnCerrar = By.xpath("//button[contains(text(),'Cerrar')]");
    By btnSi = By.xpath("//button[contains(text(),'Si')]");
    By txtValidacionDeCierre = By.xpath("//a[contains(text(),'×')]");

    /**
     * Consulta de cierres de ciclo
     **/
    public By getLblFecha() {
        return lblFecha;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getTxtEstado() {
        return txtEstado;
    }

    /**
     * Cierre de ciclo exitoso
     **/
    public By getBtnCerrar() {
        return btnCerrar;
    }

    public By getBtnSi() {
        return btnSi;
    }

    public By getTxtValidacionDeCierre() {
        return txtValidacionDeCierre;
    }

    /**
     * Métodos adicionales
     **/

    // Método para verificar si hay botones 'Cerrar' visibles

}

