import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class RegisterPage extends JFrame implements ActionListener,ItemListener
{
	JTextField name,contact,username,dob,email;
	JTextArea address;
	JPasswordField password,conpass;
	JLabel name1,address1,contact1,username1,password1,conpass1,dob1,email1,rf;
	JPanel top,centre;
	JComboBox date,month,year;
	int n = 1;
	String s,d,y;
	
	RegisterPage(String s)
	{
		super(s);
		setLayout(null);
		
		Font f = new Font("Arial Rounded MT Bold",Font.BOLD,18);
		Font ff = new Font("Arial Rounded MT Bold",Font.PLAIN,16);
		setContentPane(new JLabel(new ImageIcon("images//rp.jpg")));
		
		top = new JPanel();
		top.setBounds(0,0,1400,140);
		top.setBackground(new Color(0,0,90,80));
		
		centre = new JPanel();
		centre.setBounds(200,180,880,450);
		centre.setBackground(new Color(0,0,10,80));
		centre.setPreferredSize(new Dimension(400,300));
		
	    add(top);  add(centre); 
	    JLabel pic = new JLabel(new ImageIcon("images//tvm3re3.png"));
		top.add(pic);
		
		
		rf = new JLabel("REGISTRATION");
		name1 = new JLabel("Enter Name :");
		address1 = new JLabel("Enter Address :");
		contact1 = new JLabel("Enter Contact Number :");
		dob1 = new JLabel("Enter Date of Birth :");
		email1 = new JLabel("Enter Email ID :");
		username1 = new JLabel("Enter Username :");
		password1 = new JLabel("Enter Password :");
		conpass1 = new JLabel("Confirm Password :");
		
		name = new JTextField();
		address = new JTextArea();
		contact = new JTextField();
		dob = new JTextField();
		email = new JTextField();
		username = new JTextField();
		password = new JPasswordField();
		conpass = new JPasswordField();
		
		date = new JComboBox();
		month = new JComboBox();
		year = new JComboBox();
		
		centre.setLayout(null);
		
		rf.setBounds(310,5,350,60);
		rf.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,30));
		rf.setForeground(Color.white);
		centre.add(rf);
		
		name1.setFont(f);
		name1.setForeground(Color.white);
		name1.setBounds(20,63,200,25);
		centre.add(name1);
		name.setBounds(20,93,370,25);
		name.setFont(ff);
		centre.add(name);
		
		address1.setFont(f);
		address1.setForeground(Color.white);
		address1.setBounds(20,138,200,25);
		centre.add(address1);
		address.setBounds(20,168,370,25);
		address.setFont(ff);
		centre.add(address);
		
		contact1.setFont(f);
		contact1.setForeground(Color.white);
		contact1.setBounds(20,213,250,25);
		centre.add(contact1);
		contact.setBounds(20,243,370,25);
		contact.setFont(ff);
		centre.add(contact);
		
		dob1.setFont(f);
		dob1.setForeground(Color.white);
		dob1.setBounds(20,288,200,25);
		centre.add(dob1);
		
		month.setBounds(20,318,110,25);
		month.setFont(f);
		date.setBounds(160,318,100,25);
		date.setFont(f);
		year.setBounds(290,318,100,25);
		year.setFont(f);
		
		date.addItem("DATE"); 
		month.addItem("MONTH"); month.addItem("Jan"); month.addItem("Feb"); month.addItem("Mar");
		month.addItem("Apr");  month.addItem("May");  month.addItem("June");  month.addItem("July"); month.addItem("Aug");
		month.addItem("Sept"); month.addItem("Oct"); month.addItem("Nov");  month.addItem("Dec");
		year.addItem("YEAR"); year.addItem("<1960");  year.addItem("1960-1970");  year.addItem("1971-1980"); year.addItem("1981-1990");
		year.addItem("1991-2000");  year.addItem("2001-2005"); year.addItem(">2005");
		month.addItemListener(this);
		date.addItemListener(this);
		year.addItemListener(this);
		
				
		centre.add(date); centre.add(month); centre.add(year);
		
		
		email1.setFont(f);
		email1.setForeground(Color.white);
		email1.setBounds(470,63,200,25);
		centre.add(email1);
		email.setBounds(470,93,370,25);
		email.setFont(ff);
		centre.add(email);
		
		username1.setFont(f);
		username1.setForeground(Color.white);
		username1.setBounds(470,138,200,25);
		centre.add(username1);
		username.setBounds(470,168,370,25);
		username.setFont(ff);
		centre.add(username);
		
		
		password1.setFont(f);
		password1.setForeground(Color.white);
		password1.setBounds(470,213,200,25);
		centre.add(password1);
		password.setBounds(470,243,370,25);
		password.setFont(ff);
		centre.add(password);
		
		conpass1.setFont(f);
		conpass1.setForeground(Color.white);
		conpass1.setBounds(470,288,200,25);
		centre.add(conpass1);
		conpass.setBounds(470,318,370,25);
		conpass.setFont(ff);
		centre.add(conpass);
		
		JButton submit,reset;
		submit = new JButton("SUBMIT");
		submit.setBounds(260,385,150,40);
		submit.setBackground(Color.white);
		submit.setFocusable(true);
		centre.add(submit);
		
		reset = new JButton("RESET");
		reset.setBounds(450,385,150,40);
		reset.setBackground(Color.white);
		reset.setFocusable(true);
		centre.add(reset);
		
		submit.addActionListener(this);
		reset.addActionListener(this);
		
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void itemStateChanged(ItemEvent ie) {
		if(ie.getSource() == month)
		{
			s = month.getSelectedItem().toString();
			if(s.equals("Jan") || s.equals("Mar") || s.equals("May") || s.equals("July") || s.equals("Aug") || s.equals("Oct") || s.equals("Dec"))
			{
				while(n != 32)
				{
					date.addItem(n);
					n++;
				}
			}
			else if(s.equals("Apr") || s.equals("June") || s.equals("Sept") || s.equals("Nov"))
			{
				while(n != 31)
				{
					date.addItem(n);
					n++;
				}
			}
			else
			{
				while(n != 30)
				{
					date.addItem(n);
					n++;
				}
			}
		}
		if(ie.getSource() == date)
		{
			d = date.getSelectedItem().toString();
		}
		if(ie.getSource() == year)
		{
			y = year.getSelectedItem().toString();
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals("SUBMIT"))
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.print("\n DRIVER CONNECTED ");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tvm_user","root","");
				
				System.out.print("\n DATABASE CONNECTED ");
				
				Statement st = con.createStatement();
				
				String uname="",uadd="",ucontact="",udate="",umonth="",uyear="",umail="",uuser="",upass="",uconpass="";
				
				uname = name.getText();
				uadd = address.getText();
				ucontact = contact.getText();
				
				int len = contact.getText().length();
				if(len != 10)
				{
					contact.setText("");
				}
			
				udate = d;
				umonth = s;
				uyear = y;
				umail = email.getText();
				uuser = username.getText();
				upass = password.getText().toString();
				uconpass = conpass.getText().toString();
				
				if(uconpass.equals(upass) == false)
				{
					password.setText("");
					conpass.setText("");
				}
			
		        if(uname.equals("") || uadd.equals("") || ucontact.equals("") || umail.equals("") || uuser.equals("") || upass.equals("") || uconpass.equals("") || len != 10 || uconpass.equals(upass) == false)
		        {
		        	JOptionPane.showMessageDialog(centre,"EITHER INVALID CONTACT OR INCORRECT PASSWORD MATCH ....PLEASE ENTER CORRECT INFORMATION");
		        }
		        else
		        {
				
				String query = "insert into userinfo values('"+uname+"','"+uadd+"','"+ucontact+"','"+udate+"','"+umonth+"','"+uyear+"','"+umail+"','"+uuser+"','"+upass+"','"+uconpass+"')";
				
				st.executeUpdate(query);
				
				JOptionPane.showMessageDialog(centre,"SUCCESFULL REGISTRATION");
				
				st.close();
				con.close();
				
				setVisible(false);
				Home h = new Home("THE VELVET MOMENTS");
				h.setVisible(true);
		        }
					
			}
			catch(Exception e)
			{
				System.out.println("ERROR : "+e.getMessage());
			}
		}
		
		else if(str.equals("RESET"))
		{
			name.setText("");
			address.setText("");
			contact.setText("");
			email.setText("");
			username.setText("");
			password.setText("");
			conpass.setText("");
		}
	}
}

class Register 
{
	public static void main(String args[])
	{
		RegisterPage rpg = new RegisterPage("THE VELVET MOMENTS");
		rpg.setVisible(true);
		
	}
}