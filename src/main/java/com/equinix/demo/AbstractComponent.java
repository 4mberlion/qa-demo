package com.equinix.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractComponent {
    protected WebDriver driver;
    public final By elementLocator;

    protected AbstractComponent(By elementLocator) {
        DriverFactory.setDriver("https://www.google.com");
        driver = DriverFactory.getDriver();
        this.elementLocator = elementLocator;
    }

    protected List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    protected WebElement findElement(By by) {
        return driver.findElement(by);
    }
}
