package shopTest;

import static org.junit.Assert.*;
import orders.Order;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import customer.NewCustomer;

public class NewCustomerTest {

	Order orderRef= null;
	NewCustomer testCustomer = null;
	@Before
	public void setUp() throws Exception {
		orderRef=new Order();
		testCustomer=new NewCustomer();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testName() {
		String actualName = "Pur";
		testCustomer.setName(actualName);
		String expectedName = testCustomer.getName();
		assertTrue(actualName.equalsIgnoreCase(expectedName));
	}

	@Test
	public final void testAddress() {
		String actualAddress = "UniTech InfoSpace";
		testCustomer.setAddress(actualAddress);
		String expectedAddress = testCustomer.getAddress();
		assertTrue(actualAddress.equalsIgnoreCase(expectedAddress));
	}

	@Test
	public final void testOrder() {
		Order actualOrderRef = orderRef;
		testCustomer.setOrder(orderRef);
		Order expectedOrderRef = testCustomer.getOrder();
		assertEquals(expectedOrderRef, actualOrderRef);
	}

}
