import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Profile extends JFrame implements ActionListener
{
    JTextField originalName;
    JTextField emailId;
    JTextField contactNumber;
    JTextField username;
    JTextField password;
    JLabel warningLabel;
    JButton updateButton;
    JButton editButton;
    String user;
    String contact="",email="",password1="",name="";
    String upname="",upuser="",uppass="",upemail="",upcontact="";
    Font font1 = new Font("Arial Rounded MT BOLD",Font.PLAIN,17);
    Font font2 = new Font("Arial Rounded MT BOLD",Font.PLAIN,20);
    Font font3 = new Font("Arial Rounded MT BOLD",Font.ITALIC,17);
    Color creamColor = new Color(246, 238, 219);
    Color greenColor = new Color(14,94,119);

    Profile(String s,String user)
    {
    	super(s);
        this.user = user;
    
    	try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("\n DRIVER CONNECTED ");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tvm_user","root","");
			
			System.out.print("\n DATABASE CONNECTED ");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select name,password,email,contact from userinfo where username='"+user+"'");
			
			if(rs.next())
			{
				name = rs.getString("name");
				password1 = rs.getString("password");
				contact = rs.getString("contact");
				email = rs.getString("email");
			}
			rs.close();
    
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600);
        setLocation(350,50);

        JLabel headingLabel = new JLabel("MY PROFILE",JLabel.CENTER);
        headingLabel.setOpaque(true);
        headingLabel.setSize(600,100);
        headingLabel.setBackground(new Color(4, 53, 68, 223));
        headingLabel.setForeground(creamColor);
        headingLabel.setFont(font2);


        ImageIcon backGroundImage = new ImageIcon("Background.jpeg");
        Image img = backGroundImage.getImage();
        Image temp_img = img.getScaledInstance(600,600,Image.SCALE_SMOOTH);
        backGroundImage = new ImageIcon(temp_img);

        JLabel originalLabel = new JLabel("Full Name ");
        originalLabel.setFont(font2);
        originalLabel.setForeground(greenColor);
        originalLabel.setBounds(50,50,200,40);

        originalName = new JTextField(name);
        originalName.setBounds(200,50,300,40);
        originalName.setBackground(creamColor);
        originalName.setBorder(BorderFactory.createLineBorder(greenColor,2));
        originalName.setFont(font3);
        originalName.setForeground(new Color(4, 53, 68, 150));
        originalName.setCaretColor(greenColor);
        originalName.setEditable(false);


        JLabel userLabel = new JLabel("Username ");
        userLabel.setFont(font2);
        userLabel.setForeground(greenColor);
        userLabel.setBounds(50,110,200,40);

        username = new JTextField(user);
        username.setBounds(200,110,300,40);
        username.setBackground(creamColor);
        username.setBorder(BorderFactory.createLineBorder(greenColor,2));
        username.setFont(font3);
        username.setForeground(new Color(4, 53, 68, 150));
        username.setCaretColor(greenColor);
        username.setEditable(false);

        JLabel passwordLabel = new JLabel("Password ");
        passwordLabel.setFont(font2);
        passwordLabel.setForeground(greenColor);
        passwordLabel.setBounds(50,170,200,40);

        password = new JTextField(password1);
        password.setBounds(200,170,300,40);
        password.setBackground(creamColor);
        password.setBorder(BorderFactory.createLineBorder(greenColor,2));
        password.setFont(font3);
        password.setForeground(new Color(4, 53, 68, 150));
        password.setCaretColor(greenColor);
        password.setEditable(false);

        JLabel emailLabel = new JLabel("Email Id");
        emailLabel.setFont(font2);
        emailLabel.setForeground(greenColor);
        emailLabel.setBounds(50,230,200,40);

        emailId = new JTextField(email);
        emailId.setBounds(200,230,300,40);
        emailId.setBackground(creamColor);
        emailId.setBorder(BorderFactory.createLineBorder(greenColor,2));
        emailId.setFont(font3);
        emailId.setForeground(new Color(4, 53, 68, 150));
        emailId.setCaretColor(greenColor);
        emailId.setEditable(false);

        JLabel contactLabel = new JLabel("Contact");
        contactLabel.setFont(font2);
        contactLabel.setForeground(greenColor);
        contactLabel.setBounds(50,290,200,40);

        contactNumber = new JTextField(contact);
        contactNumber.setBounds(200,290,300,40);
        contactNumber.setBackground(creamColor);
        contactNumber.setBorder(BorderFactory.createLineBorder(greenColor,2));
        contactNumber.setFont(font3);
        contactNumber.setForeground(new Color(4, 53, 68, 150));
        contactNumber.setCaretColor(greenColor);
        contactNumber.setEditable(false);

        editButton = new JButton("Edit");
        editButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        editButton.setFocusable(false);
        editButton.setForeground(creamColor);
        editButton.setBackground(greenColor);
        editButton.setFont(font1);
        editButton.setBounds(150,370,150,40);
        editButton.addActionListener(this);

        updateButton = new JButton("Update");
        updateButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        updateButton.setFocusable(false);
        updateButton.setEnabled(false);
        updateButton.setForeground(creamColor);
        updateButton.setBackground(greenColor);
        updateButton.setFont(font1);
        updateButton.setBounds(310,370,150,40);
        updateButton.addActionListener(this);

        JPanel profilePanel = new JPanel();
        profilePanel.setLayout(null);
        profilePanel.setBackground(new Color(0, 0, 0, 0));
        profilePanel.setBounds(0,100,600,500);
        profilePanel.add(originalLabel);
        profilePanel.add(originalName);
        profilePanel.add(userLabel);
        profilePanel.add(username);
        profilePanel.add(passwordLabel);
        profilePanel.add(password);
        profilePanel.add(emailLabel);
        profilePanel.add(emailId);
        profilePanel.add(contactLabel);
        profilePanel.add(contactNumber);
        profilePanel.add(editButton);
        profilePanel.add(updateButton);

        warningLabel = new JLabel("Enter valid Information !!!");
        warningLabel.setBounds(100,500,600,40);
        warningLabel.setFont(font2);
        warningLabel.setForeground(Color.RED);
        warningLabel.setVisible(false);

        JLabel background = new JLabel("",backGroundImage,JLabel.CENTER);
        background.add(headingLabel);
        background.add(profilePanel);
        background.add(warningLabel);
        background.setBorder(BorderFactory.createLineBorder(greenColor,3));

        add(background);
        setResizable(false);
        setVisible(true);
		}
    	catch(Exception exp)
    	{
    		System.out.println("ERROR : "+exp.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()== editButton){
            originalName.setEditable(true);
            username.setEditable(true);
            password.setEditable(true);
            emailId.setEditable(true);
            contactNumber.setEditable(true);
            originalName.setFont(font1);
            originalName.setForeground(greenColor);
            username.setFont(font1);
            username.setForeground(greenColor);
            password.setFont(font1);
            password.setForeground(greenColor);
            emailId.setFont(font1);
            emailId.setForeground(greenColor);
            contactNumber.setFont(font1);
            contactNumber.setForeground(greenColor);
           
            updateButton.setEnabled(true);
        }
        if(e.getSource() == updateButton){
            originalName.setFont(font3);
            originalName.setForeground(new Color(4, 53, 68, 150));
            username.setFont(font3);
            username.setForeground(new Color(4, 53, 68, 150));
            password.setFont(font3);
            password.setForeground(new Color(4, 53, 68, 150));
            emailId.setFont(font3);
            emailId.setForeground(new Color(4, 53, 68, 150));
            contactNumber.setFont(font3);
            contactNumber.setForeground(new Color(4, 53, 68, 150));
            
            try
            {
            	Class.forName("com.mysql.jdbc.Driver");
    			System.out.print("\n DRIVER CONNECTED ");
    			
    			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tvm_user","root","");
    			
    			System.out.print("\n DATABASE CONNECTED ");
    			
    			Statement st = con.createStatement();
    			
    			upname = originalName.getText();
    			upuser = username.getText();
    			uppass = password.getText();
    			upemail = emailId.getText();
    			upcontact = contactNumber.getText();
    			
    			String query = "update userinfo set name='"+upname+"',username='"+upuser+"',password='"+uppass+"',confirm_pass='"+uppass+"',email='"+upemail+"',contact='"+upcontact+"' where username='"+user+"'";
    			
    			st.executeUpdate(query);
    			
    			JOptionPane.showMessageDialog(null,"YOUR DATA HAS BEEN UPDATED !!");
            }
            catch(Exception exp)
            {
            	System.out.println("ERROR : "+exp.getMessage());
            }
            
            originalName.setEditable(false);
            username.setEditable(false);
            password.setEditable(false);
            emailId.setEditable(false);
            contactNumber.setEditable(false);
            
            
            Start start = new Start("THE VELVET MOMENTS",upuser);
            start.setVisible(true);
            dispose();
        }
    }
}

public class ProfilePage
{
    public static void main(String[] args) {
        Profile myProfile = new Profile("THE VELVET MOMENTS","Sakshi");
    }
}
