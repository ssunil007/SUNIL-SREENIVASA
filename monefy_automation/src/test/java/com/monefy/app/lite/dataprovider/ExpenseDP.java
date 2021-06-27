package com.monefy.app.lite.dataprovider;

import org.testng.annotations.DataProvider;

import com.monefy.app.lite.common.CommonCV;
import com.monefy.app.lite.common.DriverSetup;

public class ExpenseDP extends CommonCV {
	
	public static String platFormName = DriverSetup.getPlatform();
	
	// Test Data to verify Home Screen Validations
	@DataProvider(name = "HomeScreenValidations")
	public static Object[][] HomeScreenValidations() {
		return new Object[][] { { "TC_01",month,
				"Open navigation|Monefy|All accounts|Search records|Transfer|Settings|$0.00|Balance $0.00|INCOME|EXPENSE",
				"Open navigation|Monefy|All accounts|Search records|Transfer|Settings|$0.00|Balance $0.00|INCOME|EXPENSE" } };
	}
	
	// Test Data to verify Expense Screen Validations
	@DataProvider(name = "ExpenseScreenValidations")
	public static Object[][] ExpenseScreenValidations() {
		return new Object[][] { { "TC_01", "Recurring records are now available in Monefy Pro!|New expense|Repeat|USD|Note|CHOOSE CATEGORY",
				"Recurring records are now available in Monefy Pro!|New expense|Repeat|USD|Note|CHOOSE CATEGORY" } };
	}
	
	
	// Test Data to verify Expense Screen - Repeat Button Functionality
	@DataProvider(name = "ExpenseScreen_RepeatButtonFunctionality")
	public static Object[][] ExpenseScreen_RepeatButtonFunctionality() {
		return new Object[][] { { "TC_01", "New expense|Repeat",
				"New expense|Monefy Pro|Buy|Pro Features|Recurring Records|Multi-Currency|Synchronization|Passcode Protection" } };
	}
	
	// Test Data to verify Expense Screen - Date Picker Functionality
	@DataProvider(name = "ExpenseScreen_DatePickerFunctionality")
	public static Object[][] ExpenseScreen_DatePickerFunctionality() {
		return new Object[][] { { "TC_01", "New expense|SELECT DATE", "New expense|SELECT DATE" } };
	}
	
	// Test Data to verify Expense Screen - Change Payment Method
	@DataProvider(name = "ExpenseScreen_ChangePaymentMethod")
	public static Object[][] ExpenseScreen_ChangePaymentMethod() {
		return new Object[][] { { "TC_01", "New expense|USD|Payment card|Cash", "New expense|USD|Payment card|Cash" },
				{ "TC_02", "New expense|USD|Payment card|Cash", "New expense|USD|Payment card|Cash" } };
	}
	
	// Test Data to verify Expense Screen - Amount Input Field Functionality
	@DataProvider(name = "ExpenseScreen_AmountInputFieldFunctionality")
	public static Object[][] ExpenseScreen_AmountInputFieldFunctionality() {
		return new Object[][] { { "TC_01", "New expense|100|×|10|=", "New expense|1000|0" },
			{ "TC_02", "New expense|800|+|200|=", "New expense|1000|0" },
			{ "TC_03", "New expense|1200|-|200|=", "New expense|1000|0" },
			{ "TC_04", "New expense|10000|÷|10|=", "New expense|1000|0" }};
	}
	
	// Test Data to verify Expense Screen - Undo Added Expense
	@DataProvider(name = "ExpenseScreen_UndoAddedExpense")
	public static Object[][] ExpenseScreen_UndoAddedExpense() {
		return new Object[][] { { "TC_01", "New expense|100|×|10|=|Test Note Input Functionality|Bills",
				"New expense|1000|Test Note Input Functionality|Bills: $1,000.00 added|$1,000.00|Balance -$1,000.00|$0.00|Balance $0.00" } };
	}
	
	
	// Test Data to verify Expense Screen - Adding I
	@DataProvider(name = "ExpenseScreen_AddingIncome")
	public static Object[][] ExpenseScreen_AddingIncome() {
		return new Object[][] { { "TC_01", "New income|SELECT DATE|100|×|10|=|Test Note Input Functionality|Bills",
				"New income|SELECT DATE|1000|Test Note Input Functionality|Bills: $1,000.00 added|$1,000.00|Balance $9,000.00" } };
	}
	

}
