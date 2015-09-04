package orders;

import java.util.*;

import payment.details.Payment;
import customer.NewCustomer;
enum Status{processing,dispatched,delivered}

public class Order {
   Date date;
  Status status;
   NewCustomer customer;
   Payment payment;
   List<OrderDetail> orderDetail=new ArrayList<OrderDetail>;
public Date getDate() {
	return date;
}
public void setDate() {
	 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   //get current date time with Date()
	   Date date = new Date();
	   System.out.println(dateFormat.format(date));
	  
}
public Status getStatus() {
	return status;
}
public void setStatus(Status status) {
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
	this.orderDetail.add(orderDetail);
}
   public double calcTax()
   {
	  Iterator<OrderDetail> it=new iterator();
	  OrderDetail orderRef=null;
	  double tax=0.14;
	  double totalTax=0.0;
	  while(it.hasNext())
	  {
		 orderRef=it.next();
		 if(orderRef.getTaxStatus().equals("taxable"))
		 {
			totalTax= (orderRef.calcSubTotal())*tax;
			 
		 }
       }
	  return totalTax;
   }
   public double calcTotal()
   {
	   Iterator<OrderDetail> it=new iterator();
		 
		 
		  double total=0.0;
		  while(it.hasNext())
		  {
			total+=it.next().calcSubTotal();
			
	       }
		  return total;
   }
   public double calcTotalWeight()
   {

	   Iterator<OrderDetail> it=new iterator();
		 
		 
		  double totalWeight=0.0;
		  while(it.hasNext())
		  {
			totalWeight+=it.next().calcWeight();
			
	       }
		  return totalWeight;
   }
}
