package food;

public class PlatinumPlate {
	String sabji1,sabji2,rice,farsan,sweet,sweet2;
	double cost=280;
	PlatinumPlate(String s1,String s2,String r,String f,String s,String sw){
		sabji1=s1;
		sabji2=s2;
		rice=r;
		farsan=f;
		sweet=s;
		sweet2=sw;
	}
	public String toString() {
		return "You have selected Platinum Plate..cost Rs "+cost+"\nYOUR SELECTED PLATE : \nSABJI : "+sabji1+","+sabji2+"\nFARSAN : "+farsan+"\nSWEET : "+sweet+","+sweet2+"\nRICE : "+rice+"\n,roti,naan,papad";
	}
}

