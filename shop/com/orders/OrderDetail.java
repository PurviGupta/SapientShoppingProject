package orders;

import item.details.Item;
enum TaxStatus{taxable,non-taxable}

public class OrderDetail {

	int quantity;
	TaxStatus taxStatus;
	Order order;
	Item item;
	
	public int getQuantity() {
		
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public TaxStatus getTaxStatus() {
		return taxStatus;
	}
	public void setTaxStatus(TaxStatus taxStatus) {
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
	public double calcSubTotal()
	{
		double	subTotal= (item.getPriceforQuantity()) * quantity;
		return subTotal;		
	}
	public double  calcWeight()
	{
		double subWeight = (item.getShippingWeight()) * quantity;
	
		return subWeight;
	}
	
	
}
