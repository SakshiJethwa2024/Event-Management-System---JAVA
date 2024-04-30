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

public class LightDecor extends JPanel implements ActionListener
{
	JLabel title,label1,label2,label3,price,label4;
	JRadioButton yes,no,l1,l2,l3,l4;
	Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,25);
	Font ff = new Font("Arial Rounded MT BOLD",Font.PLAIN,15);
	ButtonGroup g3 = new ButtonGroup();
	ButtonGroup g4 = new ButtonGroup();
	JTextField get;
	JButton book;
	double l1price = 10000,l2price = 14000,l3price = 18000,l4price = 21000;
	String ans ="";
	double ltotal = 0;
	DecorStorage dcs;
	
	LightDecor()
	{
		setLayout(null);
		setBackground(new Color(193,179,215));
		 
		title = new JLabel("INCLUDE LIGHTS TO THE DECOR ??");
		title.setBounds(190,50,550,30);
		title.setFont(f);
		title.setForeground(Color.black);
		add(title);
		
		yes = new JRadioButton("YES");
		no = new JRadioButton("NO");
		
		yes.setBounds(150,150,100,30);
		no.setBounds(300,150,100,30);
		yes.setOpaque(false);
		no.setOpaque(false);
		
		yes.setFont(f); no.setFont(f);
		add(yes); add(no); g3.add(yes); g3.add(no);
		
		
		l1 = new JRadioButton("RS.10000");
		l2 = new JRadioButton("RS.14000");
		l3 = new JRadioButton("RS.18000");
		l4 = new JRadioButton("RS.21000");
		
		l1.setBounds(450,150,200,30);
		l2.setBounds(450,200,200,30);
		l3.setBounds(450,250,200,30);
		l4.setBounds(450,300,200,30);
		l1.setOpaque(false);
		l2.setOpaque(false);
		l3.setOpaque(false);
		l4.setOpaque(false);
		
		l1.setEnabled(false);
		l2.setEnabled(false);
		l3.setEnabled(false);
		l4.setEnabled(false);
		
		l1.setFont(f); l2.setFont(f); l3.setFont(f); l4.setFont(f);
		add(l1); add(l2); add(l3); add(l4);
		g4.add(l1); g4.add(l2); g4.add(l3); g4.add(l4);
		
		label1 = new JLabel("(Only Decor Lights)");
		label2 = new JLabel("(Decor Lights + Hanging lights + light props)");
		label3 = new JLabel("(Above all + Chandelier)");
		label4 = new JLabel("(NeonBoard Also Included)");
		
		label1.setBounds(600,150,300,30);
		label2.setBounds(600,200,400,30);
		label3.setBounds(600,250,400,30);
		label4.setBounds(600,300,400,30);
		label1.setFont(ff);
		label2.setFont(ff);
		label3.setFont(ff);
		label4.setFont(ff);
		
		label1.setForeground(Color.black);
		label2.setForeground(Color.black);
		label3.setForeground(Color.black);
		label4.setForeground(Color.black);
		
		add(label1); add(label2); add(label3); add(label4);
		
		  price = new JLabel("PRICE : ");
		  price.setBounds(170,370,150,50);
		  price.setFont(new Font("Arial Rounded MT BOLD",Font.BOLD,30));
		  price.setForeground(Color.black);
		  add(price);
		  
		  get = new JTextField("0");
		  get.setBounds(320,370,150,40);
		  get.setEditable(false);
		  get.setFont(f);
		  get.setBackground(Color.white);
		  get.setForeground(Color.black);
		  add(get);
		
		book = new JButton("BOOK");
		book.setBounds(600,370,200,40);
		book.setBackground(Color.white);
		book.setForeground(Color.black);
		book.setFont(f);
		add(book);
		  
		book.addActionListener(this);
		
		
		yes.addActionListener(this);
		no.addActionListener(this);
		l1.addActionListener(this);
		l2.addActionListener(this);
		l3.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == yes)
		{
			l1.setEnabled(true);
			l2.setEnabled(true);
			l3.setEnabled(true);
			l4.setEnabled(true);
		}
		else if(ae.getSource() == no)
		{
			l1.setEnabled(false);
			l2.setEnabled(false);
			l3.setEnabled(false);
			l4.setEnabled(false);
			g4.clearSelection();
			
			get.setText("0");
		}
		if(l1.isSelected())
		{
			get.setText(""+l1price+"/-");
			ans = "LIGHTS INCLUDED FOR RS.10000/- \n"+label1.getText();
			ltotal = l1price;
		}
		else if(l2.isSelected())
		{
			get.setText(""+l2price+"/-");
			ans = "LIGHTS INCLUDED FOR RS.14000/- \n"+label2.getText();
			ltotal = l2price;
		}
		else if(l3.isSelected())
		{
			get.setText(""+l3price+"/-");
			ans = "LIGHTS INCLUDED FOR RS.18000/- \n"+label3.getText();
			ltotal = l3price;
		}
		else if(l4.isSelected())
		{
			get.setText(""+l4price+"/-");
			ans = "LIGHTS INCLUDED FOR RS.21000/- \n"+label4.getText();
			ltotal = l4price;
		}
		
		
		if(ae.getActionCommand() == "BOOK")
		{
			if(yes.isSelected())
			{
				if(!l1.isSelected() && !l2.isSelected() && !l3.isSelected())
				{
					JOptionPane.showMessageDialog(null,"PLEASE CHOOSE THE LIGHT PACKAGE");
				}
				else
				{
					int choice = JOptionPane.showConfirmDialog(null,"ARE YOU SURE YOU WANT TO CONTINUE WITH THIS CHOICE,\n ONCE YOU GO AHEAD..YOU CAN'T CHANGE IT?");
					if(choice == 0)
					{
						DecorTab.decorbooking = DecorTab.decorbooking+"\n\n"+ans;
					JOptionPane.showMessageDialog(null,"YOUR DECORATION BOOKING STATUS : "+DecorTab.decorbooking);
					DecorTab.totaldecorprice += ltotal;
					dcs = new DecorStorage(DecorTab.decorbooking,DecorTab.totaldecorprice);
					book.setEnabled(false);
					}
				}
			}
			else if(no.isSelected())
			{
				ans = "YOUR DECORATION DOESN'T INCLUDE LIGHTS";
				DecorTab.decorbooking = DecorTab.decorbooking+"\n\n"+ans;
				JOptionPane.showMessageDialog(null,DecorTab.decorbooking);
				book.setEnabled(false);

			}
			
		}
	}
}
