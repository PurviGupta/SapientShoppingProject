package payment.details;

import orders.Order;

public class Payment {

	private int amount;
	Order order;

	public int getAmount() {
		return amount;
	}

	public boolean setAmount(double amount) {
		if (amount < 0) {
			return false;
		} else {
			this.amount = (int) Math.round(amount);
			return true;
		}
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
