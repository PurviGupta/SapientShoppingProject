package item.details;

import orders.OrderDetail;

public class Item {

	String shippingWeight;
	String description;
	OrderDetail orderDetail;
	public String getShippingWeight() {
		return shippingWeight;
	}
	public void setShippingWeight(String shippingWeight) {
		this.shippingWeight = shippingWeight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public OrderDetail getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
	public double getPriceForQuantity()
	{
		
	}
	public double getWeight()
	{
		
	}
}
