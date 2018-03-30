package utils;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
    private static BrowserFactory instance;
    private WebDriver driver;

    private BrowserFactory(String browser) {
        if (StringUtils.isEmpty(browser) || StringUtils.containsIgnoreCase(browser, Const.TYPE_FIREFOX)) {
            System.setProperty(Const.WEBDRIVER_FIREFOX, Const.DRIVER_PATH_FIREFOX);
            driver = new FirefoxDriver();
        } else if (StringUtils.containsIgnoreCase(browser, Const.TYPE_CHROME)) {
            System.setProperty(Const.WEBDRIVER_CHROME, Const.DRIVER_PATH_CHROME);
            driver = new ChromeDriver();
        } else if (StringUtils.containsIgnoreCase(browser, Const.TYPE_IE)) {
            System.setProperty(Const.WEBDRIVER_IE, Const.DRIVER_PATH_IE);
            driver = new InternetExplorerDriver();
        }
    }

    public static BrowserFactory getInstance(String browser) {
        if (instance == null) {
            synchronized (BrowserFactory.class) {
                if (instance == null) {
                    instance = new BrowserFactory(browser);
                }
            }
        }
        return instance;
    }

    public WebDriver init() {
        return driver;
    }
}
