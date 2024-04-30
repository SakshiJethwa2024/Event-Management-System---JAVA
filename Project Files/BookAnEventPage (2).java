import mainfront.TryPage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


class BookAnEvent extends JFrame implements ItemListener,ActionListener
{
	JPanel top,left;
	JComboBox cb,d,m,y;
	Border b;
	Font f,ff;
	JLabel l1,l2;
	JButton b1;
	String s="";
	int n=1;
	
	BookAnEvent(String str)
	{
		super(str);
		setExtendedState(MAXIMIZED_BOTH);
		setResizable(false);
		setLayout(null);
		setContentPane(new JLabel(new ImageIcon("src//mainbg.jpeg")));
		f = new Font("Arial Rounded MT Bold",Font.BOLD,30);
		ff = new Font("Arial Rounded MT Bold",Font.BOLD,40);
	    
		
		top = new JPanel();
		top.setBounds(0,0,1380,150);
		top.setBackground(new Color(51,153,255,80));
		b = BorderFactory.createLineBorder(new Color(0,0,0,90),10);
		top.setBorder(b);
		ImageIcon backGroundImage = new ImageIcon("src//tvm3re3.png");
		Image img = backGroundImage.getImage();
		Image temp_img = img.getScaledInstance(1600,140,Image.SCALE_SMOOTH);
		backGroundImage = new ImageIcon(temp_img);
	    JLabel pic = new JLabel(backGroundImage);
		top.add(pic);
		
		left = new JPanel();
		left.setBounds(0,150,350,700);
		left.setBackground(new Color(255,255,255));
		ImageIcon backGroundImage1 = new ImageIcon("src//I3.jpeg");
		Image img1 = backGroundImage1.getImage();
		Image temp_img1 = img1.getScaledInstance(350,700,Image.SCALE_SMOOTH);
		backGroundImage1 = new ImageIcon(temp_img1);
	    JLabel pic1 = new JLabel(backGroundImage1);
		left.add(pic1);
		
		cb = new JComboBox();
		cb.setBounds(850,200,380,55);
		cb.setFont(f);
	//    cb.setForeground(Color.white);
		cb.addItem("Birthday");
		cb.addItem("Wedding");
	    cb.addItem("Anniversary");
	    cb.addItem("Business Events");
	    cb.addItem("Family Functions");
	    
	    l1 = new JLabel("Select Your Event:");
	    l1.setForeground(Color.black);
	    l1.setBounds(400,200,500,50);
		l1.setFont(ff);
		
		l2 = new JLabel("Select The Date:");
	    l2.setForeground(Color.black);
	    l2.setBounds(400,400,500,50);
		l2.setFont(ff); 
		 
		b1 = new JButton("NEXT");
		b1.setBounds(700,650,200,50);
		b1.setFont(f);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		
		d = new JComboBox();
		m = new JComboBox();
		y = new JComboBox();
		m.setBounds(850,400,150,55);
		m.setFont(f);
		d.setBounds(1010,400,120,55);
		d.setFont(f);
		y.setBounds(1140,400,120,55);
		y.setFont(f);
		d.addItem("DATE");
		m.addItem("MONTH");
		y.addItem("YEAR");
		m.addItem("Jan");
		m.addItem("Feb");
		m.addItem("Mar");
		m.addItem("Apr");
		m.addItem("May");
		m.addItem("June");
		m.addItem("July");
		m.addItem("Aug");
		m.addItem("Sept");
		m.addItem("Oct");
		m.addItem("Nov");
		m.addItem("Dec");
		m.addItemListener(this);
		y.addItem("2023");
		d.addItemListener(this);
		y.addItemListener(this);
		b1.addActionListener(this);
		
		
		
	    add(top);
		add(left);
		add(cb);
		add(l1);
		add(l2);
		add(b1);
		add(m);
		add(d);
		add(y);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	public void itemStateChanged(ItemEvent ie) {
		
		if(ie.getSource() == m)
		{
			s= m.getSelectedItem().toString();
			if(s.equals("Jan") || s.equals("Mar") || s.equals("May") || s.equals("July") || s.equals("Aug") || s.equals("Oct") || s.equals("Dec"))
			{
				while(n != 32)
				{
					d.addItem(n);
					n++;
				}
			}
			else if(s.equals("Apr") || s.equals("June") || s.equals("Sept") || s.equals("Nov"))
			{
				while(n != 31)
				{
					d.addItem(n);
					n++;
				}
			}
			else
			{
				while(n != 29)
				{
					d.addItem(n);
					n++;
				}
			}
		}
		
	}


	
	public void actionPerformed(ActionEvent e) {
		String ss = (String) m.getSelectedItem();
		
		if(e.getSource() == b1)
		{
			if(m.getSelectedItem() != null && !ss.equals("MONTH"))
			{
			setVisible(false);
			TryPage tp = new TryPage("TVM");
			tp.setVisible(true);
		}
		}
		
	}
}
public class BookAnEventPage {

	public static void main(String[] args) {
		
		BookAnEvent bne = new BookAnEvent("THE VELVET MOMENTS");
		bne.setVisible(true);
		
	}

}
