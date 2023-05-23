package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;

public class DragAndDropPage {
	 private ConfigFileReader configFileReader;
	
	WebDriver driver = Setup.getDriver();
	
	@FindBy(how=How.ID, using="draggable")
	public static WebElement source;
	
	@FindBy(how=How.ID, using="droppable")
	public static WebElement target;
	
	public DragAndDropPage() {
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
	}
	public void navigate() {
		Setup.getDriver().get(configFileReader.getProperties("ddurl.url"));
	}
	
	public void dragAndDrop() {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}
	
}
