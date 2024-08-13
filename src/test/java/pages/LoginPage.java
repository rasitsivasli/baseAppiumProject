package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utilities.ReusableMethods;

public class LoginPage {
    AndroidDriver driver;
    ReusableMethods methods;
    public LoginPage(AndroidDriver androidDriver){
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By loginButton = By.xpath("");
    By image = By.id("");
    By usernameBox = By.id("usernameBox");
    public void checkLoginButton(){
        methods.checkElement(loginButton);
    }
    public void clickLoginButton(){
        methods.click(loginButton);
    }
    public void checkImage(){
        methods.checkElement(image);
    }
    public void sendKeysUsername(){
        methods.sendKeys(usernameBox,"admin");
    }

}
