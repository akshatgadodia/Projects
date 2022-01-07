

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegisterPatient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_7;
	private JTextField textField_11;
	private JTextField textField_13;

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
	public RegisterPatient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 40, 1543, 1258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> jComboBox2 = new JComboBox<String>();
		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Patient Type", "Outdoor", "Indoor" }));
		jComboBox2.setBounds(980, 410, 300, 30);
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
		
		JButton jButton2 = new JButton();
		jButton2.addActionListener(new ActionListener() {
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
					String sql = "Insert into patient values('"+a+"','"+b+"','"+c+"','"+e2+"','"+i+"','"+j+"','"+g+"','"+f+"','"+d+"','"+h+"','"+k+"','"+l+"')";
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
				textField_9.setText("");      // TODO add your handling code here:
			}
	});
		jButton2.setText("Save");
		jButton2.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton2.setBackground(Color.WHITE);
		jButton2.setBounds(1200, 60, 100, 29);
		contentPane.add(jButton2);
		
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
		jLabel3.setText("Register Patient\r\n");
		jLabel3.setBorder(new EmptyBorder(0,100,0,0));
		jLabel3.setOpaque(true);
		jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setFont(new Font("Algerian", Font.BOLD, 36));
		jLabel3.setBackground(new Color(37, 193, 239));
		jLabel3.setBounds(150, 39, 1369, 70);
		contentPane.add(jLabel3);
		
		textField = new JTextField();
		textField.setBounds(350, 250, 300, 30);
		contentPane.add(textField);
		
		JLabel jLabel7 = new JLabel();
		jLabel7.setText("Patient ID");
		jLabel7.setForeground(new Color(37, 193, 239));
		jLabel7.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel7.setBackground(new Color(37, 193, 239));
		jLabel7.setBounds(210, 240, 130, 50);
		contentPane.add(jLabel7);
		
		JLabel jLabel8 = new JLabel();
		jLabel8.setText("Name");
		jLabel8.setForeground(new Color(37, 193, 239));
		jLabel8.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel8.setBackground(new Color(37, 193, 239));
		jLabel8.setBounds(210, 290, 130, 30);
		contentPane.add(jLabel8);
		
		JLabel jLabel13 = new JLabel();
		jLabel13.setText("Age");
		jLabel13.setForeground(new Color(37, 193, 239));
		jLabel13.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel13.setBackground(new Color(37, 193, 239));
		jLabel13.setBounds(800, 290, 160, 30);
		contentPane.add(jLabel13);
		
		textField_1 = new JTextField();
		textField_1.setBounds(350, 330, 300, 30);
		contentPane.add(textField_1);
		
		JLabel jLabel12 = new JLabel();
		jLabel12.setText("Gender");
		jLabel12.setForeground(new Color(37, 193, 239));
		jLabel12.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel12.setBackground(new Color(37, 193, 239));
		jLabel12.setBounds(800, 330, 160, 30);
		contentPane.add(jLabel12);
		
		textField_2 = new JTextField();
		textField_2.setBounds(980, 330, 300, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(350, 600, 300, 30);
		contentPane.add(textField_3);
		
		JLabel jLabel15 = new JLabel();
		jLabel15.setText("Bed No");
		jLabel15.setForeground(new Color(37, 193, 239));
		jLabel15.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel15.setBackground(new Color(37, 193, 239));
		jLabel15.setBounds(800, 600, 160, 30);
		contentPane.add(jLabel15);
		
		JLabel jLabel17 = new JLabel();
		jLabel17.setText("(for Indoor patients only)");
		jLabel17.setFont(new Font("Algerian", Font.PLAIN, 20));
		jLabel17.setBounds(200, 570, 300, 19);
		contentPane.add(jLabel17);
		
		JLabel jLabel16 = new JLabel();
		jLabel16.setText("Ward No");
		jLabel16.setForeground(new Color(37, 193, 239));
		jLabel16.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel16.setBackground(new Color(37, 193, 239));
		jLabel16.setBounds(210, 600, 130, 30);
		contentPane.add(jLabel16);
		
		textField_6 = new JTextField();
		textField_6.setBounds(350, 290, 300, 30);
		contentPane.add(textField_6);
		
		textField_8 = new JTextField();
		textField_8.setBounds(980, 600, 300, 30);
		contentPane.add(textField_8);
		
		JLabel jLabel22 = new JLabel();
		jLabel22.setText("Address");
		jLabel22.setForeground(new Color(37, 193, 239));
		jLabel22.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel22.setBackground(new Color(37, 193, 239));
		jLabel22.setBounds(210, 370, 130, 30);
		contentPane.add(jLabel22);
		
		textField_9 = new JTextField();
		textField_9.setBounds(350, 370, 930, 30);
		contentPane.add(textField_9);
		
		JLabel jLabel9 = new JLabel();
		jLabel9.setText("Mobile No.");
		jLabel9.setForeground(new Color(37, 193, 239));
		jLabel9.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel9.setBackground(new Color(37, 193, 239));
		jLabel9.setBounds(210, 330, 130, 30);
		contentPane.add(jLabel9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(980, 290, 300, 30);
		contentPane.add(textField_10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(200, 590, 1120, 50);
		contentPane.add(panel_1_1);
		
		JLabel jLabel8_1 = new JLabel();
		jLabel8_1.setText("Blood Group");
		jLabel8_1.setForeground(new Color(37, 193, 239));
		jLabel8_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel8_1.setBackground(new Color(37, 193, 239));
		jLabel8_1.setBounds(210, 410, 130, 30);
		contentPane.add(jLabel8_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(350, 410, 300, 30);
		contentPane.add(textField_7);
		
		JLabel jLabel9_1 = new JLabel();
		jLabel9_1.setText("Date of Admit");
		jLabel9_1.setForeground(new Color(37, 193, 239));
		jLabel9_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel9_1.setBackground(new Color(37, 193, 239));
		jLabel9_1.setBounds(210, 450, 130, 30);
		contentPane.add(jLabel9_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(350, 450, 300, 30);
		contentPane.add(textField_11);
		
		JLabel jLabel13_1 = new JLabel();
		jLabel13_1.setText("Patient Type");
		jLabel13_1.setForeground(new Color(37, 193, 239));
		jLabel13_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel13_1.setBackground(new Color(37, 193, 239));
		jLabel13_1.setBounds(800, 410, 160, 30);
		contentPane.add(jLabel13_1);
		
		JLabel jLabel12_1 = new JLabel();
		jLabel12_1.setText("Date Of Discharge");
		jLabel12_1.setForeground(new Color(37, 193, 239));
		jLabel12_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel12_1.setBackground(new Color(37, 193, 239));
		jLabel12_1.setBounds(800, 450, 160, 30);
		contentPane.add(jLabel12_1);
		
		textField_13 = new JTextField();
		textField_13.setBounds(980, 450, 300, 30);
		contentPane.add(textField_13);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(200, 240, 1120, 250);
		contentPane.add(panel);
	}
}