package orders;

import items.Item;


public class OrderDetail {

	private int quantity;
	private String taxStatus;
	private Order order;
	private Item item;
	double	subTotal=0.0;
	
	public int getQuantity() {
		
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0)
		{
			
			return;
		}
		this.quantity = quantity;
	}
	public String getTaxStatus() {
		return taxStatus;
	}
	public void setTaxStatus(String taxStatus) {
		
			this.taxStatus=taxStatus;
		
		
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		if((order instanceof Order)&&order!=null)
		{
			this.order=order;
		}
		return;
		
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		if((item instanceof Item)&&item!=null)
		{
			this.item=item;
		}
		return;
	}
	public double calcSubTotal()
	{
		subTotal= (item.getPriceForQuantity()) * quantity;
		return subTotal;		
	}
	public double  calcWeight()
	{
		double subWeight = (item.getShippingWeight())* quantity;
	
		return subWeight;
	}
	
	
}
