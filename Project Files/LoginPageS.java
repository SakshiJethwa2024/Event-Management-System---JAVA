import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Logins extends JFrame 
{
	Logins(String s)
	{
		super(s);
		setLayout(null);
      setContentPane(new JLabel(new ImageIcon("src//images//loginbg.jpeg")));
        
        JPanel heading = new JPanel();
        heading.setBounds(0,0,1400,140);
        add(heading);
        JLabel pic = new JLabel(new ImageIcon("src//images//tvm3re3.png"));
		heading.add(pic);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//      setSize(1600,900);
      setExtendedState(MAXIMIZED_BOTH);

	}
}






public class LoginPageS
{
	public static void main(String[] args) 
	{
		Logins login = new Logins("THE VELVET MOMENTS");
		login.setVisible(true);
	}
}
