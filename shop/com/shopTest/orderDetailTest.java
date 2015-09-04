package shopTest;

import static org.junit.Assert.*;
import item.details.Item;
import orders.OrderDetail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class orderDetailTest {
OrderDetail testOrderDetail= new OrderDetail();

	@Before
	public void setUp() throws Exception {
	testOrderDetail.item=new Item();
	testOrderDetail.setQuantity(5);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testSetQuantity() {
			//assertTrue(testOrderDetail.setQuantity(5));
	}
	
	@Test
	public final void testGetQuantity() {
		//assertEquals(expected, actual);
	}

	

	@Test
	public final void testGetTaxStatus() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetTaxStatus() {
		fail("Not yet implemented");
	}

	@Test
	public final void testGetOrder() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetOrder() {
		fail("Not yet implemented");
	}

	@Test
	public final void testGetItem() {
		fail("Not yet implemented");
	}

	@Test
	public final void testSetItem() {
		fail("Not yet implemented");
	}

	@Test
	public final void testCalcSubTotal() {
		testOrderDetail.item.setPriceForQuantity(500.52);
		double priceForQuantity = testOrderDetail.item.getPriceForQuantity();
		double actual = priceForQuantity * testOrderDetail.getQuantity();
		double expected = 2502.60;
		assertEquals(expected, actual, 0.5);
	}

	@Test
	public final void testCalcWeight() {
		testOrderDetail.item.setShippingWeight(500.52);
		double shippingWeight = testOrderDetail.item.getShippingWeight();
		double actual = shippingWeight * testOrderDetail.getQuantity();
		double expected = 2502.60;
		assertEquals(expected, actual, 0.5);
	}

	/*@Test
	public final void testcalcTax(){
		
	}*/
}
