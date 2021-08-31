package smartcity;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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

public class Contact extends JFrame {
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmail;
	private JTextField txtPhoneNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contact frame = new Contact();
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
	public Contact() {
		getContentPane().setBackground(new Color(255, 192, 203));
		getContentPane().setLayout(null);
		
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
		btnNewButton.setBounds(1394, 18, 110, 25);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("User");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User user = new User();
				user.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1.setBounds(1034, 18, 110, 25);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Gallery");
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
		btnNewButton_1_1.setBounds(1274, 18, 110, 25);
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
		btnNewButton_1_1_1.setBounds(1154, 18, 110, 25);
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
		btnNewButton_1_2.setBounds(914, 18, 110, 25);
		getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Home");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Smart City");
		lblNewLabel_1.setBounds(150, 0, 312, 67);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 45));
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		getContentPane().add(lblNewLabel_1);
		
		btnNewButton_1_2_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1_2_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1_2_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1_2_1.setBounds(794, 18, 110, 25);
		getContentPane().add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel = new JLabel("Contact Us");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBounds(0, 100, 1529, 67);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 48));
		getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 60, 1529, 30);
		getContentPane().add(separator);
		
		txtFirstName = new JTextField();
		txtFirstName.setEditable(false);
		txtFirstName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFirstName.setText("");
				txtFirstName.setEditable(true);
			}
			
		});
		txtFirstName.setText("FIRST NAME");
		txtFirstName.setBackground(new Color(248, 248, 255));
		txtFirstName.setBounds(570, 230, 180, 45);
		getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setText("LAST NAME");
		txtLastName.setEditable(false);
		txtLastName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtLastName.setText("");
				txtLastName.setEditable(true);
			}
		});
		txtLastName.setBackground(new Color(248, 248, 255));
		txtLastName.setColumns(10);
		txtLastName.setBounds(760, 230, 180, 45);
		getContentPane().add(txtLastName);
		
		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmail.setText("");
				txtEmail.setEditable(true);
			}
		});
		txtEmail.setText("EMAIL\r\n");
		txtEmail.setBackground(new Color(248, 248, 255));
		txtEmail.setColumns(10);
		txtEmail.setBounds(570, 285, 370, 45);
		getContentPane().add(txtEmail);
		
		txtPhoneNo = new JTextField();
		txtPhoneNo.setEditable(false);
		txtPhoneNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPhoneNo.setText("");
				txtPhoneNo.setEditable(true);
			}
		});
		txtPhoneNo.setText("PHONE NO");
		txtPhoneNo.setBackground(new Color(248, 248, 255));
		txtPhoneNo.setColumns(10);
		txtPhoneNo.setBounds(570, 340, 370, 45);
		getContentPane().add(txtPhoneNo);
		
		JTextArea txtrYourMessage = new JTextArea();
		txtrYourMessage.setText("\r\nYOUR MESSAGE");
		txtrYourMessage.setEditable(false);
		txtrYourMessage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtrYourMessage.setText("");
				txtrYourMessage.setEditable(true);
			}
		});
		txtrYourMessage.setBackground(new Color(248, 248, 255));
		txtrYourMessage.setBounds(570, 395, 370, 100);
		getContentPane().add(txtrYourMessage);
		
		JButton btnNewButton_2 = new JButton("SUBMIT");
		btnNewButton_2.setForeground(new Color(255, 192, 203));
		btnNewButton_2.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_2.setBackground(new Color(30, 144, 255));
		btnNewButton_2.setBounds(674, 540, 162, 56);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("You can also email us here\r\n");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_2.setFont(new Font("Algerian", Font.BOLD, 24));
		lblNewLabel_2.setBounds(0, 662, 1529, 67);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("akshatgadodia@gmail.com");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_2_1.setFont(new Font("Algerian", Font.BOLD, 24));
		lblNewLabel_2_1.setBounds(0, 701, 1529, 67);
		getContentPane().add(lblNewLabel_2_1);
		
		
		
		setBounds(0, 40, 1543, 1258);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
	}
}
