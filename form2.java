// LOG IN 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form2 extends JFrame implements ActionListener
{
	JPanel p;
	JLabel l1,l2,l3,l;
	JTextField un,pw;
	JButton b1,b2;
	ImageIcon img;

	form2()
	{
		super(" LOG-IN ");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p = new JPanel();
		p.setSize(new Dimension(500,500));
		p.setBackground(Color.black);
		p.setLayout(null);

		img = new ImageIcon(getClass().getResource("wallpaperflare.com_wallpaper (2).JPG"));

		l = new JLabel(img);
		l.setBounds(0,7,img.getIconWidth(),550);
		p.add(l);


		l1 = new JLabel(" Log In ");
		l1.setFont(new Font("Arial",Font.BOLD,50));
		l1.setForeground(Color.WHITE);
		l1.setBounds(200,50,450,70);
		l.add(l1);

		l2 = new JLabel(" User Name ");
		l2.setFont(new Font("Arial",Font.BOLD,22));
		l2.setForeground(Color.white);
		l2.setBounds(50,200,150,30);
		l.add(l2);

		l3 = new JLabel(" Password ");
		l3.setFont(new Font("Arial",Font.BOLD,22));
		l3.setForeground(Color.white);
		l3.setBounds(50,305,350,30);
		l.add(l3);


		un = new JTextField();
		un.setFont(new  Font("Arial",Font.BOLD,25));
		un.setBounds(200,200,231,43);
		l.add(un);

		pw = new JPasswordField();
		pw.setFont(new  Font("Arial",Font.BOLD,25));
		pw.setBounds(200,300,231,43);
		l.add(pw);

		b1 = new JButton("Back");
		b1.setBounds(100,470,100,30);
		b1.setBackground(Color.white);
		b1.addActionListener(this);
		l.add(b1);

		b2 = new JButton("Next");
		b2.setBounds(300,470,100,30);
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
			String userName =un.getText();
			String userPassword = pw.getText();
			CreateAccount createAccount = new CreateAccount();

			if(createAccount.getAccount(userName, userPassword))
			{
				JOptionPane.showMessageDialog(null,"Login Successful");

				form4 p = new form4();
				this.setVisible(false);
				p.setVisible(true);


			}
			else{JOptionPane.showMessageDialog(null, "Check UserName/Password");}

		}
		else if(ae.getSource()==b1)
		{
			form f = new form();
			this.setVisible(false);
			f.setVisible(true);
		}
	}
}
