

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class AccountantProfile extends JFrame {

	private JPanel contentPane;
	private JPasswordField jPasswordField1;
	private JTextField textField_16;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountantProfile frame = new AccountantProfile();
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
	public AccountantProfile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 40, 1543, 1258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jButton5 = new JButton();
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField_5.getText();
				String b=jPasswordField1.getText();
				try {Class.forName("java.sql.Driver");
				Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/HMS", "root", "manager");
				Statement stmt = con.createStatement();
				String x = textField_6.getText();
				String y = textField_7.getText();
				String c = textField_8.getText();
				String d = textField_9.getText();
				String e2 =textField_10.getText();
				String f = textField_11.getText();
				String g = textField_12.getText(); 
				String h = textField_13.getText(); 
				String i = textField_14.getText(); 
				String j = textField_15.getText(); 
				String sql = "Update accountant set AccountantID='"+x+"',Name='"+y+"',Gender='"+c+"',Address='"+d+"',DOB='"+e2+"',Qualification='"+f+"',MobileNo='"+g+"',EmailId='"+h+"',Personname='"+i+"',phoneno='"+j+"'where Username='"+a+"' and Password='"+b+"' ";
				stmt.executeUpdate(sql);
				con.close();  
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				JOptionPane.showMessageDialog(null, "Profile Updated Successfully");    
				textField_5.setText("");
				jPasswordField1.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
			}
		});
		jButton5.setText("Update\r\n");
		jButton5.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton5.setBackground(Color.WHITE);
		jButton5.setBounds(1200, 60, 100, 30);
		contentPane.add(jButton5);
		
		JButton jButton4 = new JButton();
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField_5.getText();
				String b=jPasswordField1.getText();
				try {Class.forName("java.sql.Driver");
				Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/hms", "root", "akshat8138");
				Statement stmt = con.createStatement();
				String sql = "Select * from Accountant where Username='"+a+"' and Password='"+b+"' ";
				ResultSet rst=stmt.executeQuery(sql);
				if(rst.next())
				{ 
					textField_6.setText(rst.getString("AccountantId"));
					textField_7.setText(rst.getString("Name"));
					textField_9.setText(rst.getString("address"));
					textField_8.setText(rst.getString("gender"));
					textField_11.setText(rst.getString("qualification"));
					textField_10.setText(rst.getString("dob"));
					textField_12.setText(rst.getString("mobileno"));
					textField_13.setText(rst.getString("emailid"));
					textField_14.setText(rst.getString("Personname"));
					textField_15.setText(rst.getString("phoneno"));
				}
				else 
					JOptionPane.showMessageDialog(null, "Invalid Data Entered");
				con.close();  
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}     
			}
		});
		jButton4.setText("Search");
		jButton4.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton4.setBackground(Color.WHITE);
		jButton4.setBounds(1050, 60, 100, 29);
		contentPane.add(jButton4);
		
		JButton jButton1 = new JButton();
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PowerButton.png")));
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantLoginPortal m=new AccountantLoginPortal();
		        m.setVisible(true);
		        dispose();
			}
		});
		jButton1.setBounds(1450, 50, 30, 30);
		contentPane.add(jButton1);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("Home");
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setForeground(Color.WHITE);
		jLabel1.setBounds(1397, 80, 34, 14);
		contentPane.add(jLabel1);
		
		JButton jButton6 = new JButton();
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 AccountantPortal m=new AccountantPortal();
			     m.setVisible(true);
			     dispose();
			}
		});
		jButton6.setOpaque(false);
		jButton6.setBackground(Color.WHITE);
		jButton6.setBounds(20, 160, 30, 30);
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackButton.png")));
		contentPane.add(jButton6);
		
		JButton jButton3 = new JButton();
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HomeButton.png")));
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainLogin m=new MainLogin();
				m.setVisible(true);
				dispose();
			}
		});
		jButton3.setBounds(1400, 50, 30, 30);
		contentPane.add(jButton3);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("  Logout");
		jLabel2.setForeground(Color.WHITE);
		jLabel2.setBounds(1441, 80, 50, 14);
		contentPane.add(jLabel2);
		
		JButton jButton2 = new JButton();
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("java.sql.Driver");
					Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/HMS", "root", "akshat8138");
					Statement stmt = con.createStatement();
					String a = textField_5.getText();
					String b = jPasswordField1.getText();
					String c = textField_6.getText();
					String d = textField_7.getText();
					String f = textField_8.getText();
					String x = textField_9.getText();
					String h = textField_10.getText();
					String g = textField_11.getText();
					String i = textField_12.getText();
					String j = textField_13.getText();
					String k = textField_14.getText();
					String l = textField_15.getText();
					String sql = "Insert into accountant values('"+a+"','"+b+"','"+c+"','"+d+"','"+x+"','"+f+"','"+g+"','"+h+"','"+i+"','"+k+"','"+k+"','"+l+"')";
					String pass=JOptionPane.showInputDialog(null, "Enter Administrator Password");
					if(pass.equals("hospital"))
						stmt.executeUpdate(sql);
					else 
						JOptionPane.showMessageDialog(null, "Wrong Administrator Password");
					con.close();  
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				JOptionPane.showMessageDialog(null, "Data Added Successfully");     
				textField_5.setText("");
				jPasswordField1.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");// TODO add your handling code here:
		}
	});
		jButton2.setText("Save");
		jButton2.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton2.setBackground(Color.WHITE);
		jButton2.setBounds(900, 60, 100, 29);
		contentPane.add(jButton2);
		
		JLabel jLabel4 = new JLabel();
		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AccountLImage.png")));
		jLabel4.setBounds(0, 0, 150, 140);
		contentPane.add(jLabel4);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel3.setText("Accountant profile");
		jLabel3.setOpaque(true);
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setBorder(new EmptyBorder(0,100,0,0));
		jLabel3.setFont(new Font("Algerian", Font.BOLD, 36));
		jLabel3.setBackground(new Color(37, 193, 239));
		jLabel3.setBounds(150, 39, 1369, 70);
		contentPane.add(jLabel3);
		
		JLabel jLabel5 = new JLabel();
		jLabel5.setText("Accountant ID");
		jLabel5.setForeground(new Color(37, 193, 239));
		jLabel5.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel5.setBackground(new Color(37, 193, 239));
		jLabel5.setBounds(210, 310, 130, 30);
		contentPane.add(jLabel5);
		
		JLabel jLabel6 = new JLabel();
		jLabel6.setText("Username");
		jLabel6.setForeground(new Color(37, 193, 239));
		jLabel6.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel6.setBackground(new Color(37, 193, 239));
		jLabel6.setBounds(210, 200, 130, 50);
		contentPane.add(jLabel6);
		
		JLabel jLabel7 = new JLabel();
		jLabel7.setText("Password");
		jLabel7.setForeground(new Color(37, 193, 239));
		jLabel7.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel7.setBackground(new Color(37, 193, 239));
		jLabel7.setBounds(770, 200, 130, 50);
		contentPane.add(jLabel7);
		
		JLabel jLabel8 = new JLabel();
		jLabel8.setText("Name");
		jLabel8.setForeground(new Color(37, 193, 239));
		jLabel8.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel8.setBackground(new Color(37, 193, 239));
		jLabel8.setBounds(210, 350, 130, 30);
		contentPane.add(jLabel8);
		
		JLabel jLabel9 = new JLabel();
		jLabel9.setText("Gender");
		jLabel9.setForeground(new Color(37, 193, 239));
		jLabel9.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel9.setBackground(new Color(37, 193, 239));
		jLabel9.setBounds(770, 350, 130, 30);
		contentPane.add(jLabel9);
		
		JLabel jLabel18 = new JLabel();
		jLabel18.setText("Personal Details");
		jLabel18.setFont(new Font("Algerian", Font.PLAIN, 20));
		jLabel18.setBounds(200, 280, 1150, 19);
		contentPane.add(jLabel18);
		
		JLabel jLabel17 = new JLabel();
		jLabel17.setText("LOGIN DETAILS");
		jLabel17.setFont(new Font("Algerian", Font.PLAIN, 20));
		jLabel17.setBounds(200, 180, 180, 19);
		contentPane.add(jLabel17);
		
		JLabel jLabel10 = new JLabel();
		jLabel10.setText("Address");
		jLabel10.setForeground(new Color(37, 193, 239));
		jLabel10.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel10.setBackground(new Color(37, 193, 239));
		jLabel10.setBounds(210, 390, 130, 30);
		contentPane.add(jLabel10);
		
		JLabel jLabel11 = new JLabel();
		jLabel11.setText("DOB");
		jLabel11.setForeground(new Color(37, 193, 239));
		jLabel11.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel11.setBackground(new Color(37, 193, 239));
		 jLabel11.setBounds(210, 430, 130, 30);
		contentPane.add(jLabel11);
		
		JLabel jLabel12 = new JLabel();
		jLabel12.setText("Qualification");
		jLabel12.setForeground(new Color(37, 193, 239));
		jLabel12.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel12.setBackground(new Color(37, 193, 239));
		jLabel12.setBounds(770, 430, 130, 30);
		contentPane.add(jLabel12);
		
		JLabel jLabel13 = new JLabel();
		jLabel13.setText("Mobile No");
		jLabel13.setForeground(new Color(37, 193, 239));
		jLabel13.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel13.setBackground(new Color(37, 193, 239));
		jLabel13.setBounds(210, 520, 130, 30);
		contentPane.add(jLabel13);
		
		JLabel jLabel14 = new JLabel();
		jLabel14.setText("E-Mail ID");
		jLabel14.setForeground(new Color(37, 193, 239));
		jLabel14.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel14.setBackground(new Color(37, 193, 239));
		jLabel14.setBounds(210, 560, 130, 30);
		contentPane.add(jLabel14);
		
		JLabel jLabel15 = new JLabel();
		jLabel15.setText("Person Name");
		jLabel15.setForeground(new Color(37, 193, 239));
		jLabel15.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel15.setBackground(new Color(37, 193, 239));
		jLabel15.setBounds(770, 520, 130, 30);
		contentPane.add(jLabel15);
		
		JLabel jLabel20 = new JLabel();
		jLabel20.setText("Emergency Contact Details");
		jLabel20.setFont(new Font("Algerian", Font.PLAIN, 20));
		jLabel20.setBounds(765, 490, 545, 19);
		contentPane.add(jLabel20);
		
		JLabel jLabel19 = new JLabel();
		jLabel19.setText("Contact Details");
		jLabel19.setFont(new Font("Algerian", Font.PLAIN, 20));
		jLabel19.setBounds(200, 490, 180, 19);
		contentPane.add(jLabel19);
		
		JLabel jLabel16 = new JLabel();
		jLabel16.setText("Mobile No");
		jLabel16.setForeground(new Color(37, 193, 239));
		jLabel16.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel16.setBackground(new Color(37, 193, 239));
		jLabel16.setBounds(770, 560, 130, 50);
		contentPane.add(jLabel16);
		
		jPasswordField1 = new JPasswordField();
		jPasswordField1.setBounds(910, 210, 210, 30);
		contentPane.add(jPasswordField1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(350, 210, 300, 30);
		
		textField_6 = new JTextField();
		textField_6.setBounds(350, 310, 300, 30);
		contentPane.add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setBounds(350, 350, 300, 30);
		contentPane.add(textField_6);
		
		textField_8 = new JTextField();
		textField_8.setBounds(910, 350, 300, 30);
		contentPane.add(textField_7);
		
		textField_9 = new JTextField();
		textField_9.setBounds(350, 390, 858, 30);
		contentPane.add(textField_8);
		
		textField_10 = new JTextField();
		textField_10.setBounds(350, 430, 300, 30);
		contentPane.add(textField_9);
		
		textField_16 = new JTextField();
		textField_16.setBounds(0, 0, 950, 560);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(910, 430, 300, 30);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setBounds(350, 520, 300, 30);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setBounds(350, 560, 300, 30);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setBounds(910, 520, 300, 30);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setBounds(910, 560, 300, 30);
		contentPane.add(textField_15);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(200, 200, 1120, 50);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(200, 300, 1120, 170);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(200, 510, 545, 90);
		contentPane.add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1_1.setBounds(765, 510, 555, 90);
		contentPane.add(panel_1_1_1);
	}
}
