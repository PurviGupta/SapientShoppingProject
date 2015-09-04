package orders;

import java.util.Date;

import payment.details.Payment;
import customer.NewCustomer;

public class Order {
   Date date;
   String status;
   NewCustomer customer;
   Payment payment;
   OrderDetail orderDetail;
public Date getDate() {
	return date;
}
public void setDate() {
	 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   //get current date time with Date()
	   Date date = new Date();
	   System.out.println(dateFormat.format(date));
	  
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public NewCustomer getCustomer() {
	return customer;
}
public void setCustomer(NewCustomer customer) {
	this.customer = customer;
}
public Payment getPayment() {
	return payment;
}
public void setPayment(Payment payment) {
	this.payment = payment;
}
public OrderDetail getOrderDetail() {
	return orderDetail;
}
public void setOrderDetail(OrderDetail orderDetail) {
	this.orderDetail = orderDetail;
}
   public void calcTax()
   {
	   
   }
   public void calcTotal()
   {
	   
   }
   public void calcTotalWeight()
   {
	   
   }
}
