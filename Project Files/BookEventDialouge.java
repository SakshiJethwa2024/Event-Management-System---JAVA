package venue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookEventDialouge implements ActionListener{
	DisplayVenue1 dv;
	BookEventDialouge(DisplayVenue1 dv){
		this.dv=dv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Book this")) {
			Dialouge1 d1=new Dialouge1(dv,"Confirm Booking");
		}
		
	}
}
