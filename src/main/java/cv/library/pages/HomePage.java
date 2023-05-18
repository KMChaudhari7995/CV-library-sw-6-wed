package cv.library.pages;

import cv.library.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private  static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleCv;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationCv;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobButn;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']//span[text()='Accept All']")
    WebElement cookie;

    public void enterJobTitle(String jobTitle) {
        log.info("Enter Job Title"+jobTitle.toString());
        sendTextToElement(jobTitleCv, jobTitle);
    }

    public void enterLocation(String location) {
        log.info("Enter Location"+locationCv.toString());
        sendTextToElement(locationCv, location);
    }

    public void selectDistance(String distance) {
        log.info("Select Distance"+distanceDropDown.toString());
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }
    public void clickOnMoreSearchOptionLink(){
        log.info("Click moreSearchOptinsLink"+moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);
    }
    public void enterMaxSalary(String maxSalary)
    {
        log.info("Enter MaxSalary"+salaryMax.toString());
        sendTextToElement(salaryMax,maxSalary);
    }
    public void enterMinSalary(String minSalary)
    {
        log.info("Enter Min Salary"+salaryMin.toString());
        sendTextToElement(salaryMin,minSalary);
    }
    public void selectSalaryType(String sType){
        log.info("Enter SalaryType"+salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    }
    public void selectJobType(String jobType){
        log.info("Enter Job Type"+jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
    }
    public void  clickOnFindJobsButton(){
        log.info("Click on Find Jobs Button"+findJobButn.toString());
        clickOnElement(findJobButn);
    }
    ResultPage resultPage= new ResultPage();

/*
    public void jobSearch(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result){
        clickOnMoreSearchOptionLink();
        enterJobTitle(jobTitle);
        enterLocation(location);
        selectDistance(distance);
        enterMinSalary(salaryMin);
        enterMaxSalary(salaryMax);
        selectSalaryType(salaryType);
        selectJobType(jobType);
        clickOnFindJobsButton();
        //resultPage.getResultMessage();

    }*/
    public void clickOnAcceptCookies()
    {
        log.info("Click on Accept Cookie");
        cookie.click();
    }
}



