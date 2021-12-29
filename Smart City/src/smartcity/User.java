package smartcity;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JPasswordField;

public class User extends JFrame {
	private JTextField txtUsername;
	private JPasswordField passwordField;
	HomePage HomePage = new HomePage();
	JLabel userLabel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
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
		
		JLabel lblNewLabel = new JLabel("User");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBounds(0, 80, 1529, 67);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 48));
		getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 60, 1529, 33);
		getContentPane().add(separator);
		
		JButton btnNewButton_1_2_1_1 = new JButton("ADMIN LOGIN\r\n");
		btnNewButton_1_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminLogin adminLogin = new AdminLogin();
				adminLogin.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2_1_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1_2_1_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1_2_1_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1_2_1_1.setBounds(50, 78, 200, 25);
		getContentPane().add(btnNewButton_1_2_1_1);
		
		txtUsername = new JTextField();
		txtUsername.setEditable(true);
		txtUsername.setColumns(10);
		txtUsername.setBackground(new Color(248, 248, 255));
		txtUsername.setBounds(572, 219, 370, 45);
		getContentPane().add(txtUsername);
		
		JButton btnNewButton_2 = new JButton("Register\r\n");
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
		btnNewButton_2.setBounds(572, 500, 150, 45);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Reset Password\r\n");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2_1.setForeground(new Color(255, 192, 203));
		btnNewButton_2_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_2_1.setBackground(new Color(30, 144, 255));
		btnNewButton_2_1.setBounds(732, 500, 210, 45);
		getContentPane().add(btnNewButton_2_1);
		
		userLabel = new JLabel("\r\n");
		userLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userLabel.setForeground(new Color(30, 144, 255));
		userLabel.setFont(new Font("Algerian", Font.PLAIN, 24));
		userLabel.setBounds(1180, 0, 312, 67);
		getContentPane().add(userLabel);
		if(HomePage.getUserData().isAuthentiation()) {
		userLabel.setText(HomePage.getUserData().getUserId());}
		
		JButton btnNewButton_2_2 = new JButton("LOGIN");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userid=txtUsername.getText(),password=passwordField.getText(),pass="";
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/smartcity", "root", "akshat8138");
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("select * from user where email='"+userid+"';");
					int k=0;
					while(rs.next()) {
						pass=rs.getString("PASSWORD");
						if (pass.equals(password)&&pass!=null) {
							//JOptionPane.showMessageDialog(null, "Login Successfully");
							HomePage.userData.setAuthentiation(true);
							HomePage.userData.setUserId(userid);
							userLabel.setText(HomePage.getUserData().getUserId());
							HomePage.userData.setFname(rs.getString("FIRSTNAME"));
							HomePage.userData.setLname(rs.getString("LASTNAME"));
							HomePage.userData.setPassword(pass);
							HomePage.userData.setSecurityQues(rs.getString("SECURITYQUESTION"));
							HomePage.userData.setSecurityAns(rs.getString("SECURITYANSWER"));
							UserProfile user = new UserProfile();
							user.setVisible(true);
							dispose();
							k=1;
						}
				    }
		            if(k==0)
		            	JOptionPane.showMessageDialog(null, "Password Incorrect");
					conn.close();
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		btnNewButton_2_2.setForeground(new Color(255, 192, 203));
		btnNewButton_2_2.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_2_2.setBackground(new Color(30, 144, 255));
		btnNewButton_2_2.setBounds(674, 400, 162, 56);
		getContentPane().add(btnNewButton_2_2);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(572, 309, 370, 45);
		getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(572, 201, 100, 20);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("PASSWORD\r\n");
		lblNewLabel_2_1.setForeground(Color.BLUE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(572, 291, 100, 20);
		getContentPane().add(lblNewLabel_2_1);
		
		setBounds(0, 40, 1543, 1258);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
		
	}
}
