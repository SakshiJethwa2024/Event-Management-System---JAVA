
public class Seating
{
	
		long num;
		
		Seating(long num)
		{
			this.num = num;
		}
		
		public String toString()
		{
			return "INCLUDES SEATING ARRAGEMENT FOR "+num+" GUESTS FOR RS."+(num*60);
		}

}
