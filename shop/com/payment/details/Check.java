package payment.details;

public class Check extends Payment implements Authorization {
	private String name;
	private String bankID;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBankID() {
	return bankID;
}
public void setBankID(String bankID) {
	this.bankID = bankID;
}
public void authorized()
{
	   
}
	
	
}
