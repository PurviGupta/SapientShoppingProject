package orders;

import item.details.Item;

public class OrderDetail {

	int quantity;
	String taxStatus;
	Order order;
	Item item;
	
	public int getQuantity() {
		
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTaxStatus() {
		return taxStatus;
	}
	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public void calcSubTotal()
	{
		return	subTotal= (item.getPriceforQuantity()) * quantity;
				
	}
	public void calcWeight()
	{
		subWeight = (item.getWeight()) * quantity;
	
		return subWeight;
	}
	
	
}
