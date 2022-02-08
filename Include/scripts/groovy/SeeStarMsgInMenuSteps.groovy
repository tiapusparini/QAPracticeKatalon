import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SeeStarMsgInMenuSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@When("I click button menu")
	def I_click_button_menu() {
		Windows.click(findWindowsObject('Object Repository/HomePage/ButtonMenu'))
		Windows.waitForElementPresent(findWindowsObject('Object Repository/HomePage/ButtonMenuWinHover'), 2)
	}
	
	@And("i click button (.*)")
	def I_click_button_starred(String value) {
		String nameButton = Windows.getText(findWindowsObject('Object Repository/StarChat/ButtonStarredInMenu'))
		assert nameButton == value
		Windows.click(findWindowsObject('Object Repository/StarChat/ButtonStarredInMenu'))
	}

	@Then("I go to starred windows")
	def I_verify_the_status_in_step() {
		Windows.click(findWindowsObject('Object Repository/StarChat/OptionButtonInStarred'))
		Windows.verifyElementPresent(findWindowsObject('Object Repository/StarChat/ButtonUnstarAll'), 1)
	}
	
	@And("I go back to home page from star")
	def I_go_back_to_home_page_from_star() {
		Windows.click(findWindowsObject('Object Repository/StarChat/ButtonBackStarred'))
		Windows.closeApplication()
	}
}