package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame a = new JFrame();
JPanel b = new JPanel();

 JButton c1;
JButton c2;

public void run() {
	
c1 = makeButton("Joke");
c2 = makeButton("Punchline");
a.add(b);
b.add(c1);
b.add(c2);
a.setSize(200,80);

a.setVisible(true);
b.setVisible(true);
c1.setVisible(true);
c2.setVisible(true);
c1.addActionListener(this);
c2.addActionListener(this);
}
public JButton makeButton(String name) {
	System.out.println("hi");
	
	
	JButton c = new JButton();
	c.setText(name);
	return(c);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==c1) {
		JOptionPane.showMessageDialog(null, "hi");
	}
	else {
		JOptionPane.showMessageDialog(null, "What?");
	}
}
}
