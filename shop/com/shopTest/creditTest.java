package shopTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import payment.details.Credit;

public class creditTest {

	@Before
	public void setUp() throws Exception {
		Credit credit = new Credit();
	}

	@After
	public void tearDown() throws Exception {
		credit=null;
	}

/*	@Test
	public final void testGetNumber() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public final void testSetNumber() {
		fail("Not yet implemented");
	}

	@Test
	public final void testGetType() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetType() {
		fail("Not yet implemented");
	}

	@Test
	public final void testGetExpDate() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetExpDate() {
		fail("Not yet implemented");
	}
*/

	@Test
	public final void testAuthorisedForWrongNoOfDigitsInNumber() throws ParseException {
	Credit.setNumber(123456789L);
	credit.setType("VISA");
    credit.setExpDate("2025-12-31");
	boolean expectedResult=false;
    boolean actualResult=credit.authorized();
	assertEquals(expectedResult, actualResult);

}
	@Test
	public final void testAuthorisedForExpiredCreditCard() throws ParseException {
	credit.setNumber(123456789123L);
	credit.setType("VISA");
    credit.setExpDate("2012-09-03");
	boolean expectedResult=false;
    boolean actualResult=credit.authorized();
	assertEquals(expectedResult, actualResult);

}
	@Test
	public final void testAuthorisedForNegativeNumber() throws ParseException {
	credit.setNumber(-123456789123L);
	credit.setType("VISA");
    credit.setExpDate("2025-12-31");
	boolean expectedResult=false;
    boolean actualResult=credit.authorized();
	assertEquals(expectedResult, actualResult);

}
	@Test
	public void testAuthorisedForCorrectCreditCardDetails() throws ParseException {
		credit.setNumber(123456789123L);
	    credit.setType("VISA");
	    credit.setExpDate("2025-12-31");
		boolean expectedResult=true;
        boolean actualResult=credit.authorized();
		assertEquals(expectedResult, actualResult);
	
	}

}
