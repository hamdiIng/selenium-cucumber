package com.e2etest.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.e2etest.automation.utils.SeleniumUtils;
import com.e2etest.automation.utils.Setup;

public class AboutPage {

	private SeleniumUtils seleniumUtils;
	/* Retrieve Element */

	@FindBy(how = How.ID, using = "about_sidebar_link")
	public static WebElement about;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div/a/div/div/span")
	public static WebElement sauceDevops;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/header/div/div/div[1]/div[2]/div/div[1]/div[1]/div[1]/span")
	public static WebElement products;

	// constructeur
	public AboutPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		seleniumUtils = new SeleniumUtils();
	}

	public void navigateLabs() {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(about));
		about.click();
		seleniumUtils.mouseHover(products);
		

	}
	public void clickBtnSauceDevops() {
		sauceDevops.click();
	}
}
