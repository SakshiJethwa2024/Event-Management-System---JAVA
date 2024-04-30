package photographyp;

import mainfront.BookingDetails;

public class PhotographyAmount {
	public long amount;
	PhotographyAmount(long amount){
		this.amount=amount;
		System.out.print("PhotographyAmount "+amount);
		BookingDetails.photographyadd(this);
	}
}
