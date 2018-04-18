package model.net;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Html5up {

    @FindBy(how = How.XPATH, using = "//*[@id='items']/article/a/img[@class='placeholder']")
    public List<WebElement> placeholderImageList;
}
