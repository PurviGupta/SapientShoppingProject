package payment;

import orders.Order;

public class Payment {
	private double amount;
	private Order order;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amounts) {
		this.amount = amounts;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
