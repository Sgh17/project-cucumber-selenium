package com.orangeHRM.e2eTests.authentificationOutline.stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.authentification.pages.AuthentificationPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AuthentificationOutlineStepDefinition {

	public WebDriver driver;
	private AuthentificationPage authenticationPage = new AuthentificationPage();
	private CommonMethods commonMethods = new CommonMethods();

	public AuthentificationOutlineStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthentificationPage.class);
	}

	@Given("^je me connecte sur l'application orange$")
	public void jeMeConnecteSurLApplicationOrange() throws Throwable {
		commonMethods.openApplicationWithConfigFile("url_test");
	}

	@When("^je saisi username \"([^\"]*)\"$")
	public void jeSaisiUsername(String name) throws Throwable {
		authenticationPage.fillUserName(name);
	}

	@When("^je saisi password \"([^\"]*)\"$")
	public void jeSaisiPassword(String password) throws Throwable {
		authenticationPage.fillPassword(password);
	}

	@When("^je click sur le bouton login$")
	public void jeClickSurLeBoutonLogin() throws Throwable {
		authenticationPage.clickButtonLogin();
	}

}
