package com.e2etest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;
import com.e2etest.automation.utils.Validations;

public class UploadFilePage {

	private ConfigFileReader configFileReader;
	private Validations validations;

	@FindBy(how = How.ID, using = "uploadfile_0")
	public static WebElement file;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"res\"]/center/text()[2]")
	public static WebElement resultat;
	
	
	@FindBy(how = How.ID, using = "terms")
	public static WebElement checkBox;

	@FindBy(how = How.ID, using = "submitbutton")
	public static WebElement submitBtn;

	public UploadFilePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}

	public void uploadFile() {
		Setup.getDriver().get(configFileReader.getProperties("upload.url"));
		file.sendKeys(configFileReader.getProperties("file.path"));
		checkBox.click();
		System.out.println(validations.isElementSelected(checkBox));
		submitBtn.click();

	}
	

}
