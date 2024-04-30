package music1;

import mainfront.BookingDetails;

public class BookMusic {
	public	String name;
	public String price;
public	BookMusic(String name,String price){
		this.name=name;
		this.price=price;
		System.out.println(name+" "+price);
		BookingDetails.musicadd(this);
		
	}
}
