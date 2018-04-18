package model.com.salesforce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Trailhead {

    @FindBy(how = How.XPATH, using = "//div[@class='content-title']")
    public WebElement lblContentTitle;

    @FindBy(how = How.XPATH, using = "//div[@class='progress-text']")
    public WebElement lblProecessText;

    @FindBy(how = How.XPATH, using = "//h3[@class='module-title']/a")
    public List<WebElement> lstModuleTitle;

    @FindBy(how = How.XPATH, using = "//span[@class='progress-time']")
    public List<WebElement> lstProcessTime;
}
