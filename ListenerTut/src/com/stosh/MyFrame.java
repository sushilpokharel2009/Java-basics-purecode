package com.stosh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{

	JPanel panel;
	JTextField tf;
	JButton jb;
	
	public MyFrame(){
		
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My FRame");
		
		panel= new JPanel();
		
		tf = new JTextField();
		tf.setColumns(10);
		
		tf.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Mouse release-->>");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Mouse Pressed-->>");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Mouse Exited-->>");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Mouse Entered-->>");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		jb= new JButton();
		jb.setText("Ok");
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("A------->>>>>.");
				
			}
		};
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("B----->>>");
				
			}
		});
		
		panel.add(tf);
		panel.add(jb);
		
		add(panel);
		
	}
	
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();

	}

}
