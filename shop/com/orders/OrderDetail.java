package orders;

import item.details.Item;
enum TaxStatus{taxable,nontaxable}

public class OrderDetail {

	int quantity;
	TaxStatus taxStatus;
	Order order;
	public Item item;
	
	public int getQuantity() {
		
		return quantity;
	}
	public boolean setQuantity(int quantity) {
		this.quantity = quantity;
		return true;
	}
	public TaxStatus getTaxStatus() {
		return taxStatus;
	}
	public boolean setTaxStatus(TaxStatus taxStatus) {
		this.taxStatus = taxStatus;
		return true;
	}
	public Order getOrder() {
		return order;
	}
	public boolean setOrder(Order order) {
		this.order = order;
		return true;
	}
	public Item getItem() {
		return item;
	}
	public boolean setItem(Item item) {
		this.item = item;
		return true;
	}
	public double calcSubTotal()
	{
		double	subTotal= (item.getPriceForQuantity()) * quantity;
		return subTotal;		
	}
	public double  calcWeight()
	{
		double subWeight = (Integer.parseInt(item.getShippingWeight())) * quantity;
	
		return subWeight;
	}
	
	
}
