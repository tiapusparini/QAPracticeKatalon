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



class LogoutSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("I click button menu for logout")
	def I_click_button_menu_for_logout() {
		Windows.click(findWindowsObject('Object Repository/HomePage/ButtonMenu'))
		Windows.waitForElementPresent(findWindowsObject('Object Repository/HomePage/ButtonMenuWinHover'), 2)
	}

	@And("I click button logout with value (.*)")
	def I_click_button_logout(String value) {
		String nameButtonLogout = Windows.getText(findWindowsObject('Object Repository/HomePage/ButtonLogout'))
		assert nameButtonLogout == value
		Windows.click(findWindowsObject('Object Repository/HomePage/ButtonLogout'))
	}

	@Then("I verify the logout is true with (.*)")
	def I_verify_the_status_in_step(String sign) {
		Windows.waitForElementPresent(findWindowsObject('Object Repository/LandingPage/BoardingWindows'), 8)
		Windows.waitForElementPresent(findWindowsObject('Object Repository/LandingPage/ImageQRCode'), 5)
		String textInLandingPage = Windows.getText(findWindowsObject('Object Repository/LandingPage/TextToUse_landingPage'))
		assert textInLandingPage == sign

		Windows.closeApplication()
	}
}