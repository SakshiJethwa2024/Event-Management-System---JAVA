package food;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;
import food.HashMapFile;
public class MCEventListner implements ActionListener,ItemListener {
	FrontEndforMainCourse mc;
	MCEventListner(FrontEndforMainCourse mc){
		this.mc=mc;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getItemSelectable().equals(mc.silver)) {
//			System.out.println("hi");
		if(mc.silver.isSelected()) {
			mc.ss1.setEnabled(true);
			mc.ss2.setEnabled(true);
			mc.sr.setEnabled(true);
			mc.sf.setEnabled(true);
			mc.ss.setEnabled(true);
			mc.confirm.setEnabled(true);
		}
		else if(!mc.silver.isSelected()) {
			mc.ss1.setEnabled(false);
			mc.ss2.setEnabled(false);
			mc.sr.setEnabled(false);
			mc.sf.setEnabled(false);
			mc.ss.setEnabled(false);
		}
		}
		if(e.getItemSelectable().equals(mc.platinum)) {
			if(mc.platinum.isSelected()) {
				mc.ps1.setEnabled(true);
				mc.pss1.setEnabled(true);
				mc.pss2.setEnabled(true);
				mc.ps2.setEnabled(true);
				mc.pr.setEnabled(true);
				mc.pf.setEnabled(true);
				mc.confirm.setEnabled(true);
			}
		
			else if(!mc.platinum.isSelected()) {
			//mc.jp1.setEnabled(false);
			mc.ps1.setEnabled(false);
			mc.pss1.setEnabled(false);
			mc.pss2.setEnabled(false);
			mc.ps2.setEnabled(false);
			mc.pr.setEnabled(false);
			mc.pf.setEnabled(false);
		}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int p;
		PlatinumPlate pl = null;
		SilverPlate sl=null;
		if(e.getActionCommand().equals("Confirm")) {
			p=0;
			if(mc.platinum.isSelected()) {
				 pl=new PlatinumPlate(mc.pss1.getSelectedItem().toString(),mc.pss2.getSelectedItem().toString(),mc.pf.getSelectedItem().toString(),mc.ps1.getSelectedItem().toString(),mc.ps2.getSelectedItem().toString(),mc.pr.getSelectedItem().toString());
				 HashMapFile.item.put(pl.toString(),pl.cost);
			}
			else if(mc.silver.isSelected()) {
				p=1;
				 sl=new SilverPlate(mc.ss1.getSelectedItem().toString(),mc.ss2.getSelectedItem().toString(),mc.sr.getSelectedItem().toString(),mc.sf.getSelectedItem().toString(),mc.ss.getSelectedItem().toString());
				HashMapFile.item.put(sl.toString(),sl.cost);;
			}
			
			if(p==0) {
				JOptionPane.showConfirmDialog(mc,pl);
				mc.maincoursecost=pl.cost;
			}
			else {
				JOptionPane.showConfirmDialog(mc,sl);
				mc.maincoursecost=sl.cost;
			}
			mc.confirm.setEnabled(false);
		}
		
	}
}
