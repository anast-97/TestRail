package pages;

import decorators.ElementDecorator;
import org.openqa.selenium.WebDriver;

public class TestCasesPage extends BasePage {

    public TestCasesPage(WebDriver driver) {
        super(driver);
    }

    public void addTestCase() {
        ElementDecorator addTestCaseButton = new ElementDecorator(driver, "sidebarCasesAdd");
        addTestCaseButton.click();
    }
}
