
public class DecorStorage
{
   public String name;
   public double amount;
   
   public DecorStorage(String name,double amount)
   {
	   this.name = name;
	   this.amount = amount;
	  // System.out.println(name+" "+amount);
		BookingDetails.decoradd(this);
   }
}
