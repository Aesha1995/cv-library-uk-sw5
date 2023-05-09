package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {
    @DataProvider(name = "Credentials")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester","Harrow, Greater London","5 miles","30000","50000","Per annum","Permanent","Permanent Tester jobs in Harrow"},
                {"Automation Tester","Central London","2 miles","40000","60000","Per annum","Contract","Contract Automation Tester jobs in Central London"},
                {"Developer","Manchester","1 mile","3500","4000","Per month","Temporary","Temporary Developer jobs in Manchester"},
                {"Developer","Wembley, Greater London","7 miles","20000","40000","Per annum","Part Time","Part Time Developer jobs in Wembley"},
                {"nurse","Birmingham","1 mile","20000","40000","Per annum","Contract","Contract Nurse jobs in Birmingham"},
                {"QA","Edgware","2 miles","30000","50000","Per month","Part Time","Part Time Qa jobs in Edgware"}
        };
        return data;
    }

}
