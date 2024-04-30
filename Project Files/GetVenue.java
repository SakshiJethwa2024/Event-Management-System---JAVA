import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;

//import TryPage;



public class GetVenue implements ActionListener{
	DisplayVenue1 dv;
	Dialouge1 d1;
	VenueChoice vc;
	public GetVenue(Dialouge1 d1,DisplayVenue1 dv){
		
		this.d1=d1;
		this.dv=dv;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		 if(d1.bg.getSelection()!=null) {
			d1.confirm.setEnabled(true);
		 }
		
		if(e.getActionCommand().equals("CONFIRM")) {
			
			//System.out.println(dv.currentlyselected.name);
		
			JOptionPane jo=new JOptionPane("You have selected "+dv.currentlyselected+" venue"+"kuhik "+d1.bg.getSelection().getActionCommand());
			
			 if(d1.b1.isSelected()) {
			 vc=new VenueChoice(dv.currentlyselected.name,"Full day",dv.currentlyselected.pricefullday);
			 }
			 else {
				 vc=new VenueChoice(dv.currentlyselected.name,"Half day",dv.currentlyselected.pricehalfday);
			 }
			 
			 dv.dispose();
			TryPage.show("YOUR SELECTED VENUE IS : "+ dv.currentlyselected.name);
			 }
	}
		
		
	

	

}
	
