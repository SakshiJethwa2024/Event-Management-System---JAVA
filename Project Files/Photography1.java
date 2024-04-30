import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class Photography1 extends JPanel{

    JRadioButton r,r1,r3;
	ButtonGroup bg;
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8;
	double amount=0;
	JLabel l,l1,l2,l3,title;
	JButton confirm,currentprice;
	public Photography1()
	{
		
		this.setLayout(null);
		//this.setResizable(false);
		//this.setExtendedState(MAXIMIZED_BOTH);
		this.setVisible(false);
		this.setBounds(300,150,1000,800);
		//this.setContentPane(new JLabel(new ImageIcon("src//image2.jpeg")));
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		this.setBackground(new Color(255,234,234));
		
		/*l = new JLabel(new ImageIcon("src//I8.jpeg"));
		l.setBounds(0,0,1000,130);
		l.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		
		add(l);
	
		l1 = new JLabel("Freeze Your Creativity For Eternity");
		Font f = new Font("Lucida Calligraphy",Font.BOLD,45);
		l1.setFont(f);
		l1.setBounds(10,20,1200,70);
		l.add(l1);
		l1.setForeground(Color.white);*/
		
		Font ff = new Font("Arial Rounded MT Bold",Font.BOLD,30);
//		Map attributes = ff.getAttributes();
//		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		
		
		/*l2 = new JLabel("ITEMS                                 PRICE");
		l2.setFont(ff);
		l2.setBounds(75,50,900,30);
		add(l2);*/
		
		title = new JLabel("SELECT YOUR PHOTOGRAPHY PACKAGE");
		title.setBounds(140,20,800,40);
		title.setFont(ff);
		title.setForeground(Color.black);
		add(title);
		
		r = new JRadioButton();
		r.setText("Birthdays/Anniversaries/Business Events/\nFamily Functions");
		r.setFont(ff);
		r.setBounds(40,100,980,35);
		add(r);
		r.setOpaque(false);
		r.setFocusable(false);
		
		 
		c1 = new JCheckBox("Photography(1 day) & Album                                                                                  10000/-");
		c1.setBounds(115,140,500,30);
		add(c1);
		c1.setFocusable(false);
		c1.setEnabled(false);
		c1.setOpaque(true);
		c1.setBackground(null);
		
		c2 = new JCheckBox("Videography(1 day) & Pendrive                                                                              10000/-");
		c2.setBounds(115,180,500,30);
		add(c2);
		c2.setFocusable(false);
		c2.setEnabled(false);
		c1.setOpaque(true);
		c2.setBackground(null);
		
		r1 = new JRadioButton();
		r1.setText("Wedding Photoshoot Pack");
		r1.setBounds(40,220,600,35);
		add(r1);
		r1.setFont(ff);
		r1.setOpaque(false);
		r1.setFocusable(false);
		
		c3 = new JCheckBox("Wedding Photography and Videography                                                            20000/-");
		c3.setBounds(115,260,500,30);
		add(c3);
		c3.setEnabled(false);
		c3.setFocusable(true);
		
		c4 = new JCheckBox("Pre-wedding shoots                                                                                              7000/-");
		c4.setBounds(115,300,500,30);
		add(c4);
		c4.setEnabled(false);
		//c4.setFocusable(false);
		 
		c5 = new JCheckBox("Traditional Photography and Videography                                                        15000/-");
		c5.setBounds(115,340,500,30);  
		add(c5);
		c5.setEnabled(false);
		//c5.setFocusable(false);
		
		c6 = new JCheckBox("Candid Photography                                                                                             25000/-");
		c6.setBounds(115,380,500,30);
		add(c6);
		c6.setEnabled(false);
		c6.setFocusable(false);
		
		c7 = new JCheckBox("All Functions(Haldi,Mehndi etc.)Photography and Videography                    50000/-");
		c7.setBounds(115,420,500,30);
		add(c7);
		c7.setEnabled(false);
		c7.setFocusable(false);
		
		c8 = new JCheckBox("Albums and SoftCopy                                                                                          20000/-");
		c8.setBounds(115,460,500,30);
		add(c8);
		c8.setEnabled(false);
		c8.setFocusable(false);
		c8.setEnabled(false);
		r3 = new JRadioButton("Combo Pack(all of the events listed above)                                                   100000/-");
		r3.setBounds(115,500,500,30); 
		add(r3);
		r3.setFocusable(false);
		r3.setEnabled(false);
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add(r);
		g1.add(r1);
		EventListnerPhotography elv=new EventListnerPhotography(this);
		
		r.addItemListener(elv);
		c1.addItemListener(elv);
		c2.addItemListener(elv);
		r1.addItemListener(elv);
		c3.addItemListener(elv);
		c4.addItemListener(elv);
		c5.addItemListener(elv);
		c6.addItemListener(elv);
		c7.addItemListener(elv);
		c8.addItemListener(elv);
		r3.addItemListener(elv);

		
		
		bg=new ButtonGroup();
		bg.add(r); bg.add(r1);
		
		currentprice=new JButton("View current price");
		currentprice.setBounds(700,400,200,35);
		currentprice.setFont(new Font("HP Simplified",Font.BOLD,20));
		currentprice.setBackground(Color.black);
		currentprice.setForeground(Color.white);
		currentprice.addActionListener(elv);
		this.add(currentprice);
		
		
		confirm=new JButton("Confirm");
		confirm.setBounds(700,450,120,35);
		confirm.setFont(new Font("HP Simplified",Font.BOLD,20));
		confirm.addActionListener(elv);
		confirm.setBackground(Color.black);
		confirm.setForeground(Color.white);
		this.add(confirm);
	}

	
	
	}


