import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MenuListener implements ActionListener {
	TryPage tp;
	JPanel temp=null;
	MenuListener(TryPage tp){
		this.tp=tp;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("VENUE")) {
			if(temp!=null) {
				temp.setVisible(false);
			}
			tp.vf.setVisible(true);
			temp=tp.vf;
		}
		else if(e.getActionCommand().equals("PHOTOS/VIDEOS")) {
			if(temp!=null) {
				temp.setVisible(false);
			}
			tp.p1.setVisible(true);
			temp=tp.p1;
		}
		else if(e.getActionCommand().equals("MUSIC")) {
			if(temp!=null) {
				temp.setVisible(false);
			}
			tp.m1.setVisible(true);
			temp=tp.m1;
		}
		else if(e.getActionCommand().equals("FOOD")) {
			if(temp!=null) {
				temp.setVisible(false);
			}
			tp.ftp.setVisible(true);
			temp=tp.ftp;
		}
		else if(e.getActionCommand().equals("DECORATION")) {
			if(temp!=null) {
				temp.setVisible(false);
			}
			tp.decor.setVisible(true);
			temp=tp.decor;
		}
		else if(e.getActionCommand().equals("next")) {
			tp.dispose();
			//PrintBooking pb=new PrintBooking("tt");
			Final fp = new Final("THE VELVET MOMENTS -- FINAL BOOKING",tp.user,tp.date);
			fp.setVisible(true);
		}
		
	}

}