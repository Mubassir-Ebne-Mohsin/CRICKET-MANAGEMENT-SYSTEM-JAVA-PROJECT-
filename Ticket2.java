import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ticket2 extends JFrame implements ActionListener
{

   
	JPanel X;
	JLabel X1,X2,X3,X4,X5,X6,X7,X8,X9,l;
	JButton b1,b2;
	ImageIcon img;
	             
	
	Ticket2()
	{
                                         
		super("CRICKET TICKET");
		this.setSize(1100,600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                            
		
		X = new JPanel();
		X.setSize(new Dimension(450,300));
		X.setBackground(Color.WHITE);
		X.setLayout(null);
		
	   	img = new ImageIcon(getClass().getResource("Untitled design (10) (1).JPG"));
		
		l = new JLabel(img);
		l.setBounds(0,7,img.getIconWidth(),550);
		X.add(l);
		
		X1 = new JLabel("     CRICKET TICKET");
		X1.setFont(new Font("Arial",Font.BOLD,40));
		X1.setForeground(Color.black);
		X1.setBackground(Color.white);
		X1.setOpaque(false);
		X1.setBounds(130,20,3000,30);
		l.add(X1);
                
        X2 = new JLabel("TICKET DETAILS");
		X2.setFont(new Font("Arial",Font.BOLD,22));
		X2.setForeground(Color.black);
		X2.setBounds(200,100,500,30);
		l.add(X2);
                
                                           
		
		X3 = new JLabel("  Zone        - 2nd class ");
		X3.setFont(new Font("Arial",Font.BOLD,25));
		X3.setForeground(Color.white);
		X3.setOpaque(true);
		X3.setBackground(Color.black);
		X3.setBounds(200,170,350,35);

		l.add(X3);
                
                                            
                
                 
		
		X4= new JLabel("  Date         - 16 Aug 2024 ");
		X4.setFont(new Font("Arial",Font.BOLD,25));
		X4.setForeground(Color.white);
		X4.setOpaque(true);
		X4.setBackground(Color.black);
		X4.setBounds(200,230,350,35);
		l.add(X4);
                
                
		
		X5 = new JLabel("  Seat         - B2");
		X5.setFont(new Font("Arial",Font.BOLD,25));
		X5.setForeground(Color.white);
		X5.setOpaque(true);
		X5.setBackground(Color.black);
		X5.setBounds(200,200,350,35);
		l.add(X5);
                
              
		
	    X6 = new JLabel("  Time        - 1pm");
		X6.setFont(new Font("ARIAL",Font.BOLD,25));
		X6.setForeground(Color.white);
		X6.setOpaque(true);
		X6.setBackground(Color.black);
		X6.setBounds(200,260,350,35);
		l.add(X6);
                
                
        X7 = new JLabel("ENJOY THE CRICKET MATCH");
		X7.setFont(new Font("Arial",Font.BOLD,25));
		X7.setForeground(Color.black);
		X7.setBounds(200,400,650,30);
		l.add(X7);
                
        X8 = new JLabel("                 _______________________________________________________________________________________________________________________________________________________");
		X8.setFont(new Font("Arial",Font.BOLD,18));
		X8.setForeground(Color.black);
		X8.setBounds(20,420,3000,50);
		l.add(X8);
                
                
        X9 = new JLabel(" Venue        : Mirpur Stadium");
		X9.setFont(new Font("Arial",Font.BOLD,25));
		X9.setForeground(Color.white);
		X9.setOpaque(true);
		X9.setBackground(Color.red);
		X9.setBounds(200,300,350,40);
		l.add(X9);       
		
		b1 = new JButton("Exit");
		b1.setBounds(650,470,100,30);
		b1.setBackground(Color.white);
        b1.addActionListener(this);
		l.add(b1);
		
		b2 = new JButton("Re-book");
		b2.setBounds(100,470,100,30);
		b2.setBackground(Color.white);
        b2.addActionListener(this);
		l.add(b2);
                
        this.add(X);
		
	}


	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b2)
			{	
			 	form4 f = new form4();
			    this.setVisible(false);
                f.setVisible(true);
			}
			else if(ae.getSource()==b1)
			{
			    System.exit(0);
			}
		}


}