import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;


class Login extends JFrame implements ActionListener
{
	JPanel heading,login;
    JButton loginButton,create;
    JTextField username;
    JPasswordField password;
    JLabel warningLabel,title,account;
    Font font1 = new Font("Arial Rounded MT BOLD",Font.BOLD,21);
    Font font2 = new Font("Arial Rounded MT BOLD",Font.PLAIN,20);
    Font font3 = new Font("Arial Rounded MT BOLD",Font.ITALIC,20);

    Login(String s)
    {
        super(s);
        setLayout(null);

        setContentPane(new JLabel(new ImageIcon("images//loginbg.jpeg")));
        
        heading = new JPanel();
        heading.setBounds(0,0,1400,140);
        add(heading);
        JLabel pic = new JLabel(new ImageIcon("images//tvm3re3.png"));
		heading.add(pic);
	

        login = new JPanel();
        login.setLayout(null);
        login.setBackground(new Color(0,0,0,80));
        login.setBounds(390,200,500,400);
        add(login);
        
        title = new JLabel("SIGN IN TO CONTINUE");
        title.setBounds(80,10,350,40);
        title.setFont(new Font("Arial Rounded MT BOLD",Font.BOLD,30));
        title.setForeground(Color.white);
        login.add(title);

        JLabel userLabel = new JLabel("Username ");
        userLabel.setFont(font1);
        userLabel.setForeground(Color.WHITE);
        userLabel.setBounds(30,100,200,50);

        username = new JTextField("username");
        username.setBounds(160,100,300,50);
        username.setBackground(Color.WHITE);
        username.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        username.setFont(font1);
        username.setForeground(new Color(0,0,0,80));
        username.setCaretColor(Color.BLACK);
        username.setEditable(false);
        username.addMouseListener(new MouseAdapter() {
          
            public void mouseEntered(MouseEvent e) {

            }

            public void mouseClicked(MouseEvent e) {
                if(username.getText().equals("username")){
                    username.setText("");
                    username.setForeground(Color.BLACK);
                    username.setCaretColor(Color.BLACK);
                    username.setFont(font2);
                    username.setBorder(BorderFactory.createLoweredSoftBevelBorder());
                }
                username.setEditable(true);
            }

            public void mouseReleased(MouseEvent e) {
                username.setEditable(false);
            }

            public void mouseExited(MouseEvent e) {
                if(username.getText().equals("")){
                    username.setText("username");
                    username.setForeground(new Color(0,0,0,100));
                    username.setFont(font1);
                }
                username.setEditable(false);
                username.setCaretColor(Color.BLACK);
                username.setBorder(BorderFactory.createRaisedSoftBevelBorder());

            }
        });
        login.add(userLabel);
        login.add(username);

        JLabel passwordLabel = new JLabel("Password ");
        passwordLabel.setFont(font1);
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(30,200,200,50);

        password = new JPasswordField("PASSWORD",8);
        password.setBounds(160,200,300,50);
        password.setBackground(Color.WHITE);
        password.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        password.setFont(font1);
        password.setForeground(Color.BLACK);
        password.setCaretColor(Color.WHITE);

        password.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {

            }

            public void mouseClicked(MouseEvent e) {
                if(password.getText().toString().equals("PASSWORD")){
                    password.setText("");
                    password.setForeground(Color.BLACK);
                    password.setCaretColor(Color.BLACK);
                    password.setFont(font1);
                    password.setBorder(BorderFactory.createLoweredSoftBevelBorder());
                }
                password.setEditable(true);
            }

            public void mouseReleased(MouseEvent e) {
                password.setEditable(false);
            }

            public void mouseExited(MouseEvent e) {
                if(password.getText().equals("") || password.getText().equals("PASSWORD")){
                    password.setText("PASSWORD");
                    password.setForeground(new Color(0,0,0,100));
                    password.setFont(font1);
                }
                password.setEditable(false);
                password.setCaretColor(Color.BLACK);
                password.setBorder(BorderFactory.createRaisedSoftBevelBorder());

            }
        });

        login.add(passwordLabel);
        login.add(password);

        loginButton = new JButton("LOGIN");
        loginButton.setBounds(180,300,150,40);
        loginButton.setBackground(Color.WHITE);
        loginButton.setForeground(Color.BLACK);
        loginButton.setFont(font1);
        loginButton.setFocusable(false);
        
        loginButton.addActionListener(this);
        login.add(loginButton);
        
        create = new JButton("CREATE");
        create.setBounds(340,365,140,25);
        create.setBackground(Color.WHITE);
        create.setForeground(Color.BLACK);
        create.setFont(font1);
        login.add(create);
        
        create.addActionListener(this);
        
        account = new JLabel("DON'T HAVE AN ACCOUNT? CREATE NOW ");
        account.setFont(new Font("Arial Rounded MT BOLD",Font.PLAIN,15));
        account.setForeground(Color.WHITE);
        account.setBounds(5,353,400,50);
        login.add(account);

        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
    }
   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton)
        {
            if (username.getText().equals("username") || password.getText().equals("PASSWORD"))
            {
            	JOptionPane.showMessageDialog(login,"PLEASE ENTER CORRECT USERNAME AND PASSWORD");
            }
            else
            {
                try
    			{
    				Class.forName("com.mysql.jdbc.Driver");
    				System.out.print("\n DRIVER CONNECTED ");
    				
    				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tvm_user","root","");
    				
    				System.out.print("\n DATABASE CONNECTED ");
    				
    				Statement st = con.createStatement();
    				
    				String uuser = username.getText();
    				String upass = password.getText().toString();
    				
    				String query = "select * from userinfo where username = '"+uuser+"' and password = '"+upass+"'";
    				
    				ResultSet rs = st.executeQuery(query);
    				
    				if(rs.next())
    				{
    					setVisible(false);
    					Start hh = new Start("THE VELVET MOMENTS",uuser);
    					hh.setVisible(true);
    				}
    				else
    				{
    					JOptionPane.showMessageDialog(login,"INCORRECT USERNAME OR PASSWORD");
    					username.setText("");
    					password.setText("");
    				}
    				
    			}
                catch(Exception exp)
                {
                	System.out.println("ERROR : "+exp.getMessage());
                }
            }
        }
        else if(e.getSource() == create)
        {
        	setVisible(false);
        	RegisterPage rp = new RegisterPage("THE VELVET MOMENTS !!");
			rp.setVisible(true);
        }
    }

}

public class LoginPage
{
    public static void main(String[] args)
    {
        Login login = new Login("Login Page");
        login.setVisible(true);
    }
}
