package items;


import orders.OrderDetail;

public class Item {

	private double shippingWeight;
	private String description;
	private OrderDetail orderDetail;
	private double price;
	private double weight;
	
	
	public void setPriceForQuantity(double price) {
		if(price<0)
		{
			return;
		}
		this.price = price;
	}
	public void setWeight(double weight) {
		if(weight<0)
		{
			return;
		}
		this.weight = weight;
	}
	public double getWeight()
	{
		return weight;
	}
	public double getShippingWeight() {
		return shippingWeight;
	}
	public void setShippingWeight(double shippingWeight) {
		if(shippingWeight<0)
		{
			
			return;
		}
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
		if((orderDetail instanceof OrderDetail)&&orderDetail!=null)
		{
			this.orderDetail=orderDetail;
		}
		return;
		
	
	}
	public double getPriceForQuantity()
	{
		return price;
	}
	
}
