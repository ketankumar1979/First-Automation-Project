package BDDProjectBright.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }
/*
    public static final String USERNAME = "ketankumarpatel1";
    public static final String AUTOMATE_KEY = "TD3x4sPqGjsxwRn7P6pk";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
*/
    public void openBrowser()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
/*
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os_version", "7.0");
        caps.setCapability("device", "Samsung Galaxy S8");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("project", "Android");
        caps.setCapability("build", "1.3");
        caps.setCapability("name", "Argos");
        caps.setCapability("browserstack.local", "false");

        driver = new RemoteWebDriver(new URL(URL), caps);

*/
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    }


    public void closeBrowser()  {
        driver.quit();
    }
}//class end

//ketan patel

//ketan
