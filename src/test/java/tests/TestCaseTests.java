package tests;

import org.testng.annotations.Test;

public class TestCaseTests extends BaseTest{

    @Test(groups = "Regression")
    public void createNewTestCase(){
        sampleProjectPage.open();
        sampleProjectPage.choseTestCases();
        testCasesPage.addTestCase();
    }
}
