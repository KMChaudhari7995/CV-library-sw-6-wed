package cv.library.pages;

import cv.library.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    private  static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ResultPage(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//div[@class='search-header__left']//h1")
    WebElement errorMessage;

    public String getResultMessage()
    {
        log.info("Get text from element"+errorMessage.toString());
        return getTextFromElement(errorMessage);
    }


}
