package shopTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import payment.Credit;

public class CreditTest {

	Credit credit=new Credit();
	int creditCardNumber;
	Date expDate=new Date(2016-12-12);
	String cardType;
	@Before
	public void setUp() throws Exception {
		credit.setNumber(12345432);
		credit.setType("Visa");
		credit.setexpiryDate(expDate);
		
	}

	@Test
	public final void testGetNumber() {
		int expectedResult=12345432;
		creditCardNumber=credit.getNumber();
		assertEquals(expectedResult, creditCardNumber);
	}

	

	@Test
	public final void testGetType() {
	String expectedResult="Visa";
	cardType=credit.getType();
	assertEquals(expectedResult, cardType);
	}

	

	@Test
	public final void testGetexpiryDate() {
	Date expiryDate1=credit.getexpiryDate();
    assertEquals(expiryDate1, expDate);
	}


	@Test
	public final void testAuthorization() {
		boolean Result=credit.authorization();
		assertTrue(Result);
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
}
