package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

	
public void setup() {
	frame.add(inputPanel);
	frame.setSize(800,600);
	inputPanel.add(text1);
	inputPanel.add(text2);
	frame.setTitle("Calculator");
	frame.setVisible(true);
	frame.setSize(800,400);
	inputPanel.setBounds(0,0,800,200);
	text1.setVisible(true);
	text2.setVisible(true);
	text1.setBounds(0,0,300,100);
	text2.setBounds(400,0,300,100);
	inputPanel.setVisible(true);
	
	
	frame.add(buttonPanel);
	buttonPanel.setVisible(true);
	buttonPanel.setBounds(0,300,800,200);
	buttonPanel.add(add);
	add.setBounds(0,0,100,50);
	add.setText("add");
	
	
	
	
	
	
}
}
