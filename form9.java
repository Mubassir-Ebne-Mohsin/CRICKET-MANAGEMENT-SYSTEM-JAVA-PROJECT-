// CARD

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form9 extends JFrame implements ActionListener
{
	JPanel p;
	JLabel l1,l2,l3,l;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2,b3;
	ImageIcon img;
	
	form9()
	{
		super(" Cricket Ticket ");
		this.setSize(900,580);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setSize(new Dimension(450,300));
		p.setBackground(Color.BLACK);
		p.setLayout(null);
		
		img = new ImageIcon(getClass().getResource("Untitled design (7) (1).JPG"));
		
		l = new JLabel(img);
		l.setBounds(0,7,img.getIconWidth(),550);
		p.add(l);
		
		l1 = new JLabel("CARD");
		l1.setFont(new Font("Arial",Font.BOLD,40));
		l1.setForeground(Color.WHITE);
		l1.setBounds(250,50,450,50);
		l.add(l1);
		
		l2 = new JLabel(" Card Number ");
		l2.setFont(new Font("Arial",Font.BOLD,25));
		l2.setForeground(Color.white);
		l2.setBounds(30,220,350,30);
		l.add(l2); 
		
		l3 = new JLabel("   Pin          ");
		l3.setFont(new Font("Arial",Font.BOLD,25));
		l3.setForeground(Color.white);
		l3.setBounds(120,280,350,30);
		l.add(l3); 
		
		t1 = new JTextField();
		t1.setBounds(210,220,180,30);
		l.add(t1);
		
		t2 = new JPasswordField();
        t2.setBounds(210,280,180,30);
        l.add(t2);	
		
		
		b2 = new JButton("Next");
		b2.setBounds(350,470,100,30);
		b2.setBackground(Color.white);
		b2.addActionListener(this);
		l.add(b2);
		
		b3 = new JButton("Back");
		b3.setBounds(100,470,100,30);
		b3.setBackground(Color.white);
		b3.addActionListener(this);
		l.add(b3);
		
		this.add(p);
		
	}
	


public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
			{
				
				String fullName = t1.getText();
                String userPassword = t2.getText();

            if(fullName.isEmpty() ||  userPassword.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Full Fill All Box");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Payment Successful");
                t1.setText("");
                t2.setText("");
				
				Ticket f = new Ticket();
				this.setVisible(false);
				f.setVisible(true);

            }
			}

		else if(ae.getSource()==b3)
			{
				form8 f = new form8();
				this.setVisible(false);
				f.setVisible(true);
			}
	}


}
