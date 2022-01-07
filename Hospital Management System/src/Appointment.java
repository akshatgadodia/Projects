

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

public class Appointment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appointment frame = new Appointment();
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
	public Appointment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 40, 1543, 1258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jLabel4 = new JLabel();
		 jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Appointments.png")));
		jLabel4.setBounds(10, 10, 150, 140);
		contentPane.add(jLabel4);
		
		JButton jButton8 = new JButton();
		jButton8.setOpaque(false);
		jButton8.setFocusable(false);
		jButton8.setFocusPainted(false);
		jButton8.setBorderPainted(false);
		jButton8.setBackground(new Color(37, 193, 239));
		jButton8.setBounds(190, 150, 10, 10);
		contentPane.add(jButton8);
		
		JButton jButton2 = new JButton();
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("java.sql.Driver");
					Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/HMS", "root", "akshat8138");
					Statement stmt = con.createStatement();
					String a = textField.getText();
					String b = textField_1.getText();
					String c = textField_4.getText(); //6-7-8-10-14-12-13 //0-1-2-3-4-5-6 //6-7-10-12-8-14-13
					String d = textField_2.getText();
					String e2 = textField_5.getText();
					String f = textField_3.getText();
					String g = textField_6.getText();         
					String sql = "Insert into appointment values('"+a+"','"+b+"','"+c+"','"+d+"','"+e2+"','"+f+"','"+g+"')";
					stmt.executeUpdate(sql);
					con.close();  
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				JOptionPane.showMessageDialog(null, "Appointment Booked Successfully");

				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText(""); 
			}
		});
		jButton2.setText("Book");
		jButton2.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton2.setBackground(Color.WHITE);
		jButton2.setBounds(950, 60, 100, 29);
		contentPane.add(jButton2);
		
		JButton jButton4 = new JButton();
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("java.sql.Driver");
					Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/HMS", "root", "akshat8138");
					Statement stmt = con.createStatement();
					String sql = "Select * from aPPOINtMENT ";
					ResultSet rst=stmt.executeQuery(sql);
					DefaultTableModel tm=(DefaultTableModel)table.getModel();
					while(rst.next())
					{Object o[]={rst.getString("PatientId"),rst.getString("Name"),rst.getString("PatientType"),rst.getString("Date"),rst.getString("Time"),rst.getString("Gender"),rst.getString("PatientMobileNo")};
					tm.addRow(o);
					}
					con.close(); 
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});
		jButton4.setText("Show Appointments");
		jButton4.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton4.setBackground(Color.WHITE);
		jButton4.setBounds(1100, 60, 200, 29);
		contentPane.add(jButton4);
		
		JButton jButton3 = new JButton();
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainLogin m=new MainLogin();
		        m.setVisible(true);
		        dispose();
			}
		});
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HomeButton.png")));
		jButton3.setBounds(1400, 50, 30, 30);
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
				ReceptionistLoginPortal m=new ReceptionistLoginPortal();
		        m.setVisible(true);
		        dispose();
			}
		});
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PowerButton.png")));
		jButton1.setBounds(1450, 50, 30, 30);
		contentPane.add(jButton1);
		
		JButton jButton6 = new JButton();
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReceptionistPortal m=new ReceptionistPortal();
		        m.setVisible(true);
		        dispose();
			}
		});
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackButton.png")));
		jButton6.setOpaque(false);
		jButton6.setBackground(Color.WHITE);
		jButton6.setBounds(170, 130, 30, 30);
		contentPane.add(jButton6);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setText("Appointments");
		jLabel3.setBorder(new EmptyBorder(0,100,0,0));
		jLabel3.setOpaque(true);
		jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setFont(new Font("Algerian", Font.BOLD, 36));
		jLabel3.setBackground(new Color(37, 193, 239));
		jLabel3.setBounds(90, 40, 1503, 70);
		contentPane.add(jLabel3);
		
		JLabel jLabel17 = new JLabel();
		jLabel17.setText("Book a Appointment");
		jLabel17.setFont(new Font("Algerian", Font.PLAIN, 20));
		jLabel17.setBounds(200, 200, 271, 19);
		contentPane.add(jLabel17);
		
		JLabel jLabel18 = new JLabel();
		jLabel18.setText("Show Appointments");
		jLabel18.setFont(new Font("Algerian", Font.PLAIN, 20));
		jLabel18.setBounds(200, 450, 294, 20);
		contentPane.add(jLabel18);
		
		JLabel jLabel5 = new JLabel();
		jLabel5.setText("Patient Id");
		jLabel5.setForeground(new Color(37, 193, 239));
		jLabel5.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel5.setBounds(210, 230, 110, 30);
		contentPane.add(jLabel5);
		
		JLabel jLabel6 = new JLabel();
		jLabel6.setText("Patient Name");
		jLabel6.setForeground(new Color(37, 193, 239));
		jLabel6.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel6.setBounds(210, 270, 110, 30);
		contentPane.add(jLabel6);
		
		JLabel jLabel7 = new JLabel();
		jLabel7.setText("Patient Type");
		jLabel7.setForeground(new Color(37, 193, 239));
		jLabel7.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel7.setBounds(780, 270, 140, 30);
		contentPane.add(jLabel7);
		
		JLabel jLabel8 = new JLabel();
		jLabel8.setText("Date");
		jLabel8.setForeground(new Color(37, 193, 239));
		jLabel8.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel8.setBounds(210, 310, 110, 30);
		contentPane.add(jLabel8);
		
		JScrollPane jScrollPane2 = new JScrollPane();
		jScrollPane2.setBounds(200, 470, 1050, 280);
		contentPane.add(jScrollPane2);
		
		table = new JTable();
		jScrollPane2.setViewportView(table);
		table.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "PatientID", "PatientName", "PatientType", "Date", "Time", "Gender", "PatientMobileNo"
	            }
	        ));
		//jScrollPane2.setViewportView(table);
		
		JLabel jLabel9 = new JLabel();
		jLabel9.setText("Time");
		jLabel9.setForeground(new Color(37, 193, 239));
		jLabel9.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel9.setBounds(780, 310, 110, 30);
		contentPane.add(jLabel9);
		
		JLabel jLabel10 = new JLabel();
		jLabel10.setText("Gender");
		jLabel10.setForeground(new Color(37, 193, 239));
		jLabel10.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel10.setBounds(210, 350, 110, 30);
		contentPane.add(jLabel10);
		
		JLabel jLabel11 = new JLabel();
		jLabel11.setText("Patient Mobile");
		jLabel11.setForeground(new Color(37, 193, 239));
		jLabel11.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel11.setBounds(780, 350, 140, 30);
		contentPane.add(jLabel11);
		
		JButton jButton7 = new JButton();
		jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
				try {
					Class.forName("java.sql.Driver");
					Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/hms", "root", "akshat8138");
					Statement stmt = con.createStatement();
					String sql = "Select * from patient where Patientid='"+a+"' ";
					ResultSet rst=stmt.executeQuery(sql);
					if(rst.next())
					{ 
						textField_1.setText(rst.getString("Name"));
						textField_4.setText(rst.getString("PatientType"));
						textField_3.setText(rst.getString("Gender"));
						textField_6.setText(rst.getString("PhoneNo"));
					}
					else 
						JOptionPane.showMessageDialog(null, "Invalid Patient ID");
					con.close();  
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});
		jButton7.setText("Display");
		jButton7.setBounds(680, 230, 80, 30);
		contentPane.add(jButton7);
		
		textField = new JTextField();
		textField.setBounds(350, 230, 300, 30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(350, 270, 300, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(350, 310, 300, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(350, 350, 300, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(930, 270, 300, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(930, 310, 300, 30);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(930, 350, 300, 30);
		contentPane.add(textField_6);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(200, 220, 1050, 170);
		contentPane.add(panel);
	}
}
