package food;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Set;

public class FoodJTabbedPane extends JPanel {
	
    Font font2 = new Font("Arial Rounded MT BOLD",Font.PLAIN,18);
   // Color creamColor = new Color(246, 238, 219);
    JTextField numberTextField;
    JButton finalBookingButton;
    FoodChoice fc;
    public FoodJTabbedPane(){
    	this.setLayout(null);
            // set up the frame
            //JFrame frame = new JFrame("JTabbedPaneDemo");
            //frame.setLayout(null);
           // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setBackground(Color.white);
        this.setBounds(300,150,1000,1200);

           this.setVisible(false);
            //frame.setResizable(false);

            JLabel numberOfGuest = new JLabel("NUMBER OF GUESTS ",JLabel.CENTER);
            numberOfGuest.setFont(font2);
            numberOfGuest.setVerticalAlignment(JLabel.CENTER);
            numberOfGuest.setBounds(50,20,300,30);
            
            numberTextField = new JTextField();
            numberTextField.setFont(font2);
            numberTextField.setBounds(350,20,200,30);
            numberTextField.setText("0");
            numberTextField.setEditable(false);
            numberTextField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseExited(MouseEvent e) {
                        if(!numberTextField.getText().equals("")){
                            try{
                                if(Double.parseDouble(numberTextField.getText()) < 0){
                                    JOptionPane.showMessageDialog(null,"ENTER ONLY POSITIVE INTEGER VALUE ","Warning massage",JOptionPane.WARNING_MESSAGE);
                                }
                            }
                            catch (Exception ex){
                                JOptionPane.showMessageDialog(null,"ENTER ONLY INTEGER VALUE : " + ex,"Exception massage",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                }
            });

            finalBookingButton = new JButton("BOOK");
            finalBookingButton.setBounds(600,20,150,30);
            finalBookingButton.setFont(font2);
            finalBookingButton.setBackground(Color.WHITE);
            finalBookingButton.setFocusable(false);
            finalBookingButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
            finalBookingButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if(!numberTextField.getText().equals("0") && !numberTextField.getText().equals("") && !HashMapFile.item.isEmpty()){
                        int choice = JOptionPane.showConfirmDialog(null,"ARE YOU SURE TO BOOK THESE FOOD ITEMS? ONCE YOU SELECTED YES YOU CANNOT CHANGE THE FOOD ITEMS IN THE LIST","FINAL BOOKING",JOptionPane.YES_NO_OPTION);
                        if(choice == 0){
                            HashMapFile.numberOfGuest = Integer.parseInt(numberTextField.getText());
                            JOptionPane.showMessageDialog(null,"YOU ENTERED NUMBER OF GUESTS : " + HashMapFile.numberOfGuest + "\n\n" + HashMapFile.getFoodList() + "\nYOU HAVE TO PAY TOTAL " + HashMapFile.getTotalPrice() +"/- RUPEES","Final Booking",JOptionPane.INFORMATION_MESSAGE);
                             fc=new FoodChoice(HashMapFile.getTotalPrice());
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"YOUR FOOD LIST IS EMPTY OR ENTER VALID NUMBER OF GUESTS TO GET DONE YOUR BOOKING","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            JPanel guestPanel = new JPanel();
//            guestPanel.setPreferredSize(new Dimension(950,40));
            guestPanel.setBounds(0,0,950,50);
            guestPanel.setLayout(null);
            guestPanel.add(numberOfGuest);
            guestPanel.add(numberTextField);
            guestPanel.add(finalBookingButton);

//        create the tabbed pane
            JTabbedPane tabbedPane = new JTabbedPane();
            //tabbedPane.setPreferredSize(new Dimension(1000,600));
            tabbedPane.setBounds(0,60,950,600);

            tabbedPane.addTab("soup",new Soup());
           tabbedPane.addTab("starters",new StartersLabel());
            tabbedPane.addTab("maincourse",new FrontEndforMainCourse());
            tabbedPane.addTab("Extras",new Extras());
            tabbedPane.addTab("Desserts",new Desserts3());

            tabbedPane.setBackground(Color.WHITE);
            
            //tabbedPane.setBackground(new Color(255,102,102,20));
            tabbedPane.setFocusable(false);
            tabbedPane.setFont(new Font("Arial",Font.PLAIN,15));
            tabbedPane.setSelectedIndex(0);
            tabbedPane.setEnabled(false);
            
            

        numberTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                numberTextField.setEditable(true);
            }
            @Override
            public void mouseExited(MouseEvent e){
                numberTextField.setEditable(false);
                if(!numberTextField.getText().equals("0")){
                    tabbedPane.setEnabled(true);
                }
                else {
                    numberTextField.setText("0");
                    tabbedPane.setEnabled(false);
                }
            }
        });

            this.add(guestPanel);
            this.add(tabbedPane);

            
        }


    }

// Make the panels that will be added to the tabbed pane

    

