package com.integra.ach.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ListaDesplegable {

        public void seleccionarTextoVisible (WebDriver driver, By elemento, String texto){
            Select seleccionar = new Select(driver.findElement(elemento));
            seleccionar.selectByVisibleText(texto);

        }
    }
