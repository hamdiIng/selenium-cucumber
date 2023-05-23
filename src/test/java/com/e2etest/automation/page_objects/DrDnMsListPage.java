package com.e2etest.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.MultiselectDropDownList;
import com.e2etest.automation.utils.Setup;

public class DrDnMsListPage {
	
	private ConfigFileReader configFileReader;
	private MultiselectDropDownList multiselectDropDownList;
	@FindBy(how=How.ID,using="cars")
	public static WebElement carsModel;
	
	public DrDnMsListPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
		multiselectDropDownList = new MultiselectDropDownList();
	}
	 
	public void seConncter() {
		Setup.getDriver().get(configFileReader.getProperties("ddlist.url"));
	}
	
	public void selectOptions() {
		multiselectDropDownList.selectMultiOptions(carsModel); 

	}

}
