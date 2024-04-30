public class FoodChoice {
public 	double amount;
public String foodbill;
public	FoodChoice(String foodbill,double amount){
	this.foodbill = foodbill;
		this.amount=amount;
		BookingDetails.foodadd(this);
	}
	
}