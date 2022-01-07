

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

public class MainLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLogin frame = new MainLogin();
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
	public MainLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 40, 1543, 1258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jButton5 = new JButton();
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButton5.setText("About");
		jButton5.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton5.setBackground(Color.WHITE);
		jButton5.setBounds(1420, 95, 80, 29);
		contentPane.add(jButton5);
		
		JButton jButton6 = new JButton();
		jButton6.setText("Exit");
		jButton6.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton6.setBackground(Color.WHITE);
		jButton6.setBounds(1420, 125, 80, 29);
		contentPane.add(jButton6);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setText("Hospital Management System");
		jLabel3.setOpaque(true);
		jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setFont(new Font("Algerian", Font.BOLD, 36));
		jLabel3.setBackground(new Color(37, 193, 239));
		jLabel3.setBounds(0, 20, 1543, 70);
		contentPane.add(jLabel3);
		
		JLabel jLabel6 = new JLabel();
		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DoctorLImage.png")));
		jLabel6.setBackground(Color.WHITE);
		jLabel6.setBounds(1061, 260, 150, 140);
		contentPane.add(jLabel6);
		
		JLabel jLabel4 = new JLabel();
		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AccountLImage.png")));
		jLabel4.setBounds(821, 260, 150, 140);
		contentPane.add(jLabel4);
		
		JLabel jLabel5 = new JLabel();
		jLabel5.setBounds(341, 260, 140, 140);
		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminLImage.png")));
		contentPane.add(jLabel5);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("Login as  ");
		jLabel2.setOpaque(true);
		jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabel2.setForeground(new Color(37, 193, 239));
		jLabel2.setFont(new Font("Monotype Corsiva", Font.BOLD, 24));
		jLabel2.setBounds(0, 110, 150, 40);
		contentPane.add(jLabel2);
		
		JLabel jLabel7 = new JLabel();
		jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ReceptionistLImage.png")));
		jLabel7.setBounds(581, 260, 150, 130);
		contentPane.add(jLabel7);
		
		JButton jButton1 = new JButton();
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLoginPortal m = new AdminLoginPortal();
				m.setVisible(true);
				dispose();
			}
		});
		jButton1.setText("Administrator");
		jButton1.setForeground(Color.WHITE);
		jButton1.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton1.setBackground(new Color(37, 193, 239));
		jButton1.setBounds(335, 420, 150, 30);
		contentPane.add(jButton1);
		
		JButton jButton2 = new JButton();
		jButton2.setText("Receptionist");
		jButton2.setForeground(Color.WHITE);
		jButton2.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton2.setBackground(new Color(37, 193, 239));
		jButton2.setBounds(581, 420, 150, 30);
		contentPane.add(jButton2);
		
		JButton jButton3 = new JButton();
		jButton3.setText("Accountant");
		jButton3.setForeground(Color.WHITE);
		jButton3.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton3.setBackground(new Color(37, 193, 239));
		jButton3.setBounds(821, 420, 150, 30);
		contentPane.add(jButton3);
		
		JButton jButton4 = new JButton();
		jButton4.setText("Doctor");
		jButton4.setForeground(Color.WHITE);
		jButton4.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton4.setBackground(new Color(37, 193, 239));
		jButton4.setBounds(1061, 420, 150, 30);
		contentPane.add(jButton4);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 24));
		jLabel1.setBounds(0, 0, 1543, 1258);
		contentPane.add(jLabel1);
	}

}
