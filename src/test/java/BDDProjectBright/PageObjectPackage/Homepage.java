package BDDProjectBright.PageObjectPackage;

import BDDProjectBright.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {

    @FindBy(id = "searchTerm")
    WebElement searchbox;

    @FindBy(xpath = "//span[@class='_1gqeQ']")
    WebElement searchbutton;

    @FindBy(xpath = "//div[@class='_3-aaF']//a[2]")
    WebElement accountButton;



    public void doSearch(String item){
        searchbox.sendKeys(item);
        searchbutton.click();
    }

    public void homePageURL(){
       String actualurl =  driver.getCurrentUrl();
        Assert.assertThat(actualurl, Matchers.containsString("argos"));
    }

    public void clickOnAccountButton(){
        accountButton.click();
    }



}//class end
