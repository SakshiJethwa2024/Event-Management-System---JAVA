package food;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Desserts1
{
	String name;
	double price;
	Desserts1(String name,double price)
	{
		this.name = name;
		this.price = price;
	}
}

class Desserts2
{
	Desserts1 d1,d2,d3,d4,d5,d6;
	Desserts2()
	{
		d1 = new Desserts1("Ice Creams",40.0);
		d2 = new Desserts1("Pastry",50.0);
		d3 = new Desserts1("Sizzling Brownies",130.0);
		d4 = new Desserts1("Kulfi",30.0);
		d5 = new Desserts1("Paan",50.0);
		d6 = new Desserts1("Chocolate Hazelnut Icecream Sandwich",120.0);
	}
}

class Desserts3 extends JPanel
{
	JCheckBox c1,c2,c3,c4,c5,c6;
	JButton book;
	Font f;
	JLabel l;
	Desserts2 d7;
	DessertsListener dl;
	Desserts3()
	{
		dl = new DessertsListener(this);
		d7 = new Desserts2();
		this.setLayout(null);
//		this.setExtendedState(MAXIMIZED_BOTH);
//		this.setResizable(false);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(new Color(255,255,204));
		
		f = new Font("Arial Rounded MT Bold",Font.PLAIN,20);
		
		c1 = new JCheckBox(""+d7.d1.name+"                                                                            "+d7.d1.price);
		c1.setBounds(200,150,900,30);
		c1.setFocusable(false);
		c1.setFont(f);
		this.add(c1);
		
		c2 = new JCheckBox(""+d7.d2.name+"                                                                                      "+d7.d2.price);
		c2.setBounds(200,190,900,30);
		c2.setFocusable(false);
		c2.setFont(f);
		this.add(c2);
		
		c3 = new JCheckBox(""+d7.d3.name+"                                                             "+d7.d3.price);
		c3.setBounds(200,230,900,30);
		c3.setFocusable(false);
		c3.setFont(f);
		this.add(c3);
		
		c4 = new JCheckBox(""+d7.d4.name+"                                                                                           "+d7.d4.price);
		c4.setBounds(200,270,900,30);
		c4.setFocusable(false);
		c4.setFont(f);
		this.add(c4);
		
		c5 = new JCheckBox(""+d7.d5.name+"                                                                                        "+d7.d5.price);
		c5.setBounds(200,310,900,30);
		c5.setFocusable(false);
		c5.setFont(f);
		this.add(c5);
		
		c6 = new JCheckBox(""+d7.d6.name+"                "+d7.d6.price);
		c6.setBounds(200,350,900,30);
		c6.setFocusable(false);
		c6.setFont(f);
		this.add(c6);
		
		l = new JLabel("CHOOSE YOUR DESSERTS HERE!!");
		l.setBounds(300,100,900,50);
		l.setFont(f);
		this.add(l);
		
		book = new JButton("CONFIRM");
		book.setBounds(600,500,150,40);
		book.setFont(f);
		book.setFocusable(false);
		this.add(book);
		
		c1.addActionListener(dl);
		c2.addActionListener(dl);
		c3.addActionListener(dl);
		c4.addActionListener(dl);
		c5.addActionListener(dl);
		c6.addActionListener(dl);
		book.addActionListener(dl);
	}
}

class DessertsListener implements ActionListener
{
	Desserts3 e;
	DessertsListener(Desserts3 e)
	{
		this.e = e;
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		float amount = 0.0f;
		if(e.c1.isSelected())
		{
			HashMapFile.item.put(e.d7.d1.name,e.d7.d1.price);
			amount += e.d7.d1.price;
		}
		if(e.c2.isSelected())
		{
			HashMapFile.item.put(e.d7.d2.name,e.d7.d2.price);
			amount += e.d7.d2.price;
		}
		if(e.c3.isSelected())
		{
			HashMapFile.item.put(e.d7.d3.name,e.d7.d3.price);
			amount += e.d7.d3.price;
		}
		if(e.c4.isSelected())
		{
			HashMapFile.item.put(e.d7.d4.name,e.d7.d4.price);
			amount += e.d7.d4.price;
		}
		if(e.c5.isSelected())
		{
			HashMapFile.item.put(e.d7.d5.name,e.d7.d5.price);
			amount += e.d7.d5.price;
		}
		if(e.c6.isSelected())
		{
			HashMapFile.item.put(e.d7.d6.name,e.d7.d6.price);
			amount += e.d7.d6.price;
		}
		if(ae.getSource() == e.book && amount>0)
		{
			int choice = JOptionPane.showConfirmDialog(null, "ARE YOU SURE TO ADD THESE DESSERTS IN YOUR FOOD LIST?\nONCE YOU HAVE SELECTED YES YOU CANNOT CHANGE THE ITEMS", "Confirm Decision", JOptionPane.YES_NO_OPTION);
			if(choice == 0)
			{
					JOptionPane.showMessageDialog(null, "YOUR BOOKING IS SUCCESSFULLY DONE!! \nYOU HAVE TO PAY "+amount + " PER PLATE","Confirmation Message",JOptionPane.INFORMATION_MESSAGE );
				e.book.setEnabled(false);
			}
		}
		
		
		
	}
	
}
//public class Desserts {
//
//	public static void main(String[] args) {
//
//		Desserts3 ds = new Desserts3();
//		ds.setVisible(true);
//
//	}
//
//}

