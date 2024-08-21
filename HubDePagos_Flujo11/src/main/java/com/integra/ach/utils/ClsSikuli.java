package com.integra.ach.utils;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;


public class ClsSikuli {

    static File directory = new File("./src/test/resources/images/");

    private static String pathCarpetaImagenes ;
    private static Screen screen;

    public void clickElemento(String imagen, String ruta) throws InterruptedException {
        screen = new Screen();
        int Attempts = 10;
        while (Attempts>0){
            try {
                pathCarpetaImagenes = directory.getCanonicalPath();
                System.out.println(pathCarpetaImagenes);
                screen.click(pathCarpetaImagenes +"/"+ imagen);
                break;
            } catch (FindFailed | IOException findFailed) {
                try {
                    screen.click(pathCarpetaImagenes +"/"+ "Archivo.png");
                    break;
                }catch (Exception e){
                }
                Attempts--;
                findFailed.printStackTrace();
                Thread.sleep(1000);
            }
        }

        String fileLocation = ruta ;
        System.out.print(fileLocation);
        StringSelection filepath = new StringSelection(fileLocation);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

        // Try block
        try {
            // Create object of Robot class
            java.awt.Robot robot = new java.awt.Robot();

            // Press Ctrl key
            robot.keyPress(KeyEvent.VK_CONTROL);
            // Press Ctrl + V key - It will paste the file path in windows dialog
            robot.keyPress(KeyEvent.VK_V);

            // Now release V + Ctrl key
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Click Enter Key
            robot.keyPress(KeyEvent.VK_ENTER);

            // Release Enter Key
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (AWTException e) {e.printStackTrace();}
    }

}