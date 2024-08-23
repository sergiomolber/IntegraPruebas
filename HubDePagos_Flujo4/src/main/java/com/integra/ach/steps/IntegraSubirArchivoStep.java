package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraInstruccionesRecibidasObject;
import com.integra.ach.pageObject.IntegraSubirArchivoObject;
import com.integra.ach.utils.*;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.io.File;

public class IntegraSubirArchivoStep {
    IntegraSubirArchivoObject integraSubirArchivoObject;
    IntegraInstruccionesRecibidasObject integraInstruccionesRecibidasObject;
    Robot robot = new Robot();
    ClsSikuli clsSikuli = new ClsSikuli();
    String carga;

    @Step
    public void seleccionarEntidad(String entidad) {
        EsperaExplicita.esperaexplilicitaClick(integraSubirArchivoObject.getDriver(), integraSubirArchivoObject.getLblEntidad());
        integraSubirArchivoObject.getDriver().findElement(integraSubirArchivoObject.getLblEntidad()).click();
        integraSubirArchivoObject.getDriver().findElement(By.xpath("//li[contains(text(),'" + entidad + "')]")).click();
    }

    @Step
    public void seleccionarServicio(String servicio) {
        EsperaExplicita.esperaexplilicitaClick(integraSubirArchivoObject.getDriver(), integraSubirArchivoObject.getLblServicio());
        integraSubirArchivoObject.getDriver().findElement(integraSubirArchivoObject.getLblServicio()).click();
        integraSubirArchivoObject.getDriver().findElement(By.xpath("//li[contains(text(),'" + servicio + "')]")).click();
    }

    @Step
    public void seleccionarFormato(String formato) {
        EsperaExplicita.esperaexplilicitaClick(integraSubirArchivoObject.getDriver(), integraSubirArchivoObject.getLblFormato());
        integraSubirArchivoObject.getDriver().findElement(integraSubirArchivoObject.getLblFormato()).click();
        integraSubirArchivoObject.getDriver().findElement(By.xpath("//li[contains(text(),'" + formato + "')]")).click();
    }

    @Step
    public void clickEnSeleccionarArchivo(String urlArchivo) throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(3);
        File file = new File(urlArchivo);
        // SE ESTRAE LA RUTA DEL SISTEMA
        String path = file.getPath();
        integraSubirArchivoObject.getDriver().findElement(integraSubirArchivoObject.getBtnSeleccionarArchivo()).sendKeys(path);
    }

    @Step
    public void subirArchivo() throws InterruptedException {

        integraSubirArchivoObject.getDriver().findElement(integraSubirArchivoObject.getBtnCargar()).click();
        EsperaExplicita.esperaexplilicitaClick(integraSubirArchivoObject.getDriver(),integraSubirArchivoObject.getBtnCargar());
        integraSubirArchivoObject.getDriver().findElement(integraSubirArchivoObject.getBtnCargar()).click();
        EsperaImplicita.esperaImplicitaWeb(6);
    }

    @Step
    public void validarMsjExitoso() {
        carga=integraSubirArchivoObject.getDriver().findElement(By.xpath("//div[@data-select2-id=18]/div[1]")).getText().substring(1,27);
        System.out.println("El texto es: "+carga);
        Assert.assertTrue(integraSubirArchivoObject.getDriver().findElement(By.xpath("//div[@data-select2-id=18]/div[1]")).isDisplayed());
    }

    @Step
    public void clickEnInstruccionesRecibidas(){
        EsperaImplicita.esperaImplicitaWeb(5);
        integraSubirArchivoObject.getDriver().findElement(integraSubirArchivoObject.getBtnInstruccionesRecibidas()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        try {
            integraInstruccionesRecibidasObject.getDriver().findElement(integraInstruccionesRecibidasObject.getBtnVistaLista()).click();
            EsperaImplicita.esperaImplicitaWeb(2);
            integraInstruccionesRecibidasObject.getDriver().findElement(integraInstruccionesRecibidasObject.getBtnVistaLista()).click();
        }catch (Exception e){
        }

    }

    @Step
    public void IngresarTransacciones() {
        integraSubirArchivoObject.getDriver().findElement(integraSubirArchivoObject.getbtnTransferencia()).click();
        EsperaImplicita.esperaImplicitaWeb(6);
        /**Hacer Scroll**/
        JavascriptExecutor jse = (JavascriptExecutor) integraInstruccionesRecibidasObject.getDriver();
        jse.executeScript("window.scrollBy(0,900)");
        integraSubirArchivoObject.getDriver().findElement(integraSubirArchivoObject.getCheckSeleccionarTodo()).click();
        EsperaImplicita.esperaImplicitaWeb(6);
        integraSubirArchivoObject.getDriver().findElement(integraSubirArchivoObject.getCheckbtnAceptarTransaccion()).click();

    }


}
