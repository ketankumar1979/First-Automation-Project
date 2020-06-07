package BDDProjectBright.PageObjectPackage;

import BDDProjectBright.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resultpage extends DriverFactory {

    @FindBy(xpath = "//span[contains(text(),'Running')]")
    WebElement runningButton;



    public void runningFilter(){
        runningButton.click();
    }

}//class end
