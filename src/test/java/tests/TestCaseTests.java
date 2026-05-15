package tests;

import org.testng.annotations.Test;

public class TestCaseTests extends BaseTest{

    @Test
    public void createNewTestCase(){
        sampleProjectPage.open();
        sampleProjectPage.choseTestCases();
        testCasesPage.addTestCase();
    }
}
