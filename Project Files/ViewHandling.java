package venue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewHandling implements ActionListener {
	Venue v;
	ViewHandling(VenuePanel vp,Venue v){
		this.v=v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("view")) {
		DisplayVenue1 dv=new DisplayVenue1(v);
		
		//mp.add(dv);
		}
		
	}
}
