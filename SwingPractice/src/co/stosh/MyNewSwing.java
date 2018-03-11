package co.stosh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MyNewSwing extends JFrame {

	private JPanel contentPane;
	private JTextField txtHello;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyNewSwing frame = new MyNewSwing();
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
	public MyNewSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new LineBorder(Color.CYAN));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(40, 30, 51, 23);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(159, 30, 51, 23);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(245, 30, 44, 23);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(339, 30, 67, 23);
		panel_3.setBackground(Color.RED);
		contentPane.add(panel_3);
		
		txtHello = new JTextField();
		txtHello.setBounds(40, 95, 390, 26);
		contentPane.add(txtHello);
		txtHello.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(25, 155, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBounds(159, 155, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBounds(289, 155, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBounds(25, 196, 117, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBounds(159, 196, 117, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBounds(289, 196, 117, 29);
		contentPane.add(btnNewButton_5);
	}
}
