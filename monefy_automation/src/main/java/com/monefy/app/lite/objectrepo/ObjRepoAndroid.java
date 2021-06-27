/**
 * @author sunil_s
 * @created on 06/26/2021
 * @description Class containing locators for Android Elements
 */
package com.monefy.app.lite.objectrepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjRepoAndroid extends BaseObjRepo {

	private static WebElement element = null;
	private static List<WebElement> elements = null;
	WebDriverWait wait = null;

	// Home Screen - Open Navigation Button
	@Override
	public WebElement getHomeScreen_OpenNavigationBtn(WebDriver dr, String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc='" + value + "']")));
		return element;
	}
	
	// Home Screen - App Title
	@Override
	public WebElement getHomeScreen_HomeScreenTitle(WebDriver dr, String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='" + value + "']")));
		return element;
	}

	// Home Screen - All Accounts Txt 
	@Override
	public WebElement getHomeScreen_AllAccountsTxt(WebDriver dr, String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='" + value + "']")));
		return element;
	}

	// Home Screen - Search Button
	@Override
	public WebElement getHomeScreen_SearchBtn(WebDriver dr, String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='" + value + "']")));
		return element;
	}

	// Home Screen - Transfer Button 
	@Override
	public WebElement getHomeScreen_TransferBtn(WebDriver dr, String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='" + value + "']")));
		return element;
	}

	// Home Screen - Settings Button
	@Override
	public WebElement getHomeScreen_SettingsBtn(WebDriver dr, String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='" + value + "']")));
		return element;
	}

	// Home Screen - Month Text
	@Override
	public WebElement getHomeScreen_MonthTxt(WebDriver dr, String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='" + value + "']")));
		return element;
	}

	// Home Screen - Income Amount Text
	@Override
	public WebElement getHomeScreen_IncomeAmtTxt(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/income_amount_text")));
		return element;
	}

	// Home Screen - Expense Amount Text
	@Override
	public WebElement getHomeScreen_ExpenseAmtTxt(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/expense_amount_text")));
		return element;
	}

	// Home Screen - Balance Amount Text
	@Override
	public WebElement getHomeScreen_BalanceAmtTxt(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/balance_amount")));
		return element;
	}

	// Home Screen - Expense Button
	@Override
	public WebElement getHomeScreen_ExpenseBtn(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/expense_button_title")));
		return element;
	}

	// Home Screen - Income Button
	@Override
	public WebElement getHomeScreen_IncomeBtn(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/income_button_title")));
		return element;
	}
	
	// Home Screen - Bills Added Toast Message
	@Override
	public WebElement getHomeScreen_BillsToastMsg(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/snackbar_text")));
		return element;
	}

	// Home Screen - Cancel Button
	@Override
	public WebElement getHomeScreen_CancelButton(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/snackbar_action")));
		return element;
	}
	
	
	// Expense Screen - Title
	@Override
	public WebElement getExpenseScreen_AlertToastMsg(WebDriver dr, String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='" + value + "']")));
		return element;
	}

	// Expense Screen - Navigation Up Button
	@Override
	public WebElement getExpenseScreen_NavigateUpBtn(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']")));
		return element;
	}

	// Expense Screen - Title
	@Override
	public WebElement getExpenseScreen_Title(WebDriver dr, String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='" + value + "']")));
		return element;
	}

	// Expense Screen - Repeat Icon
	@Override
	public WebElement getExpenseScreen_RepeatBtn(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/schedule")));
		return element;
	}
	
	// Expense Screen - Date Picker
	@Override
	public WebElement getExpenseScreen_DatePicker(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/textViewDate")));
		return element;
	}

	// Expense Scrteen - Currency Icon
	@Override
	public WebElement getExpenseScreen_CurrencyIcon(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/icon")));
		return element;
	}

	// Expense Screen - Currency Text 
	@Override
	public WebElement getExpenseScreen_CurrencyTxt(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/currency_name")));
		return element;
	}
	
	
	// Expense Screen - Payment Method
	@Override
	public WebElement getExpenseScreen_PaymentMethod(WebDriver dr,String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='" + value + "']")));
		return element;
	}

	// Expense  Screen - Amount Input Field
	@Override
	public WebElement getExpenseScreen_AmtTxtFld(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/amount_text")));
		return element;
	}

	// Expense Screen - Keyboard Clear Button
	@Override
	public WebElement getExpenseScreen_KeyboardClearBtn(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/buttonKeyboardClear")));
		return element;
	}

	// Expense Screen - Note Input Field
	@Override
	public WebElement getExpenseScreen_NoteTxtFld(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/textViewNote")));
		return element;
	}

	// Expense Screen - Keyboard Button 
	@Override
	public WebElement getExpenseScreen_KeyboardBtn(WebDriver dr,String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='" + value + "']")));
		return element;
	}

	// Expense Screen  - Choose Category Button
	@Override
	public WebElement getExpenseScreen_ChooseCategoryBtn(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/keyboard_action_button")));
		return element;
	}
	
	// Expense Screen - Category Button
	@Override
	public WebElement getExpenseScreen_CategoryBtn(WebDriver dr, String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//android.widget.TextView[@resource-id='com.monefy.app.lite:id/textCategoryName' and @text='"
						+ value + "']")));
		return element;
	}

	// MoneyfyPro Screen - Title
	@Override
	public WebElement getMonefyProScreen_Title(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/monefyProTitle")));
		return element;
	}

	// MonefyPro Screen - Buy Button
	@Override
	public WebElement getMonefyProScreen_BuyBtn(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/buttonGetOnGooglePlay")));
		return element;
	}

	// MonefyPro Screen - Pro Features Txt
	@Override
	public WebElement getMonefyProScreen_ProFeaturesTxt(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/listTitle")));
		return element;
	}

	// MonefyPro Screen - Pro Feature List
	@Override
	public List<WebElement> getMonefyProScreen_ProFeatureList(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		elements = dr.findElements(By.id("com.monefy.app.lite:id/textViewTitle"));
		return elements;
	}

	// Date Picker - Select Date Text
	@Override
	public WebElement getDatePicker_SelectDateTxt(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/mtrl_picker_title_text")));
		return element;
	}

	// Date Picker - Date Text 
	@Override
	public WebElement getDatePicker_DateTxt(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/mtrl_picker_header_selection_text")));
		return element;
	}

	// Date Picker - Edit Icon
	@Override
	public WebElement getDataPicker_EditIcon(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/mtrl_picker_header_toggle")));
		return element;
	}

	// Date Picker - OK Button 
	@Override
	public WebElement getDataPicker_OkBtn(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/confirm_button")));
		return element;
	}

	// Date Picker - Cancel Button
	@Override
	public WebElement getDataPicker_CancelBtn(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/cancel_button")));
		return element;
	}

	// Date Picker - Calendar Icon
	@Override
	public WebElement getDataPicker_CalendarIcon(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/mtrl_picker_header_toggle")));
		return element;
	}

	// Date Picker - Date Input Field
	@Override
	public WebElement getDataPicker_DateTxtFld(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText")));
		return element;
	}
	
	
	// Income Screen - Title
	@Override
	public WebElement getIncomeScreen_AlertToastMsg(WebDriver dr, String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='" + value + "']")));
		return element;
	}

	// Income Screen - Navigation Up Button
	@Override
	public WebElement getIncomeScreen_NavigateUpBtn(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']")));
		return element;
	}

	// Income Screen - Title
	@Override
	public WebElement getIncomeScreen_Title(WebDriver dr, String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='" + value + "']")));
		return element;
	}

	// Expense Screen - Repeat Icon
	@Override
	public WebElement getIncomeScreen_RepeatBtn(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/schedule")));
		return element;
	}
	
	// Income Screen - Date Picker
	@Override
	public WebElement getIncomeScreen_DatePicker(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/textViewDate")));
		return element;
	}

	// Income Scrteen - Currency Icon
	@Override
	public WebElement getIncomeScreen_CurrencyIcon(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/icon")));
		return element;
	}

	// Income Screen - Currency Text 
	@Override
	public WebElement getIncomeScreen_CurrencyTxt(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/currency_name")));
		return element;
	}
	
	
	// Income Screen - Payment Method
	@Override
	public WebElement getIncomeScreen_PaymentMethod(WebDriver dr,String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='" + value + "']")));
		return element;
	}

	// Income  Screen - Amount Input Field
	@Override
	public WebElement getIncomeScreen_AmtTxtFld(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/amount_text")));
		return element;
	}

	// Income Screen - Keyboard Clear Button
	@Override
	public WebElement getIncomeScreen_KeyboardClearBtn(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/buttonKeyboardClear")));
		return element;
	}

	// Income Screen - Note Input Field
	@Override
	public WebElement getIncomeScreen_NoteTxtFld(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/textViewNote")));
		return element;
	}

	// Income Screen - Keyboard Button 
	@Override
	public WebElement getIncomeScreen_KeyboardBtn(WebDriver dr,String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='" + value + "']")));
		return element;
	}

	// Income Screen  - Choose Category Button
	@Override
	public WebElement getIncomeScreen_ChooseCategoryBtn(WebDriver dr) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.id("com.monefy.app.lite:id/keyboard_action_button")));
		return element;
	}
	
	// Income Screen - Category Button
	@Override
	public WebElement getIncomeScreen_CategoryBtn(WebDriver dr, String value) {
		wait = new WebDriverWait(dr, 25);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//android.widget.TextView[@resource-id='com.monefy.app.lite:id/textCategoryName' and @text='"
						+ value + "']")));
		return element;
	}



}
