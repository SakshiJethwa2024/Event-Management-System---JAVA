import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SeatingDecor extends JPanel implements ActionListener
{
	JLabel title,number,price,label;
	JTextField guest,total;
	Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,25);
	Font ff = new Font("Arial Rounded MT BOLD",Font.PLAIN,15);
	double guestcount;
	JButton book;
	String ans,totalprice;
	DecorStorage dcs;
	
	SeatingDecor()
	{
		setLayout(null);
		setBackground(new Color(193,179,215));
		 
		title = new JLabel("SEATING ARRANGEMENT");
		title.setBounds(250,50,550,30);
		title.setFont(f);
		title.setForeground(Color.black);
		add(title);
		
		number = new JLabel("ENTER NUMBER OF GUESTS : ");
		number.setBounds(150,160,400,30);
		number.setFont(f);
		number.setForeground(Color.black);
		add(number);
		
		guest = new JTextField("0");
		guest.setBounds(570,160,150,30);
		guest.setFont(f);
		guest.setForeground(Color.black);
		guest.setBackground(Color.white);
		guest.setEditable(false);
		add(guest);
		
		label = new JLabel("(Press Enter to know the price for your entered number of guests)");
		label.setBounds(200,220,600,30);
		label.setFont(ff);
		label.setForeground(Color.black);
		add(label); 
		
		price = new JLabel("PRICE : ");
		price.setBounds(280,300,150,30);
		price.setFont(f);
		price.setForeground(Color.black);
		add(price);
		
		guestcount = Double.parseDouble(guest.getText()) * 50;
		
		total = new JTextField(""+guestcount);
		total.setBounds(430,300,150,30);
		total.setFont(f);
		total.setForeground(Color.black);
		total.setBackground(Color.white);
		total.setEditable(false);
		total.setText(""+guestcount);
		add(total);
		
		  book = new JButton("BOOK");
		  book.setBounds(340,390,200,40);
		  book.setBackground(Color.white);
		  book.setForeground(Color.black);
		  book.setFont(f);
		  add(book);
		  
		 book.addActionListener(this);
		
		guest.addActionListener(this);
		
		guest.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me)
			{
				guest.setEditable(true);
				guest.setText("");
			}
			public void mouseExited(MouseEvent me)
			{
				guest.setEditable(false);
			}
		});
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == guest)
		{
			guestcount = Double.parseDouble(guest.getText()) * 50;
			total.setText(""+guestcount);
		}
		
		if(ae.getActionCommand() == "BOOK")
		{
			if(guest.getText().equals("") || guest.getText().equals("0"))
			{
				JOptionPane.showMessageDialog(null,"PLEASE ENTER NUMBER OF GUESTS !!");
			}
			else
			{
				ans = guest.getText().toString();
				totalprice = total.getText().toString();
				DecorTab.decorbooking = DecorTab.decorbooking+"\n\n SEATING ARRANGEMENT INCLUDED FOR "+ans+" GUESTS \n WHICH WILL COST RS."+totalprice;
				
				int choice = JOptionPane.showConfirmDialog(null,"ARE YOU SURE YOU WANT TO CONTINUE WITH THIS CHOICE,\n ONCE YOU GO AHEAD..YOU CAN'T CHANGE IT?");
				if(choice == 0)
				{
				JOptionPane.showMessageDialog(null,"YOUR DECORATION BOOKING STATUS : "+DecorTab.decorbooking);
				DecorTab.totaldecorprice +=Double.parseDouble(total.getText());
				dcs = new DecorStorage(DecorTab.decorbooking,DecorTab.totaldecorprice);
				book.setEnabled(false);
				}
			}
		}
	}
}
