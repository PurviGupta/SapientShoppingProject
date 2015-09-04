package shopTest;

import static org.junit.Assert.*;
import item.details.Item;
import orders.Order;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import payment.details.Credit;
import customer.NewCustomer;

public class orderTest {
	Order testorder = new Order();
	Item testItem;
	NewCustomer testCustomer;
	Credit customerCredit;
	
	@Before
	public void setUp() throws Exception {
		testItem = new Item();
		customerCredit = new Credit();
		testCustomer = new NewCustomer();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetDate() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetDate() {
		fail("Not yet implemented");
	}

	@Test
	public final void testGetStatus() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetStatus() {
		fail("Not yet implemented");
	}

	@Test
	public final void testGetCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public final void testGetPayment() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetPayment() {
		fail("Not yet implemented");
	}

	@Test
	public final void testGetOrderDetail() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetOrderDetail() {
		fail("Not yet implemented");
	}

	@Test
	public final void testCalcTax() {
		Double expectedcalcTax=9.99;
		Double actualcalcTax= 
		assertEquals(expectedcalcTax, actualcalcTax);	
	}

	/*@Test
	public final void testCalcTotal() {
		testCustomer.addItemToCart(testItem, 3);
		Double expectedTotal = 89.97;
		assertEquals(expectedTotal, testCustomer.getOrder().calcTotalPayment());
	}

	@Test
	public final void testCalcTotalWeight() {
		testCustomer.addItemToCart(testItem, 3);
		Double expectedTotal = 4.5;
		assertEquals(expectedTotal, testCustomer.getOrder().calcTotalWeight());
	
	}*/

}
