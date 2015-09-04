package payment;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Credit extends Payment implements Authorization {

	private int creditCardNumber;

	Map<String, String> Card = new HashMap<String, String>();

	public void CreditCardType() {
		Card.put("Visa", "1234");
		Card.put("Maestro", "2345");
		Card.put("Master", "3456");
	}

	private String cardType;
	private Date expDate;

	public int getNumber() {
		return creditCardNumber;
	}

	public void setNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public Date getexpiryDate() {
		return expDate;
	}

	public void setexpiryDate(Date expiryDate) {
		this.expDate = expiryDate;
	}

	public String getType() {
		return cardType;
	}

	public void setType(String type) {
		this.cardType = type;
	}

	public boolean authorizeCardType(String cardType, int creditCardNumber) {
		String cardNumber = Integer.toString(creditCardNumber);

		if (cardNumber.substring(0, 3).equals(Card.get(cardType))) {
			return true;
		}
		return false;
	}

	@Override
	public boolean authorization() {

		String cardNumber = Integer.toString(creditCardNumber);

		if (cardNumber.length() != 8) {
			return false;
		}

		Calendar calender = Calendar.getInstance();
		int year = calender.get(Calendar.YEAR);
		int month = calender.get(Calendar.MONTH);
		int date = calender.get(Calendar.DATE);
		@SuppressWarnings("deprecation")
		
		Date currentDate = new Date(year, month, date);

		if (expDate.after(currentDate)) {
			return false;
		}

		return true;

	}

	@Override
	public void authorized() {
	

	}

}