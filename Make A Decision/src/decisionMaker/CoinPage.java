package decisionMaker;

import java.awt.BorderLayout;
import javax.swing.AbstractButton;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;

public class CoinPage extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;
	private JLabel lb4;
	private int c1_count=0;
	private int c2_count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinPage frame = new CoinPage();
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
	public CoinPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Toss Coin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coin die = new Coin();
				die.setChoice1(tf1.getText());
				die.setChoice2(tf2.getText());
				String result = die.tossCoin();
				if(result.equals(die.getChoice1()))
					c1_count++;
				if(result.equals(die.getChoice2()))
					c2_count++;
				lb1.setText(die.getChoice1());
				lb2.setText(c1_count+"");
				lb3.setText(die.getChoice2());
				lb4.setText(c2_count+"");
				
				System.out.println(result);
			}
		});
		btnNewButton.setBounds(253, 260, 155, 35);
		contentPane.add(btnNewButton);
		
		JLabel label1 = new JLabel("Make A Decision Using Coin ");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(10, 49, 629, 61);
		contentPane.add(label1);
		
		tf1 = new JTextField();
		tf1.setText("Heads");
		tf1.setBounds(234, 138, 201, 30);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setText("Tails");
		tf2.setBounds(234, 192, 201, 35);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		JLabel label2 = new JLabel("Choice 1");
		label2.setBounds(70, 137, 96, 30);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("Choice 2");
		label3.setBounds(70, 193, 96, 32);
		contentPane.add(label3);
		
		lb1 = new JLabel("");
		lb1.setBounds(81, 328, 85, 21);
		contentPane.add(lb1);
		
		lb2 = new JLabel("");
		lb2.setBounds(189, 330, 85, 17);
		contentPane.add(lb2);
		
		lb3 = new JLabel("");
		lb3.setBounds(350, 330, 85, 21);
		contentPane.add(lb3);
		
		lb4 = new JLabel("");
		lb4.setBounds(452, 330, 85, 21);
		contentPane.add(lb4);
	}
}
