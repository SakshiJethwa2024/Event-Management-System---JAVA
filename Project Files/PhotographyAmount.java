public class PhotographyAmount {
	public double amount;
	PhotographyAmount(double amount){
		this.amount=amount;
		//System.out.print("PhotographyAmount "+amount);
		BookingDetails.photographyadd(this);
	}
}

