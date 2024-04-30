package photographyp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

public class EventListnerPhotography implements ActionListener,ItemListener{
	Photography1 pp;
	PhotographyAmount pa;
	 EventListnerPhotography(Photography1 pp){
		 this.pp=pp;
	 }

	 public void actionPerformed(ActionEvent ae) {
		 LogicPhotography lp=new LogicPhotography(pp);
		
			
			if(ae.getActionCommand().equals("Confirm")) {
				 pp.amount=lp.returnamount();
			if(pp.amount==0) {
				JOptionPane.showConfirmDialog(pp, "you have not selected package...Do you want to continue?");
			}
			else {
			int t=JOptionPane.showConfirmDialog(pp, "your amount is "+pp.amount+" Confirm it!!");
			if(t==0) {
			pa=new PhotographyAmount(pp.amount);
			}
			}
			}
			
			if(ae.getActionCommand().equals("View current price")) {
				 pp.amount=lp.returnamount();
				JOptionPane.showMessageDialog(pp, "current amount : "+pp.amount);
			}
			
			
		}



		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getItemSelectable().equals(pp.r)) {
			if(pp.r.isSelected()) {
				pp.c1.setEnabled(true);
				pp.c2.setEnabled(true);
			}
			else if(!pp.r.isSelected()) {
				pp.c1.setSelected(false);
				pp.c2.setSelected(false);
				pp.c1.setEnabled(false);
				pp.c2.setEnabled(false);
				
			}
			}
			if(e.getItemSelectable().equals(pp.r1)) {
				
			 if(pp.r1.isSelected()) {
				 pp.c3.setEnabled(true);
				 pp.c4.setEnabled(true);
				 pp.c5.setEnabled(true);
				 pp.c6.setEnabled(true);
				 pp.c7.setEnabled(true);
				 pp.c8.setEnabled(true);
				pp.r3.setEnabled(true);
			}
			
			
			 else if(!pp.r1.isSelected()) {
				pp.c3.setSelected(false);
				pp.c4.setSelected(false);
				pp.c5.setSelected(false);
				pp.c6.setSelected(false);
				pp.c7.setSelected(false);
				pp.c8.setSelected(false);
				pp.r3.setSelected(false);
				pp.c3.setEnabled(false);
				pp.c4.setEnabled(false);
				pp.c5.setEnabled(false);
				pp.c6.setEnabled(false);
				pp.c7.setEnabled(false);
				pp.c8.setEnabled(false);
				pp.r3.setEnabled(false);
			}
			
			
		}
			if(e.getItemSelectable().equals(pp.r3)) {
			if(pp.r3.isSelected()) {
				pp.c3.setSelected(false);
				pp.c4.setSelected(false);
				pp.c5.setSelected(false);
				pp.c6.setSelected(false);
				pp.c7.setSelected(false);
				pp.c8.setSelected(false);
				
				pp.c3.setEnabled(false);
				pp.c4.setEnabled(false);
				pp.c5.setEnabled(false);
				pp.c6.setEnabled(false);
				pp.c7.setEnabled(false);
				pp.c8.setEnabled(false);
				
			}
			else if(!pp.r3.isSelected()){
				pp.c3.setEnabled(true);
				pp.c4.setEnabled(true);
				pp.c5.setEnabled(true);
				pp.c6.setEnabled(true);
				pp.c7.setEnabled(true);
				pp.c8.setEnabled(true);
				pp.r3.setEnabled(true);
			}
			}
		

		}
	

}
