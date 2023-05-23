package com.e2etest.automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.e2etest.automation.page_objects.DragAndDropPage;


public class DragAndDropStepDefinition {
	 private DragAndDropPage DragAndDropPage;
	
	
	public DragAndDropStepDefinition() {
		DragAndDropPage = new DragAndDropPage();
	}
	@Given("je me connecte a https:\\/\\/demoqa.com\\/droppable\\/")
	public void jeMeConnecteAHttpsDemoqaComDroppable() {
		DragAndDropPage.navigate();
	}
	@Then("je teste la fonctionnalite drag and drop")
	public void jeTesteLaFonctionnaliteDragAndDrop() {
		DragAndDropPage.dragAndDrop();

	}




}
