package com.tricentis.demo.testsuite;

import com.tricentis.demo.pages.MenuPage;
import com.tricentis.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    MenuPage menuPage = new MenuPage();

    @Test
    public void verifyPageNavigation() {
        menuPage.selectMenu("Books");
    }
}
