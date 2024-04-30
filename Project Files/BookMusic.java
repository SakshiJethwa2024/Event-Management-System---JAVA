public class BookMusic {
	public	String name;
	public double price;
public	BookMusic(String name,double price){
		this.name=name;
		this.price=price;
		//System.out.println(name+" "+price);
		BookingDetails.musicadd(this);
		
	}
}

