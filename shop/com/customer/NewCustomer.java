package customer;

import orders.Order;

public class NewCustomer {

	
	private String name;
	private String address;
	private Order order=null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		if((order instanceof Order)&&order!=null){
		this.order = order;
		}
		
		return;
	
	}
}
