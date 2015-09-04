package shopTest;


import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import payment.Check;



public class CheckTest {
	public Map<String, String> bankDetails = new HashMap<String, String>();

	Check check = new Check();

	@Before
	public void setUp() throws Exception {

		bankDetails.put("SBI Bank", "SBIN0000686");
		bankDetails.put("ICICI Bank", "ICICI0003709");

	}

	@After
	public void tearDown() throws Exception {
		bankDetails = null;
	}

	@Test
	public void Nametest() {
		String expected = "SBI Bank";
		String actual = null;
		check = new Check();
		check.setName("SBI Bank");
		actual = check.getName();
		assertEquals(expected, actual);
	}

	@Test
	public void BankIdtest() {
		String expected = "SBIN0000686";
		check = new Check();
		String actual = null;
		check.setBankID("SBIN0000686");
		actual = check.getBankID();
		assertEquals(expected, actual);
	}

	@Test
	public void authorizedTest() {
		check.setBankID("SBIN0000686");
		check.setName("SBI Bank");
		boolean actual = false;
		Iterator<Map.Entry<String, String>> iterator = bankDetails.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			String key = entry.getKey();
			String checkName = check.getName();
			String entryValue = entry.getValue();
			String checkBankID = check.getBankID();
			if (key == checkName && entryValue == checkBankID) {
				actual = check.authorization();
			}

		}

		assertTrue(actual);

	}
}
