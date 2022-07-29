package com.kitapyurdu.driver.page;

import com.kitapyurdu.driver.method.method;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductPage {
    method methods;
    Logger logger = LogManager.getLogger(ProductPage.class);
    Random rnd = new Random();


    public ProductPage() {
        methods = new method();
    }

    //Random Ürün Secilmesi
    public void selectRandom(){
        List<WebElement> allProducts = methods.findElements(By.cssSelector(".pr-img-link"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
    }

}
