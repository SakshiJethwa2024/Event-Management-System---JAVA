import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class selectionBox extends JFrame implements ActionListener{
    Font font1 = new Font("Arial Rounded MT BOLD",Font.BOLD,30);
    Font font2 = new Font("Arial Rounded MT BOLD",Font.PLAIN,20);
    Font font3 = new Font("Arial Rounded MT BOLD",Font.PLAIN,15);
   // Color creamColor = new Color(246, 238, 219);
   // Color greenColor = new Color(14,94,119);

    JButton bookButton;
    JButton cancelButton;
    JTextField totalPriceTextField;
    JComboBox duration;
    Double priceI;
    BookMusic bm;
    selectionBox(String str,double price){
        super("Book Your Band");
        //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setBounds(500,150,500,500);
        setLayout(null);
        this.setContentPane(new JLabel(new ImageIcon("src//pic1.jpeg")));
        //setResizable(false);
        priceI = price;

        JLabel name = new JLabel(str);
        name.setFont(new Font("HP Simplified",Font.BOLD,30));
        //name.setForeground(creamColor);
        name.setBounds(50,20,500,30);

        JLabel priceLabel = new JLabel(("Price per Hour : " + price),JLabel.CENTER);
        priceLabel.setFont(font3);
       // priceLabel.setForeground(creamColor);
        priceLabel.setBounds(40,60,300,30);

        JLabel durationLabel = new JLabel("DURATION");
        durationLabel.setFont(font3);
       // durationLabel.setForeground(creamColor);
        durationLabel.setBounds(20,150,100,30);

        String[] option = {"Select Duration","2 Hours","4 Hours","6 Hours","8 Hours","10 Hours","HalfDay","14 Hours","16 Hours","18 Hours","20 Hours","22 Hours","Full Day"};
        duration = new JComboBox(option);
        duration.setSelectedIndex(0);
        duration.setFocusable(false);
        duration.setBounds(150,150,200,28);
       // duration.setBackground(creamColor);
       // duration.setForeground(greenColor);
        duration.setFont(font3);
        duration.addActionListener(this);

        JLabel totalPriceLabel = new JLabel("PRICE");
        totalPriceLabel.setFont(font3);
      //  totalPriceLabel.setForeground(creamColor);
        totalPriceLabel.setBounds(20,200,100,28);

        totalPriceTextField = new JTextField("0");
        totalPriceTextField.setEditable(false);
        totalPriceTextField.setFont(font3);
        totalPriceTextField.setFocusable(false);
       // totalPriceTextField.setForeground(greenColor);
       // totalPriceTextField.setBackground(creamColor);
        totalPriceTextField.setBounds(150,200,100,28);
        totalPriceTextField.setVisible(true);

        bookButton = createButton();
        bookButton.setText("Book");
        bookButton.setBounds(90,300,100,30);
        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == bookButton){
                    int chioce = JOptionPane.showConfirmDialog(null,"Are you sure to book this band because once you booked the band you cannot cancel the booking","Confirm Decision",JOptionPane.YES_NO_CANCEL_OPTION);
                    if(chioce == 0){
                        if(!totalPriceTextField.getText().equals("0")){
                        	 bm=new BookMusic(str,Double.parseDouble(totalPriceTextField.getText()));
                        	 dispose();
                            JOptionPane.showMessageDialog(null,"Your Booking for " + str + " has successfully done!!" ,"Booking Successful",JOptionPane.INFORMATION_MESSAGE);
                           
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Please select a duration!!","Alert Message",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        });

        cancelButton = createButton();
        cancelButton.setText("Cancel");
        cancelButton.setBounds(200,300,100,30);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==cancelButton){
                    dispose();
                }
            }
        });

      //  getContentPane().setBackground(greenColor);
        add(name);
        add(priceLabel);
        add(durationLabel);
        add(duration);
        add(totalPriceLabel);
        add(totalPriceTextField);
        add(bookButton);
        add(cancelButton);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(duration.getSelectedIndex() != 0){
                totalPriceTextField.setText(String.valueOf(duration.getSelectedIndex() * 2 * priceI));
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
    public JButton createButton(){
        JButton button = new JButton();
       // button.setBackground(creamColor);
        button.setFont(font3);
        //button.setForeground(greenColor);
        button.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button.setFocusable(false);
        button.setVisible(true);
        return button;
    }
}

