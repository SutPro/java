package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn6;
	private JButton btn5;
	private JButton btn0;
	private JButton btnSum;
	private JButton btnC;
	private JButton btnP;
	private JButton btnD;
	private JButton btnM;
	private JButton btnDi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}
	double num , ans;
	char symbol;
	public void amount() {
		switch (symbol) {
		case '+':
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case '-':
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case '*':
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case '/':
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 298, 264);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBackground(Color.YELLOW);
		textField.setForeground(Color.BLACK);
		textField.setBounds(25, 15, 230, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn1.setBounds(25, 129, 50, 25);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btn2.setBounds(87, 129, 50, 25);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btn3.setBounds(151, 129, 50, 25);
		frame.getContentPane().add(btn3);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btn4.setBounds(25, 91, 50, 25);
		frame.getContentPane().add(btn4);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btn7.setBounds(25, 53, 50, 25);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn8.setBounds(87, 53, 50, 25);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btn9.setBounds(151, 53, 50, 25);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn6.setBounds(151, 91, 50, 25);
		frame.getContentPane().add(btn6);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btn5.setBounds(87, 91, 50, 25);
		frame.getContentPane().add(btn5);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setBounds(25, 167, 50, 25);
		frame.getContentPane().add(btn0);
		
		btnSum = new JButton("=");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
			amount();
				num=ans;
				symbol='\0';
				ans=0;
			}
		});
		btnSum.setBounds(87, 167, 50, 25);
		frame.getContentPane().add(btnSum);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				num=0;
				symbol='\0';
				ans=0;
			}
		});
		btnC.setBounds(151, 167, 50, 25);
		frame.getContentPane().add(btnC);
		
		btnP = new JButton("+");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount();
				num = Double.parseDouble(textField.getText());
				symbol = '+';
				textField.setText("");
			}
		});
		btnP.setBounds(213, 53, 50, 25);
		frame.getContentPane().add(btnP);
		
		btnD = new JButton("-");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount();
				num = Double.parseDouble(textField.getText());
				symbol = '-';
				textField.setText("");
			}
		});
		btnD.setBounds(213, 91, 50, 25);
		frame.getContentPane().add(btnD);
		
		btnM = new JButton("*");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount();
				num = Double.parseDouble(textField.getText());
				symbol = '*';
				textField.setText("");
			}
		});
		btnM.setBounds(213, 129, 50, 25);
		frame.getContentPane().add(btnM);
		
		btnDi = new JButton("/");
		btnDi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amount();
				num = Double.parseDouble(textField.getText());
				symbol = '/';
				textField.setText("");
			}
		});
		btnDi.setBounds(213, 167, 50, 25);
		frame.getContentPane().add(btnDi);
	}
}
