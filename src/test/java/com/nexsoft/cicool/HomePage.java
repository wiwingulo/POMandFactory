package com.nexsoft.cicool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	protected WebDriver driver;

//	private By signIn = By.xpath("//a[@class='page-scroll']");
//	private By languageSetting = By.xpath("//a[@class='dropdown-toggle']");

	@FindBy(xpath = "//a[@class='page-scroll']")
	private WebElement signIn;
	
	@FindBy()
	private WebElement languageSetting;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement btnLogout;

	@FindBy(xpath = "//a[@class='page-scroll dropdown-toggle']")
	private WebElement btnDashboardUsername;
	

	@FindBy(xpath = "//a[normalize-space()='I forgot my password.']" )
	private WebElement btnforgotPassword;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public SignInPage clickSignIn() {

		signIn.click();

		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);

		return signInPage;
	}

	public void logout() {

		btnDashboardUsername.click();
		btnLogout.click();

	}
	public void forgotPassword() {
		btnforgotPassword.click();
		
	}

}
	