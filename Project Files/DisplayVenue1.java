import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DisplayVenue1 extends JFrame{
	JLabel up,photo;
	JTextArea details,small;
	JButton book;
	Venue currentlyselected;
	DisplayVenue1(Venue v){
	this.setBounds(300,50,800,650);
	this.setVisible(true);
	//this.setBackground(new Color(224,243,176,20));
    this.setContentPane(new JLabel(new ImageIcon("src//pic1.jpeg")));
	this.setLayout(null);
	this.currentlyselected=v;
	 
	up=new JLabel(""+v.name);
	up.setBounds(100,0,500,100);
	
	up.setBorder(BorderFactory.createBevelBorder(4));
	Font f=new Font("HP Simplified",Font.BOLD ,42);
	Map attributes = f.getAttributes();
	attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
	up.setFont(f.deriveFont(attributes));
	this.add(up);
	
	photo=new JLabel(v.ii);
	photo.setBounds(360, 100, 400, 200);
	this.add(photo);
	
	small=new JTextArea();
	small.setBounds(10,100,300,200);
	//small.setBackground(new Color(0,0,0,10));
	small.setFont(new Font("Berlin Sans FB",Font.PLAIN,20));
    small.setText("\n\nRatings : "+v.ratings+"/5\n\nArea(covered in square ft) : \n"+  v.squarefeetarea+" sq ft\n\n");
    small.setEditable(false);
    //small.setEnabled(false);
    this.add(small);
	
	
	details=new JTextArea();
	details.setBounds(10,320,770,230);
	//details.setBackground(new Color(0,0,0,10));
	details.setFont(new Font("Berlin Sans FB",Font.PLAIN,20));
	details.setText("\nAddress/Location : "+v.location+"\nDetails : "+v.extrainfo+"\n\nPRICE : 		    Distinguish Features : \nhalf day : "+v.pricehalfday+"	    	* "+v.df1+"\nfull day : "+v.pricefullday+"	    	* "+v.df2);
	this.add(details);
	details.setEditable(false);
	
	book=new JButton("Book this");
	book.setFont(new Font("Arial",Font.BOLD,20));
	book.setBounds(530,550,130,30);
	book.setBackground(Color.black);
	book.setForeground(Color.white);
	this.add(book);
	
	BookEventDialouge bed = new BookEventDialouge(this);
	book.addActionListener(bed);
	
	
	}
	
	
	
}

