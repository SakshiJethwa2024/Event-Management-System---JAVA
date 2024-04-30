import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
 class Plate1 {
	public String sabji1[]={"Paneer tikka","Paneer Cheese masala","Kaju Paneer masala","Kadhai paneer","Paneer Angara"};
	public String sabji2[]= {"Mix veg","Masala bindi"};
	public String farsan[]= {"aloo tikki(with chutney)","Fulvadi(with matho)","faradi pattis"};
	public String rice[]= {"Jeera rice(with tadka dal)","Plain rice(with dal fry)","Pulav(with kadhi)"};
	public String sweet[]= {"Halvo","gulab jamun","Basundi"};
	public String roti="Butter roti";	
}
class Plate2 {
		String sabji1[]={"Paneer tikka","Paneer Cheese masala","Kaju Paneer masala","Kadhai paneer","Paneer Angara"};
		String sabji2[]= {"Mix veg","Masala bindi",""};
		String farsan[]= {"aloo tikki(with chutney)","Fulvadi(with matho)","faradi pattis"};
		String rice[]= {"Jeera rice(with tadka dal)","Plain rice(with dal fry)","Pulav(with kadhi)","Veg Biryani(with raita)"};
		String sweet[]= {"Halvo","gulab jamun","Basundi"};
		String roti="Butter roti+ Nan(garlic)";
		int price=270;
		
	}
