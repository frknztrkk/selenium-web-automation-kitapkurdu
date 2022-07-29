package com.kitapyurdu.driver.test;

import com.kitapyurdu.driver.driver.BaseTest;
import com.kitapyurdu.driver.page.FinalPage;
import com.kitapyurdu.driver.page.HomePage;
import com.kitapyurdu.driver.page.ProductPage;
import com.kitapyurdu.driver.page.ProductPageIn;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

import java.io.IOException;

public class ProductPageTest extends BaseTest {
    @Test
    public void productpageTest() throws CsvValidationException, IOException, InterruptedException {
        HomePage homePage = new HomePage();
        ProductPage productPage=new ProductPage();

        homePage.search();
        productPage.selectRandom();


    }
}
