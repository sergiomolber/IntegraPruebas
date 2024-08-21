package com.integra.ach.utils;

import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utilidades {


	static WebDriverWait wait;

	public static Robot robot;
	public static void centraCursor(int x, int y) {
		try {
			robot = new Robot();
			robot.mouseMove(x, y);
			Thread.sleep(1000);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(250);
			robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void scrollElemento(WebDriver driver, By elemento) throws InterruptedException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
		System.out.println("Scroll down perfomed");
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_UP).build().perform();       //Page Up
		System.out.println("Scroll up perfomed");
		Thread.sleep(3000);
	}
	public static void bajarPantalla(WebDriver webDriver, WebElement objWebElement) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
	//	js.executeScript("arguments[0].scrollIntoView();", objWebElement);
		js.executeScript("window.scrollBy(0,350)", "");
	}
	
	public static void subirPantalla(WebDriver webDriver, WebElement objWebElement) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("window.scrollBy(0,-1000)", "");
	}


	public static void esperaImplicita10(WebDriver webDriver) {
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void esperarExplicitoAlerta(WebDriver webDriver) {
		wait = new WebDriverWait(webDriver, 15);
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("ExplicitoAlerta");
	}
	
	public static void esperarExplicitoCorto(WebDriver webDriver, String xPath) {
		wait = new WebDriverWait(webDriver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));

	}

	public static void esperarExplicito(WebDriver webDriver, String xPath) {
		wait = new WebDriverWait(webDriver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));

	}

	public static void esperarExplicito30(WebDriver webDriver, By xPath) {
		wait = new WebDriverWait(webDriver, 30);
		wait.until(ExpectedConditions.elementToBeClickable((xPath)));

	}

	public static void esperarExplicito60(WebDriver webDriver, String xPath) {
		wait = new WebDriverWait(webDriver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
		// System.out.println("ExplicitoAlerta 10");

	}

	public static void esperarVentana() {
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	}

	public static void confirmarVentana() {
		wait.until(ExpectedConditions.titleIs("https://demoqa.com/sample"));
	}

	public static void esperar(int tiempo) {
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void cerrarChromeDriver() {
		try {
			Process process = Runtime.getRuntime().exec("tasklist");
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			String driver = "chromedriver.exe";
			while ((line = reader.readLine()) != null) {
				if (line.toLowerCase().contains(driver)) {
					Runtime.getRuntime().exec("taskkill /F /IM " + driver);
					System.out.println("Cerré un proceso chrome: " + line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static Properties obtenerProperties() {
		Properties prop = new Properties();
		InputStream is = null;

		try {
			is = new FileInputStream(System.getProperty("user.dir") + "\\data.properties");
			prop.load(is);
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		return prop;
	}

	public void cambiarVentana(WebDriver webDriver) {
		String originalWindow = webDriver.getWindowHandle();

		for (String windowHandle : webDriver.getWindowHandles()) {
			if (!originalWindow.contentEquals(windowHandle)) {
				webDriver.switchTo().window(windowHandle);
				break;
			}
		}

	}

	


}
