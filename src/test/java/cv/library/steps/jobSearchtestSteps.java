package cv.library.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cv.library.pages.HomePage;
import cv.library.pages.ResultPage;
import org.junit.Assert;

public class jobSearchtestSteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }


    @When("^I enter \"([^\"]*)\"$")
    public void iEnter(String job)  {
       new HomePage().enterJobTitle(job);
    }

    @And("^enter Location \"([^\"]*)\"$")
    public void enterLocation(String location)  {
           new HomePage().enterLocation(location);
    }

    @And("^I enter distance \"([^\"]*)\"$")
    public void iEnterDistance(String distance)  {
       new HomePage().selectDistance(distance);
    }

    @And("^I click on moreSearchOptionsLink$")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter salaryMin \"([^\"]*)\"$")
    public void iEnterSalaryMin(String maxsalary)  {
       new HomePage().enterMaxSalary(maxsalary);
    }

    @And("^I  enter salaryMax \"([^\"]*)\"$")
    public void iEnterSalaryMax(String minsalary)  {
       new HomePage().enterMinSalary(minsalary);
    }

    @And("^I select salaryType \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType)  {
       new HomePage().selectSalaryType(salaryType);
    }

    @And("^I select jobType \"([^\"]*)\"$")
    public void iSelectJobType(String jobtype)  {
       new HomePage().selectJobType(jobtype);
    }

    @And("^click on 'Find Jobs' button$")
    public void clickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("^I verify the result \"([^\"]*)\"$")
    public void iVerifyTheResult(String result)  {
        Assert.assertEquals(result, new ResultPage().getResultMessage());
    }
}
