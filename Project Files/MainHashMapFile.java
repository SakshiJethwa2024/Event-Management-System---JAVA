import java.util.HashMap;
import java.util.Set;

public class MainHashMapFile 
{
	
	public static double totalPrice;
	public static HashMap<String,Double> list = new HashMap<>();
	
	public static double getTotalPrice()
	{
		totalPrice = 0;
		for(String price : list.keySet())
		{
			totalPrice+=list.get(price);
		}
		return totalPrice;
	}
	
	 public static String getList() {
	        Set<String> keys = MainHashMapFile.list.keySet();
	        StringBuilder newStr = new StringBuilder();
	        for (String key : keys){
	            newStr.append(key).append(" : ").append(MainHashMapFile.list.get(key).toString()).append("/-").append("\n");
	        }
	        return "YOUR SELECTED FOOD ITEMS ARE : \n" + newStr;
	    }
}
