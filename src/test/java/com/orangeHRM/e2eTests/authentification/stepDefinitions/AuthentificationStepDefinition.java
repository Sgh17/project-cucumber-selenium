package com.orangeHRM.e2eTests.authentification.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.authentification.pages.AuthentificationPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition {

	public WebDriver driver; 
	private AuthentificationPage authenticationPage = new AuthentificationPage();
	private CommonMethods commonMethods = new CommonMethods();
	
	public AuthentificationStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^Je me connecte sur l'application orange$")
	public void jeMeConnecteSurLApplicationOrange() throws Throwable {
		commonMethods.openApplicationWithConfigFile("url_test");
	}

	@When("^Je saisi username \"([^\"]*)\"$")
	public void jeSaisiUsername(String name) throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class);
		authenticationPage.fillUserName(name);
	}

	@When("^Je saisi password \"([^\"]*)\"$")
	public void jeSaisiPassword(String password) throws Throwable {
		authenticationPage.fillPassword(password);
	}

	@When("^Je click sur le bouton login$")
	public void jeClickSurLeBoutonLogin() throws Throwable {
		authenticationPage.clickButtonLogin();
	}

	@Then("^Redirection vers le compte admin \"([^\"]*)\"$")
	public void redirectionVersLeCompteAdmin(String message) throws Throwable {
       String welcomeMessage = AuthentificationPage.messageWelcome.getText();
       Assert.assertTrue(welcomeMessage.contains(message));
	}
}
