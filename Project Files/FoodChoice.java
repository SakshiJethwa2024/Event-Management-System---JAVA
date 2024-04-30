package food;

import mainfront.BookingDetails;

public class FoodChoice {
public 	double amount;
public	FoodChoice(double amount){
		this.amount=amount;
		BookingDetails.foodadd(this);
	}
	
}