class FrontEndforMainCourse extends JPanel{
	Plate1 pl1;
	Plate2 pl2;
	double maincoursecost;
	JRadioButton silver,platinum;
	JLabel jl1,jl2,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	ButtonGroup bg;
	JPanel jp1,jp2;
	JComboBox ss1,ss2,pss1,pss2,sf,pf,ss,ps1,ps2,sr,pr;
	int l;
	JButton confirm;
	FrontEndforMainCourse(){
		
		this.setBounds(200, 100, 900, 700);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setVisible(true);
		this.setBackground(new Color(207,236,207));
		 
		this.setLayout(null);
		
		silver=new JRadioButton("  SILVER PLATE");
		silver.setFont(new Font("Arial",Font.BOLD,20));
		silver.setBounds(50, 30, 400, 50);
		this.add(silver);
		
		jl1=new JLabel("(Rs 220: 2 sabji , 1 farsan , 1 sweet , Butter Roti , Rice , Papad , Salad )");
		jl1.setBounds(90,70,900,30);
		this.add(jl1);
		
		
		platinum=new JRadioButton("  PLATINUM PLATE");
		platinum.setFont(new Font("Arial",Font.BOLD,20));
		platinum.setBounds(50, 110, 400, 50);
		this.add(platinum);
		
		jl2=new JLabel("(Rs 280: 2 sabji , 1 farsan , 2 sweets , Butter Roti + Naan\n , Rice(Biryani also available) ,Papad , Salad )");
		jl2.setBounds(90,150,900,30);
		this.add(jl2);
		
		bg=new ButtonGroup();
		bg.add(silver); bg.add(platinum);
		
		
		jp1=new JPanel();
		jp1.setBackground(Color.white);
		jp1.setBounds(20,190,420,230);
		this.add(jp1);
		jp1.setLayout(null);
		
		jp2=new JPanel();
		jp2.setBackground(Color.white);
		jp2.setBounds(450,190,420,230);
		this.add(jp2);
		jp2.setLayout(null);
		
		Plate1 sil=new Plate1();
		Plate2 pla=new Plate2();
		
		l1=new JLabel("Sabji 1 : ");
		l1.setBounds(10,8,150,20);
		jp1.add(l1);
		ss1=new JComboBox();
		
		 l=sil.sabji1.length;
		for(int i=0;i<l;i++) {
			ss1.addItem(sil.sabji1[i]);
			
		}
			ss1.setBounds(10,30,150,30);
			jp1.add(ss1);
			l2=new JLabel("Sabji 2 : ");
			l2.setBounds(210,8,150,20);
			jp1.add(l2);
			
			ss2=new JComboBox();
			
			 l=sil.sabji2.length;
			for(int i=0;i<l;i++) {
				ss2.addItem(sil.sabji2[i]);
				
			}
				ss2.setBounds(210,30,150,30);
				jp1.add(ss2);
				
				l3=new JLabel("Farsan : ");
				l3.setBounds(10,70,150,20);
				jp1.add(l3);
		
				sf=new JComboBox();
				l=sil.farsan.length;
				for(int i=0;i<l;i++) {
					sf.addItem(sil.farsan[i]);
				}
				sf.setBounds(10,90,150,30);
				jp1.add(sf);
				
				l4=new JLabel("Sweet : ");
				l4.setBounds(210,70,150,20);
				jp1.add(l4);
				
				ss=new JComboBox();
				l=sil.sweet.length;
				for(int i=0;i<l;i++) {
					ss.addItem(sil.sweet[i]);
				}
				ss.setBounds(210,90,150,30);
				jp1.add(ss);
				l5=new JLabel("Rice : ");
				l5.setBounds(10,130,150,20);
				jp1.add(l5);
				sr=new JComboBox();
				l=sil.rice.length;
				for(int i=0;i<l;i++) {
					sr.addItem(sil.rice[i]);
				}
				sr.setBounds(10,150,150,30);
				jp1.add(sr);
				
				l6=new JLabel("Sabji 1 : ");
				l6.setBounds(10,8,150,20);
				jp2.add(l6);
				
				pss1=new JComboBox();
				
				 l=pla.sabji1.length;
				for(int i=0;i<l;i++) {
					pss1.addItem(pla.sabji1[i]);
					
				}
					pss1.setBounds(10,30,150,30);
					jp2.add(pss1);
					
					l7=new JLabel("Sabji 2 : ");
					l7.setBounds(210,8,150,20);
					jp2.add(l7);
					
					pss2=new JComboBox();
					
					 l=pla.sabji2.length;
					for(int i=0;i<l;i++) {
						pss2.addItem(pla.sabji2[i]);
						
					}
						pss2.setBounds(210,30,150,30);
						jp2.add(pss2);
				
						l8=new JLabel("Farsan : ");
						l8.setBounds(10,70,150,20);
						jp2.add(l8);
						pf=new JComboBox();
						l=pla.farsan.length;
						for(int i=0;i<l;i++) {
							pf.addItem(pla.farsan[i]);
						}
						pf.setBounds(10,90,150,30);
						jp2.add(pf);
						
						l9=new JLabel("Sweet : ");
						l9.setBounds(210,70,150,20);
						jp2.add(l9);
						ps1=new JComboBox();
						l=pla.sweet.length;
						for(int i=0;i<l;i++) {
							ps1.addItem(sil.sweet[i]);
						}
						ps1.setBounds(210,90,150,30);
						jp2.add(ps1);
						l10=new JLabel("Rice : ");
						l10.setBounds(10,130,150,20);
						jp2.add(l10);
						
						pr=new JComboBox();
						l=pla.rice.length;
						for(int i=0;i<l;i++) {
							pr.addItem(pla.rice[i]);
						}
						pr.setBounds(10,150,150,30);
						jp2.add(pr);
						l11=new JLabel("Sweet 2 : ");
						l11.setBounds(210,130,150,20);
						jp2.add(l11);
						ps2=new JComboBox(pla.sweet);
						/*l=pla.sweet.length;
						for(int i=0;i<l;i++) {
							ps2.addItem(sil.sweet[i]);
						}*/
						ps2.setBounds(210,150,150,30);
						jp2.add(ps2);
						
						ps1.setEnabled(false);
						pss1.setEnabled(false);
						pss2.setEnabled(false);
						ps2.setEnabled(false);
						pr.setEnabled(false);
						pf.setEnabled(false);
						ss1.setEnabled(false);
						ss2.setEnabled(false);
						sf.setEnabled(false);
						ss.setEnabled(false);
						sr.setEnabled(false);
						MCEventListner mcl=new MCEventListner(this);
						//JComboBox ss1,ss2,pss1,pss2,sf,pf,ss,ps1,ps2,sr,pr;
						silver.addItemListener(mcl);
						platinum.addItemListener(mcl);
						ss1.addItemListener(mcl);
						ss2.addItemListener(mcl);
						pss1.addItemListener(mcl);
						pss2.addItemListener(mcl);
						sf.addItemListener(mcl);
						pf.addItemListener(mcl);
						ss.addItemListener(mcl);
						ps1.addItemListener(mcl);
						ps2.addItemListener(mcl);
						sr.addItemListener(mcl);
						pr.addItemListener(mcl);
						
						
						confirm=new JButton("Confirm");
						confirm.setFont(new Font("Arial",Font.BOLD,15));
						confirm.setBounds(680,60,130,40);
						confirm.setBackground(Color.white);
						confirm.setForeground(Color.black);
						this.add(confirm);
						confirm.setEnabled(false);
						confirm.addActionListener(mcl);
		
	}
}

