public class SilverPlate {
	String sabji1,sabji2,rice,farsan,sweet;
	double cost=220;
	SilverPlate(String s1,String s2,String r,String f,String s){
		sabji1=s1;
		sabji2=s2;
		rice=r;
		farsan=f;
		sweet=s;
	}
	public String toString() {
		return "You have selected Silver Plate..cost Rs "+cost+"\nYOUR SELECTED PLATE : \nSABJI : "+sabji1+","+sabji2+"\nFARSAN : "+farsan+"\nSWEET : "+sweet+
		"\nRICE : "+rice+"\nroti,papad";
	}
}