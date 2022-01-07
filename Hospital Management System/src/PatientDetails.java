

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class PatientDetails extends JFrame {

	public JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_6;
	public JTextField textField_8;
	public JTextField textField_9;
	public JTextField textField_10;
	public JTextField textField_7;
	public JTextField textField_11;
	public JTextField textField_13;
	private JTable table;
	private JTable table1;
	public JComboBox<String> jComboBox2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientDetails frame = new PatientDetails();
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
	public PatientDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 40, 1543, 1258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> jComboBox2_1 = new JComboBox<String>();
		jComboBox2_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			}
		});
		jComboBox2_1.setModel(new DefaultComboBoxModel(new String[] {"Select What Type of Details Do You Want ", "Appointments", "Prescriptions", "Medical History"}));
		jComboBox2_1.setBounds(210, 490, 1070, 30);
		contentPane.add(jComboBox2_1);
		
		table1 = new JTable();

		table1.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "PatientID", "Name", "Age", "Gender", "Date Of Admit", "Date of Discharge", "Blood Group","Address","PhoneNo.","Patient Type","Ward No","Bed No"
	            }
	        ));
		DefaultTableModel tm=(DefaultTableModel)table1.getModel();
		
		
		JButton jButton4 = new JButton();
		jButton4.setBounds(660, 177, 90, 24);
		contentPane.add(jButton4);
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*SearchPatient fr = new SearchPatient();
				fr.setVisible(true);*/
				String a=textField.getText();
				String b=textField_6.getText();
				try {
					Class.forName("java.sql.Driver");
					Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/hms", "root", "akshat8138");
					Statement stmt = con.createStatement();
					if(a.isBlank()&&!b.isBlank()) {
						String sql = "Select * from patient where name like '"+b+"%' ";
						ResultSet rst=stmt.executeQuery(sql);
						if(rst.next())
						{ 
							do {
								System.out.println("HELLO");
								Object o[]={rst.getString("PatientId"),rst.getString("Name"),rst.getString("Age"),rst.getString("Gender"),rst.getString("DateofAdmit"),rst.getString("DateofDischarge"),rst.getString("BloodGroup"),rst.getString("Address"),rst.getString("PhoneNo"),rst.getString("PatientType"),rst.getString("WardNo"),rst.getString("BEdNo")};
								tm.addRow(o);
							}while(rst.next());

							JOptionPane.showMessageDialog(null, table1,"Select Patient",JOptionPane.PLAIN_MESSAGE);
							//JOptionPane.showConfirmDialog(null,table1);
							int ind=table1.getSelectedRow();
							textField.setText((String) table1.getValueAt(ind, 0));
							textField_6.setText((String) table1.getValueAt(ind, 1));
							textField_1.setText((String) table1.getValueAt(ind, 8));
							textField_9.setText((String) table1.getValueAt(ind, 7));
							textField_7.setText((String) table1.getValueAt(ind, 6));
							textField_11.setText((String) table1.getValueAt(ind, 4));
							textField_3.setText((String) table1.getValueAt(ind, 10));
							textField_10.setText((String) table1.getValueAt(ind, 2));
							textField_2.setText((String) table1.getValueAt(ind, 3));
							textField_13.setText((String) table1.getValueAt(ind, 5));
							textField_8.setText((String) table1.getValueAt(ind, 11));
							String pt= (String) table1.getValueAt(ind, 9);
							if(pt.equals("Indoor")) {
								//System.out.println("Ind");
								jComboBox2.setSelectedIndex(2);
							}
							else {
								//System.out.println("Out");
								jComboBox2.setSelectedIndex(2);
							}
						}
						else 
							JOptionPane.showMessageDialog(null, "Invalid Patient ID");
					}
					else if(!a.isBlank()) {
						String sql = "Select * from patient where Patientid='"+a+"' ";
						ResultSet rst=stmt.executeQuery(sql);
						if(rst.next())
						{ 	//System.out.println("RUN");
							textField_6.setText(rst.getString("Name"));
							textField_1.setText(rst.getString("PhoneNo"));
							textField_9.setText(rst.getString("Address"));
							textField_7.setText(rst.getString("BloodGroup"));
							textField_11.setText(rst.getString("DateofAdmit"));
							textField_3.setText(rst.getString("WardNo"));
							textField_10.setText(rst.getString("Age"));
							textField_2.setText(rst.getString("Gender"));
							textField_13.setText(rst.getString("DateofDischarge"));
							textField_8.setText(rst.getString("BedNo"));
							if(rst.getString("PatientType").equals("Indoor")) {
								//System.out.println("Ind");
								jComboBox2.setSelectedIndex(2);
							}
							else {
								//System.out.println("Out");
								jComboBox2.setSelectedIndex(2);
							}
							//setVisible(true);
							}
						else 
							JOptionPane.showMessageDialog(null, "Invalid Patient ID");
					}
					else {
						JOptionPane.showMessageDialog(null, "Enter Patient ID or Name");
					}
				con.close();  
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
		});
		jButton4.setText("Search");
		jButton4.setFont(new Font("Dialog", Font.PLAIN, 15));
		jButton4.setBackground(Color.WHITE);
		
		jComboBox2 = new JComboBox<String>();
		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Patient Type", "Outdoor", "Indoor" }));
		jComboBox2.setBounds(980, 335, 300, 30);
		contentPane.add(jComboBox2);
		
		JLabel jLabel4 = new JLabel();
		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BillLOGO.png")));
		jLabel4.setBounds(0, 0, 150, 140);
		contentPane.add(jLabel4);
		
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
		
		JButton jButton6 = new JButton();
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantPortal m=new AccountantPortal();
		        m.setVisible(true);
		        dispose();
			}
		});
		jButton6.setOpaque(false);
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackButton.png")));
		jButton6.setBackground(Color.WHITE);
		jButton6.setBounds(30, 160, 30, 30);
		contentPane.add(jButton6);
		
		
		JButton jButton5 = new JButton();
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("java.sql.Driver");
					Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/HMS", "root", "manager");
					Statement stmt = con.createStatement();
					int z;
					z=jComboBox2.getSelectedIndex();
					String h=null;
					switch (z){
					case 3:
						h="Indoor";
						break;
					case 2:
						h="Outdoor";
						break;
					default:
						JOptionPane.showMessageDialog(null, "Select Patient Type");}
					String a = textField.getText();
					String b = textField_6.getText();
					String c = textField_10.getText();
					String d = textField_1.getText();
					String e2 = textField_2.getText();
					String f = textField_9.getText();
					String g = textField_7.getText();
					String i = textField_11.getText();
					String j = textField_13.getText();
					String k = textField_3.getText();
					String l = textField_8.getText();
					String sql = "Update patient set PatientID='"+a+"',Name='"+b+"',Gender='"+c+"',phoneno='"+d+"',Address='"+f+"',age='"+e2+"',dateofadmit='"+i+"',dateofdischarge='"+j+"',bloodgroup='"+g+"',patienttype='"+h+"',bedno='"+l+"',wardno='"+k+"'where PatientId='"+a+"' ";
			        stmt.executeUpdate(sql);
					con.close();  
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				JOptionPane.showMessageDialog(null, "Patient Details Added Successfully");   
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_8.setText("");
				textField_7.setText("");
				textField_6.setText("");
				textField_11.setText("");
				textField_10.setText("");
				textField_13.setText("");
				textField_9.setText(""); 
			}
		});
		jButton5.setText("Update");
		jButton5.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton5.setBackground(Color.WHITE);
		jButton5.setBounds(1200, 60, 100, 30);
		contentPane.add(jButton5);
		
		JButton jButton3 = new JButton();
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HomeButton.png"))); 
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 MainLogin ml=new MainLogin();
			     ml.setVisible(true);
			     dispose();
			}
		});
		jButton3.setBounds(1400, 50, 30, 30);
		contentPane.add(jButton3);
		
		JButton jButton1 = new JButton();
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PowerButton.png")));
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantPortal m=new AccountantPortal();
		        m.setVisible(true);
		        dispose(); 
			}
		});
		jButton1.setBounds(1450, 50, 30, 30);
		contentPane.add(jButton1);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setText("Patient Details");
		jLabel3.setBorder(new EmptyBorder(0,100,0,0));
		jLabel3.setOpaque(true);
		jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setFont(new Font("Algerian", Font.BOLD, 36));
		jLabel3.setBackground(new Color(37, 193, 239));
		jLabel3.setBounds(150, 39, 1369, 70);
		contentPane.add(jLabel3);
		
		textField = new JTextField();
		textField.setBounds(350, 175, 300, 30);
		contentPane.add(textField);
		
		JLabel jLabel7 = new JLabel();
		jLabel7.setText("Patient ID");
		jLabel7.setForeground(new Color(37, 193, 239));
		jLabel7.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel7.setBackground(new Color(37, 193, 239));
		jLabel7.setBounds(210, 165, 130, 50);
		contentPane.add(jLabel7);
		
		JLabel jLabel8 = new JLabel();
		jLabel8.setText("Name");
		jLabel8.setForeground(new Color(37, 193, 239));
		jLabel8.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel8.setBackground(new Color(37, 193, 239));
		jLabel8.setBounds(210, 215, 130, 30);
		contentPane.add(jLabel8);
		
		JLabel jLabel13 = new JLabel();
		jLabel13.setText("Age");
		jLabel13.setForeground(new Color(37, 193, 239));
		jLabel13.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel13.setBackground(new Color(37, 193, 239));
		jLabel13.setBounds(800, 215, 160, 30);
		contentPane.add(jLabel13);
		
		textField_1 = new JTextField();
		textField_1.setBounds(350, 255, 300, 30);
		contentPane.add(textField_1);
		
		JLabel jLabel12 = new JLabel();
		jLabel12.setText("Gender");
		jLabel12.setForeground(new Color(37, 193, 239));
		jLabel12.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel12.setBackground(new Color(37, 193, 239));
		jLabel12.setBounds(800, 255, 160, 30);
		contentPane.add(jLabel12);
		
		textField_2 = new JTextField();
		textField_2.setBounds(980, 255, 300, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(350, 415, 300, 30);
		contentPane.add(textField_3);
		
		JLabel jLabel15 = new JLabel();
		jLabel15.setText("Bed No");
		jLabel15.setForeground(new Color(37, 193, 239));
		jLabel15.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel15.setBackground(new Color(37, 193, 239));
		jLabel15.setBounds(800, 415, 160, 30);
		contentPane.add(jLabel15);
		
		JLabel jLabel16 = new JLabel();
		jLabel16.setText("Ward No");
		jLabel16.setForeground(new Color(37, 193, 239));
		jLabel16.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel16.setBackground(new Color(37, 193, 239));
		jLabel16.setBounds(210, 415, 130, 30);
		contentPane.add(jLabel16);
		
		textField_6 = new JTextField();
		textField_6.setBounds(350, 215, 300, 30);
		contentPane.add(textField_6);
		
		textField_8 = new JTextField();
		textField_8.setBounds(980, 415, 300, 30);
		contentPane.add(textField_8);
		
		JLabel jLabel22 = new JLabel();
		jLabel22.setText("Address");
		jLabel22.setForeground(new Color(37, 193, 239));
		jLabel22.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel22.setBackground(new Color(37, 193, 239));
		jLabel22.setBounds(210, 295, 130, 30);
		contentPane.add(jLabel22);
		
		textField_9 = new JTextField();
		textField_9.setBounds(350, 295, 930, 30);
		contentPane.add(textField_9);
		
		JLabel jLabel9 = new JLabel();
		jLabel9.setText("Mobile No.");
		jLabel9.setForeground(new Color(37, 193, 239));
		jLabel9.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel9.setBackground(new Color(37, 193, 239));
		jLabel9.setBounds(210, 255, 130, 30);
		contentPane.add(jLabel9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(980, 215, 300, 30);
		contentPane.add(textField_10);
		
		JLabel jLabel8_1 = new JLabel();
		jLabel8_1.setText("Blood Group");
		jLabel8_1.setForeground(new Color(37, 193, 239));
		jLabel8_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel8_1.setBackground(new Color(37, 193, 239));
		jLabel8_1.setBounds(210, 335, 130, 30);
		contentPane.add(jLabel8_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(350, 335, 300, 30);
		contentPane.add(textField_7);
		
		JLabel jLabel9_1 = new JLabel();
		jLabel9_1.setText("Date of Admit");
		jLabel9_1.setForeground(new Color(37, 193, 239));
		jLabel9_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel9_1.setBackground(new Color(37, 193, 239));
		jLabel9_1.setBounds(210, 375, 130, 30);
		contentPane.add(jLabel9_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(350, 375, 300, 30);
		contentPane.add(textField_11);
		
		JLabel jLabel13_1 = new JLabel();
		jLabel13_1.setText("Patient Type");
		jLabel13_1.setForeground(new Color(37, 193, 239));
		jLabel13_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel13_1.setBackground(new Color(37, 193, 239));
		jLabel13_1.setBounds(800, 335, 160, 30);
		contentPane.add(jLabel13_1);
		
		JLabel jLabel12_1 = new JLabel();
		jLabel12_1.setText("Date Of Discharge");
		jLabel12_1.setForeground(new Color(37, 193, 239));
		jLabel12_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel12_1.setBackground(new Color(37, 193, 239));
		jLabel12_1.setBounds(800, 375, 160, 30);
		contentPane.add(jLabel12_1);
		
		textField_13 = new JTextField();
		textField_13.setBounds(980, 375, 300, 30);
		contentPane.add(textField_13);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(200, 165, 1120, 291);
		contentPane.add(panel);
		
		JScrollPane jScrollPane21 = new JScrollPane();
		jScrollPane21.setBounds(240, 530, 1050, 240);
		contentPane.add(jScrollPane21);
		
		table = new JTable();
		jScrollPane21.setViewportView(table);
		table.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "PatientID", "PatientName", "PatientType", "Date", "Time", "Gender", "PatientMobileNo"
	            }
	        ));
		jScrollPane21.setVisible(false);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(200, 480, 1120, 300);
		contentPane.add(panel_1_1);
	}
}