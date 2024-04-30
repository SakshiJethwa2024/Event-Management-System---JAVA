import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Tnx extends JFrame 
{
	Tnx(String s)
	{
		super(s);
		setLayout(null);
		setContentPane(new JLabel(new ImageIcon("images//thankyou.jpeg")));
		setVisible(true);
		
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}


public class TnxPage {

	public static void main(String[] args) {
		
		Tnx t = new Tnx("TVM");
		t.setVisible(true);
	}

}
