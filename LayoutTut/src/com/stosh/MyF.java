package com.stosh;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyF extends JFrame{

	int x;
	JPanel panel = new JPanel();
	JTextField tf;
	JButton jb;
	
	public MyF(){
		
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		x = 5;
		panel = new JPanel();
		
		tf = new JTextField();
		tf.setColumns(10);
		
		jb = new JButton();
		jb.setText("Add");
		
		panel.add(tf);
		panel.add(jb);
		
		add(panel);
	}
	
	
	public static void main1(String[] args) {
		
		MyF frame = new MyF();

		
	}

}
