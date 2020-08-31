package com.equinix.demo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class ExampleTest {



    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"shelf-item__buy-btn\"]"));
        //Cat Tee Black T-Shirt
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div[2]/div[4]")).click();
        driver.findElement(By.xpath("//div[@class=\"float-cart__close-btn\"]")).click();
        //Dark Thug Blue-Navy T-Shirt
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div[3]/div[4]")).click();
        driver.findElement(By.xpath("//div[@class=\"float-cart__close-btn\"]")).click();
        //Sphynx Tie Dye Wine T-Shirt
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div[4]/div[4]")).click();
        //driver.findElement(By.xpath("//div[@class=\"float-cart__close-btn\"]")).click();
        //div[@class="float-cart__shelf-container"]//p[@class="title" and contains(text(), "Cat Tee Black T-Shirt")]
        List<String> items = Arrays.asList("Cat Tee Black T-Shirt", "Dark Thug Blue-Navy T-Shirt", "Sphynx Tie Dye Wine T-Shirt");
        for (String item: items) {
            driver.findElement(By.xpath("//div[@class=\"float-cart__shelf-container\"]//p[@class=\"title\" and contains(text(), \""+item+"\")]")).isDisplayed();
        }
        String price = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[4]/p")).getText();
        price = price.substring(2, price.length());
        BigDecimal dprice = new BigDecimal(price);
        System.out.println(dprice);
        BigDecimal total = new BigDecimal(0);
        //List<WebElement> pricesElements = Arrays.asList(driver.findElements(By.xpath("//div[@class=\"shelf-item__price\"]/p")));


    }
}
