package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;


import java.util.concurrent.TimeUnit;

import static steps.PageInitializers.employeeSearchPage;

public class EmployeeSearchSteps extends CommonMethods {


    @Given("user is navigated HRMS application")
    public void user_is_navigated_hrms_application() {
       openBrowserAndLauchApplication();

    }
    @When("user enters valid admin credentials")
    public void user_enters_valid_admin_credentials() {
        WebElement usernameField= driver.findElement(By.id("txtUsername"));
       // usernameField.sendKeys(ConfigReader.getPropertyValue("username"));
        sendText(usernameField,ConfigReader.getPropertyValue("username"));

        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        sendText(passwordField,ConfigReader.getPropertyValue("password"));
       // passwordField.sendKeys((ConfigReader.getPropertyValue("password")));


    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
       WebElement loginButton=driver.findElement(By.id("btnLogin"));
       // driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
       click(loginButton);
       //loginButton.click();

    }
    @When("user navigated to employee list page")
    public void user_navigated_to_employee_list_page() {
       WebElement pimOption=driver.findElement(By.id("menu_pim_viewPimModule"));
       //pimOption.click();
        click(pimOption);

       WebElement empListOption =driver.findElement(By.id("menu_pim_viewEmployeeList"));
      // empListOption.click();
        click(empListOption);

    }
    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {

     WebElement searchId= driver.findElement(By.id("empsearch_id"));
    // searchId.sendKeys("12773407");
        sendText(searchId,"12773407");

    }


    @When("user click on search button")
    public void user_click_on_search_button() {

        // WebElement searchButton = driver.findElement(By.id("searchBtn"));
        //  searchButton.click();
        click(employeeSearchPage.searchButton);
    }


    @Then("user is able to see employee information")
    public void user_is_able_to_see_employee_information() {
        System.out.println("Result Displayed");
       // tearDown();
    }


    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
      //  driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);

        WebElement searchName= driver.findElement(By.xpath("(//*[@type='text'])[1]"));
        //searchName.sendKeys("Donna");
        sendText(searchName,"Donna");

    }


}
