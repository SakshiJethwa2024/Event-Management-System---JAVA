
public class Ceiling 
{
	
		String type;
		long price;
		
		Ceiling(String type,long price)
		{
			this.type = type;
			this.price = price;
		}
		
		public String toString()
		{
			return "INCLUDES CEILING DECORATION IN "+type+" TYPE FOR RS."+price;
		}

}
