import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8089/#/')

WebUI.click(findTestObject('Object Repository/Page_Hello React/span_Helpless'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Hello React/i_Helpless_play icon'))

WebUI.click(findTestObject('Object Repository/Page_Hello React/span_We Are All Astronauts'))

WebUI.delay(20)

WebUI.click(findTestObject('Page_Hello React/Hide'))

WebUI.click(findTestObject('Object Repository/Page_Hello React/span_Purity is an album by Eth'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Hello React/span_An excellent companion'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Hello React/a_Explore new albums'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Hello React/div_Purity'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Hello React/a_Go to my playlists'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Hello React/div_HelplessNeed a Name...'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/Page_Hello React/a_Go to upload page'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Hello React/a_MelodyCloud'))

