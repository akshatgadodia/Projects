

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

public class AdminPortal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPortal frame = new AdminPortal();
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
	public AdminPortal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 40, 1543, 1258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jLabel4 = new JLabel();
		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminLImage.png")));
		jLabel4.setBounds(5, 5, 140, 140);
		contentPane.add(jLabel4);
		
		JButton jButton1 = new JButton();
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLoginPortal m=new AdminLoginPortal();
				m.setVisible(true);
				dispose();  
			}
		});
		jButton1.setText("Logout");
		jButton1.setForeground(new Color(37, 193, 239));
		jButton1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jButton1.setBackground(Color.WHITE);
		jButton1.setBounds(1350, 60, 120, 30);
		contentPane.add(jButton1);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setText("       Admin Portal");
		jLabel3.setOpaque(true);
		jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setFont(new Font("Algerian", Font.BOLD, 36));
		jLabel3.setBackground(new Color(37, 193, 239));
		jLabel3.setBounds(141, 40, 1402, 70);
		contentPane.add(jLabel3);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("Welcome");
		jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel2.setForeground(Color.WHITE);
		jLabel2.setFont(new Font("Algerian", Font.PLAIN, 36));
		jLabel2.setBounds(50, 311, 300, 60);
		contentPane.add(jLabel2);
		
		JLabel jLabel6 = new JLabel();
		jLabel6.setText("Admin Portal");
		jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel6.setForeground(Color.WHITE);
		jLabel6.setFont(new Font("Algerian", Font.PLAIN, 24));
		jLabel6.setBounds(50, 459, 300, 60);
		contentPane.add(jLabel6);
		
		JLabel jLabel5 = new JLabel();
		jLabel5.setText("To");
		jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel5.setForeground(Color.WHITE);
		jLabel5.setFont(new Font("Algerian", Font.PLAIN, 18));
		jLabel5.setBounds(50, 401, 300, 24);
		contentPane.add(jLabel5);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setOpaque(true);
		jLabel1.setBackground(new Color(37, 193, 239));
		jLabel1.setBounds(50, 180, 300, 500);
		contentPane.add(jLabel1);
		
		JButton jButton2 = new JButton();
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Appointment m=new Appointment();
				m.setVisible(true);
				dispose(); 
			}
		});
		jButton2.setText("Appointments");
		jButton2.setFont(new Font("Dialog", Font.PLAIN, 24));
		jButton2.setBounds(450, 450, 200, 200);
		contentPane.add(jButton2);
		
		JButton jButton3 = new JButton();
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IdPassword m=new IdPassword();
				m.setVisible(true);
				dispose();
			}
		});
		jButton3.setText("ID-Password");
		jButton3.setFont(new Font("Dialog", Font.PLAIN, 24));
		jButton3.setBounds(1200, 450, 200, 200);
		contentPane.add(jButton3);
		
		JButton jButton4 = new JButton();
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GenerateBill m=new GenerateBill();
				m.setVisible(true);
				dispose();
			}
		});
		jButton4.setText("Generate Bill");
		jButton4.setFont(new Font("Dialog", Font.PLAIN, 24));
		jButton4.setBounds(700, 450, 200, 200);
		contentPane.add(jButton4);
		
		JButton jButton5 = new JButton();
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorProfile m=new DoctorProfile();
				m.setVisible(true);
				dispose();
			}
		});
		jButton5.setText("Doctors");
		jButton5.setFont(new Font("Dialog", Font.PLAIN, 24));
		jButton5.setBounds(1200, 210, 200, 200);
		contentPane.add(jButton5);
		
		JButton jButton6 = new JButton();
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewBills m=new ViewBills();
				m.setVisible(true);
				dispose();
			}
		});
		jButton6.setText("View Bills");
		jButton6.setFont(new Font("Dialog", Font.PLAIN, 24));
		jButton6.setBounds(950, 450, 200, 200);
		contentPane.add(jButton6);
		
		JButton jButton7 = new JButton();
		jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReceptionistProfile m=new ReceptionistProfile();
				m.setVisible(true);
				dispose();
			}
			
		});
		jButton7.setText("Receptionists");
		jButton7.setFont(new Font("Dialog", Font.PLAIN, 24));
		jButton7.setBounds(700, 210, 200, 200);
		contentPane.add(jButton7);
		
		JButton jButton8 = new JButton();
		jButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientDetails m=new PatientDetails();
				m.setVisible(true);
				dispose();
			}
		});
		jButton8.setText("Patient Details");
		jButton8.setFont(new Font("Dialog", Font.PLAIN, 24));
		jButton8.setBounds(450, 210, 200, 200);
		contentPane.add(jButton8);
		
		JButton jButton9 = new JButton();
		jButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantProfile m=new AccountantProfile();
				m.setVisible(true);
				dispose(); 
			}
		});
		jButton9.setText("Accountants");
		jButton9.setFont(new Font("Dialog", Font.PLAIN, 24));
		jButton9.setBounds(950, 210, 200, 200);
		contentPane.add(jButton9);
	}

}
