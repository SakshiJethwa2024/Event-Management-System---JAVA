package music1;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Music extends JPanel implements ActionListener {

    Font font1 = new Font("Arial Rounded MT BOLD",Font.BOLD,30);
    Font font2 = new Font("Arial Rounded MT BOLD",Font.PLAIN,20);
    Font font3 = new Font("Arial Rounded MT BOLD",Font.PLAIN,15);
    //Color creamColor = new Color(246, 238, 219);
    //Color greenColor = new Color(14,94,119);

    JButton selectButton1;
    JButton reviewButton1;
    JButton selectButton2;
    JButton reviewButton2;
    JButton selectButton3;
    JButton reviewButton3;
    JButton selectButton4;
    JButton reviewButton4;

   public Music(){
       // setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setSize(1200,700);
        //setResizable(false);
    	this.setBackground(Color.white);
        this.setBounds(300,150,1000,1200);
        this.setLayout(null);
        this.setVisible(false);
        selectButton1 = createButton();
        selectButton1.setText("Select");
        selectButton1.setBounds(850,120,100,30);

        reviewButton1 = createButton();
        reviewButton1.setText("Review");
        reviewButton1.setBounds(700,120,100,30);

        JLabel label_01 = new JLabel("FUNCTION AND PARTY BAND");
        label_01.setBounds(10,10,980,20);
        label_01.setFont(font2);
        JLabel label_02 = new JLabel("Price : 1300 rupees/hour");
        label_02.setBounds(10,35,980,20);
        label_02.setFont(font3);
        JLabel label_03 = new JLabel("Rating : * * * * *");
        label_03.setBounds(10,60,980,20);
        label_03.setFont(font3);
        JLabel label_04 = new JLabel("Details : This band is suitable for family functions or any party like children party !");
        label_04.setBounds(10,85,980,20);
        label_04.setFont(font3);

        JPanel panel_01 = createPanel();
        panel_01.setBounds(15,10,980,170);
        panel_01.add(label_01);
        panel_01.add(label_02);
        panel_01.add(label_03);
        panel_01.add(label_04);
        panel_01.add(selectButton1);
        panel_01.add(reviewButton1);

        JLabel label21 = new JLabel("CLASSICAL BAND");
        label21.setBounds(10,10,980,20);
        label21.setFont(font2);
        JLabel label22 = new JLabel("Price : 1000 rupees/hour");
        label22.setBounds(10,35,980,20);
        label22.setFont(font3);
        JLabel label23 = new JLabel("Rating : * * * * *");
        label23.setBounds(10,60,980,20);
        label23.setFont(font3);
        JLabel label24 = new JLabel("Details : This band is suitable for family functions,opening events,background music or any other functions!");
        label24.setBounds(10,85,980,20);
        label24.setFont(font3);

        selectButton2 = createButton();
        selectButton2.setText("Select");
        selectButton2.setBounds(850,120,100,30);

        reviewButton2 = createButton();
        reviewButton2.setText("Review");
        reviewButton2.setBounds(700,120,100,30);

        JPanel panel_02 = createPanel();
        panel_02.setBounds(15,190,980,170);
        panel_02.add(label21);
        panel_02.add(label22);
        panel_02.add(label23);
        panel_02.add(label24);
        panel_02.add(selectButton2);
        panel_02.add(reviewButton2);


        JLabel label31 = new JLabel("DJ REMIX BAND");
        label31.setBounds(10,10,980,20);
        label31.setFont(font2);
        JLabel label32 = new JLabel("Price : 2000 rupees/hour");
        label32.setBounds(10,35,980,20);
        label32.setFont(font3);
        JLabel label33 = new JLabel("Rating : * * * * *");
        label33.setBounds(10,60,980,20);
        label33.setFont(font3);
        JLabel label34 = new JLabel("Details : This band is suitable for parties,opening events,collage events !!");
        label34.setBounds(10,85,980,40);
        label34.setFont(font3);

        selectButton3 = createButton();
        selectButton3.setText("Select");
        selectButton3.setBounds(850,120,100,30);

        reviewButton3 = createButton();
        reviewButton3.setText("Review");
        reviewButton3.setBounds(700,120,100,30);

        JPanel panel_03 = createPanel();
        panel_03.setBounds(15,370,980,170);
        panel_03.add(label31);
        panel_03.add(label32);
        panel_03.add(label33);
        panel_03.add(label34);
        panel_03.add(selectButton3);
        panel_03.add(reviewButton3);


        JLabel label41 = new JLabel("ROCK BAND");
        label41.setBounds(10,10,980,20);
        label41.setFont(font2);
        JLabel label42 = new JLabel("Price : 3000 rupees/hour");
        label42.setBounds(10,35,980,20);
        label42.setFont(font3);
        JLabel label43 = new JLabel("Rating : * * * * *");
        label43.setBounds(10,60,980,20);
        label43.setFont(font3);
        JLabel label44 = new JLabel("Details : This band is suitable specially for parties,collage events,rocking event ");
        label44.setBounds(10,85,980,20);
        label44.setFont(font3);

        selectButton4 = createButton();
        selectButton4.setText("Select");
        selectButton4.setBounds(1000,120,100,30);

        reviewButton4 = createButton();
        reviewButton4.setText("Review");
        reviewButton4.setBounds(800,120,100,30);

        JPanel panel_04 = createPanel();
        panel_04.setBounds(15,550,980,170);
        panel_04.add(label41);
        panel_04.add(label42);
        panel_04.add(label43);
        panel_04.add(label44);
        panel_04.add(selectButton4);
        panel_04.add(reviewButton4);
        
        this.add(panel_01);
        this.add(panel_02);
        this.add(panel_03);
        this.add(panel_04);

     /*   JPanel musicPanel = new JPanel();
        //musicPanel.setBackground(greenColor);
        musicPanel.setBounds(0,0,1200,700);
        musicPanel.setLayout(null);
        musicPanel.add(panel_01);
        musicPanel.add(panel_02);
        musicPanel.add(panel_03);
        musicPanel.add(panel_04);
       // musicPanel.setVisible(true);

        add(musicPanel);
        setVisible(true);*/
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        selectionBox selectionBox;
        if(e.getSource() == selectButton1){
            selectionBox = new selectionBox("FUNCTION AND PARTY BAND",1300);
        }
        else if(e.getSource() == selectButton2){
            selectionBox = new selectionBox("CLASSICAL BAND",1000);
        }
        else if(e.getSource() == selectButton3){
            selectionBox = new selectionBox("DJ REMIX BAND",2000);
        }
        else if(e.getSource() == selectButton4){
            selectionBox = new selectionBox("ROCK BAND",3000);
        }

        if(e.getSource()== reviewButton1 || e.getSource()== reviewButton2 || e.getSource()== reviewButton3 ||e.getSource()== reviewButton4){
            JOptionPane.showMessageDialog(null,"This band is really good for event like parties and wedding or any children party.
             I want to rate this band 4.5 out of 5 Thank you","Customer Review",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public JButton createButton(){
        JButton button = new JButton();
        button.setBackground(Color.black);
        button.setFont(font3);
        button.setForeground(Color.white);
        button.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        button.setFocusable(false);
        //button.setVisible(true);
        button.addActionListener(this);
        return button;
    }

    public JPanel createPanel(){
        JPanel panel = new JPanel();
       // panel.setBackground(creamColor);
       // panel.setBackground(Color.white);
       panel.setBackground(new Color(255,102,102,20));
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
       // panel.setVisible(true);
        return panel;
    }
}




