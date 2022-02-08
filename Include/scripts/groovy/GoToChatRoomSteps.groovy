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



class GoToChatRoomSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am in home page")
	def I_am_in_home_page() {
		Windows.startApplication('C:\\Users\\Tia\\AppData\\Local\\WhatsApp\\app-2.2202.12\\WhatsApp.exe')
		Windows.waitForElementPresent(findWindowsObject('Object Repository/LandingPage/BoardingWindows'), 2)
		Windows.waitForElementPresent(findWindowsObject('Object Repository/LandingPage/BoardingWindowsAfterLogin'), 8)
		Windows.verifyElementPresent(findWindowsObject('Object Repository/HomePage/ImageAccount'), 1)
	}

	@When("I click some chat room")
	def I_click_some_chat_room() {
		Windows.click(findWindowsObject('Object Repository/HomePage/CustomChatInList'))
	}

	@Then("the chat room will be shown")
	def the_chat_room_will_shown() {
		Windows.waitForElementPresent(findWindowsObject('Object Repository/RoomChat/ToolbarInChatRoom'), 1)
		Windows.waitForElementPresent(findWindowsObject('Object Repository/RoomChat/ToolbarTypeMessage'), 1)
		//Check if the name we click and name in chat room is the same name

		Windows.closeApplication()
	}
}