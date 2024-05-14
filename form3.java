// SIGN UP 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form3 extends JFrame implements ActionListener
{
	JPanel p;
	JLabel l1,l2,l3,l4,l5,l6,l7,l;
	JButton b1,b2;
	JTextField t1,t2,t3,t4,t5,t6;
	ImageIcon img;

	form3()
	{
		super(" Sign up ");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p = new JPanel();
		p.setSize(new Dimension(300,300));
		p.setBackground(Color.black);
		p.setLayout(null);

		img = new ImageIcon(getClass().getResource("wallpaperflare.com_wallpaper (2) - Copy.JPG"));

		l = new JLabel(img);
		l.setBounds(0,0,img.getIconWidth(),550);
		p.add(l);


		l1 = new JLabel(" SIGN-UP ");
		l1.setFont(new Font("Arial",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(220,50,450,50);
		l.add(l1);

		l2 = new JLabel("Full Name ");
		l2.setFont(new Font("Arial",Font.BOLD,22));
		l2.setForeground(Color.white);
		l2.setBounds(100,150,370,30);
		l.add(l2);

		l3 = new JLabel("NID ");
		l3.setFont(new Font("Arial",Font.BOLD,22));
		l3.setForeground(Color.white);
		l3.setBounds(100,200,350,30);
		l.add(l3);

		l4 = new JLabel("Email ");
		l4.setFont(new Font("Arial",Font.BOLD,22));
		l4.setForeground(Color.white);
		l4.setBounds(100,250,350,30);
		l.add(l4);

		l5 = new JLabel("User Name ");
		l5.setFont(new Font("white",Font.BOLD,22));
		l5.setForeground(Color.white);
		l5.setBounds(100,300,350,30);
		l.add(l5);

		l6 = new JLabel("Password ");
		l6.setFont(new Font("Arial",Font.BOLD,22));
		l6.setForeground(Color.white);
		l6.setBounds(100,350,350,30);
		l.add(l6);

		l7 = new JLabel("Confirm Password ");
		l7.setFont(new Font("Arial",Font.BOLD,22));
		l7.setForeground(Color.white);
		l7.setBounds(100,400,350,30);
		l.add(l7);


		t1 = new JTextField();
		t1.setFont(new  Font("Arial",Font.BOLD,18));
		t1.setBounds(373,150,173,29);
		l.add(t1);

		t2 = new JTextField();
		t2.setFont(new  Font("",Font.BOLD,18));
		t2.setBounds(373,200,173,29);
		l.add(t2);


		t3 = new JTextField();
		t3.setFont(new  Font("Arial",Font.BOLD,18));
		t3.setBounds(373,250,173,29);
		l.add(t3);

		t4 = new JTextField();
		t4.setFont(new  Font("Comic Sans MS",Font.BOLD,18));
		t4.setBounds(373,300,173,29);
		l.add(t4);

		t5 = new JTextField();
		t5.setFont(new  Font("Comic Sans MS",Font.BOLD,18));
		t5.setBounds(373,350,173,29);
		l.add(t5);

		t6 = new JTextField();
		t6.setFont(new  Font("Comic Sans MS",Font.BOLD,18));
		t6.setBounds(373,400,173,29);
		l.add(t6);

		b1 = new JButton("Back");
		b1.setBounds(100,470,100,30);
		b1.setBackground(Color.white);
		b1.addActionListener(this);
		l.add(b1);

		b2 = new JButton("Next");
		b2.setBounds(380,470,100,30);
		b2.setBackground(Color.white);
		b2.setBorderPainted(false);
		b2.setFocusable(false);
		b2.addActionListener(this);
		l.add(b2);


		this.add(p);

	}


	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{
			String fullName = t1.getText();
			String nID = t2.getText();
			String userEmail = t3.getText();
			String userName = t4.getText();
			String userPassword = t5.getText();
			String userPasswordConfirm = t6.getText();

			if(fullName.isEmpty() ||  nID.isEmpty() || userEmail.isEmpty() || userName.isEmpty() || userPassword.isEmpty() || userPasswordConfirm.isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Full Fill All Box");
			}
			else if(userPassword.equals(userPasswordConfirm))
			{
				CreateAccount createAccount = new CreateAccount(fullName, nID, userEmail, userName, userPassword);
				createAccount.addAccount();
				JOptionPane.showMessageDialog(null, "Account Added");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");

				form f = new form();
				this.setVisible(false);
				f.setVisible(true);

			}
			else{JOptionPane.showMessageDialog(null, "Check Password");}


		}
		else if(ae.getSource()==b1)
		{

			form f = new form();
			this.setVisible(false);
			f.setVisible(true);
		}
	}
}