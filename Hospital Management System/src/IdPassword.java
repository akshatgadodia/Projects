

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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;

public class IdPassword extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JRadioButton jRadioButton1;
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton3;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IdPassword frame = new IdPassword();
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
	public IdPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 40, 1543, 1258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jButton4 = new JButton();
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = null,b = null;
				b=textField_2.getText();
				if(jRadioButton1.isSelected())
				{a="Accountant";}
				else if (jRadioButton2.isSelected())
				{a="Doctor";}
				else if (jRadioButton3.isSelected())
				{a="Receptionist";}
				else
					JOptionPane.showMessageDialog(null, "Select Account Type");
				try {
					Class.forName("java.sql.Driver");
					Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/hms", "root", "akshat8138");
					Statement stmt = con.createStatement();
					String sql = "Select * from "+a+" where Name='"+b+"'";
					ResultSet rst=stmt.executeQuery(sql);
					if(rst.next())
					{ 
						textField.setText(rst.getString("Username"));
						textField_1.setText(rst.getString("Password"));
					}
					else 
						JOptionPane.showMessageDialog(null, "Invalid "+a+" Name");
					con.close();  
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}     
			}
		});
		jButton4.setText("Search");
		jButton4.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton4.setBackground(Color.WHITE);
		jButton4.setBounds(950, 60, 100, 29);
		contentPane.add(jButton4);
		
		JButton jButton5 = new JButton();
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options1 = { "Accountant", "Doctor","Receptionist" };
				int result = JOptionPane.showOptionDialog(null, "Click on Account Type Whose Password You Want To Change",null,
				        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
				        null, options1, null);
				 if (result == JOptionPane.YES_OPTION){
					ChangePassword m = new ChangePassword("Accountant");
					m.setVisible(true);
					dispose();
				 }
				 else if (result == JOptionPane.NO_OPTION){
					ChangePassword m = new ChangePassword("Doctor");
					m.setVisible(true);
					dispose();
				 }
				 else {
					 ChangePassword m = new ChangePassword("Receptionist");;
						m.setVisible(true);
						dispose();
				}
				/*String a=JOptionPane.showInputDialog(null, "Enter Account Type whose Password you want to change")  ; 
				if(a.equals("Accountant"))
				{ 
					ChangePassword m = new ChangePassword("Accountant");
					m.setVisible(true);
					dispose();
				}
				else if(a.equals("Doctor"))
				{ 
					ChangePassword m = new ChangePassword("Doctor");
					m.setVisible(true);
					dispose();
					}
				else if(a.equals("Receptionist"))
				{ 
					ChangePassword m = new ChangePassword("Receptionist");;
					m.setVisible(true);
					dispose();
					}
				else 
				    JOptionPane.showMessageDialog(null, "Invalid Account Type");*/
			}
		});
		jButton5.setText("Change Password");
		jButton5.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton5.setBackground(Color.WHITE);
		jButton5.setBounds(1100, 60, 200, 29);
		contentPane.add(jButton5);
		
		JButton jButton3 = new JButton();
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainLogin m=new MainLogin();
		        m.setVisible(true);
		        dispose();
			}
		});
		jButton3.setBounds(1400, 50, 30, 30);
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HomeButton.png")));
		contentPane.add(jButton3);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("Home");
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setForeground(Color.WHITE);
		jLabel1.setBounds(1397, 80, 34, 14);
		contentPane.add(jLabel1);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("  Logout");
		jLabel2.setForeground(Color.WHITE);
		jLabel2.setBounds(1441, 80, 50, 14);
		contentPane.add(jLabel2);
		
		JButton jButton1 = new JButton();
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 AdminLoginPortal m=new AdminLoginPortal();
			     m.setVisible(true);
			     dispose();    
			}
		});
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PowerButton.png")));
		jButton1.setBounds(1450, 50, 30, 30);
		contentPane.add(jButton1);
		
		JLabel jLabel4 = new JLabel();
		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminLImage.png")));
		jLabel4.setBounds(0, 0, 150, 140);
		contentPane.add(jLabel4);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setText("Manage Accounts");
		jLabel3.setOpaque(true);
		jLabel3.setBorder(new EmptyBorder(0,100,0,0));
		jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setFont(new Font("Algerian", Font.BOLD, 36));
		jLabel3.setBackground(new Color(37, 193, 239));
		jLabel3.setBounds(150, 39, 1369, 70);
		contentPane.add(jLabel3);
		
		jRadioButton1 = new JRadioButton();
		buttonGroup.add(jRadioButton1);
		jRadioButton1.setText("Accountant");
		jRadioButton1.setFont(new Font("Dialog", Font.PLAIN, 18));
		jRadioButton1.setBounds(210, 210, 130, 29);
		contentPane.add(jRadioButton1);
		
		jRadioButton2 = new JRadioButton();
		buttonGroup.add(jRadioButton2);
		jRadioButton2.setText("Doctor");
		jRadioButton2.setFont(new Font("Dialog", Font.PLAIN, 18));
		jRadioButton2.setBounds(210, 250, 130, 29);
		contentPane.add(jRadioButton2);
		
		jRadioButton3 = new JRadioButton();
		buttonGroup.add(jRadioButton3);
		jRadioButton3.setText("Receptionist");
		jRadioButton3.setFont(new Font("Dialog", Font.PLAIN, 18));
		jRadioButton3.setBounds(210, 290, 130, 29);
		contentPane.add(jRadioButton3);
		
		JLabel jLabel7 = new JLabel();
		jLabel7.setText("Password");
		jLabel7.setForeground(new Color(37, 193, 239));
		jLabel7.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel7.setBackground(new Color(37, 193, 239));
		jLabel7.setBounds(770, 610, 110, 30);
		contentPane.add(jLabel7);
		
		JLabel jLabel8 = new JLabel();
		jLabel8.setText("Username");
		jLabel8.setForeground(new Color(37, 193, 239));
		jLabel8.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel8.setBackground(new Color(37, 193, 239));
		jLabel8.setBounds(210, 610, 130, 30);
		contentPane.add(jLabel8);
		
		textField = new JTextField();
		textField.setBounds(310, 610, 300, 30);
		contentPane.add(textField);
		
		JLabel jLabel9 = new JLabel();
		jLabel9.setText("Name");
		jLabel9.setForeground(new Color(37, 193, 239));
		jLabel9.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel9.setBackground(new Color(37, 193, 239));
		jLabel9.setBounds(210, 450, 120, 30);
		contentPane.add(jLabel9);
		
		JLabel jLabel18 = new JLabel();
		jLabel18.setText("Select Account Type");
		jLabel18.setFont(new Font("Algerian", Font.PLAIN, 20));
		jLabel18.setBounds(200, 180, 250, 20);
		contentPane.add(jLabel18);
		
		textField_1 = new JTextField();
		textField_1.setBounds(910, 610, 300, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(350, 450, 300, 30);
		contentPane.add(textField_2);
		
		JButton jButton6 = new JButton();
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPortal m=new AdminPortal();
		        m.setVisible(true);
		        dispose();
			}
		});
		jButton6.setOpaque(false);
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackButton.png")));
		jButton6.setBackground(Color.WHITE);
		jButton6.setBounds(110, 150, 30, 20);
		contentPane.add(jButton6);
		
		JLabel jLabel100 = new JLabel();
		jLabel100.setText("Enter Name");
		jLabel100.setFont(new Font("Algerian", Font.PLAIN, 20));
		jLabel100.setBounds(200, 420, 210, 19);
		contentPane.add(jLabel100);
		
		JLabel jLabel19 = new JLabel();
		jLabel19.setText("Username and password");
		jLabel19.setFont(new Font("Algerian", Font.PLAIN, 20));
		jLabel19.setBounds(200, 580, 250, 19);
		contentPane.add(jLabel19);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(200, 200, 300, 130);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(200, 440, 1120, 50);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(200, 600, 1120, 50);
		contentPane.add(panel_1_1);
	}
}
