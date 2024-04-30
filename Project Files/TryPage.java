package mainfront;
import java.awt.BorderLayout;
import venue.*;
import food.*;
import music1.Music;
import photographyp.Photography1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;


import venue.VenueFrame;

public class TryPage extends JFrame{
	JPanel top,left,MyProfile,right;
	JButton venue,food,decoration,music,photography;
	Font f;
	static TryPage z;
	VenueFrame vf;
	Photography1 p1;
	Music m1;
	FoodJTabbedPane ftp;
	JButton next;
	//JScrollPane sp;
	public TryPage(String s){
		super(s);
		z=this;
		this.setLayout(null);
		//this.pack();
		
		//this.setExtendedState(MAXIMIZED_BOTH);
		//this.setResizable(false);
		this.setSize(1500,900);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(new JLabel(new ImageIcon("src//pic1.jpeg")));
		
		left=new JPanel();
		//left.setBackground(new Color(102,0,153));
		//left.setBackground(new Color(255,204,51));
		
		left.setBounds(0, 150, 290, 700);
		this.add(left);
		left.setLayout(null);
		
		//left.setBorder(BorderFactory.createLoweredBevelBorder());
		left.setBorder(BorderFactory.createLineBorder(Color.black, 1, isVisible()));
		//JLabel temp=new JLabel(new ImageIcon("src//pic1.jpeg"));
		//temp.setBounds(0,0,290,700);
		//left.add(temp);
		left.setBackground(new Color(255,102,102,20));
		
		venue=new JButton("VENUE");
		
		addButtons(left,venue);
		venue.setBounds(40,120,200,70);
		
		food=new JButton("FOOD");
		addButtons(left,food);
		food.setBounds(40,200,200,70);
		music=new JButton("MUSIC");
		addButtons(left,music);
		music.setBounds(40,280,200,70);
		decoration=new JButton("DECORATION");
		addButtons(left,decoration);
		decoration.setBounds(40,360,200,70);
		photography=new JButton("PHOTOS/VIDEOS");
		addButtons(left,photography);
		photography.setBounds(40,440,200,70);
		
		MenuListener ml=new MenuListener(this);
		venue.addActionListener(ml);
		food.addActionListener(ml);
		music.addActionListener(ml);
		decoration.addActionListener(ml);
		photography.addActionListener(ml);
		
		//right=new JPanel();
		//right.setBounds(1200,200,300,900);
		//right.setBackground(new Color(102,0,153));
		//this.add(right);
	
		//sp.setVisible(true);
		//this.getContentPane().add(vf.sp);
		
		next=new JButton("next");
		next.setBounds(1200,700,200,50);
		this.add(next);
		next.addActionListener(ml);
		 vf=new VenueFrame();
		 this.add(vf);
		 p1=new Photography1();               
		 this.add(p1);
		 m1=new Music();
		 this.add(m1);
		 ftp=new FoodJTabbedPane();
		 this.add(ftp);
		
	}
	public void addButtons(JPanel left,JButton b) {
		//b.setToolTipText(b.getLabel());
		//b.setBorderPainted(false);
		b.setBorder(BorderFactory.createLoweredBevelBorder());
		//b.setOpaque(false);
		b.setFont(new Font("Berlin Sans FB",Font.PLAIN,25));
		b.setBackground(Color.white);
		//b.setForeground(Color.white);
		left.add(b);
	}
	public static void show(String s) {
		
		JOptionPane.showMessageDialog(z, s);
		
	}
	
}


