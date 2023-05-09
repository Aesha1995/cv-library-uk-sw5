package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utilities.Utility;

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Permanent Tester jobs in Harrow']")
    WebElement sample1;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Contract Automation Tester jobs in Central London']")
    WebElement sample2;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Temporary Developer jobs in Manchester']")
    WebElement sample3;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Part Time Developer jobs in Wembley']")
    WebElement sample4;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Contract Nurse jobs in Birmingham']")
    WebElement sample5;
    @CacheLookup
    @FindBy(xpath = "h1[normalize-space()='Part Time Qa jobs']")
    WebElement sample6;

    @FindBy(xpath = "//div[@class='search-header__left']//h1")
    WebElement errorMessage;
    public String getResultSample1(){
        CustomListeners.test.log(Status.PASS,"Verify Message "+sample1);
        return getTextFromElement(sample1);
    }
    public String getResultSample2(){
        CustomListeners.test.log(Status.PASS,"Verify Message "+sample2);
        return getTextFromElement(sample2);
    }
    public String getResultSample3(){
        CustomListeners.test.log(Status.PASS,"Verify Message "+sample3);
        return getTextFromElement(sample3);
    }
    public String getResultSample4(){
        CustomListeners.test.log(Status.PASS,"Verify Message "+sample4);
        return getTextFromElement(sample4);
    }
    public String getResultSample5(){
        CustomListeners.test.log(Status.PASS,"Verify Message "+sample5);
        return getTextFromElement(sample5);
    }
    public String getResultSample6(){
        CustomListeners.test.log(Status.PASS,"Verify Message "+sample6);
        return getTextFromElement(sample6);
    }
    public String getErrorMessage()
    {
        return getTextFromElement(errorMessage);
    }
    public void getResultMessage(){
        getResultSample1();
        getResultSample2();
        getResultSample3();
        getResultSample4();
        getResultSample5();
        getResultSample6();
    }
}
