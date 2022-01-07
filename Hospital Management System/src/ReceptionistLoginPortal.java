

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ReceptionistLoginPortal extends JFrame {


	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReceptionistLoginPortal frame = new ReceptionistLoginPortal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReceptionistLoginPortal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 40, 1543, 1258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel3.setText("Hospital Management System");
		jLabel3.setOpaque(true);
		//jLabel3.setBorder(new EmptyBorder(0,100,0,0));
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setFont(new Font("Algerian", Font.BOLD, 36));
		jLabel3.setBackground(new Color(37, 193, 239));
		jLabel3.setBounds(0, 20, 1543, 70);
		contentPane.add(jLabel3);
		
		JLabel jLabel4 = new JLabel();
		jLabel4.setText("Login Here");
		jLabel4.setForeground(Color.WHITE);
		jLabel4.setFont(new Font("Dialog", Font.PLAIN, 36));
		jLabel4.setBounds(150, 200, 226, 40);
		contentPane.add(jLabel4);
		
		JLabel jLabel7 = new JLabel();
		jLabel7.setToolTipText("");
		jLabel7.setBounds(581, 370, 25, 25);
		jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lOCK.png")));
		contentPane.add(jLabel7);
		
		JLabel jLabel5 = new JLabel();
		jLabel5.setText("RECEPTIONIST LOGIN PANEL");
		jLabel5.setForeground(Color.WHITE);
		jLabel5.setFont(new Font("Dialog", Font.PLAIN, 24));
		jLabel5.setBounds(150, 250, 355, 29);
		contentPane.add(jLabel5);
		
		JLabel jLabel6 = new JLabel();
		 jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Username.png")));
		jLabel6.setBounds(581, 327, 25, 25);
		contentPane.add(jLabel6);
		
		JButton jButton1 = new JButton();
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b,c = null;
				b = passwordField.getText();
				try {
					Class.forName("java.sql.Driver");
					Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/HMS", "root", "akshat8138");
					Statement stmt = con.createStatement();
					String a=textField.getText();
					String sql = "Select * from accountant  where  Username='"+a+"'";
					ResultSet rst=stmt.executeQuery(sql);
					if(rst.next())
					{c=rst.getString("Password");}
					else
						JOptionPane.showMessageDialog(null, "Invalid Username");
	
					con.close();  
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}    
				if(b.equals(c)){
					AccountantPortal m=new AccountantPortal();
					m.setVisible(true);
					dispose();
				}
				else
					JOptionPane.showMessageDialog(null, "Username and Password does not Match");
			}
		});
		jButton1.setText("Login");
		jButton1.setBackground(new Color(37, 193, 239));
		jButton1.setBounds(680, 471, 100, 40);
		contentPane.add(jButton1);
		
		textField = new JTextField();
		textField.setBounds(611, 321, 250, 30);
		contentPane.add(textField);
		
		JButton jButton2 = new JButton();
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackButton.png")));
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainLogin m=new MainLogin();
				m.setVisible(true);
				dispose();
			}
		});
		jButton2.setOpaque(false);
		jButton2.setBackground(Color.WHITE);
		jButton2.setBounds(50, 120, 30, 20);
		contentPane.add(jButton2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(611, 370, 250, 30);
		contentPane.add(passwordField);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setOpaque(true);
		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login Portal Image.png")));
		jLabel2.setBackground(Color.WHITE);
		jLabel2.setBounds(0, 0, 900, 530);
		contentPane.add(jLabel2);
	}

}