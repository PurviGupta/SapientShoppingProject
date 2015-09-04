package item.details;

import orders.OrderDetail;

public class Item {

	private double shippingWeight;
	private String description;
	private OrderDetail orderDetail;
	private double price;
	private double weight;
	public void setPrice(double price)
	{
		this.price=price;
		
	}
	public double getPrice(){
		
		return price;
	}
	public void setWeight(double weight)
	{
		this.weight=weight;
		
	}
	public double getWeight(){
		
		return weight;
	}
	public double getShippingWeight() {
		return shippingWeight;
	}
	public void setShippingWeight(Double shippingWeight) {
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
		return price;
	}
	
}
