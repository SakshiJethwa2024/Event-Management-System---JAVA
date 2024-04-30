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

public class ThemeTab extends JPanel implements ActionListener
{
  JRadioButton flower,balloon;
  JLabel title,enter;
  Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,25);
  Font ff = new Font("Arial Rounded MT BOLD",Font.BOLD,30);
  ButtonGroup g1 = new ButtonGroup();
  JTextField theme;
  JButton book;
  String selection,th;
  DecorStorage dcs;
  
  ThemeTab()
  {
	  setLayout(null);
	  setBackground(new Color(193,179,215));
	  
	  title = new JLabel("SELECT YOUR EVENT THEME !!");
	  title.setBounds(250,50,450,30);
	  title.setFont(f);
	  title.setForeground(Color.black);
	  add(title);
	  
	  enter = new JLabel("ENTER YOUR THEME : ");
	  enter.setBounds(150,150,500,40);
	  enter.setFont(ff);
	  enter.setForeground(Color.black);
	  
	  
	  theme = new JTextField();
	  theme.setBounds(550,150,300,40);
	  theme.setFont(f);
	  theme.setBackground(Color.white);
	  
	  add(enter); add(theme);
	  
	  flower = new JRadioButton("FLOWER DECOR");
	  balloon = new JRadioButton("BALLOON DECOR");
	  
	  flower.setBounds(150,230,300,40);
	  balloon.setBounds(150,300,300,40);
	  
	  flower.setOpaque(false);
	  balloon.setOpaque(false);
	  flower.setFont(f);
	  balloon.setFont(f);
	  add(flower); add(balloon);
	  g1.add(flower);  g1.add(balloon);
	  
	  book = new JButton("BOOK");
	  book.setBounds(370,380,200,40);
	  book.setBackground(Color.white);
	  book.setForeground(Color.black);
	  book.setFont(f);
	  add(book);
	  
	 book.addActionListener(this);
	  
  }
  public void actionPerformed(ActionEvent ae)
  {
	 if(ae.getActionCommand() == "BOOK")
	 {
		 th = theme.getText().toString();
		 if(th.equals(""))
		 {
			 JOptionPane.showMessageDialog(null,"PLEASE ENTER A THEME");
		 }
		 else
		 {
			 if(flower.isSelected())
			 {
				 selection = "FLOWER";
			 }
			 else if(balloon.isSelected())
			 {
				 selection = "BALLOON";
			 }
			 
			 if(flower.isSelected() || balloon.isSelected())
			 {
			 int ch = JOptionPane.showConfirmDialog(null,"ARE YOU SURE YOU WANT TO CONTINUE WITH THIS THEME,\n ONCE YOU GO AHEAD..YOU CAN'T CHANGE IT?");
			 if(ch == 0)
			 {
				 th = th+" THEME IN "+selection+" TYPE";
				 DecorTab.decorbooking = DecorTab.decorbooking+"\n"+th;
			     JOptionPane.showMessageDialog(null,"YOUR THEME HAS BEEN SET TO : "+DecorTab.decorbooking);
			     DecorTab.totaldecorprice += 0;
					dcs = new DecorStorage(DecorTab.decorbooking,DecorTab.totaldecorprice);
			 book.setEnabled(false);
			 }
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(null,"PLEASE CHOOSE DECOR TYPE !!");
			 }
		 }
	 }
  }
}
