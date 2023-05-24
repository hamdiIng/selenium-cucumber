package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;

public class PlaceHolderPage {

	@FindBy(how = How.ID, using = "toolTipTextField")
	public static WebElement placeHolder;

	private ConfigFileReader configFileReader;

	public PlaceHolderPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();

	}

	public void seConnecter() {
		Setup.getDriver().get(configFileReader.getProperties("placeHolder.url"));
	}

	public String getPlaceHolder() {
		return placeHolder.getAttribute("placeHolder");
	}

}
