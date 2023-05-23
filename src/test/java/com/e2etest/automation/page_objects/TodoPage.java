package com.e2etest.automation.page_objects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.SeleniumUtils;
import com.e2etest.automation.utils.Setup;

public class TodoPage {
	private ConfigFileReader configFileReader;
	private SeleniumUtils seleniumUtils;
	WebDriver driver =Setup.getDriver();

	/* Retrieve Element */

	@FindBy(how = How.XPATH, using = "//input[@ng-model='newTodo']")
	public static WebElement inputText;
	
	
	@FindBy(how = How.XPATH, using = "//label[@ng-dblclick='editTodo(todo)']")
	public static WebElement labelText;
	
	@FindBy(how = How.XPATH, using = "//button[@ng-click='removeTodo(todo)']")
	public static WebElement removeBtn;

	public TodoPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
	}

	public void connecterApp() {
		Setup.getDriver().get(configFileReader.getProperties("hometodo.url"));

	}

	public void introduireUnText(String todo) {
		inputText.clear();
		todo =configFileReader.getProperties("home.inputText");
		inputText.sendKeys(todo);
		inputText.sendKeys(Keys.ENTER);
		seleniumUtils.mouseHover(labelText);
		removeBtn.getText();
		System.out.println(removeBtn.getText());
		
		Actions actions = new Actions(Setup.getDriver());
		actions.click(removeBtn).perform();
		
		Assert.assertFalse(seleniumUtils.getPageSource().contains(todo));
		//Assert.assertFalse(Setup.getDriver().getPageSource().contains(todo));
		
	}

}
