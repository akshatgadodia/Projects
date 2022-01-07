

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class GenerateBill extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerateBill frame = new GenerateBill();
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
	public GenerateBill() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 40, 1543, 1258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
					String a = textField.getText();
					String b = textField_6.getText();
					String d = textField_10.getText();
					String c = textField_1.getText();
					String f = textField_2.getText();
					String e2 = textField_9.getText();
					String h = textField_8.getText();
					String g = textField_3.getText();
					String i = textField_4.getText();
					String j = textField_5.getText();
					String k = textField_7.getText();

					String sql = "Insert into bill values('"+a+"','"+b+"','"+c+"','"+d+"','"+h+"','"+g+"','"+e2+"','"+f+"','"+i+"','"+j+"','"+k+"')";
					stmt.executeUpdate(sql);
					con.close();  
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				JOptionPane.showMessageDialog(null, "Bill Generated Successfully");  
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_10.setText("");
				textField_9.setText("");        // TODO add your handling code here:
			}
	});
		jButton2.setText("Save");
		jButton2.setFont(new Font("Dialog", Font.PLAIN, 18));
		jButton2.setBackground(Color.WHITE);
		jButton2.setBounds(1050, 60, 100, 29);
		contentPane.add(jButton2);
		
		JButton jButton5 = new JButton();
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("java.sql.Driver");
					Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/HMS", "root", "manager");
					Statement stmt = con.createStatement();
					String a = textField.getText();
					String b = textField_6.getText();
					String c = textField_10.getText();
					String x = textField_1.getText();
					String f = textField_2.getText();
					String e2 = textField_9.getText();
					String g = textField_8.getText();
					String i = textField_3.getText();
					String t = textField_4.getText();
					String k = textField_5.getText();
					String j = textField_7.getText();
					String sql = "Update bill set billno='"+a+"', patientid='"+b+"' ,name='"+x+"',patienttype='"+c+"',wardno='"+g+"',bedno='"+i+"',Dateofadmit='"+e2+"',Dateofdischarge='"+f+"', TotalAmount='"+t+"',Modeofpayment='"+k+"',Narration='"+j+"'where billno='"+a+"'";
					stmt.executeUpdate(sql);
					con.close();  
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				JOptionPane.showMessageDialog(null, "Bill Updated Successfully");   
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_10.setText("");
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
		jLabel3.setText("Generate Bill");
		jLabel3.setBorder(new EmptyBorder(0,100,0,0));
		jLabel3.setOpaque(true);
		jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel3.setForeground(Color.WHITE);
		jLabel3.setFont(new Font("Algerian", Font.BOLD, 36));
		jLabel3.setBackground(new Color(37, 193, 239));
		jLabel3.setBounds(150, 39, 1369, 70);
		contentPane.add(jLabel3);
		
		textField = new JTextField();
		textField.setBounds(350, 210, 300, 30);
		contentPane.add(textField);
		
		JLabel jLabel7 = new JLabel();
		jLabel7.setText("Bill No");
		jLabel7.setForeground(new Color(37, 193, 239));
		jLabel7.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel7.setBackground(new Color(37, 193, 239));
		jLabel7.setBounds(210, 200, 130, 50);
		contentPane.add(jLabel7);
		
		JLabel jLabel8 = new JLabel();
		jLabel8.setText("Patient ID");
		jLabel8.setForeground(new Color(37, 193, 239));
		jLabel8.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel8.setBackground(new Color(37, 193, 239));
		jLabel8.setBounds(210, 250, 130, 30);
		contentPane.add(jLabel8);
		
		JLabel jLabel13 = new JLabel();
		jLabel13.setText("Patient Type");
		jLabel13.setForeground(new Color(37, 193, 239));
		jLabel13.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel13.setBackground(new Color(37, 193, 239));
		jLabel13.setBounds(800, 250, 160, 30);
		contentPane.add(jLabel13);
		
		textField_1 = new JTextField();
		textField_1.setBounds(350, 290, 300, 30);
		contentPane.add(textField_1);
		
		JLabel jLabel11 = new JLabel();
		jLabel11.setText("Narration");
		jLabel11.setForeground(new Color(37, 193, 239));
		jLabel11.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel11.setBackground(new Color(37, 193, 239));
		jLabel11.setBounds(210, 600, 130, 30);
		contentPane.add(jLabel11);
		
		JLabel jLabel12 = new JLabel();
		jLabel12.setText("Date Of Discharge");
		jLabel12.setForeground(new Color(37, 193, 239));
		jLabel12.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel12.setBackground(new Color(37, 193, 239));
		jLabel12.setBounds(800, 290, 160, 30);
		contentPane.add(jLabel12);
		
		textField_2 = new JTextField();
		textField_2.setBounds(980, 290, 300, 30);
		contentPane.add(textField_2);
		
		JLabel jLabel10 = new JLabel();
		jLabel10.setText("Mode of Payment");
		jLabel10.setForeground(new Color(37, 193, 239));
		jLabel10.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel10.setBackground(new Color(37, 193, 239));
		jLabel10.setBounds(800, 480, 160, 30);
		contentPane.add(jLabel10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(350, 440, 300, 30);
		contentPane.add(textField_3);
		
		JLabel jLabel15 = new JLabel();
		jLabel15.setText("Bed No");
		jLabel15.setForeground(new Color(37, 193, 239));
		jLabel15.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel15.setBackground(new Color(37, 193, 239));
		jLabel15.setBounds(800, 440, 160, 30);
		contentPane.add(jLabel15);
		
		textField_4 = new JTextField();
		textField_4.setBounds(350, 480, 300, 30);
		contentPane.add(textField_4);
		
		JLabel jLabel17 = new JLabel();
		jLabel17.setText("(for Indoor patients only)");
		jLabel17.setFont(new Font("Algerian", Font.PLAIN, 20));
		jLabel17.setBounds(200, 410, 300, 19);
		contentPane.add(jLabel17);
		
		JLabel jLabel16 = new JLabel();
		jLabel16.setText("Ward No");
		jLabel16.setForeground(new Color(37, 193, 239));
		jLabel16.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel16.setBackground(new Color(37, 193, 239));
		jLabel16.setBounds(210, 440, 130, 30);
		contentPane.add(jLabel16);
		
		textField_5 = new JTextField();
		textField_5.setBounds(980, 480, 300, 30);
		contentPane.add(textField_5);
		
		JButton jButton7 = new JButton();
		jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField_6.getText();
				try {Class.forName("java.sql.Driver");
				Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/hms", "root", "akshat8138");
				Statement stmt = con.createStatement();
				String sql = "Select * from patient where Patientid='"+a+"' ";
				ResultSet rst=stmt.executeQuery(sql);
				if(rst.next())
				{
					textField_1.setText(rst.getString("Name"));
					textField_10.setText(rst.getString("PatientType"));
					textField_9.setText(rst.getString("DateOfAdmit"));
					textField_2.setText(rst.getString("DateOfDischarge"));
					textField_3.setText(rst.getString("WardNo"));
					textField_8.setText(rst.getString("BedNo"));
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
		jButton7.setBounds(655, 255, 80, 20);
		contentPane.add(jButton7);
		
		JLabel jLabel14 = new JLabel();
		jLabel14.setText("Total Amount");
		jLabel14.setForeground(new Color(37, 193, 239));
		jLabel14.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel14.setBackground(new Color(37, 193, 239));
		jLabel14.setBounds(210, 480, 130, 40);
		contentPane.add(jLabel14);
		
		JLabel jLabel19 = new JLabel();
		jLabel19.setText("(for personal use only)");
		jLabel19.setFont(new Font("Algerian", Font.PLAIN, 20));
		jLabel19.setBounds(200, 570, 250, 19);
		contentPane.add(jLabel19);
		
		textField_6 = new JTextField();
		textField_6.setBounds(350, 250, 300, 30);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(350, 600, 930, 30);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(980, 440, 300, 30);
		contentPane.add(textField_8);
		
		JLabel jLabel22 = new JLabel();
		jLabel22.setText("Date Of Admit");
		jLabel22.setForeground(new Color(37, 193, 239));
		jLabel22.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel22.setBackground(new Color(37, 193, 239));
		jLabel22.setBounds(210, 330, 130, 30);
		contentPane.add(jLabel22);
		
		textField_9 = new JTextField();
		textField_9.setBounds(350, 330, 300, 30);
		contentPane.add(textField_9);
		
		JLabel jLabel9 = new JLabel();
		jLabel9.setText("Name");
		jLabel9.setForeground(new Color(37, 193, 239));
		jLabel9.setFont(new Font("Dialog", Font.PLAIN, 18));
		jLabel9.setBackground(new Color(37, 193, 239));
		jLabel9.setBounds(210, 290, 130, 30);
		contentPane.add(jLabel9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(980, 250, 300, 30);
		contentPane.add(textField_10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(200, 200, 1120, 170);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(200, 430, 1120, 100);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(200, 590, 1120, 50);
		contentPane.add(panel_1_1);
	}
}
