import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class ArchivedSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I'm in home page")
	def Im_in_home_page() {
		Windows.startApplication('C:\\Users\\Tia\\AppData\\Local\\WhatsApp\\app-2.2202.12\\WhatsApp.exe')
		Windows.waitForElementPresent(findWindowsObject('Object Repository/LandingPage/BoardingWindows'), 2)
	}

	@When("I see a progress bar")
	def i_see_a_progress_bar() {
		Windows.waitForElementPresent(findWindowsObject('Object Repository/LandingPage/BoardingWindowsAfterLogin'), 8)
		Windows.verifyElementPresent(findWindowsObject('Object Repository/HomePage/ImageAccount'), 1)
	}

	@And("I click button that has (.*) in home page")
	def I_click_button_archived_in_home_page(String value) {
		Windows.verifyElementPresent(findWindowsObject('Object Repository/HomePage/ButtonArchived'), 1)
		Windows.click(findWindowsObject('Object Repository/HomePage/ButtonArchived'))
	}

	@Then("I go to archived windows")
	def I_go_to_archived_windows() {
		Windows.click(findWindowsObject('Object Repository/HomePage/InArchivedMenu'))
		Windows.verifyElementPresent(findWindowsObject('Object Repository/HomePage/InArchiveSetting'), 1)
	}

	@And("I go back to home page from archived")
	def I_go_back_to_home_page_from_archived() {
		Windows.click(findWindowsObject('Object Repository/HomePage/InArchiveBack'))
		Windows.closeApplication()
	}
}