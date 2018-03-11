package co.stosh;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class M {

	public static void main(String[] args) {
		
		JFrame jr = new JFrame();
		jr.setVisible(true);
		jr.setSize(500, 300);
		jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel pl = new JPanel();
		pl.setBackground(Color.CYAN);
		
		
		JTextField tf = new JTextField();
		tf.setForeground(Color.BLACK);
		tf.setColumns(10);
		
		
		JButton bt1 = new JButton();
		bt1.setBackground(Color.BLUE);
		bt1.setText("Yes");
		bt1.setForeground(Color.GREEN);
		
		
		JButton bt2 = new JButton();
		bt2.setBackground(Color.BLUE);
		bt2.setText("No");
		bt2.setForeground(Color.RED);
		
		
		
		pl.add(tf);
		pl.add(bt1);
		pl.add(bt2);
		
		
		jr.add(pl);

	}

}
