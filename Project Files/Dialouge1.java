package venue;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Dialouge1 extends JDialog {
	JLabel select;
	JButton confirm;
	JRadioButton b1,b2;
	ButtonGroup bg;
	Dialouge1(DisplayVenue1 dv,String s){
		super(dv,s);
		this.setVisible(true);
		this.setBounds(500,300,400,250);
		this.setLayout(null);
		this.setModal(true);
		this.setBackground(Color.white);
		
		select=new JLabel("To book select your choice : ");
		select.setFont(new Font("Berlin Sans FB",Font.PLAIN,20));
		select.setBounds(2,10,300,30);
		this.add(select);
		
		bg=new ButtonGroup();
		b1=new JRadioButton("Full Day - "+dv.currentlyselected.pricefullday);
		b2=new JRadioButton("Half Day- "+dv.currentlyselected.pricehalfday);
		b1.setBounds(2,60,200,30);
		this.add(b1);
		b2.setBounds(2,100,200,30);
		this.add(b2);
		bg.add(b1); bg.add(b2);
		
		
		confirm=new JButton("CONFIRM");
		confirm.setBounds(270,150,130,35);
		//confirm.setBackground(Color.red);
		//confirm.setForeground(Color.white);
		confirm.setFont(new Font("Arial",Font.PLAIN,20));
		confirm.setEnabled(false);
		this.add(confirm);
		
		GetVenue fl=new GetVenue(this,dv);
		b1.addActionListener(fl);
		b2.addActionListener(fl);
		
		confirm.addActionListener(fl);
		
		
	//	
		
		}

}


