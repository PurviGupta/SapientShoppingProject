package payment.details;

public class Cash extends Payment {

	private int cashTendered;

	public int getCashTendered() {
		return cashTendered;
	}

	public boolean setCashTendered(double cashTendered) {
		
		if(cashTendered < 0){
			return false;
		} else {
			this.cashTendered = (int) Math.round(cashTendered);
			return true;
		}
		
	}

	
}
