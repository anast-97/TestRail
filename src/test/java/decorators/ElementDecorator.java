package decorators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementDecorator {

    private WebElement element;
    private WebDriver driver;
    private By locator;
    private String dataTestId;

    public ElementDecorator(WebDriver driver, WebElement element) {
        this.element = element;
        this.driver = driver;
    }

    public ElementDecorator(WebDriver driver, By locator) {
        this.driver = driver;
        this.locator = locator;
        this.element=driver.findElement(locator);
    }

    public ElementDecorator(WebDriver driver, String dataTestId) {
        this.driver = driver;
        this.dataTestId = dataTestId;
        this.element=driver.findElement(By.cssSelector(String.format("[data-testid=$]", this.dataTestId)));
    }

    public void click(){}

    public boolean isDisplayed(){
        return element.isDisplayed();
    }

    public void clearValue(){}

    public boolean isEnabled(){
        return element.isEnabled();
    }

    public void clear(){
        element.clear();
    }
}
