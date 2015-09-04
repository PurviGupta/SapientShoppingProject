package shopTest;

import static org.junit.Assert.*;
import items.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import orders.OrderDetail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {

	Item testItem = new Item();
	OrderDetail testOrderDetail = null;

	@Before
	public void setUp() throws Exception {
		testOrderDetail = new OrderDetail();

	}

	@Test
	public final void testShippingWeight() {
		double expectedShippingWeight = 100.0;
		testItem.setShippingWeight(expectedShippingWeight);
		double actualShippingWeight = testItem.getShippingWeight();
		assertEquals(expectedShippingWeight, actualShippingWeight, 0.1);
	}

	@Test
	public final void testDescription() {
		String expectedDescription = "mobile";
		testItem.setDescription(expectedDescription);
		String actualDescription = testItem.getDescription();
		assertTrue(actualDescription.equalsIgnoreCase(expectedDescription));

	}

	@Test
	public final void testOrderDetail() {
		testItem.setOrderDetail(testOrderDetail);
		OrderDetail actualOrderRef = testItem.getOrderDetail();
		assertEquals(testOrderDetail, actualOrderRef);

	}

	@Test
	public final void testPriceForQuantity() {
		double expectedPrice = 100.0;
		testItem.setPriceForQuantity(expectedPrice);
		double actualPrice = testItem.getPriceForQuantity();
		assertEquals(expectedPrice, actualPrice, 0.1);

	}

	@Test
	public final void testWeight() {
		double expectedWeight = 100.0;
		testItem.setWeight(expectedWeight);
		double actualWeight = testItem.getWeight();
		assertEquals(expectedWeight, actualWeight, 0.1);

	}

	@After
	public void tearDown() throws Exception {

	}

}
