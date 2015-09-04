package shopTest;
import orders.*;

import static org.junit.Assert.*;
import item.details.Item;
import orders.Order;
import orders.OrderDetail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import payment.details.Credit;
import payment.details.Payment;
import customer.NewCustomer;

public class orderTest {
	Order testOrder = new Order();
	Payment testPayment=null;
	NewCustomer testCustomer=null;
	OrderDetail testorderDetail=null;
	Item testItem=null;
	Status status;
	
	@Before
	public void setUp() throws Exception {
		testItem = new Item();
		testCustomer = new NewCustomer();
		testPayment = new Payment();
		testorderDetail = new OrderDetail();
	}
	@Test
	public final void testCustomer() {
		testOrder.setCustomer(testCustomer);
		NewCustomer actualCustomer=testOrder.getCustomer();
		assertEquals(testCustomer, actualCustomer);
	}

	@Test
	public final void testPayment() {
		testOrder.setPayment(testPayment);
		Payment actualPayment=testOrder.getPayment();
		assertEquals(testPayment, actualPayment);
	}

	@Test
	public final void testOrderDetail() {
		testOrder.setOrderDetail(testorderDetail);
		NewCustomer actualOrder=testOrder.getCustomer();
		assertEquals(testOrder, actualOrder);
	}

	@Test
	public final void testCalcTax() {
		Double expectedcalcTax=14.0;
		testItem.setPriceForQuantity(20);
		testorderDetail.setQuantity(5);
		testorderDetail.setTaxStatus(taxable);
		Double actualcalcTax= testOrder.calcTax();
		assertEquals(expectedcalcTax, actualcalcTax);	
	}

	@Test
	public final void testCalcTotal() {
		
		assertEquals(expectedcalcTax, actualcalcTax);	
	}

	@Test
	public final void testCalcTax() {
		Double expectedcalcTax=9.99;
		Double actualcalcTax= 
		assertEquals(expectedcalcTax, actualcalcTax);	
	}

	@Test
	public final void testCalcTax() {
		Double expectedcalcTax=9.99;
		Double actualcalcTax= 
		assertEquals(expectedcalcTax, actualcalcTax);	
	}


	@After
	public void tearDown() throws Exception {
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
