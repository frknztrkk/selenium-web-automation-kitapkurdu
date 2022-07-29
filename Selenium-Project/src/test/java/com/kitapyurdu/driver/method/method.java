package com.kitapyurdu.driver.method;

import com.kitapyurdu.driver.driver.BaseTest;
import com.opencsv.CSVReader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;


import java.io.FileReader;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class method {
    static WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;
    static Logger logger = LogManager.getLogger(method.class);

    public method() {
        driver = BaseTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30)).
                pollingEvery((Duration.ofMillis(300))).
                ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
    }


    public static WebElement findElement(By by) {
        return driver.findElement(by);
    }



    public static void clickElement(By by) {
        findElement(by).click();
    }




    public static void clearText(By by) {
        findElement(by).clear();


    }
    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);


    }

    public static List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }


    public void emptyProductCheck(String text, By by, String message) {
        Assertions.assertEquals(text, findElement(by).getText(), message);
        System.out.println(text);
        logger.info("Sepet Boş");
    }




    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void productUpdateCheck(By by) {
        Assertions.assertEquals("Sepetiniz güncelleniyor!", findElement(by).getText(), "Ürün Güncellenmedi");
        System.out.println("Urun Guncellendi Yazisi Geldi");
        logger.info("Urun Guncellendi Yazisi Geldi");
    }
}

