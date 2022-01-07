

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class ChangePassword extends JFrame {
	private String actype="";

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePassword frame = new ChangePassword("");
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
	public ChangePassword(String actypein) {
		this.actype=actypein;
		//System.out.println(actype);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 40, 1543, 1258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setText("Change "+actype+" Password");
		jLabel3.setOpaque(true);
		jLabel3.setBorder(new EmptyBorder(0,100,0,0));
		jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setFont(new Font("Algerian", Font.BOLD, 36));
		jLabel3.setBackground(new Color(37, 193, 239));
		jLabel3.setBounds(0, 10, 775, 70);
		contentPane.add(jLabel3);
		
		JLabel jLabel6 = new JLabel();
		jLabel6.setText("Username");
		jLabel6.setForeground(new Color(37, 193, 239));
		jLabel6.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel6.setBackground(new Color(37, 193, 239));
		jLabel6.setBounds(400, 190, 120, 30);
		contentPane.add(jLabel6);
		
		textField = new JTextField();
		textField.setBounds(565, 190, 210, 30);
		contentPane.add(textField);
		
		JLabel jLabel7 = new JLabel();
		jLabel7.setText("Old Password");
		jLabel7.setForeground(new Color(37, 193, 239));
		jLabel7.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel7.setBackground(new Color(37, 193, 239));
		jLabel7.setBounds(400, 230, 120, 30);
		contentPane.add(jLabel7);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(565, 230, 210, 30);
		contentPane.add(passwordField);
		
		JButton jButton5 = new JButton();
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a,b,c,d;
				a=textField.getText();
				b=passwordField.getText();
				c=passwordField_1.getText();
				d=passwordField_2.getText();
				try {
					Class.forName("java.sql.Driver");
					Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/hms", "root", "akshat8138");
					Statement stmt = con.createStatement();
					String sql = "update "+actype+" set password='"+c+"' where username='"+a+"'and password='"+b+"'";
					if(c.equals(d))
						stmt.executeUpdate(sql);
					else
						JOptionPane.showMessageDialog(null, "New Password Does not match");
					con.close();  
				} catch (Exception e1) 
				{JOptionPane.showMessageDialog(null, e1.getMessage());
				}            
				JOptionPane.showMessageDialog(null, "Password Updated Successfully");
				textField.setText("");
				passwordField_1.setText("");
				passwordField_2.setText("");
				passwordField.setText("");
			}
		});
		jButton5.setText("Save");
		jButton5.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton5.setBackground(Color.WHITE);
		jButton5.setBounds(600, 471, 100, 30);
		contentPane.add(jButton5);
		
		JLabel jLabel5 = new JLabel();
		jLabel5.setText("New Password");
		jLabel5.setForeground(new Color(37, 193, 239));
		jLabel5.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel5.setBackground(new Color(37, 193, 239));
		jLabel5.setBounds(400, 270, 150, 30);
		contentPane.add(jLabel5);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(565, 270, 210, 30);
		contentPane.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(565, 310, 210, 30);
		contentPane.add(passwordField_2);
		
		JLabel jLabel8 = new JLabel();
		jLabel8.setText("Confirm Password");
		jLabel8.setForeground(new Color(37, 193, 239));
		jLabel8.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel8.setBackground(new Color(37, 193, 239));
		jLabel8.setBounds(400, 310, 150, 30);
		contentPane.add(jLabel8);
		
		JButton jButton6 = new JButton();
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackButton.png")));
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantPortal m=new AccountantPortal();
		        m.setVisible(true);
		        dispose();
			}
		});
		jButton6.setOpaque(false);
		jButton6.setBackground(Color.WHITE);
		jButton6.setBounds(28, 102, 30, 30);
		contentPane.add(jButton6);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setBounds(0, 0, 1543, 845);
		contentPane.add(jLabel2);
	}

}
