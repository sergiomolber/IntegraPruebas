package com.integra.ach.utils;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Robot {


    public static String fechahora() {
        // TOMAMOS LA FECHA DEL SISTEMA
        LocalDateTime fechaSistema = LocalDateTime.now();
        // DEFINIR FORMATO FECHA
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // DAR FORMATO A LA FECHA DEL SISTEMA
        String formatFecha = fecha.format(fechaSistema);
        return formatFecha;
    }


    public void hacerTap1() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
    }

    public void hacerTap2() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
    }

    public void hacerTap3() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
    }

    public void hacerTap4() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
    }

    public void hacerEnter() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void hacerControlM() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void procesarCola() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void reload() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_F5);
        robot.keyPress(KeyEvent.VK_F5);
    }

    public void dobleClick() throws IOException, AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public void hacerEscape() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }

    public void alt_tab() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ALT);
    }

    public void alt_F4() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_ALT);
    }

    public void control_F4() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void control_Menos() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

    }

    public void control_Mas() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_PLUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    public void control_J() throws AWTException {
        java.awt.Robot robot = new java.awt.Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    // METODOD PARA GUARDAR LA FECHA DEL SISTEMA

    public static String fechaHora() {

        // TOMAMOS LA FECHA DEL SISTEMA

        LocalDateTime fechaSistema = LocalDateTime.now();

        // DEFINIR FORMATO FECHA

        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyyMMdd");

        // DAR FORMATO A LA FECHA DEL SISTEMA

        String formatFecha = fecha.format(fechaSistema);

        return formatFecha;
    }

    public static String fechahoraanterior() {
        // TOMAMOS LA FECHA DEL SISTEMA
        LocalDateTime fechaSistema = LocalDateTime.now().minusDays(1);
        // DEFINIR FORMATO FECHA
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // DAR FORMATO A LA FECHA DEL SISTEMA
        String fechahoraanterior = fecha.format(fechaSistema);
        return fechahoraanterior;
    }
}
