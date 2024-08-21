package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraInstruccionesRecibidasObject;
import com.integra.ach.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntegraInstruccionesRecibidasStep {
    IntegraInstruccionesRecibidasObject integraInstruccionesRecibidasObject;
    String nombre;
    String estadoExitoso = "WAITING_FILEAPPROVAL";
    String estadoFallido = "REJECTED";
    String estado;
    String estado1;

    private WebDriver getDriver() {
        return integraInstruccionesRecibidasObject.getDriver();
    }

    private WebElement waitForElement(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    @Step
    public void validarCargueYEstadoExitoso(String nombreArchivo) {
        By archivoLocator = By.xpath("(//div[@class='filelist-style cursorPointer'])[1]//ul//li[text()='" + nombreArchivo + " ']");
        nombre = waitForElement(archivoLocator, 10).getText().substring(0, 13);
        System.out.println("EL NOMBRE DEL ARCHIVO ES: " + nombre);
        Assert.assertEquals(nombre, nombreArchivo);

        By estadoLocator = By.xpath("(//div[@class='filelist-style cursorPointer'])[1]//ul//li[text()='" + nombreArchivo + " ']//ancestor::div[@class='filelist-style cursorPointer'][1]//following-sibling::div[@class='col-md-4']//span//span");
        estado = waitForElement(estadoLocator, 10).getText();
        System.out.println("EL ESTADO DEL ARCHIVO ES: " + estado);
        Assert.assertEquals(estadoExitoso, estado);
    }

    @Step
    public void validarCargueYEstadoFallido(String nombreArchivo) {
        By archivoLocator = By.xpath("(//div[@class='filelist-style cursorPointer'])[1]//ul//li[text()='" + nombreArchivo + " ']");
        nombre = waitForElement(archivoLocator, 10).getText().substring(0, 13);
        System.out.println("EL NOMBRE DEL ARCHIVO ES: " + nombre);
        Assert.assertEquals(nombre, nombreArchivo);

        By estadoLocator = By.xpath("(//div[@class='filelist-style cursorPointer'])[1]//ul//li[text()='" + nombreArchivo + " ']//ancestor::div[@class='filelist-style cursorPointer'][1]//following-sibling::div[@class='col-md-4']//span//span");
        estado = waitForElement(estadoLocator, 10).getText();
        System.out.println("EL ESTADO DEL ARCHIVO ES: " + estado);

        WebElement actualizarBtn = waitForElement(integraInstruccionesRecibidasObject.getBtnActualizarPage(), 10);
        actualizarBtn.click();
        EsperaImplicita.esperaImplicitaWeb(10);
        actualizarBtn.click();
        EsperaImplicita.esperaImplicitaWeb(10);

        Assert.assertEquals(estadoFallido, estado);
    }
}

