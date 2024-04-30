import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class DecorTab extends JPanel
{
	public static String decorbooking="";
	public static double totaldecorprice=0;
   public DecorTab()
   {
	   this.setVisible(false);
	   this.setLayout(null);
	   this.setBounds(300,150,1000,1200);
	   
	   JTabbedPane dectab = new JTabbedPane();
	   dectab.setBounds(0,0,940,520);
	   
	   dectab.addTab("THEME",new ThemeTab());
	   dectab.addTab("MANDAP",new Mandap());
	   dectab.addTab("STAGE",new Stage());
	   dectab.addTab("BACKGROUND SET",new BackgroundSet());
	   dectab.addTab("LIGHTS",new LightDecor());
	   dectab.addTab("SEATING",new SeatingDecor());
	   
	   dectab.setBackground(Color.white);
	   dectab.setFocusable(false);
       dectab.setFont(new Font("Arial Rounded MT BOLD",Font.PLAIN,15));
       dectab.setSelectedIndex(0);
       //dectab.setEnabled(false);
       
       
       this.add(dectab);
   }
}
/*public class DecorTab
{
	public static void main(String[] args)
	{
		DecorTab1 dt = new DecorTab1();
		dt.setVisible(true);
	}
	
}*/
