package com.stosh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	//private JTextField textField;

	String x = "";
	String o = "";	
	String y = "";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
	public MyFrame() {
		setResizable(false);
		setTitle("My Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY));
		panel.setBounds(6, 6, 438, 266);
		contentPane.add(panel);
		panel.setLayout(null);
		
	
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = x+"1";
				textField.setText(x);
			}
		});
		btnOne.setBounds(6, 65, 117, 29);
		panel.add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = x+"2";
				textField.setText(x);
			}
		});
		btnTwo.setBounds(133, 65, 117, 29);
		panel.add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.setBounds(280, 65, 117, 29);
		panel.add(btnThree);
		
		JButton btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				o = "+";
				y = x;
				x = "";
				
			}
		});
		btnSum.setBounds(6, 116, 117, 29);
		panel.add(btnSum);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				o = "-";
				y = x;
				x = "";
			}
		});
		btnSub.setBounds(143, 106, 117, 29);
		panel.add(btnSub);
		
		JButton btnNewButton_3 = new JButton("=");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double fn = Double.parseDouble(y);
				double sn = Double.parseDouble(x);
				double result = 0.0;
				
				
				if(o.equals("+")){
					result = fn+sn;
				}else if(o.equals("-")){
					result = fn-sn;
				}
				
				textField.setText(result+"");
						
				
				
			}
		});
		btnNewButton_3.setBounds(25, 215, 302, 29);
		panel.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(34, 6, 371, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double n = Double.parseDouble(textField.getText());
				
				double result = Math.tan(Math.toRadians(n));
				
				textField.setText(result+"");
			}
		});
		btnTan.setBounds(16, 157, 117, 29);
		panel.add(btnTan);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(x);
				x = x.substring(1, x.length());
				textField.setText(x);
			}
		});
		btnNewButton.setBounds(280, 157, 117, 29);
		panel.add(btnNewButton);
	}
}
