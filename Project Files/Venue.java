import javax.swing.ImageIcon;

public class Venue {
	String name="",location="",contactno="",extrainfo="",df1="",df2="";
	float ratings=0f;
	double squarefeetarea=0,pricehalfday,pricefullday;
	ImageIcon ii;
	Venue(String name,String location,String contactno,float ratings,double squarefeetarea,String extrainfo,double pricefullday,double pricehalfday,String loc,String f1,String f2){
		this.name=name;
		this.location=location;
		this.contactno=contactno;
		this.ratings=ratings;
		this.squarefeetarea=squarefeetarea;
		this.extrainfo=extrainfo;
		this.pricefullday=pricefullday;
		this.pricehalfday=pricehalfday;
		ii=new ImageIcon(loc);
		this.df1=f1;
		this.df2=f2;
	}
	
}