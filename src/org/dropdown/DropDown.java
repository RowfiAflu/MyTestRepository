package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AFLAHA\\eclipse-workspace\\SeleniumDropDown\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
        driver.manage().window().maximize();
        WebElement txtUserName = driver.findElement(By.id("username"));
        txtUserName.sendKeys("aniafurow");
        WebElement txtPwd = driver.findElement(By.id("password"));
        txtPwd.sendKeys("Ani@123456");
        WebElement btnLogin = driver.findElement(By.id("login"));
        btnLogin.click();
        
        
        
        WebElement dDnLocation = driver.findElement(By.id("location"));
        
        Select select = new Select(dDnLocation);
        List<WebElement> list = select.getOptions();
        int size = list.size();
        System.out.println(size);
        for (WebElement webElement : list) {
        	String text = webElement.getText();
        	System.out.println(text);	
		}
         select.selectByValue("Sydney");
        
        WebElement dDnHotels = driver.findElement(By.id("hotels"));
        Select select1 = new Select(dDnHotels);
        select1.selectByValue("Hotel Cornice");
        
        WebElement dDnRoomTAype = driver.findElement(By.name("room_type"));
        Select select2 = new Select(dDnRoomTAype);
        select2.selectByIndex(3);
        
        WebElement dDnNoOfRoom = driver.findElement(By.name("room_nos"));
        Select select3 = new Select(dDnNoOfRoom );
        select3.selectByIndex(5);
       
        WebElement dDnCheckInDate = driver.findElement(By.name("datepick_in"));
        dDnCheckInDate.clear();
        dDnCheckInDate.sendKeys("08/03/2022");
        
        WebElement dDnCheckOutDate = driver.findElement(By.name("datepick_out"));
        dDnCheckOutDate.clear();
        dDnCheckOutDate.sendKeys("15/03/2022");
        
        WebElement dDnNoAdults = driver.findElement(By.name("adult_room"));
        Select select4 = new Select(dDnNoAdults);
        select4.selectByIndex(2);
        
        WebElement dDnNoOfChild = driver.findElement(By.name("child_room"));
        Select select5 = new Select(dDnNoOfChild);
        select5.selectByIndex(2);
        
        WebElement btnSearch = driver.findElement(By.id("Submit"));
        btnSearch.click();
        
        WebElement btnSelectHotel = driver.findElement(By.id("radiobutton_0"));
        btnSelectHotel.click();
        
        WebElement btnContinue = driver.findElement(By.id("continue"));
        btnContinue.click();
        
        WebElement txtFirstName = driver.findElement(By.id("first_name"));
        txtFirstName.sendKeys("Afu");
        
        WebElement txtLastName = driver.findElement(By.id("last_name"));
        txtLastName.sendKeys("Ani");
        
        WebElement txtAddress = driver.findElement(By.id("address"));
        txtAddress.sendKeys("1, Melbourn");
        
        WebElement txtCcNumber = driver.findElement(By.id("cc_num"));
        txtCcNumber.sendKeys("1238972015400111");
        
        WebElement dDnCcType = driver.findElement(By.name("cc_type"));
        Select select6 = new Select(dDnCcType);
        select6.selectByIndex(2);
        
        WebElement dDnExpMonth = driver.findElement(By.name("cc_exp_month"));
        Select select7 = new Select(dDnExpMonth);
        select7.selectByIndex(3);
        
       
        WebElement dDnExpYear = driver.findElement(By.name("cc_exp_year"));
        Select select8 = new Select(dDnExpYear);
        select8.selectByIndex(2);
        
        WebElement txtCvvNumber = driver.findElement(By.id("cc_cvv"));
        txtCvvNumber.sendKeys("010");
        
        WebElement btnBookNow = driver.findElement(By.id("book_now"));
        btnBookNow.click();
       WebDriverWait wait = new WebDriverWait(driver,5);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
        WebElement getTtOrderID = driver.findElement(By.id("order_no"));
        String orderID = getTtOrderID.getAttribute("value");
        System.out.println(orderID);
        
        
        
      
        
     
        
        
        
        
        
       
        
	}

}
