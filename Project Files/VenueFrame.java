import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class VenueFrame extends JPanel {
	VenuePanel vp1,vp2,vp3,vp4;
	//final JScrollPane sp;
	public VenueFrame(){	
		
		//this.setBounds(300,150,1000,1200);
		this.setVisible(false);
		this.setLayout(null);
		//this.setEditable(false);
		//this.setBackground(new Color(0,0,0,10));
		this.setBackground(Color.white);	
		AddVenue av=new AddVenue();
		vp1=new VenuePanel(av.v1,20,10);
		this.add(vp1);
		vp2=new VenuePanel(av.v2,20,190);
		this.add(vp2);
		vp3=new VenuePanel(av.v3,20,370);
		this.add(vp3);
		//vp1=new VenuePanel(av.v1,50,10);
		//this.add(vp1);
		
		
		//sp=new JScrollPane(this,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		//sp.setLayout(null);
		//sp.setBounds(300, 300, 1000, 700);
		//sp.setViewportView(this);
		this.setBounds(300,150,1000,1200);
		//this.setPreferredSize(new Dimension(1000,1200));
	}
	
}

