package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.SelectFromListUtils;
import com.e2etest.automation.utils.Setup;

public class DropDownListPage {
	 private ConfigFileReader configFileReader;
	 private SelectFromListUtils selectFromListUtils;
		
		WebDriver driver = Setup.getDriver();
		
		@FindBy(how=How.ID, using="oldSelectMenu")
		public static WebElement element;

		public DropDownListPage() {
			PageFactory.initElements(Setup.getDriver(), this);
			configFileReader = new ConfigFileReader();
			selectFromListUtils = new SelectFromListUtils();
		}
		public void navigateTo() {
			Setup.getDriver().get(configFileReader.getProperties("ddlist.url"));
			
		}
		public void selectFromList(String index, String value, String text) {
			int index1  =Integer.parseInt(configFileReader.getProperties("home.index"));
			value =configFileReader.getProperties("home.valeur");
			text =configFileReader.getProperties("home.text");
			selectFromListUtils.selectDropDownListByIndex(element, index1);
			selectFromListUtils.selectDropDownListByValue(element, value);
			selectFromListUtils.selectDropDownListByVisibleText(element, text);
		}
		
		

}
