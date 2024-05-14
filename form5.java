//SEAT BOOKING

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form5 extends JFrame implements ActionListener
{
	JPanel p;
	JLabel l1,l2,l;
	JRadioButton l3,l4;
	ButtonGroup g;
	JButton b1,b2;
	ImageIcon img;
	
	form5()
	{
		super(" Cricket Ticket ");
		this.setSize(1000,600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setSize(new Dimension(450,300));
		p.setBackground(Color.white);
		p.setLayout(null);
		
		g = new ButtonGroup();
		
		img = new ImageIcon(getClass().getResource("Add a heading.JPG"));
		
		l = new JLabel(img);
		l.setBounds(0,7,img.getIconWidth(),550);
		p.add(l);
		
		l1 = new JLabel("");
		l1.setFont(new Font("Arial",Font.BOLD,40));
		l1.setForeground(Color.WHITE);
		l1.setBounds(250,50,450,50);
		l.add(l1);
		
		l2 = new JLabel("                                   CHOOSE SEAT CLASS");
		l2.setFont(new Font("Arial",Font.BOLD,30));
		l2.setForeground(Color.white);
		l2.setOpaque(true);
		l2.setBackground(Color.red);
		l2.setBounds(10,2,1000,70);
		l.add(l2);
		
		l3 = new JRadioButton("FIRST CLASS ");
		l3.setFont(new Font("Arial",Font.BOLD,20));
		l3.setForeground(Color.black);
		l3.setBackground(Color.white);
		l3.setOpaque(false);
		l3.setBounds(90,90,200,30);
		l3.addActionListener(this);
		l.add(l3);
		
		l4 = new JRadioButton("SECOND CLASS");
		l4.setFont(new Font("Arial",Font.BOLD,20));
		l4.setForeground(Color.black);
		l4.setBackground(Color.white);
		l4.setOpaque(false);
		l4.setBounds(760,90,200,30);
		l4.addActionListener(this);
		l.add(l4);
		
		
		b2 = new JButton("Back");
		b2.setBounds(450,470,100,30);
		b2.setBackground(Color.red);
		b2.setFont(new Font("Arial", Font.BOLD, 20));
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		l.add(b2);
		
		g.add(l3);
		g.add(l4);
				
		this.add(p);
		
	}
	

	
public void actionPerformed(ActionEvent ae)
		{
		    
			if(ae.getSource()==l3)
			{
			form6 f = new form6();
			this.setVisible(false);
			f.setVisible(true);	
			}
			
			else if(ae.getSource()==l4)
			{
			form7 f = new form7();
			this.setVisible(false);
			f.setVisible(true);	
			}
			
			else if(ae.getSource()==b2)
			{
				form4 f = new form4();
				this.setVisible(false);
				f.setVisible(true);
			}
		}


}

