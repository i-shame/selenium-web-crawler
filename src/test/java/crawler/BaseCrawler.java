package crawler;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utils.BrowserFactory;
import utils.Const;

public class BaseCrawler {
    public static final Logger logger = LogManager.getLogger(BaseCrawler.class);

    public static final Logger LOGGER = LogManager.getLogger(Const.LOG_APPLICATION);
    public WebDriver driver;
    public WebDriverWait waiter;

    @Parameters(Const.TYPE_BROWSER)
    @BeforeClass
    public void beforeExecution(@Optional String browser) {
//        DOMConfigurator.configure("log4j.xml");
        driver = BrowserFactory.getInstance(browser).init();
        waiter = new WebDriverWait(driver, Const.TIMEOUT_IN_SECONDS);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }
}
