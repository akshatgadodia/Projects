package decisionMaker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class DicePage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	int selectedfields=2;
	private JTextField tf7;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DicePage frame = new DicePage();
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
	public DicePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Make a Decision Using Dice");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(95, 10, 358, 28);
		contentPane.add(label1);
		
		JLabel lblNewLabel = new JLabel("Choice 1");
		lblNewLabel.setBounds(54, 75, 62, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choice 2");
		lblNewLabel_1.setBounds(54, 106, 62, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Choice 3");
		lblNewLabel_2.setBounds(54, 141, 62, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Choice 4");
		lblNewLabel_3.setBounds(54, 178, 62, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Choice 5");
		lblNewLabel_4.setBounds(54, 217, 62, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Choice 6");
		lblNewLabel_5.setBounds(54, 254, 62, 28);
		contentPane.add(lblNewLabel_5);
		
		final JCheckBox cb1 = new JCheckBox("Select to Enter");
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb1.isSelected()) {
					tf3.setEnabled(true);
					selectedfields++;
					tf3.setText("Choice 3");}
				else {
					tf3.setEnabled(false);
					selectedfields--;
					tf3.setText("");}
			}
		});
		cb1.setBounds(351, 140, 140, 28);
		contentPane.add(cb1);
		
		final JCheckBox cb2 = new JCheckBox("Select to Enter");
		cb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb2.isSelected()) {
					tf4.setEnabled(true);
					selectedfields++;
					tf4.setText("Choice 4");}
				else {
					tf4.setEnabled(false);
					selectedfields--;
					tf4.setText("");}
			}
			
		});
		cb2.setBounds(351, 176, 142, 28);
		contentPane.add(cb2);
		
		final JCheckBox cb3 = new JCheckBox("Select to Enter");
		cb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb3.isSelected()) {
					tf5.setEnabled(true);
					selectedfields++;
					tf5.setText("Choice 5");}
				else {
					tf5.setEnabled(false);
					selectedfields--;
					tf5.setText("");}
			}
		});
		cb3.setBounds(351, 216, 142, 28);
		contentPane.add(cb3);
		
		final JCheckBox cb4 = new JCheckBox("Select to Enter");
		cb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb4.isSelected()) {
					tf6.setEnabled(true);
					selectedfields++;
					tf6.setText("Choice 6");}
				else {
					tf6.setEnabled(false);
					selectedfields--;
					tf6.setText("");}
			}
			
		});
		cb4.setBounds(351, 254, 142, 28);
		contentPane.add(cb4);
		
		tf1 = new JTextField();
		tf1.setText("Choice 1");
		tf1.setBounds(140, 70, 181, 28);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setText("Choice 2");
		tf2.setBounds(139, 103, 182, 28);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setEnabled(false);
		tf3.setBounds(140, 141, 181, 28);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setEnabled(false);
		tf4.setBounds(139, 179, 182, 28);
		contentPane.add(tf4);
		tf4.setColumns(10);
		
		tf5 = new JTextField();
		tf5.setEnabled(false);
		tf5.setBounds(139, 217, 182, 28);
		contentPane.add(tf5);
		tf5.setColumns(10);
		
		tf6 = new JTextField();
		tf6.setEnabled(false);
		tf6.setBounds(140, 255, 182, 28);
		contentPane.add(tf6);
		tf6.setColumns(10);
		
		JButton btnNewButton = new JButton("Roll Die");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dice d = new Dice(); 
				System.out.println("SF is "+selectedfields+", Numch is "+d.getNumch());
				d.setNumch(selectedfields);
				d.setChoice1(tf1.getText());
				d.setChoice2(tf2.getText());
				d.setChoice3(tf3.getText());
				d.setChoice4(tf4.getText());
				d.setChoice5(tf5.getText());
				d.setChoice6(tf6.getText());
				System.out.println(d.rollDie());
				tf7.setText(d.rollDie());
				
				
			}
		});
		btnNewButton.setBounds(172, 354, 149, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Result");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(95, 307, 78, 28);
		contentPane.add(lblNewLabel_6);
		
		tf7 = new JTextField();
		tf7.setBounds(184, 307, 191, 28);
		contentPane.add(tf7);
		tf7.setColumns(10);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 109, 22);
		contentPane.add(menuBar);
		
		mnNewMenu = new JMenu("New");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("New File");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DicePage diepg = new DicePage();
				diepg.setVisible(true);
				diepg.dispose();
			}
			
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Quit");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Clear");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				tf6.setText("");
				tf7.setText("");
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		mnNewMenu_2 = new JMenu("Help");
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_3 = new JMenuItem("About");
		mnNewMenu_2.add(mntmNewMenuItem_3);
	}
}
