package convert;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Converter {

	private JFrame frame;
	private JTextField textPound;
	private JTextField textFahrenheit;
	private JTextField textKilogram;
	private JTextField textCelsius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter window = new Converter();
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
	public Converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 585, 137);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWeightPound = new JLabel("Weight: Pound");
		lblWeightPound.setBounds(12, 13, 84, 16);
		frame.getContentPane().add(lblWeightPound);
		
		JLabel lblFahrenheit = new JLabel("Fahrenheit");
		lblFahrenheit.setBounds(12, 61, 78, 16);
		frame.getContentPane().add(lblFahrenheit);
		
		JLabel lblKilogram = new JLabel("Kilogram");
		lblKilogram.setBounds(336, 13, 55, 16);
		frame.getContentPane().add(lblKilogram);
		
		JLabel lblCelsius = new JLabel("Celsius");
		lblCelsius.setBounds(336, 61, 45, 16);
		frame.getContentPane().add(lblCelsius);
		
		JButton btnW = new JButton("convert>>");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kilogram K = new Kilogram();
				double W=0.0;
				W = Double.parseDouble(textPound.getText());		
				K.SetKilogram(W);
				textKilogram.setText((K.getKilogram()));
			}
		});
		btnW.setBounds(227, 9, 97, 25);
		frame.getContentPane().add(btnW);
		
		JButton btnT = new JButton("convert>>");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Celsius C = new Celsius();
				double T=100;
				T = Double.parseDouble(textFahrenheit.getText());		
				C.SetCelsius(T);
				textCelsius.setText((C.getCelsius()));
			}
		});
		btnT.setBounds(227, 57, 97, 25);
		frame.getContentPane().add(btnT);
		
		textPound = new JTextField();
		textPound.setBounds(99, 10, 116, 22);
		frame.getContentPane().add(textPound);
		textPound.setColumns(10);
		
		textFahrenheit = new JTextField();
		textFahrenheit.setColumns(10);
		textFahrenheit.setBounds(99, 58, 116, 22);
		frame.getContentPane().add(textFahrenheit);
		
		textKilogram = new JTextField();
		textKilogram.setText("0.0");
		textKilogram.setColumns(10);
		textKilogram.setBounds(393, 10, 116, 22);
		frame.getContentPane().add(textKilogram);
		
		textCelsius = new JTextField();
		textCelsius.setText("0.0");
		textCelsius.setColumns(10);
		textCelsius.setBounds(393, 58, 116, 22);
		frame.getContentPane().add(textCelsius);
	}
}
