// TIME SHEDULE

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form4 extends JFrame implements ActionListener {
	JPanel p;
	JLabel l1,  l4,  l7,  l;
	JRadioButton l3, l6, l9;
	ButtonGroup g;
	JButton b1, b2;
	ImageIcon img;


	form4() {
		super(" Cricket Ticket ");
		this.setSize(1000, 560);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p = new JPanel();
		p.setSize(new Dimension(450, 300));
		p.setBackground(Color.green);
		p.setLayout(null);

		g = new ButtonGroup();

		img = new ImageIcon(getClass().getResource("illustration-batsman-cricket-game-watercolor-background-banner-ai-generated_852336-7224.JPG"));

		l = new JLabel(img);
		l.setBounds(0, 0, img.getIconWidth(), 550);
		p.add(l);

		l1 = new JLabel("                     CRICKET MATCHES");
		l1.setFont(new Font("Arial",Font.BOLD,50));
		l1.setForeground(Color.white);
		l1.setOpaque(true);
		l1.setBackground(Color.red);
		l1.setBounds(10,20,950,70);
		l.add(l1);

		l1 = new JLabel("SAT,16 Aug 2024 ( 1:00 PM )");
		l1.setFont(new Font("Arial", Font.BOLD, 20));
		l1.setForeground(Color.white);
		l1.setBounds(50, 100, 450, 50);
		l.add(l1);



		l3 = new JRadioButton(" BANGLADESH VS ENGLAND ");
		l3.setFont(new Font("Arial", Font.BOLD, 25));
		l3.setForeground(Color.white);
		l3.setBackground(Color.black);
		l3.setOpaque(false);
		l3.setBounds(50, 150, 380, 25);
		l3.addActionListener(this);
		l.add(l3);

		l4 = new JLabel(" TUES,20 Aug 2024( 1:00 PM ) ");
		l4.setFont(new Font("Arial", Font.BOLD, 20));
		l4.setForeground(Color.white);
		l4.setBounds(50, 220, 350, 30);
		l.add(l4);


		l6 = new JRadioButton(" INDIA VS PAKISTAN");
		l6.setFont(new Font("Arial", Font.BOLD, 25));
		l6.setForeground(Color.white);
		l6.setBackground(Color.black);
		l6.setOpaque(false);
		l6.setBounds(50, 260, 360, 30);
		l6.addActionListener(this);
		l.add(l6);

		l7 = new JLabel(" WED,28 Aug 2024( 1:00 PM )");
		l7.setFont(new Font("Arial", Font.BOLD, 20));
		l7.setForeground(Color.white);
		l7.setBounds(50, 320, 350, 30);
		l.add(l7);



		l9 = new JRadioButton("AUSTRALIA VS IRELAND");
		l9.setFont(new Font("Arial", Font.BOLD, 25));
		l9.setForeground(Color.white);
		l9.setBackground(Color.black);
		l9.setOpaque(false);
		l9.setBounds(50, 350, 350, 30);
		l9.addActionListener(this);
		l.add(l9);

		b1 = new JButton("Back");
		b1.setBounds(400, 470, 150, 40); // Larger size
		b1.setBackground(Color.white);
		b1.setFont(new Font("Arial", Font.BOLD, 20)); // Larger font
		b1.addActionListener(this);
		l.add(b1);

		g.add(l3);
		g.add(l6);
		g.add(l9);

		this.add(p);

	}


public void actionPerformed(ActionEvent ae)
		{
		    if(ae.getSource()==b1)
			{
				form2 f = new form2();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==l3)
			{
				form5 f = new form5();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==l6)
			{
				form5 f = new form5();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==l9)
			{
				form5 f = new form5();
				this.setVisible(false);
				f.setVisible(true);
			}
		}


}
