

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
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

public class ViewBills extends JFrame {


	private JPanel contentPane;
	private JTextField textField_16;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBills frame = new ViewBills();
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
	public ViewBills() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 40, 1543, 1258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jButton5 = new JButton();
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("java.sql.Driver");
					Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/HMS", "root", "akshat8138");
					Statement stmt = con.createStatement();
					String sql = "Select * from bill;";
					ResultSet rst=stmt.executeQuery(sql);
					DefaultTableModel tm=(DefaultTableModel)table.getModel();
					while(rst.next())
					{		
						Object o[]={rst.getString("BillNo"),rst.getString("PatientId"),rst.getString("Name"),rst.getString("PatientType"),rst.getString("DateOfAdmit"),rst.getString("Dateofdischarge"),rst.getString("TotalAmount"),rst.getString("ModeofPayment"),rst.getString("Narration")};
						tm.addRow(o);
					}
					con.close(); 
				} 
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}     
			}
		});
		jButton5.setText("View Bills");
		jButton5.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton5.setBackground(Color.WHITE);
		jButton5.setBounds(1180, 60, 120, 30);
		contentPane.add(jButton5);
		
		JButton jButton1 = new JButton();
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PowerButton.png")));
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoctorLoginPortal m=new DoctorLoginPortal();
		        m.setVisible(true);
		        dispose();
			}
		});
		jButton1.setBounds(1450, 50, 30, 30);
		contentPane.add(jButton1);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("Home");
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setForeground(Color.WHITE);
		jLabel1.setBounds(1397, 80, 34, 14);
		contentPane.add(jLabel1);
		
		JButton jButton6 = new JButton();
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 DoctorPortal m=new DoctorPortal();
			     m.setVisible(true);
			     dispose();
			}
		});
		jButton6.setOpaque(false);
		jButton6.setBackground(Color.WHITE);
		jButton6.setBounds(20, 160, 30, 30);
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackButton.png")));
		contentPane.add(jButton6);
		
		JButton jButton3 = new JButton();
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HomeButton.png")));
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainLogin m=new MainLogin();
				m.setVisible(true);
				dispose();
			}
		});
		jButton3.setBounds(1400, 50, 30, 30);
		contentPane.add(jButton3);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("  Logout");
		jLabel2.setForeground(Color.WHITE);
		jLabel2.setBounds(1441, 80, 50, 14);
		contentPane.add(jLabel2);
		
		JLabel jLabel4 = new JLabel();
		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BillLOGO.png")));
		jLabel4.setBounds(0, 0, 150, 140);
		contentPane.add(jLabel4);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel3.setText("View Bills\r\n");
		jLabel3.setOpaque(true);
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setBorder(new EmptyBorder(0,100,0,0));
		jLabel3.setFont(new Font("Algerian", Font.BOLD, 36));
		jLabel3.setBackground(new Color(37, 193, 239));
		jLabel3.setBounds(150, 39, 1369, 70);
		contentPane.add(jLabel3);
		
		textField_16 = new JTextField();
		textField_16.setBounds(0, 0, 950, 560);
		
		JScrollPane jScrollPane2 = new JScrollPane();
		jScrollPane2.setBounds(200, 250, 1150, 400);
		contentPane.add(jScrollPane2);
		
		table = new JTable();
		jScrollPane2.setViewportView(table);
		table.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                    "Bill No", "Patient ID", "Name", "Patient Type", "Date of Admit", "Date of Discharge", "Total Amount", "Mode of Payment", "Narration"
	                }
	        ));
	}
}