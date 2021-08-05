package decisionMaker;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class HomePage {

	private JFrame frame;

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
		frame.setBounds(100, 100, 491, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("Make Decision Using Coin");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoinPage cpg = new CoinPage();
				cpg.setVisible(true);
				frame.dispose();
			}
		});
		btn1.setBounds(94, 85, 261, 48);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("Make Decision Using Die");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DicePage diepg = new DicePage();
				diepg.setVisible(true);
				frame.dispose();
			
			}
		});
		btn2.setBounds(94, 180, 261, 48);
		frame.getContentPane().add(btn2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 70, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnNewMenu_1 = new JMenu("New");
		mnFile.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Decision Using Coin");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoinPage cpg = new CoinPage();
				cpg.setVisible(true);
				frame.dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Descision Using Die");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DicePage diepg = new DicePage();
				diepg.setVisible(true);
				frame.dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Quit");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu = new JMenu("Help");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("About");
		mnNewMenu.add(mntmNewMenuItem_1);
	}
}
