package payment.details;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Credit extends Payment implements Authorization {

	private String cardNumber;
	private String cardType;
	private Date cardExpDate;
	Map<String, String> creditCardType = new HashMap<String, String>();

	public void authenticateCreditCard() {
		creditCardType.put("4000", "VISA");
		creditCardType.put("5018", "Maestro");
		creditCardType.put("6304", "Laser");
		creditCardType.put("3528 ", "JCB");
		creditCardType.put("6011", "Discover");
		creditCardType.put("3400", "American Express");
		creditCardType.put("3011", "Diners Club");
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public boolean setCardNumber(String number) {
		if (number.length() == 16 && number.matches("[0-9]+")) {
			this.cardNumber = number;
			return true;
		} else {
			return false;
		}
	}

	public String getType() {
		return cardType;
	}

	public boolean setType(String type) {
		if (type.matches("[a-zA-Z]+")) {
			this.cardType = type;
			return true;
		} else {
			return false;
		}
	}

	public Date getExpDate() {
		return cardExpDate;
	}

	public void setExpDate(Date expDate) {
		this.cardExpDate = expDate;
	}

	public boolean authorized() {

		String cardNumber = this.cardNumber;
		int length = cardNumber.length();

		/**
		 * This is to check credit card should contain exactly 16 digits. I
		 * assumed this norm from my side It can be replaced with real norms if
		 * required.
		 * 
		 */
		if (length != 16) {
			return false;
		}

		/**
		 * This is to check credit card number should not start with zero.
		 */

		String startCharacter = "0";

		if (cardNumber.startsWith(startCharacter)) {
			return false;
		}

		/**
		 * This is to check credit card expire date is later than current date.
		 */
		Calendar calender = Calendar.getInstance();// New instance of calendar
													// class.
		int year = calender.get(Calendar.YEAR);// Fetches current year.
		int month = calender.get(Calendar.MONTH);// Fetches current month.
		int date = calender.get(Calendar.DATE);// Fetches current date.

		Date currentDate = new Date(year, month, date);// New date object with
														// current date.

		if (currentDate.after(this.cardExpDate)) {
			return false;
		}

		String FirstFourDigits = cardNumber.substring(0, 3);
		/*
		 * boolean BankName, BankID;
		 * 
		 * BankID = authenticatePair.containsKey(bankID);// sets true if such //
		 * Bank ID exist. BankName = authenticatePair.containsValue(bankName);//
		 * sets true if such
		 */
		if (!creditCardType.containsKey(FirstFourDigits)
				&& !creditCardType.containsValue(creditCardType
						.get(FirstFourDigits))) {
			return false;
		}

		return true;// returns true as not condition has turned false.
	}
}
