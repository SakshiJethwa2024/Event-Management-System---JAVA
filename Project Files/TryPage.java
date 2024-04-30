import java.awt.BorderLayout;

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




public class TryPage extends JFrame{
	JPanel top,left,MyProfile,right,heading;
	JButton venue,food,decoration,music,photography;
	Font f;
	static TryPage z;
	VenueFrame vf;
	Photography1 p1;
	Music m1;
	FoodJTabbedPane ftp;
	DecorTab decor;
	JButton next;
	String user,date;
	//JScrollPane sp;
	public TryPage(String s,String user,String date){
		super(s);
		z=this;
		this.user = user;
		this.date = date;
		this.setLayout(null);
		//this.pack();
		
		//this.setExtendedState(MAXIMIZED_BOTH);
		//this.setResizable(false);
		this.setSize(1500,900);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(new JLabel(new ImageIcon("src//pic1.jpeg")));
		
		
		    heading = new JPanel();
	        heading.setBounds(0,0,1400,140);
	        add(heading);
	        JLabel pic = new JLabel(new ImageIcon("images//tvm3re3.png"));
			heading.add(pic);
		
		left=new JPanel();
		//left.setBackground(new Color(102,0,153));
		//left.setBackground(new Color(255,204,51));
		
		left.setBounds(0, 140, 250, 700);
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
		venue.setBounds(20,20,200,70);
		
		food=new JButton("FOOD");
		addButtons(left,food);
		food.setBounds(20,120,200,70);
		music=new JButton("MUSIC");
		addButtons(left,music);
		music.setBounds(20,220,200,70);
		decoration=new JButton("DECORATION");
		addButtons(left,decoration);
		decoration.setBounds(20,320,200,70);
		photography=new JButton("PHOTOS/VIDEOS");
		addButtons(left,photography);
		photography.setBounds(20,420,200,70);
		
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
		next.setBounds(1150,100,100,40);
		next.setBackground(Color.white);
		next.setForeground(Color.black);
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
		 decor = new DecorTab();
		 this.add(decor);
		
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

