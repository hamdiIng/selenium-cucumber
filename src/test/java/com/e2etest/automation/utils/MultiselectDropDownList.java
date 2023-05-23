package com.e2etest.automation.utils;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropDownList {
	
	public void selectMultiOptions(WebElement element) {
		Select select =new Select( element);
		List<WebElement> options = select.getOptions();
		
		for (WebElement option : options)
			System.out.println(option.getText());

		// Using isMultiple() method to verify if the element is multi-select, if yes go
		// onto next steps else eit
		if (select.isMultiple()) {
			
			// Selecting option as 'Opel'-- ByIndex
			System.out.println("Select option Opel by Index");
			select.selectByIndex(2);

			// Selecting the option as 'Saab'-- ByValue
			System.out.println("Select option saab by Value");
			select.selectByValue("saab");

			// Selecting the option by text
			System.out.println("Select option Audi by Text");
			select.selectByVisibleText("Audi");

			// Get the list of selected options
			System.out.println("The selected values in the dropdown options are -");

			List<WebElement> selectedOptions = select.getAllSelectedOptions();
			
			for (WebElement selectedOption : selectedOptions)
				System.out.println(selectedOption.getText());

			// Deselect the value "Audi" by Index
			System.out.println("DeSelect option Audi by Index");
			select.deselectByIndex(3);

			// Deselect the value "Opel" by visible text
			System.out.println("Select option Opel by Text");
			select.deselectByVisibleText("Opel");

			// Validate that both the values are deselected
			System.out.println("The selected values after deselect in the dropdown options are -");
			List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();

			for (WebElement selectedOptionAfterDeselect : selectedOptionsAfterDeselect)
				System.out.println(selectedOptionAfterDeselect.getText());

			// Step#8- Deselect all values
			select.deselectAll();
		}

	}

}
