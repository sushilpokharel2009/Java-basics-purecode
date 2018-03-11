package com.stosh;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class A {

	public static void main1(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		
		JTextField tf = new JTextField();
		tf.setColumns(5);
		
		JButton jb = new JButton();
		jb.setText("OK");
		jb.setForeground(Color.RED);
		
		JButton jb1 = new JButton();
		jb1.setText("No");
		JButton jb2 = new JButton();
		jb1.setText("No");
		JButton jb3 = new JButton();
		jb1.setText("No");
		JButton jb4 = new JButton();
		jb1.setText("No");
		
		panel.add(tf);
		panel.add(jb);
		panel.add(jb1);
		panel.add(jb2);
		panel.add(jb3);
		panel.add(jb4);
		//panel.add(jb1);
		
		frame.add(panel);
		
	}

}
