package com.kitapyurdu.driver.test;

import com.kitapyurdu.driver.driver.BaseTest;
import com.kitapyurdu.driver.page.FinalPage;
import com.kitapyurdu.driver.page.HomePage;
import com.kitapyurdu.driver.page.ProductPage;
import com.kitapyurdu.driver.page.ProductPageIn;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

import java.io.IOException;

public class HomePageTest extends BaseTest {
    @Test
    public void homePageTest() throws InterruptedException, CsvValidationException, IOException {
        HomePage homePage = new HomePage();
        ProductPage productPage=new ProductPage();
        ProductPageIn productpagein=new ProductPageIn();
        FinalPage finalpage=new FinalPage();

        homePage.search();
        productPage.selectRandom();
        productpagein.ProductAddAndCheck();
        finalpage.Basket();

            }
}


