package com.equinix.demo.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;

public class TextField extends BaseComponent {
    public TextField(By textFieldLocator) {
        super(textFieldLocator);
    }

    public void clearField() {
        getTextFieldElement().sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
    }

    public String getPlaceholderText() {
        return getTextFieldElement().getAttribute("placeholder");
    }

    public void insertValue(CharSequence... data) {
        clearField();
        getTextFieldElement().sendKeys(data);
        getTextFieldElement().sendKeys(Keys.TAB);
    }

    private WebElement getTextFieldElement() {
        return findElement(new ByChained(elementLocator, By.cssSelector("input")));
    }
}
