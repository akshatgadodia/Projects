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

public class User extends JFrame {

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
		lblNewLabel_1.setBounds(150, 0, 312, 67);
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
		btnNewButton_1_2_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1_2_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1_2_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1_2_1.setBounds(794, 18, 110, 25);
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
		
		setBounds(0, 40, 1543, 1258);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
		
	}
}
