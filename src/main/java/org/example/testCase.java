package org.example;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.DataField;
import pageObject.common;

public class testCase extends common {
    public WebDriver dr;
    public WebDriverWait ewait;
    DataField dataField;

    public testCase() throws Exception {
        super(common.edriver);
        dr = common.edriver;
        ewait = common.ewait;
        dataField = new DataField("src/main/java/org/example/excel.xlsx");
    }
    @Test
    public void test() throws Exception  {
    }

    @Test
    public void testCase_login() throws Exception  {
        dr.manage().window().maximize();
        waitUntil(login);
        login.click();
        waitUntil(userName);
        userName.sendKeys("admin");
        waitUntil(passWord);
        waitUntilPath( "//input[@id='loginpassword']");
        passWord.sendKeys("admin");
        waitUntil(submitLogin);
        submitLogin.click();
        waitUntil(afterLogin);
    }

    @Test
    public void testCase_addProductAndDeleteProduct() throws Exception  {
        dr.manage().window().maximize();
        waitUntil(login);
        login.click();
        waitUntil(userName);
        userName.sendKeys("admin");
        waitUntil(passWord);
        passWord.sendKeys("admin");
        waitUntil(submitLogin);
        submitLogin.click();
        waitUntil(afterLogin);
        samsungLink.click();
        waitUntil(addCart);
        addCart.click();
        ewait.until(ExpectedConditions.alertIsPresent());
        Alert alert = edriver.switchTo().alert();
        alert.accept();
        waitUntil(cart);
        cart.click();
        text(infosamsung);
        text(pricesamsung);

        waitUntil(delete);
        delete.click();
        waitUntil(home);
        home.click();
    }

    @Test
    public void testCase_orderProduct() throws Exception  {
        dr.manage().window().maximize();
        waitUntil(login);
        login.click();
        waitUntil(userName);
        userName.sendKeys("admin");
        waitUntil(passWord);
        passWord.sendKeys("admin");
        waitUntil(submitLogin);
        submitLogin.click();
        waitUntil(afterLogin);
        waitUntil(nokia);
        nokia.click();
        waitUntil(addCart);
        addCart.click();
        ewait.until(ExpectedConditions.alertIsPresent());
        Alert alert = edriver.switchTo().alert();
        alert.accept();
        waitUntil(cart);
        cart.click();
        waitUntil(placeorder);
        placeorder.click();

        waitUntil(nameInput);
        nameInput.clear();
        nameInput.sendKeys("Hiếu Nguyễn");
        waitUntil(countryInput);
        countryInput.clear();
        countryInput.sendKeys("Việt Nam");
        waitUntil(cityInput);
        cityInput.clear();
        cityInput.sendKeys("Hồ Chí Minh");
        waitUntil(cardInput);
        cardInput.clear();
        cardInput.sendKeys("123");
        waitUntil(monthInput);
        monthInput.clear();
        monthInput.sendKeys("06");
        waitUntil(yearInput);
        yearInput.clear();
        yearInput.sendKeys("2023");

        waitUntil(closeForm);
        closeForm.click();

        waitUntil(homeHeader);
        homeHeader.click();
    }

    @Test
    public void testCase_filterProduct() throws Exception  {
        dr.manage().window().maximize();
        waitUntil(login);
        login.click();
        waitUntil(userName);
        userName.sendKeys("admin");
        waitUntil(passWord);
        passWord.sendKeys("admin");
        waitUntil(submitLogin);
        submitLogin.click();
        waitUntil(afterLogin);
        samsungLink.click();
        text(samsung);
        text(price);
        text(desc);
    }

    @Test
    public void testCase_contact() throws Exception  {
        dr.manage().window().maximize();
        waitUntil(login);
        login.click();
        waitUntil(userName);
        userName.sendKeys("admin");
        waitUntil(passWord);
        passWord.sendKeys("admin");
        waitUntil(submitLogin);
        submitLogin.click();
        waitUntil(afterLogin);
        samsungLink.click();
        text(samsung);
        text(price);
        text(desc);
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        dr.quit();
    }
}
