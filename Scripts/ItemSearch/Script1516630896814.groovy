import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('User Test Data').getValue(1, 3))

WebUI.setText(findTestObject('Page_User Login/input_username'), findTestData('User Test Data').getValue(2, 3))

WebUI.setText(findTestObject('Page_User Login/input_password'), findTestData('User Test Data').getValue(3, 3))

WebUI.click(findTestObject('Page_User Login/button_Login'))

WebUI.click(findTestObject('a_stylemenu'))

WebUI.click(findTestObject('span_Search Items (1)'))

WebUI.setText(findTestObject('input_searchText'), findTestData('User Test Data').getValue(4, 3))

WebUI.click(findTestObject('input_form-control btn btn-inf'))

WebUI.click(findTestObject('span_2'))

WebUI.click(findTestObject('a_First'))

WebUI.click(findTestObject('span_1'))

WebUI.click(findTestObject('a_Last'))

WebUI.click(findTestObject('Page_Home/i_exit_to_app'))

WebUI.closeBrowser()

