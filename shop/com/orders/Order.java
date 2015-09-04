package orders;



import java.util.*;

import payment.Payment;
import customer.NewCustomer;
enum Status{processing,dispatched,delivered}

public class Order {
   Date date;
   double totalTax=0.0;
   String status;
   NewCustomer customer=null;
   Payment payment=null;
   List<OrderDetail> orderDetail=new ArrayList<OrderDetail>();
   public Date getDate() {
	return date;
     }
   public void setDate( Date date) {
	if((date instanceof Date)&& date!=null)
	{
		this.date=date;
	}
	
		return;
   }
public String getStatus() {
	return status;
}
public void setStatus(String status) {
			this.status=status;
	
}
public NewCustomer getCustomer() {
	return customer;
}
public void setCustomer(NewCustomer customer) {
	if((customer instanceof NewCustomer)&& customer!=null)
	{
		this.customer=customer;
	}
	return;
}
public Payment getPayment() {
	return payment;
}
public void setPayment(Payment payment) {
	if((payment instanceof Payment)&& payment!=null)
	{
		this.payment=payment;
	}
	
	return;

	
	
}
public List<OrderDetail> getOrderDetail() {
	return orderDetail;
}
public void setOrderDetail(List<OrderDetail> orderDetail) {
	
	
		this.orderDetail=orderDetail;
	
	
}
   public double calcTax()
   {
	  Iterator<OrderDetail> it=orderDetail. iterator();
	  OrderDetail orderRef=null;
	  double tax=0.14;
	
	  while(it.hasNext())
	  {
		 orderRef=it.next();
		 if(orderRef.getTaxStatus().equalsIgnoreCase("taxable"))
		 {
			totalTax= (orderRef.calcSubTotal())*tax;
			 
		 }
       }
	  return totalTax;
   }
   public double calcTotal()
   {
	   Iterator<OrderDetail> it=orderDetail.iterator();
		 
		 
		  double total=0.0;
		  while(it.hasNext())
		  {
			total+=it.next().calcSubTotal();
			
	       }
		  return total;
   }
   public double calcTotalWeight()
   {

	   Iterator<OrderDetail> it=orderDetail.iterator();
		 
		 
		  double totalWeight=0.0;
		  while(it.hasNext())
		  {
			totalWeight+=it.next().calcWeight();
			
	       }
		  return totalWeight;
   }
}
