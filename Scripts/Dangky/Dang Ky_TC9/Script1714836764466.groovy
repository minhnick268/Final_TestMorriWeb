import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://www.morricosmetics.somee.com/')

WebUI.click(findTestObject('Dangky/Page_Trang ch/i_Lin h nhanh_pe-7s-users'))

WebUI.clickOffset(findTestObject('Dangky/Page_Trang ch/a_ng k ti khon'), 0, 0)

WebUI.setText(findTestObject('Dangky/Page_ng k ti khon/input_H v Tn_FullName'), 'Morri')

WebUI.setText(findTestObject('Dangky/Page_ng k ti khon/input_a ch Email_Email'), 'morritest@gmail.com')

WebUI.setText(findTestObject('Dangky/Page_ng k ti khon/input_S in thoi_Phone'), '0935626852')

WebUI.setText(findTestObject('Dangky/Page_ng k ti khon/input_Mt khu_Password'), '123456')

WebUI.setText(findTestObject('Dangky/Page_ng k ti khon/input_Nhp li mt khu_ConfirmPassword'), '12345')

WebUI.scrollToPosition(0, 750)

WebUI.click(findTestObject('Dangky/Page_Trang ch/Page_ng k ti khon/button_ng k'))

WebUI.verifyElementText(findTestObject('Dangky/Page_Dashboard/a_Thng tin ti khon'), 'THÔNG TIN TÀI KHOẢN')

WebUI.closeBrowser()

