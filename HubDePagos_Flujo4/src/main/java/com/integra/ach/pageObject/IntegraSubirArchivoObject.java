package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraSubirArchivoObject extends PageObject {
    By lblEntidad = By.id("select2-party-container");
    By lblServicio = By.id("select2-service-container");
    By lblFormato = By.id("select2-inputformat-container");
    //By btnSeleccionarArchivo = By.xpath("//input[@id='uploadBtn']");
    By btnSeleccionarArchivo = By.xpath("//*[@type='file']");

    By btnCargar = By.id("uploadHere");
    By btnInstruccionesRecibidas = By.xpath("(//span[contains(text(),'Instrucciones Recibidas')])[1]");


    By btnTransferencia = By.xpath("//div[6]/div[2]/div/div/div/div/ul");
    By CheckSeleccionarTodo = By.xpath("//input[@name='action']");

    By CheckbtnAceptarTransaccion = By.xpath("//div[@id='collapsePaymentDetls']/div/ul/div/button");




    public By getLblEntidad() {
        return lblEntidad;
    }

    public By getLblServicio() {
        return lblServicio;
    }

    public By getLblFormato() {
        return lblFormato;
    }

    public By getBtnSeleccionarArchivo() {return btnSeleccionarArchivo;}

    public By getBtnCargar() {
        return btnCargar;
    }

    public By getBtnInstruccionesRecibidas() {
        return btnInstruccionesRecibidas;
    }

    public By getbtnTransferencia() {
        return btnTransferencia;
    }
    public By getCheckSeleccionarTodo() {
        return CheckSeleccionarTodo;
    }
    public By getCheckbtnAceptarTransaccion() {
        return CheckbtnAceptarTransaccion;
    }



}
