/**
 * @author sunil_s
 * @created on 06/26/2021
 * @description Class containing declarations of Locator Elements
 */
package com.monefy.app.lite.objectrepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BaseObjRepo {

	// Locators of Home Scren
	public abstract WebElement getHomeScreen_OpenNavigationBtn(WebDriver dr, String value);

	public abstract WebElement getHomeScreen_HomeScreenTitle(WebDriver dr, String value);

	public abstract WebElement getHomeScreen_AllAccountsTxt(WebDriver dr, String value);

	public abstract WebElement getHomeScreen_SearchBtn(WebDriver dr, String value);

	public abstract WebElement getHomeScreen_TransferBtn(WebDriver dr, String value);

	public abstract WebElement getHomeScreen_SettingsBtn(WebDriver dr, String value);

	public abstract WebElement getHomeScreen_MonthTxt(WebDriver dr, String value);

	public abstract WebElement getHomeScreen_IncomeAmtTxt(WebDriver dr);

	public abstract WebElement getHomeScreen_ExpenseAmtTxt(WebDriver dr);

	public abstract WebElement getHomeScreen_BalanceAmtTxt(WebDriver dr);

	public abstract WebElement getHomeScreen_ExpenseBtn(WebDriver dr);

	public abstract WebElement getHomeScreen_IncomeBtn(WebDriver dr);
	
	public abstract WebElement getHomeScreen_BillsToastMsg(WebDriver dr);
	
	public abstract WebElement getHomeScreen_CancelButton(WebDriver dr);
	
	
	// Locator of Expense Module
	public abstract WebElement getExpenseScreen_AlertToastMsg(WebDriver dr,String value);
	
	public abstract WebElement getExpenseScreen_NavigateUpBtn(WebDriver dr);
	
	public abstract WebElement getExpenseScreen_Title(WebDriver dr,String value);
	
	public abstract WebElement getExpenseScreen_RepeatBtn(WebDriver dr);
	
	public abstract WebElement getExpenseScreen_DatePicker(WebDriver dr);
	
	public abstract WebElement getExpenseScreen_CurrencyIcon(WebDriver dr);
	
	public abstract WebElement getExpenseScreen_CurrencyTxt(WebDriver dr);
	
	public abstract WebElement getExpenseScreen_PaymentMethod(WebDriver dr,String value);
	
	public abstract WebElement getExpenseScreen_AmtTxtFld(WebDriver dr);
	
	public abstract WebElement getExpenseScreen_KeyboardClearBtn(WebDriver dr);
	
	public abstract WebElement getExpenseScreen_NoteTxtFld(WebDriver dr);
	
	public abstract WebElement getExpenseScreen_KeyboardBtn(WebDriver dr,String value);
	
	public abstract WebElement getExpenseScreen_ChooseCategoryBtn(WebDriver dr);
	
	public abstract WebElement getExpenseScreen_CategoryBtn(WebDriver dr, String value);
	
	
	// Locators of Moenfy Pro Screen
	public abstract WebElement getMonefyProScreen_Title(WebDriver dr);
	
	public abstract WebElement getMonefyProScreen_BuyBtn(WebDriver dr);
	
	public abstract WebElement getMonefyProScreen_ProFeaturesTxt(WebDriver dr);
	
	public abstract  List<WebElement> getMonefyProScreen_ProFeatureList(WebDriver dr);
	
	
	// Locators of Date Picker
	public abstract WebElement getDatePicker_SelectDateTxt(WebDriver dr);
	
	public abstract WebElement getDatePicker_DateTxt(WebDriver dr);
	
	public abstract WebElement getDataPicker_EditIcon(WebDriver dr);
	
	public abstract WebElement getDataPicker_OkBtn(WebDriver dr);
	
	public abstract WebElement getDataPicker_CancelBtn(WebDriver dr);
	
	public abstract WebElement getDataPicker_CalendarIcon(WebDriver dr);
	
	public abstract WebElement getDataPicker_DateTxtFld(WebDriver dr);
	
	
	// Locator of Income Module
	public abstract WebElement getIncomeScreen_AlertToastMsg(WebDriver dr, String value);

	public abstract WebElement getIncomeScreen_NavigateUpBtn(WebDriver dr);

	public abstract WebElement getIncomeScreen_Title(WebDriver dr, String value);

	public abstract WebElement getIncomeScreen_RepeatBtn(WebDriver dr);

	public abstract WebElement getIncomeScreen_DatePicker(WebDriver dr);

	public abstract WebElement getIncomeScreen_CurrencyIcon(WebDriver dr);

	public abstract WebElement getIncomeScreen_CurrencyTxt(WebDriver dr);

	public abstract WebElement getIncomeScreen_PaymentMethod(WebDriver dr, String value);

	public abstract WebElement getIncomeScreen_AmtTxtFld(WebDriver dr);

	public abstract WebElement getIncomeScreen_KeyboardClearBtn(WebDriver dr);

	public abstract WebElement getIncomeScreen_NoteTxtFld(WebDriver dr);

	public abstract WebElement getIncomeScreen_KeyboardBtn(WebDriver dr, String value);

	public abstract WebElement getIncomeScreen_ChooseCategoryBtn(WebDriver dr);

	public abstract WebElement getIncomeScreen_CategoryBtn(WebDriver dr, String value);
	
	

}
