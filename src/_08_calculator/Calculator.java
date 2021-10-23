package _08_calculator;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Calculator {
	JFrame frame = new JFrame();
	JPanel inputPanel= new JPanel();
	JPanel buttonPanel = new JPanel();
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton dev = new JButton();
	JLabel label = new JLabel();
	String num1;
	String num2;
	int Num1;
	int Num2;
	int ans;
	
public void setup() {
	frame.add(inputPanel);
	frame.setSize(800,600);
	inputPanel.add(text1);
	inputPanel.add(text2);
	frame.setTitle("Calculator");
	frame.setVisible(true);
	frame.setSize(800,400);
	inputPanel.setBounds(0,0,500,200);
	text1.setVisible(true);
	text2.setVisible(true);
	text1.setBounds(0,0,300,100);
	text2.setBounds(400,0,300,100);
	inputPanel.setVisible(true);
	inputPanel.add(add);
	inputPanel.add(sub);
	inputPanel.add(mul);
	inputPanel.add(dev);
	inputPanel.add(label);
	
	add.setText("add");
	sub.setText("sub");
	mul.setText("mul");
	dev.setText("dev");
	inputPanel.add(label);
	add.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			num1=text1.getText();
			 num2=text2.getText();
			 Num1 = Integer.parseInt(num1);
			 Num2 = Integer.parseInt(num2);
			 ans = Num1+Num2;
			 label.setText(ans+"");
		}
	});
	sub.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			num1=text1.getText();
			 num2=text2.getText();
			 Num1 = Integer.parseInt(num1);
			 Num2 = Integer.parseInt(num2);
			 ans = Num1-Num2;
			 label.setText(ans+"");
		}
	});
	mul.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			num1=text1.getText();
			 num2=text2.getText();
			 Num1 = Integer.parseInt(num1);
			 Num2 = Integer.parseInt(num2);
			 ans = Num1*Num2;
			 label.setText(ans+"");
		}
	});
	dev.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			num1=text1.getText();
			 num2=text2.getText();
			 Num1 = Integer.parseInt(num1);
			 Num2 = Integer.parseInt(num2);
			 ans = Num1/Num2;
			 label.setText(ans+"");
		}
	});
	
	
}



}
