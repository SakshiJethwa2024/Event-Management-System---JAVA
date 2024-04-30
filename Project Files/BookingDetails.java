

public class BookingDetails {
	static VenueChoice v;
	static BookMusic bm;
	static PhotographyAmount pa;
	static FoodChoice fc;
	static DecorStorage dcs;
	
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
	public static void decoradd(DecorStorage ds)
	{
		dcs=ds;
	}
}

