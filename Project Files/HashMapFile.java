package food;

import java.util.HashMap;
import java.util.Set;

public class HashMapFile {
    public static int numberOfGuest;
    public static double totalPrice;
    public static HashMap<String,Double> item = new HashMap<>();
    public static double getTotalPrice(){
        totalPrice = 0;
        for(String price : item.keySet()){
            totalPrice+=item.get(price);
        }
        return totalPrice*numberOfGuest;
    }

    public static String getFoodList() {
        Set<String> keys = HashMapFile.item.keySet();
        StringBuilder newStr = new StringBuilder();
        for (String key : keys){
            newStr.append(key).append(" : ").append(HashMapFile.item.get(key).toString()).append("/-").append("\n");
        }
        return "YOUR SELECTED FOOD ITEMS ARE : \n" + newStr;
    }
}

