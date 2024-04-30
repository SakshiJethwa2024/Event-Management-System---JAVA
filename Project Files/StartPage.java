import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Start extends JFrame implements ActionListener {
    JPanel heading;
    JPanel userProfile;
    JPanel workPlace;
    JButton logoutButton;
    JButton profileButton;
    JButton bookingHistoryButton;
    JButton bookEventButton;
    JButton notificationButton;
    JButton helpButton;

    Font font1 = new Font("Arial Rounded MT BOLD",Font.BOLD,30);
    Font font2 = new Font("Arial Rounded MT BOLD",Font.PLAIN,20);
    Font font3 = new Font("Arial Rounded MT BOLD",Font.ITALIC,20);
    Color creamColor = new Color(246, 238, 219);
    Color greenColor = new Color(14,94,119);
    Start(){
        super("Start Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(new BorderLayout());

//        ImageIcon imageIcon = new ImageIcon("Logo.png");
//        Image image = imageIcon.getImage();
//        Image temp = image.getScaledInstance(100,100,Image.SCALE_SMOOTH);
//        imageIcon = new ImageIcon(temp);
//        JLabel eventLogo = new JLabel("",imageIcon,JLabel.CENTER);
        JLabel eventLogo = new JLabel("");
//        eventLogo.setBorder(BorderFactory.createLineBorder(creamColor));
        eventLogo.setPreferredSize(new Dimension(100,100));

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(210,70,150,50);
        logoutButton.setFocusable(false);
        logoutButton.setFont(font2);
        logoutButton.setBackground(creamColor);
        logoutButton.setForeground(greenColor);
        logoutButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        logoutButton.addActionListener(this);

        profileButton = new JButton("Profile");
        profileButton.setBounds(40,70,150,50);
        profileButton.setFocusable(false);
        profileButton.setFont(font2);
        profileButton.setBackground(creamColor);
        profileButton.setForeground(greenColor);
        profileButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        profileButton.addActionListener(this);

        JLabel buttonLabel = new JLabel("");
//        buttonLabel.setBorder(BorderFactory.createLineBorder(creamColor));
        buttonLabel.setPreferredSize(new Dimension(400,100));
        buttonLabel.add(profileButton);
        buttonLabel.add(logoutButton);

        JLabel eventName = new JLabel("THE VELVET MOMENTS");
        eventName.setFont(font1);
        eventName.setForeground(creamColor);


        heading = new JPanel();
        heading.setPreferredSize(new Dimension(0,200));
        heading.setBackground(new Color(4, 53, 68, 223));
        heading.setLayout(new BorderLayout());
        heading.add(eventLogo,BorderLayout.WEST);
        heading.add(eventName,BorderLayout.CENTER);
        heading.add(buttonLabel,BorderLayout.EAST);

//        JLabel welcomeLabel = new JLabel("Let's start your dream plans with us.",JLabel.CENTER);
//        welcomeLabel.setBounds(0,150,400,50);
//        welcomeLabel.setFont(font2);
//        welcomeLabel.setForeground(creamColor);
//
//        JLabel userLabel = new JLabel("MAHESWARI PANDA",JLabel.CENTER);
//        userLabel.setBounds(0,200,400,50);
//        userLabel.setFont(font2);
//        userLabel.setForeground(creamColor);
//
//        JLabel nameLabel = new JLabel("BOOK EVENT",JLabel.CENTER);
//        nameLabel.setBounds(0,350,400,50);
//        nameLabel.setFont(font2);
//        nameLabel.setForeground(creamColor);
//
//        JLabel emailLabel = new JLabel("BOOKING HISTORY",JLabel.CENTER);
//        emailLabel.setBounds(0,400,400,50);
//        emailLabel.setFont(font2);
//        emailLabel.setForeground(creamColor);
//
//        JLabel contactLabel = new JLabel("NOTIFICATIONS",JLabel.CENTER);
//        contactLabel.setBounds(0,450,400,50);
//        contactLabel.setFont(font2);
//        contactLabel.setForeground(creamColor);
//
//        JLabel helpLabel = new JLabel("CONNECT US",JLabel.CENTER);
//        helpLabel.setBounds(0,500,400,50);
//        helpLabel.setFont(font2);
//        helpLabel.setForeground(creamColor);

//        userProfile = new JPanel();
//        userProfile.setBorder(BorderFactory.createLineBorder(creamColor));
//        userProfile.setPreferredSize(new Dimension(400,0));
//        userProfile.setBackground(greenColor);
//        userProfile.setLayout(null);
//        userProfile.add(welcomeLabel);
//        userProfile.add(userLabel);
//        userProfile.add(nameLabel);
//        userProfile.add(emailLabel);
//        userProfile.add(contactLabel);
//        userProfile.add(helpLabel);

        ImageIcon backgroundImage = new ImageIcon("Background.jpeg");
        Image image = backgroundImage.getImage();
        Image temp = image.getScaledInstance(1600,900,Image.SCALE_SMOOTH);
        backgroundImage = new ImageIcon(temp);

        JPanel optionPanel = new JPanel();
        optionPanel.setBackground(new Color(4, 53, 68, 223));
        optionPanel.setBounds(480,320,700,500);
        optionPanel.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));

        bookEventButton = new JButton("BOOK EVENT");
        bookEventButton.setPreferredSize(new Dimension(300,220));
        bookEventButton.setBackground(creamColor);
        bookEventButton.setForeground(greenColor);
        bookEventButton.setFont(font2);
        bookEventButton.setFocusable(false);
        bookEventButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());

        bookingHistoryButton = new JButton("BOOKING HISTORY");
        bookingHistoryButton.setPreferredSize(new Dimension(300,220));
        bookingHistoryButton.setBackground(creamColor);
        bookingHistoryButton.setForeground(greenColor);
        bookingHistoryButton.setFont(font2);
        bookingHistoryButton.setFocusable(false);
        bookingHistoryButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());


        notificationButton = new JButton("NOTIFICATIONS");
        notificationButton.setPreferredSize(new Dimension(300,220));
        notificationButton.setBackground(creamColor);
        notificationButton.setForeground(greenColor);
        notificationButton.setFont(font2);
        notificationButton.setFocusable(false);
        notificationButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());


        helpButton = new JButton("HELP DESK");
        helpButton.setPreferredSize(new Dimension(300,220));
        helpButton.setBackground(creamColor);
        helpButton.setForeground(greenColor);
        helpButton.setFont(font2);
        helpButton.setFocusable(false);
        helpButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());



        optionPanel.add(bookEventButton);
        optionPanel.add(bookingHistoryButton);
        optionPanel.add(notificationButton);
        optionPanel.add(helpButton);

        JLabel workplaceBackgroundLabel = new JLabel("",backgroundImage,JLabel.CENTER);
        workplaceBackgroundLabel.add(optionPanel,JLabel.CENTER);

        workPlace = new JPanel();
        workPlace.setPreferredSize(new Dimension(1600,900));
        workPlace.add(workplaceBackgroundLabel);

//        add(userProfile,BorderLayout.WEST);
        add(heading,BorderLayout.NORTH);
        add(workPlace,BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == profileButton){
            ProfilePage profilePage = new ProfilePage();
        }
        if (e.getSource() == logoutButton){
            dispose();
            NewPage newPage = new NewPage();
        }
    }
}

public class StartPage {
    StartPage(){
        Start start = new Start();
    }

    public static void main(String[] args) {
        Start start = new Start();
    }
}
