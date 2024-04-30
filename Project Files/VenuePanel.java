import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class VenuePanel extends JPanel {

		JButton view;
		JLabel title;
		JTextArea info;
		
		VenuePanel(Venue v,int m,int n){
			this.setLayout(null);
			this.setBounds(m,n,900,170);
			this.setVisible(true);
		    this.setBackground(new Color(191,213,232));
			
			this.setBorder(BorderFactory.createLineBorder(Color.black, 2, isVisible()));
			//this.currentlyselected=v;
			//JLabel temp=new JLabel(new ImageIcon("src//pic2.jpeg"));
			//temp.setBounds(0,0,290,700);
			//this.add(temp);
			title=new JLabel(v.name);
			title.setForeground(Color.black);
			title.setBackground(new Color(255,102,102,40));
			title.setFont(new Font("HP Simplified",Font.BOLD,40));
			title.setBounds(50, 7, 500, 100);
			this.add(title);
			
			info=new JTextArea();
			info.setText("\n Ratings "+v.ratings+"/5                                      "+"Contact no. "+v.contactno+"\n Details "+v.extrainfo);
			info.setEditable(false);
			info.setBounds(2, 90, 700, 75);
			info.setForeground(Color.black);
			info.setFont(new Font("Berlin Sans FB",Font.PLAIN,20));
			info.setBackground(new Color(253,222,238));
			//info.setBackground(Color.white);
			this.add(info);
			
			
			view=new JButton("view");
			view.setBackground(Color.black);
			view.setForeground(Color.white);
			view.setBounds(800, 25, 80, 30);
			view.setFont(new Font("Arial",Font.CENTER_BASELINE,20));
			view.setBorderPainted(false);
			this.add(view);
			
			ViewHandling vh=new ViewHandling(this,v);
			view.addActionListener(vh);
		}
	}

