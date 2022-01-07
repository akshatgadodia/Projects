

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountantPortal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountantPortal frame = new AccountantPortal();
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
	public AccountantPortal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 40, 1543, 1258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jButton5 = new JButton();
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantLoginPortal m=new AccountantLoginPortal();
				m.setVisible(true);
				dispose();
			}
		});
		jButton5.setText("Logout");
		jButton5.setForeground(new Color(37, 193, 239));
		jButton5.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton5.setBackground(Color.WHITE);
		jButton5.setBounds(1350, 52, 120, 30);
		contentPane.add(jButton5);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setText("  Accountant portal");
		jLabel3.setOpaque(true);
		jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setFont(new Font("Algerian", Font.BOLD, 36));
		jLabel3.setBackground(new Color(37, 193, 239));
		jLabel3.setBorder(new EmptyBorder(0,100,0,0));
		jLabel3.setBounds(0, 30, 1543, 70);
		contentPane.add(jLabel3);
		
		JButton jButton2 = new JButton();
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantProfile m=new AccountantProfile();
				setVisible(true);
				dispose();  
			}
		});
		jButton2.setText("Profile");
		jButton2.setFont(new Font("Dialog", Font.PLAIN, 24));
		jButton2.setBackground(Color.WHITE);
		jButton2.setBounds(450, 300, 200, 200);
		contentPane.add(jButton2);
		
		JButton jButton3 = new JButton();
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GenerateBill m=new GenerateBill();
				m.setVisible(true);
				dispose();
			}
		});
		jButton3.setText("Generate Bill");
		jButton3.setFont(new Font("Dialog", Font.PLAIN, 24));
		jButton3.setBackground(Color.WHITE);
		jButton3.setBounds(700, 300, 200, 200);
		contentPane.add(jButton3);
		
		JButton jButton4 = new JButton();
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePassword m=new ChangePassword("Accountant");
				m.setVisible(true);
				dispose(); 
			}
		});
		jButton4.setText("Change Password");
		jButton4.setFont(new Font("Dialog", Font.PLAIN, 24));
		jButton4.setBackground(Color.WHITE);
		jButton4.setBounds(1200, 300, 250, 200);
		contentPane.add(jButton4);
		
		JButton jButton7 = new JButton();
		jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewBills m=new ViewBills();
				m.setVisible(true);
				dispose();
			}
		});
		jButton7.setText("View Bills");
		jButton7.setFont(new Font("Dialog", Font.PLAIN, 24));
		jButton7.setBackground(Color.WHITE);
		jButton7.setBounds(950, 300, 200, 200);
		contentPane.add(jButton7);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("Welcome");
		jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel2.setForeground(Color.WHITE);
		jLabel2.setFont(new Font("Algerian", Font.PLAIN, 36));
		jLabel2.setBounds(50, 300, 300, 60);
		contentPane.add(jLabel2);
		
		JLabel jLabel5 = new JLabel();
		jLabel5.setText("To");
		jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel5.setForeground(Color.WHITE);
		jLabel5.setFont(new Font("Algerian", Font.PLAIN, 18));
		jLabel5.setBounds(50, 385, 300, 24);
		contentPane.add(jLabel5);
		
		JLabel jLabel6 = new JLabel();
		jLabel6.setText("Admin Portal");
		jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel6.setForeground(Color.WHITE);
		jLabel6.setFont(new Font("Algerian", Font.PLAIN, 24));
		jLabel6.setBounds(50, 440, 300, 60);
		contentPane.add(jLabel6);
		
		JLabel jLabel7 = new JLabel();
		jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AccountantBG.jpg")));
		jLabel7.setBounds(0, 0, 940, 550);
		contentPane.add(jLabel7);
	}

}
