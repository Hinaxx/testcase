package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();

        // Khởi tạo trình duyệt Chrome
        EdgeDriver driver = new EdgeDriver(edgeOptions);

        // Mở trang web
        driver.get("https://www.demoblaze.com/");

        // Phóng to trình duyệt
        driver.manage().window().maximize();

        // Khởi tạo WebDriverWait với thời gian chờ là 20 giây
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


//**************************************************************************************************************************


        Thread.sleep(1000);
        WebElement login = driver.findElement(By.xpath("//a[@id='login2']"));
        wait.until(ExpectedConditions.visibilityOf(login));
        wait.until(ExpectedConditions.elementToBeClickable(login));
        login.click();

        Thread.sleep(1000);

        WebElement usernameInput = driver.findElement(By.id("loginusername"));
        usernameInput.clear();
        usernameInput.sendKeys("admin");

        Thread.sleep(1000);

        WebElement passwordInput = driver.findElement(By.id("loginpassword"));
        passwordInput.clear();
        passwordInput.sendKeys("admin");

        Thread.sleep(1000);
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();

        Thread.sleep(2000);
        WebElement navigateItem = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img/.."));
        wait.until(ExpectedConditions.visibilityOf(navigateItem));
        wait.until(ExpectedConditions.elementToBeClickable(navigateItem));
        navigateItem.click();

        Thread.sleep(1000);
        WebElement titleItem = driver.findElement(By.xpath("//h2[normalize-space()='Samsung galaxy s6']"));
        wait.until(ExpectedConditions.visibilityOf(titleItem));
        wait.until(ExpectedConditions.elementToBeClickable(titleItem));
        System.out.println(titleItem.getText());

        Thread.sleep(1000);
        WebElement priceItem = driver.findElement(By.xpath("//h3[@class='price-container']"));
        wait.until(ExpectedConditions.visibilityOf(priceItem));
        wait.until(ExpectedConditions.elementToBeClickable(priceItem));
        System.out.println(priceItem.getText());

        Thread.sleep(1000);
        WebElement strongItem = driver.findElement(By.xpath("//strong[normalize-space()='Product description']"));
        wait.until(ExpectedConditions.visibilityOf(strongItem));
        wait.until(ExpectedConditions.elementToBeClickable(strongItem));
        System.out.println(strongItem.getText());

        Thread.sleep(1000);
        WebElement descriptionItem = driver.findElement(By.xpath("//div[@id=\"more-information\"]/p"));
        wait.until(ExpectedConditions.visibilityOf(descriptionItem));
        wait.until(ExpectedConditions.elementToBeClickable(descriptionItem));
        System.out.println(descriptionItem.getText());

        //**************************************************************************************************************************\

        Thread.sleep(1000);
        WebElement BtnATC = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
        wait.until(ExpectedConditions.visibilityOf(BtnATC));
        wait.until(ExpectedConditions.elementToBeClickable(BtnATC));
        BtnATC.click();


        Thread.sleep(1000);
        Alert alert= driver.switchTo().alert();
        alert.accept();


        Thread.sleep(1000);
        WebElement BtnCart = driver.findElement(By.xpath("//*[@id=\"cartur\"]"));
        wait.until(ExpectedConditions.visibilityOf(BtnCart));
        wait.until(ExpectedConditions.elementToBeClickable(BtnCart));
        BtnCart.click();



        Thread.sleep(2000);
        String infoProduct = "//tr[@class='success']/td[index]";
        WebElement infoProducts;

        for (int i = 1; i <= 4; i++) {
            infoProducts = driver.findElement((By.xpath(infoProduct.replace("index",String.valueOf(i)))));
            wait.until(ExpectedConditions.visibilityOf(infoProducts));
            wait.until(ExpectedConditions.elementToBeClickable(infoProducts));
            System.out.println("Category: " + infoProducts.getText());

        }

        By deleteproduct = By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a");
        wait.until(ExpectedConditions.elementToBeClickable(deleteproduct));
        WebElement delete = driver.findElement(deleteproduct);
        delete.click();

        Thread.sleep(1000);
        WebElement BtnHome = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
        BtnHome.click();

        Thread.sleep(1000);
        WebElement ImgNokia = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a/img"));
        ImgNokia.click();

        Thread.sleep(1000);
        WebElement BtnATCNokia  = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
        BtnATCNokia.click();

        Thread.sleep(1000);
        Alert alert2= driver.switchTo().alert();
        alert2.accept();

        Thread.sleep(1000);
        WebElement BtnCart2 = driver.findElement(By.xpath("//*[@id=\"cartur\"]"));
        BtnCart2.click();


//**************************************************************************************************************************


        WebElement buttonPlaceOrder = driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
        wait.until(ExpectedConditions.visibilityOf(buttonPlaceOrder));
        wait.until(ExpectedConditions.elementToBeClickable(buttonPlaceOrder));
        buttonPlaceOrder.click();

        Thread.sleep(1000);

        WebElement nameInput = driver.findElement(By.id("name"));
        nameInput.clear();
        nameInput.sendKeys("Hiêu Nguyễn");

        WebElement countryInput = driver.findElement(By.id("country"));
        countryInput.clear();
        countryInput.sendKeys("Việt Nam");

        WebElement cityInput = driver.findElement(By.id("city"));
        cityInput.clear();
        cityInput.sendKeys("Hồ Chí Minh");

        WebElement cardInput = driver.findElement(By.id("card"));
        cardInput.clear();
        cardInput.sendKeys("123");

        WebElement monthInput = driver.findElement(By.id("month"));
        monthInput.clear();
        monthInput.sendKeys("06");

        WebElement yearInput = driver.findElement(By.id("year"));
        yearInput.clear();
        yearInput.sendKeys("2023");

        Thread.sleep(2000);

        WebElement buttonClose = driver.findElement(By.xpath("//div[@id='orderModal']//button[@type='button'][normalize-space()='Close']"));
        wait.until(ExpectedConditions.visibilityOf(buttonClose));
        wait.until(ExpectedConditions.elementToBeClickable(buttonClose));
        buttonClose.click();
        Thread.sleep(3000);

        // Quit the driver
        driver.quit();

    }
}