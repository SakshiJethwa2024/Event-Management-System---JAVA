import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class Extras1
{
	String name;
	double price;
	Extras1(String name,double price)
	{
		this.name = name;
		this.price = price;
	}
}

class Extras2
{
	Extras1 e1,e2,e3,e4,e5,e6,e7,e8;
	Extras2()
	{
		e1 = new Extras1("Pani Puri",30.0);
		e2 = new Extras1("Aloo Tikki",50.0);
		e3 = new Extras1("Dosa",80.0);
		e4 = new Extras1("Pizza",100.0);
		e5 = new Extras1("Chinese",110.0);
		e6 = new Extras1("Chaat",120.0);
		e7 = new Extras1("Live Dhokla",70.0);
		e8 = new Extras1("Mexican Jar",150.0);
	}
}

class Extras extends JPanel
{
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8;
	JButton book;
	Font f;
	JLabel l;
	Extras2 e9;
	ExtrasListener el;
	Extras()
	{
		el = new ExtrasListener(this);
		e9 = new Extras2();
		this.setLayout(null);
		//this.setExtendedState(MAXIMIZED_BOTH);
		//this.setResizable(false);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(10,10,900,700);
		this.setBackground(new Color(207,236,207));
		
		f = new Font("Arial Rounded MT Bold",Font.PLAIN,20);
		
		c1 = new JCheckBox(""+e9.e1.name+"                                                                "+e9.e1.price);
		c1.setBounds(140,70,700,30);
		c1.setFocusable(false);
		c1.setFont(f);
		this.add(c1);
		
		c2 = new JCheckBox(""+e9.e2.name+"                                                               "+e9.e2.price);
		c2.setBounds(140,110,700,30);
		c2.setFocusable(false);
		c2.setFont(f);
		this.add(c2);
		
		c3 = new JCheckBox(""+e9.e3.name+"                                                                        "+e9.e3.price);
		c3.setBounds(140,150,700,30);
		c3.setFocusable(false);
		c3.setFont(f);
		this.add(c3);
		
		c4 = new JCheckBox(""+e9.e4.name+"                                                                      "+e9.e4.price);
		c4.setBounds(140,190,700,30);
		c4.setFocusable(false);
		c4.setFont(f);
		this.add(c4);
		
		c5 = new JCheckBox(""+e9.e5.name+"                                                                 "+e9.e5.price);
		c5.setBounds(140,230,700,30);
		c5.setFocusable(false);
		c5.setFont(f);
		this.add(c5);
		
		c6 = new JCheckBox(""+e9.e6.name+"                                                                     "+e9.e6.price);
		c6.setBounds(140,270,700,30);
		c6.setFocusable(false);
		c6.setFont(f);
		this.add(c6);
		
		c7 = new JCheckBox(""+e9.e7.name+"                                                            "+e9.e7.price);
		c7.setBounds(140,310,700,30);
		c7.setFocusable(false);
		c7.setFont(f);
		this.add(c7);
		
		c8 = new JCheckBox(""+e9.e8.name+"                                                          "+e9.e8.price);
		c8.setBounds(140,350,700,30);
		c8.setFocusable(false);
		c8.setFont(f);
		this.add(c8);
		
		l = new JLabel("CHOOSE YOUR EXTRAS HERE!!");
		l.setBounds(300,10,900,40);
		l.setFont(f);
		this.add(l);
		
		book = new JButton("CONFIRM");
		book.setBounds(380,390,150,40);
		book.setBackground(Color.white);
		book.setForeground(Color.black);
		book.setFont(f);
		book.setFocusable(false);
		this.add(book);
		
		c1.addActionListener(el);
		c2.addActionListener(el);
		c3.addActionListener(el);
		c4.addActionListener(el);
		c5.addActionListener(el);
		c6.addActionListener(el);
		c7.addActionListener(el);
		c8.addActionListener(el);
		book.addActionListener(el);
	}
}

class ExtrasListener implements ActionListener
{
	Extras e;
	ExtrasListener(Extras e)
	{
		this.e = e;
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		double amount = 0.0;
		if(ae.getActionCommand().equals("CONFIRM")) {
		if(e.c1.isSelected())
		{
			HashMapFile.item.put(e.e9.e1.name,e.e9.e1.price);
			amount += e.e9.e1.price;
		}
		if(e.c2.isSelected())
		{
			HashMapFile.item.put(e.e9.e2.name,e.e9.e2.price);
			amount += e.e9.e2.price;
		}
		if(e.c3.isSelected())
		{
			HashMapFile.item.put(e.e9.e3.name,e.e9.e3.price);
			amount += e.e9.e3.price;
		}
		if(e.c4.isSelected())
		{
			HashMapFile.item.put(e.e9.e4.name,e.e9.e4.price);
			amount += e.e9.e4.price;
		}
		if(e.c5.isSelected())
		{
			HashMapFile.item.put(e.e9.e5.name,e.e9.e5.price);
			amount += e.e9.e5.price;
		}
		if(e.c6.isSelected())
		{
			HashMapFile.item.put(e.e9.e6.name,e.e9.e6.price);
			amount += e.e9.e6.price;
		}
		if(e.c7.isSelected())
		{
			HashMapFile.item.put(e.e9.e7.name,e.e9.e7.price);
			amount += e.e9.e7.price;
		}
		if(e.c8.isSelected())
		{
			HashMapFile.item.put(e.e9.e8.name,e.e9.e8.price);
			amount += e.e9.e8.price;
		}
		if(amount>0) {
		int choice = JOptionPane.showConfirmDialog(null, "ARE YOU SURE TO ADD THESE EXTRAS IN YOUR FOOD LIST?\nONCE YOU SELECT YES YOU CANNOT CHANGE THE EXTRAS ITEMS", "Confirm Decision", JOptionPane.YES_NO_OPTION);
		//System.out.println(amount);
		  
			
			if(choice == 0)
			{
				JOptionPane.showMessageDialog(null, "YOUR SELECTED EXTRAS ARE SUCCESSFULLY ADDED TO THE FOOD LIST!! \nYOU HAVE TO PAY "+amount,"Confirmation Message",JOptionPane.INFORMATION_MESSAGE );
//				System.out.println(HashMapFile.item);
				e.book.setEnabled(false);
			}
		}



		
	}
	
	}
}



