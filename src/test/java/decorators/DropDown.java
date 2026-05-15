package decorators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDown extends ElementDecorator{
    public DropDown(WebDriver driver, WebElement element) {
        super(driver, element);
    }

    public DropDown(WebDriver driver, By locator) {
        super(driver, locator);
    }

    public DropDown(WebDriver driver, String dataTestId) {
        super(driver, dataTestId);
    }
}
