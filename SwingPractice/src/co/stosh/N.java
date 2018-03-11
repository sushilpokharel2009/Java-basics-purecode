package co.stosh;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class N extends JFrame {
	
	private static final Border Border = null;
	JPanel pl;
	JTextField tf;
	JButton bt;
	JButton bt1;
	JButton bt2;
	JButton bt3;
	
	
	
	public N(){
		
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pl = new JPanel();
		pl.setBackground(Color.GREEN);
		
		
		tf = new JTextField();
		tf.setColumns(5);
		
		bt = new JButton();
		bt.setBackground(Color.BLACK);
		bt.setBorder(Border);
		bt.setText("Yes");
		
		
		
		bt2 = new JButton();
		bt2.setBackground(Color.BLACK);
		bt2.setBorder(Border);
		bt2.setText("No");
		
		
		
		bt3 = new JButton();
		bt3.setBackground(Color.BLACK);
		bt3.setBorder(Border);
		bt3.setText("Total");
		
		
		bt1 = new JButton();
		bt1.setBackground(Color.BLACK);
		bt1.setBorder(Border);
		bt1.setText("Calc");
		
		pl.add(tf);
		pl.add(bt);
		pl.add(bt1);
		pl.add(bt2);
		pl.add(bt3);
		
		
		this.add(pl);
		
	}

	public static void main(String[] args) {
		N n1 = new N();
		
	}

}
