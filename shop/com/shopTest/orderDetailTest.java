package shopTest;
import items.*;
import static org.junit.Assert.*;
import orders.Order;
import orders.OrderDetail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import customer.NewCustomer;

public class OrderDetailTest {
OrderDetail testOrderDetail= new OrderDetail();
Order testOrder = null;
Item testItem = null;

	@Before
	public void setUp() throws Exception {
	 testOrder = new Order();
	 testItem=new Item();
	
	
	}

	
	@Test
	public final void testQuantity() {
		int expectedQuantity = 5;
		 
		testOrderDetail.setQuantity(expectedQuantity);
		int actualQuantity=testOrderDetail.getQuantity();
	    assertEquals(expectedQuantity, actualQuantity);		
	}
	
	
	@Test
	public final void testTaxStatus() {
		String expectedTaxStatus = "taxable";
		testOrderDetail.setTaxStatus(expectedTaxStatus);;
		String actualTaxStatus=testOrderDetail.getTaxStatus();
	    assertTrue(actualTaxStatus.equalsIgnoreCase(expectedTaxStatus))	;
	}

	@Test
	public final void testOrder() {
		testOrderDetail.setOrder(testOrder);
		Order actualOrder=testOrderDetail.getOrder();
	    assertEquals(testOrder, actualOrder);	
	}

	@Test
	public final void testItem() {
		
		testOrderDetail.setItem(testItem);
		Item actualItem=testOrderDetail.getItem();
	    assertEquals(testItem, actualItem);	
	}

	@Test
	public final void testCalcSubTotal() {
		testItem.setPriceForQuantity(200);
		testOrderDetail.setQuantity(5);
		testOrderDetail.setItem(testItem);
		double actual = testOrderDetail.calcSubTotal();
		double expected = 1000;
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public final void testCalcWeight() {
		testItem.setShippingWeight(500.00);
		testOrderDetail.setQuantity(5);
		testOrderDetail.setItem(testItem);
		double expectedWeight=2500.0;
		double actualWeight = testOrderDetail.calcWeight();
	    assertEquals(expectedWeight, actualWeight, 0.1);
	}

	@After
	public void tearDown() throws Exception {
		testOrder=null;
		testItem=null;
	}

}
