package com.kitapyurdu.driver.page;

import com.kitapyurdu.driver.method.method;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import java.util.Random;

public class ProductPageIn {
    method methods;
    Logger logger = LogManager.getLogger(ProductPageIn.class);
    Random rnd = new Random();


    public ProductPageIn() {
        methods = new method();
    }
public void ProductAddAndCheck() throws InterruptedException {
        //ürünün Eklenmesi
    methods.clickElement(By.id("button-cart"));
    Thread.sleep(1000);
    //Değer Kontrolü

    String heading = methods.findElement(By.id("cart-items")).getText();
    if (heading.equals("1")) {
        System.out.println("Urun sepete eklendi");
        logger.info("Urun sepete eklendi");
        //Sepetim Butonuna Tıklanması
        methods.clickElement(By.id("sprite-cart-icon"));
        Thread.sleep(1000);
        //Sepete Git Butonuna Tıklanması
        methods.clickElement(By.cssSelector("a#js-cart.button"));






    }
}
}
