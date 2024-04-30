

public class VenueChoice {
	public String name,timeduration;
	double price;
	VenueChoice(String name,String timeduration,double pricefullday){
		this.name=name;
		this.timeduration=timeduration;
		this.price=pricefullday;
		BookingDetails.venueadd(this);
		//System.out.print(""+name+","+timeduration+","+price);
	}
}

