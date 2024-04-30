import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Login extends JFrame implements ActionListener{
    JButton loginButton;
    JTextField username;
    JPasswordField password;
    JLabel warningLabel;
    Font font1 = new Font("Arial Rounded MT BOLD",Font.BOLD,40);
    Font font2 = new Font("Arial Rounded MT BOLD",Font.PLAIN,20);
    Font font3 = new Font("Arial Rounded MT BOLD",Font.ITALIC,20);

    public Login(String str){
        super(str);
        setLayout(new BorderLayout());

        // font
        // header
        JPanel heading;
        heading = new JPanel();
        heading.setBackground(new Color(0,0,0,150));
        heading.setBounds(0,0,1600,200);
//        setSize(1600,200);
        heading.setLayout(null);
        JLabel name = new JLabel("WELCOME TO THE VELVET MOMENTS");
        name.setLayout(null);
        name.setBounds(400,0,800,200);
        name.setFont(font1);
        name.setForeground(Color.WHITE);
        heading.add(name);

        // login panel
        JPanel login = new JPanel();
        login.setLayout(null);
        login.setBackground(new Color(0,0,0,150));
        login.setBounds(530,300,500,400);

        JLabel userLabel = new JLabel("Username ");
        userLabel.setFont(font2);
        userLabel.setForeground(Color.WHITE);
        userLabel.setBounds(30,100,200,50);

        username = new JTextField("username");
        username.setBounds(160,100,300,50);
        username.setBackground(Color.WHITE);
        username.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        username.setFont(font3);
        username.setForeground(new Color(0,0,0,100));
        username.setCaretColor(Color.BLACK);
        username.setEditable(false);
        username.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if(username.getText().equals("username")){
                    warningLabel.setVisible(false);
                    username.setText("");
                    username.setForeground(Color.BLACK);
                    username.setCaretColor(Color.BLACK);
                    username.setFont(font2);
                    username.setBorder(BorderFactory.createLoweredSoftBevelBorder());
                }
                username.setEditable(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                username.setEditable(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(username.getText().equals("")){
                    username.setText("username");
                    username.setForeground(new Color(0,0,0,100));
                    username.setFont(font3);
                }
                username.setEditable(false);
                username.setCaretColor(Color.BLACK);
                username.setBorder(BorderFactory.createRaisedSoftBevelBorder());

            }
        });
        login.add(userLabel);
        login.add(username);

        JLabel passwordLabel = new JLabel("Password ");
        passwordLabel.setFont(font2);
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(30,200,200,50);

        password = new JPasswordField("PASSWORD",8);
        password.setBounds(160,200,300,50);
        password.setBackground(Color.WHITE);
        password.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        password.setFont(font2);
        password.setForeground(Color.BLACK);
        password.setCaretColor(Color.WHITE);

        password.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if(password.getText().equals("PASSWORD")){
                    warningLabel.setVisible(false);
                    password.setText("");
                    password.setForeground(Color.BLACK);
                    password.setCaretColor(Color.BLACK);
                    password.setFont(font2);
                    password.setBorder(BorderFactory.createLoweredSoftBevelBorder());
                }
                password.setEditable(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                password.setEditable(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(password.getText().equals("") || password.getText().equals("PASSWORD")){
                    password.setText("PASSWORD");
                    password.setForeground(new Color(0,0,0,100));
                    password.setFont(font3);
                }
                password.setEditable(false);
                password.setCaretColor(Color.BLACK);
                password.setBorder(BorderFactory.createRaisedSoftBevelBorder());

            }
        });

        login.add(passwordLabel);
        login.add(password);

        loginButton = new JButton("Login");
        loginButton.setBounds(200,300,150,50);
        loginButton.setBackground(Color.WHITE);
        loginButton.setForeground(Color.BLACK);
        loginButton.setFont(font2);
        loginButton.setFocusable(false);
//        loginButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        loginButton.addActionListener(this);
        login.add(loginButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setSize(1600,900);
        setExtendedState(MAXIMIZED_BOTH);

        ImageIcon backGroundImage = new ImageIcon("Image_09.jpeg");
        Image img = backGroundImage.getImage();
        Image temp_img = img.getScaledInstance(1600,900,Image.SCALE_SMOOTH);
        backGroundImage = new ImageIcon(temp_img);

        warningLabel = new JLabel("Enter valid Username or Password !!!");
        warningLabel.setBounds(600,750,800,50);
        warningLabel.setFont(font3);
        warningLabel.setForeground(Color.RED);
        warningLabel.setVisible(false);

        JLabel background = new JLabel("",backGroundImage,JLabel.CENTER);
        background.add(heading);
        background.add(login);
        background.add(warningLabel);
        add(background);
        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton){
            if (username.getText().equals("username") || password.getText().equals("PASSWORD")){
                warningLabel.setVisible(true);
            }
            else{
                loginButton.setEnabled(false);
                dispose();
                HomePage homePage = new HomePage();
                System.out.println("Username : " + username.getText());
                System.out.println("Password : " + password.getText());
            }
        }
    }

}

public class LoginPage {
    LoginPage(){
        Login login = new Login("Login Page");
    }
    public static void main(String[] args) {

        Login login = new Login("Login Page");
    }
}
