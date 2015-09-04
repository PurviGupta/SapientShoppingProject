package customer;

import item.details.Item;
import orders.Order;
import orders.OrderDetail;
import payment.details.Payment;

public class NewCustomer {

	
	private String name;
	private String address;
	private Order order;
	private Payment payment;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Order getOrder() {
		return this.order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

	/*public void addItemToCart(Item item, Integer quantity) {
		//this adds Item to cart
		OrderDetail newOrderDetail = new OrderDetail();
		order.getOrderDetail().add(newOrderDetail);
	}*/
}
