import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartersLabel extends JLabel implements ActionListener {
    Font font1 = new Font("Arial Rounded MT BOLD",Font.BOLD,30);
    Font font2 = new Font("Arial Rounded MT BOLD",Font.PLAIN,20);
    Font font3 = new Font("Arial Rounded MT BOLD",Font.PLAIN,15);

    JButton bookButton,cancelButton;
    JCheckBox[] checkBoxes = new JCheckBox[4];
    Double[] prices = new Double[4];
    int i = 0;
    public StartersLabel(){
        //ImageIcon backGroundImage = new ImageIcon("Image_13.jpeg");
        //Image img = backGroundImage.getImage();
        //Image temp_img = img.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        //backGroundImage = new ImageIcon(temp_img);
    	this.setBackground(new Color(207,236,207));
        setText("");
       // setIcon(backGroundImage);
        setAlignmentX(JLabel.CENTER);

        JLabel heading = new JLabel("CHOOSE YOUR STARTERS",JLabel.CENTER);
        heading.setFont(font2);
        heading.setBounds(0,0,900,100);
        heading.setBackground(new Color(207,236,207));

//        JPanel starter = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel starter = new JPanel();
        starter.setLayout(null);
        starter.setBounds(0,100,940,300);
        //starter.setBackground(new Color(0,0,0,0));
        starter.setBackground(new Color(207,236,207));
        starter.setOpaque(true);
        checkBoxes[0] = createCheckBox("Hara Bhara Kabab ", 100);
        checkBoxes[0].setBounds(110,20,700,40);
        starter.add(checkBoxes[0],CENTER);
        checkBoxes[1] = createCheckBox("Paneer Chilly Dry " , 200);
        checkBoxes[1].setBounds(110,70,700,40);
        starter.add(checkBoxes[1]);
        checkBoxes[2] = createCheckBox("Barbeque " , 130);
        checkBoxes[2].setBounds(110,120,700,40);
        starter.add(checkBoxes[2]);
        checkBoxes[3] = createCheckBox("Cheese Balls " , 130);
        checkBoxes[3].setBounds(110,170,700,40);
        starter.add(checkBoxes[3]);

        bookButton = new JButton("CONFIRM");
        bookButton.setFont(font3);
        bookButton.setFocusable(false);
        bookButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        bookButton.setBackground(Color.WHITE);
        bookButton.setBounds(260,240,150,30);
        bookButton.addActionListener(this);

        cancelButton = new JButton("CLEAR");
        cancelButton.setFont(font3);
        cancelButton.setFocusable(false);
        cancelButton.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        cancelButton.setBackground(Color.WHITE);
        cancelButton.setBounds(460,240,150,30);
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (int i=0; i<checkBoxes.length;i++){
                    checkBoxes[i].setSelected(false);
                }
            }
        });

        starter.add(bookButton);
        starter.add(cancelButton);
        add(heading);
        add(starter,JLabel.CENTER);
    }
    public JCheckBox createCheckBox(String str,double price){
        prices[i++] = price;
        JCheckBox checkBox = new JCheckBox(str);
        checkBox.setFont(font3);
        checkBox.setFocusable(false);
        checkBox.setForeground(Color.BLACK);
        checkBox.setBackground(Color.WHITE);
        checkBox.setPreferredSize(new Dimension(800,30));
        checkBox.setLayout(new BorderLayout());
        JLabel priceLabel = new JLabel(String.valueOf(price)+"/-");
        priceLabel.setFont(font3);
        checkBox.add(priceLabel,BorderLayout.EAST);
        return checkBox;
    }

    public boolean isSelectedAny(JCheckBox[] checkBoxes){
        for(int i = 0; i <checkBoxes.length; i++){
            if(checkBoxes[i].isSelected()){
                return true;
            }
        }
        return false;
    }

    public StringBuilder selectedStartersList(){
        StringBuilder startersList = new StringBuilder();
        for(int i = 0; i <checkBoxes.length; i++){
            if(checkBoxes[i].isSelected()){
                HashMapFile.item.put(checkBoxes[i].getText(),prices[i]);
                startersList.append(checkBoxes[i].getText()).append(" : ").append(prices[i].toString()).append("/-").append("\n");
            }
        }
        return startersList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bookButton){
            if(isSelectedAny(checkBoxes)){
                int chioce = JOptionPane.showConfirmDialog(null,"ARE YOU SURE TO CONFIRM THESE STARTERS?\nONCE YOU SELECT YES YOU CANNOT EDIT THE STARTERS!!","Confirm Decision",JOptionPane.YES_NO_OPTION);
                if(chioce == 0){
                    JOptionPane.showMessageDialog(null,"YOUR SELECTED STARTERS \n" + selectedStartersList() + "\nARE SUCCESSFULLY ADDED TO THE FOOD LIST!!\nTHE COAST IS PER PLATE" ,"Confirmation Massage",JOptionPane.INFORMATION_MESSAGE);
//                    System.out.println(HashMapFile.item);
                    bookButton.setEnabled(false);
                    cancelButton.setEnabled(false);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"PLEASE SELECT AT LEAST ONE STARTER TO ADD IN THE FOOD LIST","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}

