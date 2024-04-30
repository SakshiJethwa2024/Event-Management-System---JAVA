import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Soup1
{
	String name;
	double price;
	Soup1(String name,double price)
	{
		this.name = name;
		this.price = price;
	}
}

class Soup2
{
	Soup1 s1,s2,s3,s4,s5;
	Soup2()
	{
		s1 = new Soup1("Manchow",40.0);
		s2 = new Soup1("Tomato",30.0);
		s3 = new Soup1("Hot & Sour",40.0);
		s4 = new Soup1("Sweet Corn",50.0);
		s5 = new Soup1("Brocolli Almond Soup",60.0);
	}
}

public class Soup extends JPanel
{
	JCheckBox c1,c2,c3,c4,c5;
	JButton book;
	Font f;
	JLabel l;
	Soup2 s6;
	SoupListener sl;
	Soup()
	{
		sl = new SoupListener(this);
		s6 = new Soup2();
		this.setLayout(null);
		this.setBackground(new Color(207,236,207));
		//this.setBackground(Color.white);
		//this.setExtendedState(MAXIMIZED_BOTH);
		this.setBounds(10,10,900,700);
		//this.setResizable(false);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		f = new Font("Arial Rounded MT Bold",Font.PLAIN,20);

		c1 = new JCheckBox(""+s6.s1.name+"                                                                "+s6.s1.price);
		c1.setBounds(110,100,700,30);
		c1.setFocusable(false);
		c1.setFont(f);
		this.add(c1);
		
		c2 = new JCheckBox(""+s6.s2.name+"                                                                   "+s6.s2.price);
		c2.setBounds(110,150,700,30);
		c2.setFocusable(false);
		c2.setFont(f);
		this.add(c2);
		
		c3 = new JCheckBox(""+s6.s3.name+"                                                             "+s6.s3.price);
		c3.setBounds(110,200,700,30);
		c3.setFocusable(false);
		c3.setFont(f);
		this.add(c3);
		
		c4 = new JCheckBox(""+s6.s4.name+"                                                            "+s6.s4.price);
		c4.setBounds(110,250,700,30);
		c4.setFocusable(false);
		c4.setFont(f);
		this.add(c4);
		
		c5 = new JCheckBox(""+s6.s5.name+"                                           "+s6.s5.price);
		c5.setBounds(110,300,700,30);
		c5.setFocusable(false);
		c5.setFont(f);
		this.add(c5);
		
		l = new JLabel("CHOOSE YOUR SOUPS HERE!!");
		l.setBounds(290,20,900,30);
		l.setFont(f);
		this.add(l);
		
		book = new JButton("CONFIRM");
		book.setBounds(380,350,150,40);
		book.setBackground(Color.white);
		book.setForeground(Color.black);
		book.setFont(f);
		book.setFocusable(false);
		this.add(book);
		
		c1.addActionListener(sl);
		c2.addActionListener(sl);
		c3.addActionListener(sl);
		c4.addActionListener(sl);
		c5.addActionListener(sl);
		book.addActionListener(sl);
	}
}

class SoupListener implements ActionListener
{
	Soup s;
	SoupListener(Soup s)
	{
		this.s = s;
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		double amount = 0.0;

		if(s.c1.isSelected())
		{
			HashMapFile.item.put(s.s6.s1.name,s.s6.s1.price);
			amount += s.s6.s1.price;
		}
		if(s.c2.isSelected())
		{
			HashMapFile.item.put(s.s6.s2.name,s.s6.s2.price);
			amount += s.s6.s2.price;
		}
		if(s.c3.isSelected())
		{
			HashMapFile.item.put(s.s6.s3.name,s.s6.s3.price);
			amount += s.s6.s3.price;
		}
		if(s.c4.isSelected())
		{
			HashMapFile.item.put(s.s6.s4.name,s.s6.s4.price);
			amount += s.s6.s4.price;
		}
		if(s.c5.isSelected())
		{
			HashMapFile.item.put(s.s6.s5.name,s.s6.s5.price);
			amount += s.s6.s5.price;
		}
		
		//System.out.println(amount);
		
		if(ae.getSource() == s.book && amount>0)
		{
			int choice = JOptionPane.showConfirmDialog(null, "ARE YOU SURE TO ADD THESE/THIS SOUPS TO YOUR FOOD LIST?\nONCE YOU SELECT YES YOU CANNOT CHANGE THE ITEMS.", "Confirm Decision", JOptionPane.YES_NO_OPTION);
			if(choice == 0)
			{
				JOptionPane.showMessageDialog(null, "YOUR SELECTED SOUPS ARE SUCCESSFULLY ADDED TO YOUR FOOD LIST!! \nYOU HAVE TO PAY "+amount,"Confirmation Message",JOptionPane.INFORMATION_MESSAGE );
//				System.out.println(HashMapFile.item);
				s.book.setEnabled(false);
			}
		}
		else if(amount == 0)
		{
			JOptionPane.showMessageDialog(null,"PLEASE SELECT AT LEAST ONE SOUP TO ADD IN THE FOOD LIST","Error",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	
}



