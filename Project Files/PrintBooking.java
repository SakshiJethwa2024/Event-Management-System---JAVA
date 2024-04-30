import javax.swing.JFrame;
import javax.swing.JTextArea;

public class PrintBooking extends JFrame
{
	JTextArea jt;
	PrintBooking(String s){
		super(s);
		jt=new JTextArea();
		if(BookingDetails.v!=null) {
		jt.setText("venue : "+BookingDetails.v.name+"price : "+BookingDetails.v.price);
		}
		else if(BookingDetails.v==null) {
			jt.setText("Venue : not selected");
		}
		if(BookingDetails.fc!=null) {
			jt.append("\n FOOD DEETS : \n"+BookingDetails.fc.foodbill+"\nfood bills : "+BookingDetails.fc.amount);
		}
		if(BookingDetails.bm!=null) {
			jt.append("\nMusic : "+BookingDetails.bm.name+"  price : "+BookingDetails.bm.price);
		}
		if(BookingDetails.pa!=null) {
			jt.append("\nPhotography amount : "+BookingDetails.pa.amount);
		}
		if(BookingDetails.dcs!=null) {
			jt.append("\n Decoration Details : "+BookingDetails.dcs.name+"\nDecoration amount : "+BookingDetails.dcs.amount);
		}
		
		this.add(jt);
		this.setVisible(true);
		this.setSize(1200,700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

