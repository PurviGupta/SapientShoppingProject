package payment.details;

import java.util.Date;

public class Credit extends Payment implements Authorization {
  private long number;
  private String type;
  private Date expDate;
  
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Date getExpDate() {
	return expDate;
}
public void setExpDate(Date expDate) {
	this.expDate = expDate;
}
   public void authorized()
   {
	   
   }
}
