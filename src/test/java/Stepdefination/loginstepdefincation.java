package Stepdefination;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpages.loginPP;
import genericmethods.genericclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefincation extends genericclass {

	@Given("user is on logi")
	public void user_is_on_login() throws IOException 
	{
		browserlaunch();
		ExtentCucumberAdapter.addTestStepLog("browser lanuach");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(captureScreenshot());
		}
	  
	@When("^enter Username as \"([^\"]*)\"$")
	public void user_enters_username_details(String username) throws IOException 
	{
		Enter_Emaild(username);
		ExtentCucumberAdapter.addTestStepLog("entered username");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(captureScreenshot());
	}

	@And("enters pasword \"([^\"]*)\"$")
	public void enters_pasword(String password) throws IOException
	{
		Enter_password(password);
		ExtentCucumberAdapter.addTestStepLog("entered password");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(captureScreenshot());
	}

	@When("user clicks on submit")
	public void user_clicks_on_submit() throws IOException {
		login();
		ExtentCucumberAdapter.addTestStepLog("submit button is clicked");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(captureScreenshot());
	}

}
