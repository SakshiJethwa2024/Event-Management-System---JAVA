import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Start extends JFrame implements ActionListener,ItemListener
{
    JPanel heading;
    JPanel userProfile;
    JPanel workPlace;
    JButton logoutButton;
    JButton profileButton;
    JButton bookingHistoryButton;
    JButton bookEventButton;
    JButton notificationButton;
    JButton helpButton;
    String user;
    JLabel username,edate;
    JTextField ufield;
    JComboBox date,month,year;
	int n = 1;
	String s,d,y,eventdate="DATE NOT SELECTED";

    Font font1 = new Font("Arial Rounded MT BOLD",Font.BOLD,30);
    Font font2 = new Font("Arial Rounded MT BOLD",Font.PLAIN,20);
    Font font3 = new Font("Arial Rounded MT BOLD",Font.ITALIC,20);
   
    Start(String s,String user)
    {
        super(s);
        this.user = user;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(null);
        setContentPane(new JLabel(new ImageIcon("images//mainbg.jpg")));
        
        heading = new JPanel();
        heading.setBounds(0,0,1400,140);
        add(heading);
        JLabel pic = new JLabel(new ImageIcon("images//tvm3re3.png"));
		heading.add(pic);

        
        username = new JLabel("USERNAME       : ");
        username.setBounds(330,170,250,40);
        username.setForeground(Color.black);
        username.setFont(font1);
        add(username);
        
        ufield = new JTextField(user);
        ufield.setBounds(650,170,200,40);
        ufield.setFont(font1);
        ufield.setEditable(false);
        add(ufield);

        JPanel optionPanel = new JPanel();
        optionPanel.setBackground(new Color(4, 53, 68, 83));
        optionPanel.setBounds(500,250,700,350);
        optionPanel.setLayout(null);

        bookEventButton = new JButton("BOOK AN EVENT");
        bookEventButton.setBounds(20,20,320,310);
        bookEventButton.setBackground(Color.white);
        bookEventButton.setForeground(Color.black);
        bookEventButton.setFont(font2);
        bookEventButton.setFocusable(false);
        bookEventButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());

        /*bookingHistoryButton = new JButton("BOOKING HISTORY");
        bookingHistoryButton.setBounds(360,20,320,140);
        bookingHistoryButton.setBackground(Color.white);
        bookingHistoryButton.setForeground(Color.black);
        bookingHistoryButton.setFont(font2);
        bookingHistoryButton.setFocusable(false);
        bookingHistoryButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());


        notificationButton = new JButton("NOTIFICATIONS");
        notificationButton.setBounds(20,190,320,140);
        notificationButton.setBackground(Color.white);
        notificationButton.setForeground(Color.black);
        notificationButton.setFont(font2);
        notificationButton.setFocusable(false);
        notificationButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());*/


        helpButton = new JButton("HELP DESK");
        helpButton.setBounds(360,20,320,310);
        helpButton.setBackground(Color.white);
        helpButton.setForeground(Color.black);
        helpButton.setFont(font2);
        helpButton.setFocusable(false);
        helpButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());


        add(optionPanel);
        optionPanel.add(bookEventButton);
       /* optionPanel.add(bookingHistoryButton);
        optionPanel.add(notificationButton);*/
       optionPanel.add(helpButton);
        
        
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(1140,170,100,50);
        logoutButton.setFocusable(false);
        logoutButton.setFont(font2);
        logoutButton.setBackground(Color.white);
        logoutButton.setForeground(Color.black);
        logoutButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        add(logoutButton);
        logoutButton.addActionListener(this);

        profileButton = new JButton("Profile");
        profileButton.setBounds(1000,170,100,50);
        profileButton.setFocusable(false);
        profileButton.setFont(font2);
        profileButton.setBackground(Color.white);
        profileButton.setForeground(Color.black);
        profileButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        add(profileButton);
        profileButton.addActionListener(this);
        
        bookEventButton.addActionListener(this);
//        bookingHistoryButton.addActionListener(this);
//        notificationButton.addActionListener(this);
        helpButton.addActionListener(this);
        
        
        
        
        
        edate = new JLabel("SELECT EVENT DATE :");
        
        date = new JComboBox();
		month = new JComboBox();
		year = new JComboBox();
		
		edate.setFont(font2);
		edate.setForeground(Color.black);
		edate.setBounds(20,288,300,30);
		add(edate);
		
		month.setBounds(20,330,110,25);
		month.setFont(font2);
		date.setBounds(160,330,100,25);
		date.setFont(font2);
		year.setBounds(290,330,150,25);
		year.setFont(font2);
		
		date.addItem("DATE"); 
		month.addItem("MONTH"); month.addItem("Jan"); month.addItem("Feb"); month.addItem("Mar");
		month.addItem("Apr");  month.addItem("May");  month.addItem("June");  month.addItem("July"); month.addItem("Aug");
		month.addItem("Sept"); month.addItem("Oct"); month.addItem("Nov");  month.addItem("Dec");
		year.addItem("YEAR"); year.addItem("2023");
		month.addItemListener(this);
		date.addItemListener(this);
		year.addItemListener(this);
		
		
		
				
		add(date); add(month); add(year);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == profileButton)
        {
        	setVisible(true);
           Profile profilePage = new Profile("THE VELVET MOMENTS",user);
//           setVisible(true);
        }
        else if (e.getSource() == logoutButton)
        {
           setVisible(false);
           Home h1 = new Home("THE VELVET MOMENTS");
           h1.setVisible(true);
        }
        if(e.getSource() == bookEventButton)
        {
        	setVisible(false);
        	TryPage tp = new TryPage("THE VELVET MOMENTS",user,eventdate);
        }
        
        if(e.getSource() == helpButton)
        {
        	JOptionPane.showMessageDialog(null,"YOU CAN CONTACT US FOR ANY QUERIES RELATED TO BOOKINGS\nNOTE : FOR CANCEL A BOOKING YOU MUST HAVE TO INFORM US AT LEAST BEFORE 2 DAYS OF THE SELECTED DATE\n\nYOU CAN CONTACT US BY THE FOLLOWING INFORMATION\n\nEMAIL : tvmsupport@gmmail.com\nHELP : 9090909090\n\n\nWE ARE ALWAYS THERE FOR YOUR DREAMS","HELP DESK",JOptionPane.INFORMATION_MESSAGE);
        }
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
		
		eventdate = s+" "+d+" , "+y;
	}
}

/*public class StartPage
{
    public static void main(String[] args) 
    {
        Start start = new Start("THE VELVET MOMENTS","SAKSHI");
        start.setVisible(true);
    }
}*/