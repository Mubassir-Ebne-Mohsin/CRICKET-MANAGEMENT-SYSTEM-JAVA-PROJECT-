// HOME PAGE

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form extends JFrame implements ActionListener
{
	JPanel p;
	JLabel l,l1;
	JButton b1,b2,b3;
	ImageIcon img;

	form()
	{
		super(" CRICKET MANAGEMENT SYSTEM ");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p = new JPanel();
		p.setSize(new Dimension(300,300));
		p.setBackground(Color.black);
		p.setLayout(null);

		img = new ImageIcon(getClass().getResource("desktop-wallpaper-cricket-bat-cricket-stump (2).JPG"));

		l = new JLabel(img);
		l.setBounds(0,0,img.getIconWidth(),590);
		p.add(l);

		l1 = new JLabel("    CRICKET MANAGEMENT SYSTEM");
		l1.setFont(new Font("Arial",Font.BOLD,33));
		l1.setForeground(Color.white);
		l1.setOpaque(true);
		l1.setBackground(Color.red);
		l1.setBounds(0,80,600,50);
		l.add(l1);

		b1 = new JButton("Log In");
		b1.setBounds(100,430,120,33);
		b1.setFont(new Font("Arial",Font.BOLD,18));
		b1.setBackground(Color.white);
		b1.addActionListener(this);
		l.add(b1);

		b2 = new JButton("Sign Up");
		b2.setBounds(350,430,120,33);
		b2.setFont(new Font("Arial",Font.BOLD,18));
		b2.setBackground(Color.white);
		b2.addActionListener(this);
		l.add(b2);


		b3 = new JButton(" Exit ");
		b3.setBounds(230,500,120,30);
		b3.setFont(new Font("Arial",Font.BOLD,18));
		b3.setBackground(Color.white);
		b3.addActionListener(this);
		l.add(b3);

		this.add(p);

	}


	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			form2 t= new form2();
			this.setVisible(false);
			t.setVisible(true);
		}
		else if(ae.getSource()==b2)
		{
			form3 s = new form3();
			this.setVisible(false);
			s.setVisible(true);
		}
		else if(ae.getSource()==b3)
		{
			int choice = JOptionPane.showConfirmDialog(null,"Do you want to quit this program?","quit",JOptionPane.YES_NO_OPTION);

			if(choice == JOptionPane.YES_OPTION)
			{

				System.exit(0);

			}
			else
			{
				form p = new form();
				this.setVisible(false);
				p.setVisible(true);
			}
		}
	}


}