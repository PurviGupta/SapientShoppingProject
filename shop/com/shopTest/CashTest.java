package shopTest;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import payment.Cash;



public class CashTest {
	Cash cash =new Cash();
	@Before
	public void setUp() throws Exception {
		
	}

	
	@Test
	public final void testCashTendered() {
		int expected = 54;
		cash.setCashTendered(expected);
		int actual = cash.getCashTendered();
		assertEquals(expected, actual);
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
