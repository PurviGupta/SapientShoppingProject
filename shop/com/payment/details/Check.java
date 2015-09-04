package payment.details;

import java.util.HashMap;
import java.util.Map;

public class Check extends Payment implements Authorization {
	private String bankName;
	private String bankID;

	Map<String, String> authenticatePair = new HashMap<String, String>();

	public void setBankIdNamePair() {
		authenticatePair.put("ICI", "ICICI");
		authenticatePair.put("HDF", "HDFC");
		authenticatePair.put("SBI", "State Bank Of India");
		authenticatePair.put("CBI", "Central Bank Of India");
		authenticatePair.put("CIT", "Citi Bank");
		authenticatePair.put("YES", "Yes Bank");
	}

	public String getName() {
		return bankName;
	}

	public boolean setName(String name) {
		if (name.matches("[a-zA-Z]+")) {
			this.bankName = name;
			return true;
		} else {
			return false;
		}
	}

	public String getBankID() {
		return bankID;
	}

	public boolean setBankID(String bankID) {
		if (bankID.length() == 3 && bankID.matches("[A-Z]")) {
			this.bankID = bankID;
			return true;
		} else {
			return false;
		}
	}

	public boolean authorized() {

		boolean BankName, BankID;

		BankID = authenticatePair.containsKey(bankID);// sets true if such
														// Bank ID exist.
		BankName = authenticatePair.containsValue(bankName);// sets true if such
		// Bank
		// Name exist.

		if (BankID && BankName) {
			return true;
		}

		return false;

	}

}
