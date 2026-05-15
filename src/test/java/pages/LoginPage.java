package pages;

import decorators.Button;
import decorators.ElementDecorator;
import decorators.Input;
import decorators.TextArea;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    private ElementDecorator elementDecorator;
    private Button loginButton;

    public void open() {
        driver.navigate().to("https://profile.testrail.io/index.php?/auth/login");
    }

    public void sendEmail(String email){
        elementDecorator = new ElementDecorator(driver, "loginIdName");
        elementDecorator.sendKeys(email);
    }

    public void sendPassword(String password){
        elementDecorator = new ElementDecorator(driver, "loginPasswordFormDialog");
        elementDecorator.sendKeys(password);
    }

    public void clickToLoginButton(){
        loginButton =new Button(driver, "loginButtonPrimary");
        loginButton.click();
    }
}
