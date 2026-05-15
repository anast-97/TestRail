package pages;

import decorators.ElementDecorator;
import org.openqa.selenium.WebDriver;

public class SampleProjectPage extends BasePage{

    ElementDecorator elementDecorator;

    public SampleProjectPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.navigate().to("https://ynastua97.testrail.io/index.php?/projects/overview/1");
    }

    public void choseTestCases(){
        elementDecorator = new ElementDecorator(driver, "navigateToMilestonesButton");
        elementDecorator.click();
    }


}
