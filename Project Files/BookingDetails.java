package mainfront;

import food.FoodChoice;
import music1.BookMusic;
import photographyp.PhotographyAmount;
import venue.VenueChoice;

public class BookingDetails {
	static VenueChoice v;
	static BookMusic bm;
	static PhotographyAmount pa;
	static FoodChoice fc;
	public static void venueadd(VenueChoice v1) {
		v=v1;
	}
	public static void musicadd(BookMusic b) {
		bm=b;	
	}
	public static void photographyadd(PhotographyAmount p) {
		pa=p;
	}
	public static void foodadd(FoodChoice f) {
		fc=f;
	}
}
