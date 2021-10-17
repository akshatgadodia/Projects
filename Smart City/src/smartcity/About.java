package smartcity;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Point;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class About extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
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
				HomePage HomePage = new HomePage();
				HomePage.userLabel.setText("HELLO");
				dispose();
			}
		});
		btnNewButton_1_2_1.setForeground(new Color(255, 192, 203));
		btnNewButton_1_2_1.setFont(new Font("Century", Font.BOLD, 20));
		btnNewButton_1_2_1.setBackground(new Color(30, 144, 255));
		btnNewButton_1_2_1.setBounds(413, 18, 110, 25);
		getContentPane().add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel = new JLabel("About JAIPUR\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBounds(0, 100, 1529, 67);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 48));
		getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 60, 1529, 33);
		getContentPane().add(separator);
		
		JTextPane txtpnRajasthansBeautifulPink = new JTextPane();
		txtpnRajasthansBeautifulPink.setText("Rajasthan's beautiful Pink City Jaipur, was the stronghold of a clan of rulers whose three hill forts and series of palaces in the city areimportant attractions. Known as the Pink City because of the colour of the stone used exclusively in the walled city, Jaipur's bazaars sell embroidered leather shoes, blue pottery, tie and dye scarves and other exotic wares. Western Rajasthan itself forms a convenient circuit, in the heart of the Thar desert which has shaped its history, lifestyles and architecture.\r\n\r\nFounded in AD 1727 by Sawai Jaisingh II, Jaipur the capital of Rajasthan is popularly known as the Pink City with broad avenues and spacious gardens. The capital of Rajasthan, Jaipur is steeped in history and culture. Here the past comes alive in magnificent forts and palaces, blushed pink, where once lived the maharajas. The bustling bazaars of Jaipur, famous for Rajasthani jewellery, fabric and shoes, possess a timeless quality and are surely a treasure-trove for the shoppers. This fascinating city with its romantic charm takes you to an epoch of royalty and tradition.\r\n\r\nJaipur has been laid according to the conventional nine-grid pattern that astrologers believe to be lucky, and which has been recommended in the ancient Indian treatise on architecture. Each grid consists of a square, and these have been planned so that, at the heart of the city is the City Palace. Spread around it, in rows, are public buildings, the residences of noblemen, the living and trading quarters of merchants and artisans. Straight, wide roads run through the city, while a high, crenellated wall that forms its defense is pierced with seven gateways that serve as entry points. Today, these walls may be more difficult to spot since the city has grown far beyond its original plan, but they are still there, proof that though Jaipur saw no great siege, it was more than adequately prepared for it.\r\n\r\nJaipur architectural planning may have been ancient, but its execution was definitely modern. Best represented by the City Palace complex, it brought together all that was excellent in Rajput and Mughal architecture, creating a new tradition that found wide currency over much of north India. As in the Mughal tradition, the durbar or court areas became much more open, characterised by a series of arched pavilions held on delicately crafted pillars. Ornamentation had always been a part of the state architectural heritage, now it became much more opulent. The private wings of the family also extended their entertainment areas. Since defence was no longer a primary concern, larger, more ornamental windows were built to over look the streets or courtyards outside these wings. Gardens were no longer planned within the internal courtyards only, but were added to the external vistas, and water, a basic feature of Mughal palaces and gardens, was utilised in a similar fashion, in canals and fountains.\r\n\r\nJaipur has much to offer visitors everything from pageants and festivals to extraordinarily clad people, a wealth of handicrafts, a royal legacy of palaces, and sightseeing that will occupy their time. However, should the visitors simply choose to walk around the streets of the old city instead, they will not regret it. All of Jaipur is an architectural gem, and no scheduled sight seeing can even hope to do justice to this rare city.");
		txtpnRajasthansBeautifulPink.setForeground(Color.BLUE);
		txtpnRajasthansBeautifulPink.setFont(new Font("Poor Richard", Font.PLAIN, 20));
		txtpnRajasthansBeautifulPink.setBackground(new Color(255, 192, 203));
		txtpnRajasthansBeautifulPink.setBounds(10, 190, 1511, 568);
		getContentPane().add(txtpnRajasthansBeautifulPink);
		
		JLabel userLabel = new JLabel("");
		userLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userLabel.setForeground(new Color(30, 144, 255));
		userLabel.setFont(new Font("Algerian", Font.PLAIN, 24));
		userLabel.setBounds(1180, 0, 312, 67);
		getContentPane().add(userLabel);
		HomePage HomePage = new HomePage();
		if(HomePage.userData.isAuthentiation()) {
		userLabel.setText(HomePage.userData.getUserId());}
		
		setBounds(0, 40, 1543, 1258);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
	}
}
