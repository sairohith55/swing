import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class calc {

	private JFrame frame;
	private JTextField textField;
	private double number;

	private JLabel jlabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 253, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 0, 215, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		clear.setBounds(10, 63, 50, 50);
		frame.getContentPane().add(clear);
		
		JButton back = new JButton("<");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText().substring(0, textField.getText().length()-1);
				textField.setText(str);
			}
		});
		back.setBounds(66, 63, 50, 50);
		frame.getContentPane().add(back);
		
		JButton sqrt = new JButton("sqrt");
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+sqrt.getText());
			}
		});
		sqrt.setBounds(122, 63, 50, 50);
		frame.getContentPane().add(sqrt);
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Integer.parseInt(textField.getText());
				jlabel.setText(textField.getText()+"/");
				textField.setText("");
			}
		});
		divide.setBounds(178, 63, 50, 50);
		frame.getContentPane().add(divide);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(10, 119, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn8.getText());
			}
		});
		btn8.setBounds(66, 119, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn9.getText());
			}
		});
		btn9.setBounds(122, 119, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton mul = new JButton("x");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				number = Integer.parseInt(textField.getText());
				jlabel.setText(textField.getText()+"*");
				textField.setText("");
			}
		});
		mul.setBounds(178, 119, 50, 50);
		frame.getContentPane().add(mul);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn4.getText());
			}
		});
		btn4.setBounds(10, 175, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn5.getText());
			}
		});
		btn5.setBounds(66, 175, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn6.getText());
			}
		});
		btn6.setBounds(122, 175, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				number = Integer.parseInt(textField.getText());
				jlabel.setText(textField.getText()+"-");
				textField.setText("");
			}
		});
		minus.setBounds(178, 175, 50, 50);
		frame.getContentPane().add(minus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				textField.setText(textField.getText()+btn1.getText());
			}
		});
		btn1.setBounds(10, 231, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn2.getText());
			}
		});
		btn2.setBounds(66, 231, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn3.getText());
			}
		});
		btn3.setBounds(122, 231, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				number = Integer.parseInt(textField.getText());
				jlabel.setText(textField.getText()+"+");
				textField.setText("");
			}
		});
		plus.setBounds(178, 231, 50, 50);
		frame.getContentPane().add(plus);
		
		JButton sign = new JButton("+/-");
		sign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = textField.getText();
				if(!value.contains("-"))
					textField.setText("-"+value);
				else
					textField.setText(value.split("-")[1]);
			}
		});
		sign.setBounds(10, 287, 50, 50);
		frame.getContentPane().add(sign);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+btn0.getText());
			}
		});
		btn0.setBounds(66, 287, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+dot.getText());
			}
		});
		dot.setBounds(122, 287, 50, 50);
		frame.getContentPane().add(dot);
		
		JButton equal = new JButton("=");
		equal.setBounds(178, 287, 50, 50);
		frame.getContentPane().add(equal);
		
		jlabel = new JLabel("");
		jlabel.setBounds(10, 40, 214, 24);
		frame.getContentPane().add(jlabel);
		
		
		
		}
}
