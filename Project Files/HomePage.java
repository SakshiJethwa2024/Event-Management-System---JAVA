import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Home extends JFrame implements ActionListener
{
	JButton register,login;
	Home(String s)
	{
		super(s);
		setLayout(null);
		
		setContentPane(new JLabel(new ImageIcon("images//imgnew.jpg")));
		
		
		login = new JButton("LOGIN");
		register = new JButton("REGISTER");
		
		JLabel user = new JLabel("NEW USER ? SIGN UP !");
		
		login.setBounds(450,500,150,30);
		login.setToolTipText("Sign in if already registered");
		login.setBackground(Color.white);
		login.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,15));
		login.setForeground(Color.black);
		login.setFocusable(true);
		add(login);
		
		register.setBounds(680,500,150,30);
		register.setToolTipText("Sign up if not registered");
		register.setBackground(Color.white);
		register.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,15));
		register.setForeground(Color.black);
		register.setFocusable(true);
		add(register);
		
		user.setBounds(570,550,150,20);
		add(user);
		
		register.addActionListener(this);
		login.addActionListener(this);
		
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		
		if(s.equals("REGISTER"))
		{
			setVisible(false);
			RegisterPage rp = new RegisterPage("THE VELVET MOMENTS !!");
			rp.setVisible(true);
		}
		else if(s.equals("LOGIN"))
		{
			setVisible(false);
			Login lg = new Login("THE VELVET MOMENTS !!");
			lg.setVisible(true);
		}
	}
}

public class HomePage
{
	public static void main(String[] args)
	{
		Home h = new Home("WELCOME TO THE VELVET MOMENTS !!");
		h.setVisible(true);
	}
}