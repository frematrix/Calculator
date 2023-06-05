package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorMain {

	private JFrame frmCalculator;
	private JTextField textField;
	static String number1;
	static String number2;
	static double solution;
	static char operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorMain window = new CalculatorMain();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 445, 521);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Arial", Font.PLAIN, 30));
		textField.setBounds(10, 33, 412, 59);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberInput(7);
			}
		});
		btn7.setBounds(10, 188, 96, 59);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberInput(8);
			}
		});
		btn8.setBounds(116, 188, 96, 59);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberInput(9);
			}
		});
		btn9.setBounds(222, 188, 96, 59);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnDivision = new JButton("÷");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation('/');
				
			}
		});
		btnDivision.setBounds(328, 188, 96, 59);
		frmCalculator.getContentPane().add(btnDivision);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberInput(4);
			}
		});
		btn4.setBounds(10, 258, 96, 59);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberInput(5);
			}
		});
		btn5.setBounds(116, 258, 96, 59);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberInput(6);
			}
		});
		btn6.setBounds(222, 258, 96, 59);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation('*');
			}
		});
		btnMultiplication.setBounds(328, 258, 96, 59);
		frmCalculator.getContentPane().add(btnMultiplication);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberInput(1);
			}
		});
		btn1.setBounds(10, 332, 96, 59);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberInput(2);
			}
		});
		btn2.setBounds(116, 332, 96, 59);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberInput(3);
			}
		});
		btn3.setBounds(222, 332, 96, 59);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation('-');
			}
		});
		btnMinus.setBounds(328, 332, 96, 59);
		frmCalculator.getContentPane().add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numberInput(0);
			}
		});
		btn0.setBounds(10, 401, 96, 59);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dot();
			}
		});
		btnDot.setBounds(116, 401, 96, 59);
		frmCalculator.getContentPane().add(btnDot);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculatorMain.this.equals();
				
			}

			
		});
		btnEquals.setBounds(222, 401, 96, 59);
		frmCalculator.getContentPane().add(btnEquals);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation('+');
			}
		});
		btnPlus.setBounds(328, 401, 96, 59);
		frmCalculator.getContentPane().add(btnPlus);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		btnClear.setBounds(8, 118, 96, 59);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btnBack = new JButton("<--");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back();
			}
		});
		btnBack.setBounds(114, 118, 96, 59);
		frmCalculator.getContentPane().add(btnBack);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double number = Double.parseDouble(textField.getText());
				if (number1.length()==0) {
					number1 = String.valueOf(Math.sqrt(number));
					textField.setText(number1);
				}
				else {
					number2 = String.valueOf(Math.sqrt(number));
					textField.setText(number2);
				}
				
			}
		});
		btnSqrt.setBounds(220, 118, 96, 59);
		frmCalculator.getContentPane().add(btnSqrt);
		
		JButton btnMinusPlus = new JButton("+/-");
		btnMinusPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign('-');
			}
		});
		btnMinusPlus.setBounds(326, 118, 96, 59);
		frmCalculator.getContentPane().add(btnMinusPlus);
	}
	
	protected void back() {
		String number = textField.getText();
		number = number.substring(0, number.length()-1);
		textField.setText(number);
		
	}

	protected void clear() {
		textField.setText("");
		number1 = "";
		number2 = "";
		solution = 0;
		
	}

	protected void sign(char s) {
		
		String number = textField.getText();
		textField.setText(s+number);
	}

	protected void equals() {
		
		number2 = textField.getText();
		switch (operator) {
		case '+': 
			solution = Double.parseDouble(number1)+Double.parseDouble(number2);
			textField.setText(String.valueOf(solution));
			break;
		case '-':
			solution = Double.parseDouble(number1)-Double.parseDouble(number2);
			textField.setText(String.valueOf(solution));
			break;
		case '*':
			solution = Double.parseDouble(number1)*Double.parseDouble(number2);
			textField.setText(String.valueOf(solution));
			break;
		case '/':
			solution = Double.parseDouble(number1)/Double.parseDouble(number2);
			textField.setText(String.valueOf(solution));
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}
		
	}

	protected void dot() {
		
		String number = textField.getText();
		if (number.length()>0) {
			textField.setText(number+'.');
		}
		
	}

	protected void operation(char c) {
		
		number1 = textField.getText();
		textField.setText("");
		operator = c; 
		
	}

	protected void numberInput(int i) {
		
		if (textField.getText().isEmpty()) {
			textField.setText(String.valueOf(i));
		}
		else {
			String numbers = textField.getText();
			textField.setText(numbers+String.valueOf(i));
		}
	}
}
