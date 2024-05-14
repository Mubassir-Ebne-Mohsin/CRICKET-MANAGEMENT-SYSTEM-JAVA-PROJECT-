// PAYMENT OPTION

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form8 extends JFrame implements ActionListener
{
	JPanel p;
	JLabel l1,l2,l;
	JRadioButton l3,l4,l5;
	ButtonGroup g;
	JButton b1,b2;
	ImageIcon img;
	
	form8()
	{
		super(" CRICKET TICKET ");
		this.setSize(900,580);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setSize(new Dimension(450,300));
		p.setBackground(Color.gray);
		p.setLayout(null);
		
		img = new ImageIcon(getClass().getResource("Untitled design (3) (1).JPG"));
		
		l = new JLabel(img);
		l.setBounds(0,0,img.getIconWidth(),550);
		p.add(l);
		
		l1 = new JLabel(" PAYMENT GATEWAY ");
		l1.setFont(new Font("Arial",Font.BOLD,40));
		l1.setForeground(Color.white);
		l1.setOpaque(true);
		l1.setBackground(Color.BLACK);
		l1.setBounds(250,50,450,50);
		l.add(l1);
		
		l2 = new JLabel("");
		l2.setFont(new Font("Serif",Font.BOLD,23));
		l2.setForeground(Color.black);
		l2.setBounds(120,150,350,30);
		l.add(l2); 
		
		l3 = new JRadioButton(" Card ");
		l3.setFont(new Font("Arial",Font.BOLD,23));
		l3.setForeground(Color.white);
		l3.setBackground(Color.black);
		l3.setOpaque(false);
		l3.setBounds(700,150,200,30);
		l3.addActionListener(this);
		l.add(l3); 
		
		l4 = new JRadioButton(" Bkash ");
		l4.setFont(new Font("Arial",Font.BOLD,23));
		l4.setForeground(Color.white);
		l4.setBackground(Color.black);
		l4.setOpaque(false);
		l4.setBounds(120,150,200,30);
		l4.addActionListener(this);
		l.add(l4); 
		
		l5 = new JRadioButton(" Nagad ");
		l5.setFont(new Font("Arial",Font.BOLD,23));
		l5.setForeground(Color.white);
		l5.setBackground(Color.black);
		l5.setOpaque(false);
		l5.setBounds(400,150,200,30);
		l5.addActionListener(this);
		l.add(l5); 
		 
		
		b2 = new JButton("Back");
		b2.setBounds(420,470,100,30);
		b2.setBackground(Color.white);
		b2.addActionListener(this);
		l.add(b2);
		
		this.add(p);
		
	}
	

public void actionPerformed(ActionEvent ae)
		{
		    if(ae.getSource()==l3)
			{
				form9 f = new form9();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==l4)
			{
				form10 f = new form10();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==l5)
			{
				form11 f = new form11();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				form6 f = new form6();
				this.setVisible(false);
				f.setVisible(true);
			}
		}


}
