package com.e2etest.automation.page_objects;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.SeleniumUtils;
import com.e2etest.automation.utils.Setup;

public class TodoPage {
	private ConfigFileReader configFileReader;
	private SeleniumUtils seleniumUtils;

	/* Retrieve Element */

	@FindBy(how = How.XPATH, using = "//input[@ng-model='newTodo']")
	public static WebElement inputText;
	
	
	@FindBy(how = How.XPATH, using = "//label[@ng-dblclick='editTodo(todo)']")
	public static WebElement labelText;
	
	@FindBy(how = How.XPATH, using = "//button[@ng-click=\"removeTodo(todo)\"]")
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
		removeBtn.click();
		Assert.assertFalse(Setup.getDriver().getPageSource().contains(todo));
		
	}

}
