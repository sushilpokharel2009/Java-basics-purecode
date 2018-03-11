package co.stosh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class MyCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
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
	public MyCalculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GREEN));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(21, 26, 403, 58);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(21, 96, 52, 29);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(95, 96, 58, 29);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(165, 96, 58, 29);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(231, 96, 52, 29);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(318, 96, 52, 29);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(21, 132, 52, 29);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(95, 132, 50, 29);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(165, 137, 51, 29);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(231, 137, 52, 29);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(318, 137, 52, 29);
		contentPane.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(21, 173, 52, 29);
		contentPane.add(btnDot);
		
		JButton add = new JButton("+");
		add.setBounds(93, 173, 52, 29);
		contentPane.add(add);
		
		JButton multiply = new JButton("+");
		multiply.setBounds(231, 173, 52, 29);
		contentPane.add(multiply);
		
		JButton c = new JButton("C");
		c.setBounds(21, 211, 52, 29);
		contentPane.add(c);
		
		JButton bracket = new JButton("( )");
		bracket.setBounds(95, 211, 52, 29);
		contentPane.add(bracket);
		
		JButton sub = new JButton("-");
		sub.setBounds(165, 173, 52, 29);
		contentPane.add(sub);
		
		JButton div = new JButton("%");
		div.setBounds(318, 173, 52, 29);
		contentPane.add(div);
		
		JButton mod = new JButton("/");
		mod.setBounds(165, 211, 52, 29);
		contentPane.add(mod);
		
		JButton eqaual = new JButton("=");
		eqaual.setBounds(233, 211, 50, 29);
		contentPane.add(eqaual);
		
		JButton ac = new JButton("AC");
		ac.setBounds(318, 211, 52, 29);
		ac.setBackground(Color.RED);
		contentPane.add(ac);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, textField, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDot, add, multiply, c, bracket, sub, div, mod, eqaual, ac}));
	}
}
