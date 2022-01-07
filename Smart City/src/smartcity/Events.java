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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

public class Events extends JFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Events frame = new Events();
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
	public Events() {
		getContentPane().setBackground(new Color(255, 192, 203));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Smart City");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 45));
		lblNewLabel_1.setBounds(50, 0, 312, 67);
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
		btnNewButton.setBounds(1023, 18, 110, 25);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("User");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HomePage.userData.isAuthentiation()) {
					UserProfile userPro = new UserProfile();
					userPro.setVisible(true);
					dispose();
				}
				else {
					User user = new User();
					user.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1.setBounds(653, 18, 110, 25);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("City Info");
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
		btnNewButton_1_1.setBounds(893, 18, 120, 25);
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
		btnNewButton_1_1_1.setBounds(773, 18, 110, 25);
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
		btnNewButton_1_2.setBounds(533, 18, 110, 25);
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
		btnNewButton_1_2_1.setBounds(413, 18, 110, 25);
		getContentPane().add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel = new JLabel("Events");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBounds(0, 80, 1529, 67);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 48));
		getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 60, 1529, 33);
		getContentPane().add(separator);
		
		JLabel userLabel = new JLabel("");
		userLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userLabel.setForeground(new Color(30, 144, 255));
		userLabel.setFont(new Font("Algerian", Font.PLAIN, 24));
		userLabel.setBounds(1180, 0, 312, 67);
		getContentPane().add(userLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(79, 213, 1372, 555);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setForeground(new Color(128, 0, 0));
		table.setBackground(new Color(255, 192, 203));
		table.setFont(new Font("Century", Font.PLAIN, 15));
		table.setRowHeight(30);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
				{"Smart Photography Workshop", "Wed 5 Jan 2022", "20:00 Hrs", "Online", "Workshop", "1200Rs", "https://in.bookmyshow.com/"},
			},
			new String[] {
				"Event", "Date", "Time", "Venue", "Type", "Price", "Website"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.getColumnModel().getColumn(6).setPreferredWidth(150);
		table.getColumnModel().getColumn(6).setMinWidth(50);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.getTableHeader().setOpaque(false);
		table.getTableHeader().setForeground(new Color(255, 192, 203));
		table.getTableHeader().setBackground(new Color(30, 144, 255));
		table.getTableHeader().setFont(new Font("Century", Font.BOLD, 20));
		scrollPane.setBackground(new Color(255, 192, 203));
		scrollPane.setOpaque(true);
		scrollPane.setForeground(new Color(255, 192, 203));
		scrollPane.setViewportView(table);
		HomePage HomePage = new HomePage();
		if(HomePage.getUserData().isAuthentiation()) {
		userLabel.setText(HomePage.getUserData().getUserId());}
		
		setBounds(0, 40, 1543, 1258);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
	}
}
