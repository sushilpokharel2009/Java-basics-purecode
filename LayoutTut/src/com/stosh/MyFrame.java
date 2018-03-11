package com.stosh;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	JPanel panel;
	JButton b1, b2, b3, b4, b5, b6;
	
	
	public MyFrame(){
		
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		b1 = new JButton("1"); //b1.setBounds(5, 5, 50, 50);
		b2 = new JButton("2"); //b2.setBounds(60, 60, 50, 50);
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		
		panel.add(b1, BorderLayout.NORTH);
		panel.add(b2, BorderLayout.SOUTH);
		panel.add(b3, BorderLayout.EAST);
		panel.add(b4, BorderLayout.WEST);
		panel.add(b5, BorderLayout.CENTER);
		panel.add(b6);
		
		add(panel);
	}
	
	
	public static void main(String[] args) {
		
		MyFrame frame = new MyFrame();

	}

}
