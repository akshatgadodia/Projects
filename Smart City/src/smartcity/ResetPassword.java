package smartcity;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class ResetPassword extends JFrame {
	private JTextField txtPhoneNo;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField txtSecurityAnswer;
	HomePage HomePage = new HomePage();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResetPassword frame = new ResetPassword();
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
	public ResetPassword() {
		getContentPane().setBackground(new Color(255, 192, 203));
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Contact");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResetPassword contact = new ResetPassword();
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
		
		JButton btnNewButton_1_1 = new JButton("City Info");
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
		
		JLabel lblNewLabel_1 = new JLabel("Smart City");
		lblNewLabel_1.setBounds(50, 0, 312, 67);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 45));
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		getContentPane().add(lblNewLabel_1);
		
		btnNewButton_1_2_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1_2_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1_2_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1_2_1.setBounds(413, 18, 110, 25);
		getContentPane().add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel = new JLabel("Reset Password\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBounds(0, 100, 1529, 67);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 48));
		getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 60, 1529, 30);
		getContentPane().add(separator);
		
		txtPhoneNo = new JTextField();
		txtPhoneNo.setEditable(false);
		txtPhoneNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPhoneNo.setText("");
				txtPhoneNo.setEditable(true);
			}
		});
		txtPhoneNo.setText("SECURITY QUESTION");
		txtPhoneNo.setBackground(new Color(248, 248, 255));
		txtPhoneNo.setColumns(10);
		txtPhoneNo.setBounds(570, 232, 370, 45);
		getContentPane().add(txtPhoneNo);
		
		JButton btnNewButton_2 = new JButton("Reset Password\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Password Reset Successfully");
				User user = new User();
				user.setVisible(true);
				dispose();
				HomePage.userData.resetFields();
			}
		});
		btnNewButton_2.setForeground(new Color(255, 192, 203));
		btnNewButton_2.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_2.setBackground(new Color(30, 144, 255));
		btnNewButton_2.setBounds(666, 581, 194, 56);
		getContentPane().add(btnNewButton_2);
		
		JLabel userLabel = new JLabel("");
		userLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userLabel.setForeground(new Color(30, 144, 255));
		userLabel.setFont(new Font("Algerian", Font.PLAIN, 24));
		userLabel.setBounds(1180, 0, 312, 67);
		getContentPane().add(userLabel);
		if(HomePage.userData.isAuthentiation()) {
		userLabel.setText(HomePage.userData.getUserId());}
		
		JLabel lblNewLabel_2_1 = new JLabel("PASSWORD\r\n");
		lblNewLabel_2_1.setForeground(Color.BLUE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(570, 332, 141, 20);
		getContentPane().add(lblNewLabel_2_1);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(248, 248, 255));
		passwordField.setBounds(570, 350, 370, 45);
		getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("CONFIRM PASSWORD\r\n");
		lblNewLabel_2_1_1.setForeground(Color.BLUE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(570, 397, 141, 20);
		getContentPane().add(lblNewLabel_2_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(new Color(248, 248, 255));
		passwordField_1.setBounds(570, 415, 370, 45);
		getContentPane().add(passwordField_1);
		
		txtSecurityAnswer = new JTextField();
		txtSecurityAnswer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtSecurityAnswer.setText("");
				txtSecurityAnswer.setEditable(true);
			}
		});
		txtSecurityAnswer.setText("SECURITY ANSWER");
		txtSecurityAnswer.setEditable(false);
		txtSecurityAnswer.setColumns(10);
		txtSecurityAnswer.setBackground(new Color(248, 248, 255));
		txtSecurityAnswer.setBounds(570, 287, 370, 45);
		getContentPane().add(txtSecurityAnswer);
		
		
		
		setBounds(0, 40, 1543, 1258);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
	}
}
