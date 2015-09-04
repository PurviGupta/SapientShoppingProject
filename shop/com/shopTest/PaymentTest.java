/**
 * 
 */
package shopTest;

import static org.junit.Assert.*;
import orders.Order;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import payment.Payment;

public class PaymentTest {
	Payment payment = new Payment();

	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public final void testAmount() {
		double expected = 20.0;
		payment.setAmount(expected);
		double actual = payment.getAmount();
		assertEquals(expected, actual, 0.2);
	}


	@Test
	public final void testOrder() {
		Order expected = new Order();
		payment.setOrder(expected);
		Order actual = payment.getOrder();
		assertSame(expected, actual);
	}

	@After
	public void tearDown() throws Exception {
	}
}
