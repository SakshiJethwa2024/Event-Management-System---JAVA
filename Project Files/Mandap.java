import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Mandap extends JPanel implements ActionListener
{
	JLabel title,price,adesc,cdesc,sdesc;
	Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,25);
	Font ff = new Font("Arial Rounded MT BOLD",Font.PLAIN,15);
	JRadioButton aes,col,sim,none;
	ButtonGroup g2 = new ButtonGroup();
	JTextField get;
    double aprice = 10000,cprice = 9000,sprice = 7500,nprice = 0,mtotal;
	String ans;
	JButton book;
	DecorStorage dcs;
	
	
	Mandap()
	{
		setLayout(null);
		setBackground(new Color(193,179,215));
		
		  title = new JLabel("SELECT YOUR MANDAP TYPE !!");
		  title.setBounds(250,50,450,30);
		  title.setFont(f);
		  title.setForeground(Color.black);
		  add(title);
		  
		  aes = new JRadioButton("AESTHETIC");
		  col = new JRadioButton("COLORFUL VIBRANT");
		  sim = new JRadioButton("SIMPLE");
		  none = new JRadioButton("NONE");
		  
		  aes.setBounds(150,150,300,40);
		  col.setBounds(150,230,300,40);
		  sim.setBounds(150,310,300,40);
		  none.setBounds(150,390,300,40);
		  
		  aes.setFont(f); col.setFont(f); sim.setFont(f); none.setFont(f);
		  add(aes); add(col); add(sim); add(none);
		  g2.add(aes); g2.add(col); g2.add(sim); g2.add(none);
		  aes.setOpaque(false);
		  col.setOpaque(false);
		  sim.setOpaque(false);
		  none.setOpaque(false);
		  
		  adesc = new JLabel("(Light Colors,Pleasing to eyes,Fine artistic propped decor)");
		  adesc.setBounds(170,190,700,20);
		  adesc.setFont(ff);
		  adesc.setForeground(Color.black);
		  add(adesc);
		  
		  cdesc = new JLabel("(Vibrant Colors to lift up the mood and an Indian touch to every decor)");
		  cdesc.setBounds(170,270,700,20);
		  cdesc.setFont(ff);
		  cdesc.setForeground(Color.black);
		  add(cdesc);
		  
		  sdesc = new JLabel("(Simple but quite Attractive)");
		  sdesc.setBounds(170,350,700,20);
		  sdesc.setFont(ff);
		  sdesc.setForeground(Color.black);
		  add(sdesc);		  
		  
		  price = new JLabel("PRICE : ");
		  price.setBounds(250,430,150,50);
		  price.setFont(new Font("Arial Rounded MT BOLD",Font.BOLD,30));
		  price.setForeground(Color.black);
		  add(price);
		  
		  get = new JTextField("0");
		  get.setBounds(400,435,150,40);
		  get.setEditable(false);
		  get.setFont(f);
		  get.setBackground(Color.white);
		  get.setForeground(Color.black);
		  add(get);
		  
		  book = new JButton("BOOK");
		  book.setBounds(650,435,200,40);
		  book.setBackground(Color.white);
		  book.setForeground(Color.black);
		  book.setFont(f);
		  add(book);
		  
		 book.addActionListener(this);
		  
		  aes.addActionListener(this);
		  col.addActionListener(this);
		  sim.addActionListener(this);
		  none.addActionListener(this);
		  
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == aes)
		{
			get.setText(""+aprice+" /-");
			ans = "AESTHETIC MANDAP FOR RS."+aprice+"/- \n"+adesc.getText();
			mtotal = aprice;
		}
		else if(ae.getSource() == col)
		{
			get.setText(""+cprice+" /-");
			ans = "COLORFUL VIBRANT MANDAP RS."+cprice+"/- \n"+cdesc.getText();
			mtotal = cprice;
		}
		else if(ae.getSource() == sim)
		{
			get.setText(""+sprice+" /-");
			ans = "SIMPLE MANDAP FOR RS."+sprice+"/- \n"+sdesc.getText();
			mtotal = sprice;
		}
		else if(ae.getSource() == none)
		{
			get.setText(""+nprice+" /-");
			ans = "NO MANDAP";
			mtotal = nprice;
		}
		
		if(ae.getActionCommand() == "BOOK")
		{
			if(!aes.isSelected() && !col.isSelected() && !sim.isSelected() && !none.isSelected())
			{
				JOptionPane.showMessageDialog(null,"PLEASE SELECT ONE OF THE OPTION !!");
			}
			else
			{
					int choice = JOptionPane.showConfirmDialog(null,"ARE YOU SURE YOU WANT TO CONTINUE WITH THIS CHOICE,\n ONCE YOU GO AHEAD..YOU CAN'T CHANGE IT?");
					if(choice == 0)
					{
						DecorTab.decorbooking = DecorTab.decorbooking+"\n\n"+ans;
						JOptionPane.showMessageDialog(null,"YOUR DECORATION BOOKING STATUS : "+DecorTab.decorbooking);
						DecorTab.totaldecorprice += mtotal;
						dcs = new DecorStorage(DecorTab.decorbooking,DecorTab.totaldecorprice);
						book.setEnabled(false);
					}
			}
		}
	}
}
