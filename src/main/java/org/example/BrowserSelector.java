package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {

    LoadProperty loadProperty=new LoadProperty();
    String browserName=loadProperty.getProperty("browser");
    public static final String AUTOMATE_USERNAME = "amitapatel_scKRzn";
    public static final String AUTOMATE_ACCESS_KEY = "RGfKqE4zjQFdJusDvqDU";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public static final boolean browserStack = true;  //enter true or false for remote or local testing

    DesiredCapabilities caps = new DesiredCapabilities();

    public void openBrowser(){
        if(browserStack){
            if (browserName.equalsIgnoreCase("chrome")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");

            }
            else if (browserName.equalsIgnoreCase("edge")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.5.2");


            }
            else if (browserName.equalsIgnoreCase("firefox")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "7");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.10.0");

                //window XP setup
                /*caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "XP");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "47.0");
                caps.setCapability("browserstack.local", "false");*/


            }
            try {
                driver = new RemoteWebDriver(new URL(URL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        //open locally
        else{
            if (browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/BrowserDrivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "src/test/resources/BrowserDrivers/msedgedriver.exe");
                driver = new EdgeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/test/resources/BrowserDrivers/geckodriver.exe");
                driver = new FirefoxDriver();
            } else {
                System.out.println("in correct browser name of empty" + browserName);
            }
        }

    //maximise the browser window
        driver.manage().window().maximize();
    //applying implicitly wait to driver object
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }








}
