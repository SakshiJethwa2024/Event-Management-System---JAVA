import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Final extends JFrame implements ActionListener
{
	JPanel heading;
	JLabel deets,venue,venueprice,food,foodprice,music,musicprice,decoration,decorprice,photography,photoprice,total,username,edate;
	JTextField vprice,mprice,pname,pprice,fprice,dprice,tprice;
	JTextArea vname,fname,dname,mname;
	JScrollPane jsp,jsp2,jsp3,jsp4;
	String user,date;
	JButton complete;
	
	
	Font f = new Font("Arial Rounded MT BOLD",Font.BOLD,25);
	Font ff = new Font("Arial Rounded MT BOLD",Font.BOLD,10);
	
	Final(String s,String user,String date)
	{
		super(s);
		this.user = user;
		this.date = date;
		setLayout(null);
		setContentPane(new JLabel(new ImageIcon("images//mainbg.jpg")));
		
		heading = new JPanel();
        heading.setBounds(0,0,1400,140);
        add(heading);
        JLabel pic = new JLabel(new ImageIcon("images//tvm3re3.png"));
		heading.add(pic);
		
		deets = new JLabel("YOUR BOOKING DETAILS ");
		deets.setBounds(420,150,500,30);
		deets.setFont(new Font("Arial Rounded MT BOLD",Font.BOLD,35));
		deets.setForeground(Color.black);
		add(deets);
		
		username = new JLabel(user+" - ");
		username.setBounds(200,150,300,30);
		username.setFont(new Font("Arial Rounded MT BOLD",Font.BOLD,35));
		username.setForeground(Color.black);
		add(username);
		
		edate = new JLabel(" FOR "+date);
		edate.setBounds(920,150,400,30);
		edate.setFont(new Font("Arial Rounded MT BOLD",Font.BOLD,35));
		edate.setForeground(Color.black);
		add(edate);
		
		venue = new JLabel("VENUE : ");
		venue.setBounds(40,220,150,30);
		venue.setFont(f);
		venue.setForeground(Color.black);
		add(venue);
		
		vname = new JTextArea();
		vname.setBounds(160,225,300,70);
		vname.setFont(f);
		vname.setForeground(Color.black);
		vname.setEditable(false);
		jsp4 = new JScrollPane();
		jsp4.setBounds(160,225,300,70);
//		jsp4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jsp4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp4.getViewport().add(vname);
		jsp4.setVisible(true);
		add(jsp4);
//		add(vname);
		
		venueprice = new JLabel("PRICE : ");
		venueprice.setBounds(490,220,150,40);
		venueprice.setFont(f);
		venueprice.setForeground(Color.black);
		add(venueprice);
		
		vprice = new JTextField();
		vprice.setBounds(610,225,200,30);
		vprice.setFont(f);
		vprice.setForeground(Color.black);
		vprice.setEditable(false);
		add(vprice);
		
		food = new JLabel("FOOD : ");
		food.setBounds(40,330,150,40);
		food.setFont(f);
		food.setForeground(Color.black);
		add(food);
		
		fname = new JTextArea();
		fname.setBounds(160,335,300,150);
		fname.setFont(ff);
		fname.setForeground(Color.black);
		fname.setEditable(false);
		jsp = new JScrollPane();
		jsp.setBounds(160,335,300,150);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.getViewport().add(fname);
		jsp.setVisible(true);
		add(jsp);
		
		foodprice = new JLabel("PRICE : ");
		foodprice.setBounds(490,330,150,40);
		foodprice.setFont(f);
		foodprice.setForeground(Color.black);
		add(foodprice);
		
		fprice = new JTextField();
		fprice.setBounds(610,335,200,30);
		fprice.setFont(f);
		fprice.setForeground(Color.black);
		fprice.setEditable(false);
		add(fprice);
		
		music = new JLabel("MUSIC : ");
		music.setBounds(40,490,150,40);
		music.setFont(f);
		music.setForeground(Color.black);
		add(music);
		
		mname = new JTextArea();
		mname.setBounds(160,495,300,70);
		mname.setFont(f);
		mname.setForeground(Color.black);
		mname.setEditable(false);
		jsp3 = new JScrollPane();
		jsp3.setBounds(160,495,300,70);
//		jsp3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jsp3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp3.getViewport().add(mname);
		jsp3.setVisible(true);
		add(jsp3);
//		add(mname);
		
		musicprice = new JLabel("PRICE : ");
		musicprice.setBounds(490,490,150,40);
		musicprice.setFont(f);
		musicprice.setForeground(Color.black);
		add(musicprice);
		
		mprice = new JTextField();
		mprice.setBounds(610,495,200,30);
		mprice.setFont(f);
		mprice.setForeground(Color.black);
		mprice.setEditable(false);
		add(mprice);
		
		/*photography = new JLabel("PHOTOGRAPHY : ");
		photography.setBounds(40,520,250,40);
		photography.setFont(f);
		photography.setForeground(Color.black);
		add(photography);
		
		pname = new JTextField();
		pname.setBounds(290,525,300,30);
		pname.setFont(f);
		pname.setForeground(Color.black);
		pname.setEditable(false);
		add(pname);*/
		
		photoprice = new JLabel("PHOTOGRAPHY PRICE : ");
		photoprice.setBounds(40,580,350,40);
		photoprice.setFont(f);
		photoprice.setForeground(Color.black);
		add(photoprice);
		
		pprice = new JTextField();
		pprice.setBounds(380,585,200,30);
		pprice.setFont(f);
		pprice.setForeground(Color.black);
		pprice.setEditable(false);
		add(pprice);
		
		decoration = new JLabel("DECORATION : ");
		decoration.setBounds(870,220,250,40);
		decoration.setFont(f);
		decoration.setForeground(Color.black);
		add(decoration);
		
		dname = new JTextArea();
		dname.setBounds(870,275,300,150);
		dname.setFont(ff);
		dname.setForeground(Color.black);
		dname.setEditable(false);
		jsp2 = new JScrollPane();
		jsp2.setBounds(870,275,300,150);
		jsp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jsp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp2.getViewport().add(dname);
		jsp2.setVisible(true);
		add(jsp2);
		
		decorprice = new JLabel("DECORATION PRICE : ");
		decorprice.setBounds(870,440,450,40);
		decorprice.setFont(f);
		decorprice.setForeground(Color.black);
		add(decorprice);
		
		dprice = new JTextField();
		dprice.setBounds(870,490,200,30);
		dprice.setFont(f);
		dprice.setForeground(Color.black);
		dprice.setEditable(false);
		add(dprice);
		
        complete = new JButton("COMPLETE");
		complete.setBounds(620,580,200,40);
		complete.setFont(f);
		complete.setBackground(Color.white);
		complete.setForeground(Color.black);
		add(complete);
		complete.addActionListener(this);
		
		total = new JLabel("TOTAL PRICE : ");
		total.setBounds(870,550,250,40);
		total.setFont(f);
		total.setForeground(Color.black);
		add(total);
		
		tprice = new JTextField();
		tprice.setBounds(870,590,300,30);
		tprice.setFont(f);
		tprice.setForeground(Color.black);
		tprice.setEditable(false);
		add(tprice);
		
		
		
		
		
		    if(BookingDetails.v!=null) 
		    {
			     vname.setText(""+BookingDetails.v.name);
			     vprice.setText(""+BookingDetails.v.price);
			}
			else if(BookingDetails.v==null)
			{
				vname.setText("NOT SELECTED");
				vprice.setText("0");
			}
		    
			if(BookingDetails.fc!=null)
			{
				fname.setFont(ff);
				fname.setText(""+BookingDetails.fc.foodbill);
				fprice.setText(""+BookingDetails.fc.amount);
			}
			else if(BookingDetails.fc == null)
			{
				fname.setFont(f);
				fname.setText("NOT SELECTED");
				fprice.setText("0");
			}
			
			if(BookingDetails.bm!=null)
			{
				mname.setText(""+BookingDetails.bm.name);
				mprice.setText(""+BookingDetails.bm.price);
			}
			else if(BookingDetails.bm == null)
			{
				mname.setText("NOT SELECTED");
				mprice.setText("0");
			}
			
			if(BookingDetails.pa!=null)
			{
//				pname.setText("PHOTOSHOOT");
				pprice.setText(""+BookingDetails.pa.amount);
			}
			else if(BookingDetails.pa == null)
			{
//				pname.setText("NOT SELECTED");
				pprice.setText("0");
			}
			
			if(BookingDetails.dcs!=null)
			{
				dname.setFont(ff);
				dname.setText(""+BookingDetails.dcs.name);
				dprice.setText(""+BookingDetails.dcs.amount);
			}
			else if(BookingDetails.dcs == null)
			{
				dname.setFont(f);
				dname.setText("NOT SELECTED");
				dprice.setText("0");
			}
			
			tprice.setText(""+(Double.parseDouble(vprice.getText()) + Double.parseDouble(fprice.getText()) + Double.parseDouble(mprice.getText()) + Double.parseDouble(pprice.getText()) + Double.parseDouble(dprice.getText())));
		
			
			
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand() == "COMPLETE")
		{
			setVisible(false);
			Tnx t = new Tnx("THE VELVET MOMENTS");
		}
	}
}




public class FinalPage
{
	public static void main(String[] args) 
	{
		Final f = new Final("THE VELVET MOMENTS","DG","BSFB");
		f.setVisible(true);

	}
}
