package smartcity;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class UserProfile extends JFrame {
	HomePage HomePage = new HomePage();
	JLabel userLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtPass;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserProfile frame = new UserProfile();
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
	public UserProfile() {
		getContentPane().setBackground(new Color(255, 192, 203));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Smart City");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 45));
		lblNewLabel_1.setBounds(50, 0, 312, 67);
		getContentPane().add(lblNewLabel_1);
		
		
		
		JButton btnNewButton = new JButton("Contact");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contact contact = new Contact();
				contact.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(255, 192, 203));
		btnNewButton.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(1023, 18, 110, 25);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("User");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HomePage.userData.isAuthentiation()) {
					UserProfile userPro = new UserProfile();
					userPro.setVisible(true);
					dispose();
				}
				else {
					User user = new User();
					user.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1.setBounds(653, 18, 110, 25);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("City Info\r\n");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gallery gallery = new Gallery();
				gallery.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1_1.setBounds(893, 18, 120, 25);
		getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Events");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Events event = new Events();
				event.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1_1_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1_1_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1_1_1.setBounds(773, 18, 110, 25);
		getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("About");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About about = new About();
				about.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2.setForeground(new Color(255, 192, 203));
		btnNewButton_1_2.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1_2.setBackground(new Color(30, 144, 255));
		btnNewButton_1_2.setBounds(533, 18, 110, 25);
		getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Home");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1_2_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1_2_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1_2_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1_2_1.setBounds(413, 18, 110, 25);
		getContentPane().add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel = new JLabel("PROFILE\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBounds(0, 80, 1529, 67);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 48));
		getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 60, 1529, 33);
		getContentPane().add(separator);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterUser RegisterUser = new RegisterUser();
				RegisterUser.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(255, 192, 203));
		btnNewButton_2.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_2.setBackground(new Color(30, 144, 255));
		btnNewButton_2.setBounds(587, 667, 150, 45);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Reset Password\r\n");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setForeground(new Color(255, 192, 203));
		btnNewButton_2_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_2_1.setBackground(new Color(30, 144, 255));
		btnNewButton_2_1.setBounds(747, 667, 210, 45);
		getContentPane().add(btnNewButton_2_1);
		
		userLabel = new JLabel("\r\n");
		userLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userLabel.setForeground(new Color(30, 144, 255));
		userLabel.setFont(new Font("Algerian", Font.PLAIN, 24));
		userLabel.setBounds(1180, 0, 312, 67);
		getContentPane().add(userLabel);
		if(HomePage.getUserData().isAuthentiation()) {
		userLabel.setText(HomePage.userData.getUserId());}
		
		JButton btnNewButton_2_2 = new JButton("LOGOUT\r\n");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage.userData.resetFields();
				User user = new User();
				user.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_2_2.setForeground(new Color(255, 192, 203));
		btnNewButton_2_2.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_2_2.setBackground(new Color(30, 144, 255));
		btnNewButton_2_2.setBounds(689, 567, 162, 56);
		getContentPane().add(btnNewButton_2_2);
		
		textField = new JTextField();
		textField.setText("FIRST NAME");
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(248, 248, 255));
		textField.setBounds(587, 217, 180, 45);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("LAST NAME");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(248, 248, 255));
		textField_1.setBounds(777, 217, 180, 45);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("EMAIL\r\n");
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(248, 248, 255));
		textField_2.setBounds(587, 272, 370, 45);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("SECURITY QUESTION");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(248, 248, 255));
		textField_3.setBounds(587, 382, 370, 45);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("SECURITY ANSWER");
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(248, 248, 255));
		textField_4.setBounds(587, 437, 370, 45);
		getContentPane().add(textField_4);

		
		txtPass = new JTextField();
		txtPass.setText("PASS");
		txtPass.setEditable(false);
		txtPass.setColumns(10);
		txtPass.setBackground(new Color(248, 248, 255));
		txtPass.setBounds(587, 327, 370, 45);
		getContentPane().add(txtPass);
		
		textField.setText(HomePage.userData.getFname());
		textField_1.setText(HomePage.userData.getLname());
		textField_2.setText(HomePage.userData.getUserId());
		textField_3.setText(HomePage.userData.getSecurityQues());
		textField_4.setText(HomePage.userData.getSecurityAns());
		txtPass.setText(HomePage.userData.getPassword());
		
		setBounds(0, 40, 1543, 1258);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
		
	}
}
