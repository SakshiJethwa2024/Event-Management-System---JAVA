
public class Light
{
	String type;
	long price;
	
	Light(String type,long price)
	{
		this.type = type;
		this.price = price;
	}
	
	public String toString()
	{
		return "INCLUDES LIGHTING DECORATION IN "+type+" TYPE FOR RS."+price;
	}
}
