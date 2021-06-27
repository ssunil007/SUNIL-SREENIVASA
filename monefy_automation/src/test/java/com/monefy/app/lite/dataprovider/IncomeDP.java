package com.monefy.app.lite.dataprovider;

import org.testng.annotations.DataProvider;

import com.monefy.app.lite.common.CommonCV;
import com.monefy.app.lite.common.DriverSetup;

public class IncomeDP extends CommonCV {

	public static String platFormName = DriverSetup.getPlatform();
	
	// Test Data to verify Income Screen Validations
	@DataProvider(name = "IncomeScreenValidations")
	public static Object[][] IncomeScreenValidations() {
		return new Object[][] { { "TC_01",
				"Recurring records are now available in Monefy Pro!|New income|Repeat|USD|Note|CHOOSE CATEGORY",
				"Recurring records are now available in Monefy Pro!|New income|Repeat|USD|Note|CHOOSE CATEGORY" } };
	}

	// Test Data to verify Income Screen - Repeat Button Functionality
	@DataProvider(name = "IncomeScreen_RepeatButtonFunctionality")
	public static Object[][] IncomeScreen_RepeatButtonFunctionality() {
		return new Object[][] { { "TC_01", "New income|Repeat",
				"New income|Monefy Pro|Buy|Pro Features|Recurring Records|Multi-Currency|Synchronization|Passcode Protection" } };
	}

	// Test Data to verify Income Screen - Date Picker Functionality
	@DataProvider(name = "IncomeScreen_DatePickerFunctionality")
	public static Object[][] IncomeScreen_DatePickerFunctionality() {
		return new Object[][] { { "TC_01", "New income|SELECT DATE", "New income|SELECT DATE" } };
	}

	// Test Data to verify Income Screen - Change Payment Method
	@DataProvider(name = "IncomeScreen_ChangePaymentMethod")
	public static Object[][] IncomeScreen_ChangePaymentMethod() {
		return new Object[][] { { "TC_01", "New income|USD|Payment card|Cash", "New income|USD|Payment card|Cash" },
				{ "TC_02", "New income|USD|Payment card|Cash", "New income|USD|Payment card|Cash" } };
	}

	// Test Data to verify Income Screen - Amount InputField Functionality
	@DataProvider(name = "IncomeScreen_AmountInputFieldFunctionality")
	public static Object[][] IncomeScreen_AmountInputFieldFunctionality() {
		return new Object[][] { { "TC_01", "New income|100|×|10|=", "New income|1000|0" },
				{ "TC_02", "New income|800|+|200|=", "New income|1000|0" },
				{ "TC_03", "New income|1200|-|200|=", "New income|1000|0" },
				{ "TC_04", "New income|10000|÷|10|=", "New income|1000|0" } };
	}

	// Test Data to verify Income Screen - Undo Added Income
	@DataProvider(name = "IncomeScreen_UndoAddedIncome")
	public static Object[][] IncomeScreen_UndoAddedIncome() {
		return new Object[][] { { "TC_01", "New income|1000|×|10|=|Test Note Input Functionality|Salary",
				"New income|10000|Test Note Input Functionality|Salary: $10,000.00 added|$20,000.00|Balance $10,000.00|$0.00|Balance $0.00" } };
	}
	
	
	// Test Data to verify Income Screen - Adding Income
	@DataProvider(name = "IncomeScreen_AddingIncome")
	public static Object[][] IncomeScreen_AddingIncome() {
		return new Object[][] { { "TC_01", "New income|SELECT DATE|1000|×|10|=|Test Note Input Functionality|Salary",
				"New income|SELECT DATE|10000|Test Note Input Functionality|Salary: $10,000.00 added|$10,000.00|Balance $10,000.00" } };
	}

}
