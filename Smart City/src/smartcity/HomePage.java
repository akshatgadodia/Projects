package smartcity;

import java.awt.EventQueue;
import java.awt.Image;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Scrollbar;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;

public class HomePage {

	private JFrame frame;
	static UserData userData = new UserData();
	JLabel userLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 192, 203));
		frame.setBounds(0, 40, 1543, 1258);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("D:\\_Workspace_\\Smart City\\Resources\\wp4917316.jpg"); 
		Image img = icon.getImage();
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setBounds(0, 55, 1542, 524);
		Image imgScale = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		frame.getContentPane().setLayout(null);
		lblNewLabel.setIcon(scaledIcon);
		
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pink City Jaipur");
		lblNewLabel_1_1.setBounds(0, 605, 1529, 67);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1_1.setFont(new Font("Algerian", Font.BOLD, 40));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Smart City");
		lblNewLabel_1.setBounds(50, 0, 312, 67);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 45));
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Contact");
		btnNewButton.setBounds(1023, 18, 110, 25);
		btnNewButton.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(255, 192, 203));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contact contact = new Contact();
				contact.setVisible(true);
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("User");
		btnNewButton_1.setBounds(653, 18, 110, 25);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(getUserData().isAuthentiation()) {
					UserProfile userPro = new UserProfile();
					userPro.setVisible(true);
				}
				else {
					User user = new User();
					user.setVisible(true);
				}
				
			}
		});
		btnNewButton_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("City Info");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gallery gallery = new Gallery();
				gallery.setVisible(true);
			}
		});
		btnNewButton_1_1.setBounds(893, 18, 120, 25);
		btnNewButton_1_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(new Color(30, 144, 255));
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Events");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Events event = new Events();
				event.setVisible(true);
			}
		});
		btnNewButton_1_1_1.setBounds(773, 18, 110, 25);
		btnNewButton_1_1_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1_1_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1_1_1.setBackground(new Color(30, 144, 255));
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("About");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About about = new About();
				about.setVisible(true);
			}
		});
		btnNewButton_1_2.setBounds(533, 18, 110, 25);
		btnNewButton_1_2.setForeground(new Color(255, 192, 203));
		btnNewButton_1_2.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1_2.setBackground(new Color(30, 144, 255));
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Home");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				frame.setVisible(true);
			}
		});
		btnNewButton_1_2_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1_2_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1_2_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1_2_1.setBounds(413, 18, 110, 25);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		JEditorPane dtrpnJaipurIsThe = new JEditorPane();
		dtrpnJaipurIsThe.setText("Jaipur is the capital of India\u2019s Rajasthan state. It evokes the royal family that once ruled the region and that, in 1727, founded what is now called the Old City, or \u201CPink City\u201D for its trademark building color. At the center of its stately street grid (notable in India) stands the opulent, colonnaded City Palace complex. With gardens, courtyards and museums, part of it is still a royal residence.");
		dtrpnJaipurIsThe.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 25));
		dtrpnJaipurIsThe.setBackground(new Color(255, 192, 203));
		dtrpnJaipurIsThe.setBounds(10, 660, 1513, 138);
		frame.getContentPane().add(dtrpnJaipurIsThe);
		
		userLabel = new JLabel("");
		userLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userLabel.setForeground(new Color(30, 144, 255));
		userLabel.setFont(new Font("Algerian", Font.PLAIN, 24));
		userLabel.setBounds(1180, 0, 312, 67);
		frame.getContentPane().add(userLabel);
		if(getUserData().isAuthentiation()) {
		userLabel.setText(getUserData().getUserId());}
	}

	public static UserData getUserData() {
		return userData;
	}

	public static void setUserData(UserData userData) {
		HomePage.userData = userData;
	}
}
