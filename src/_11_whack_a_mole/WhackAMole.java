package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame frame = new JFrame();
JButton mole = new JButton();
JPanel panel = new JPanel();
int miss=0;
int score=0;
Date date = new Date();
 
public WhackAMole() {

int num = new Random().nextInt(24);
drawButton(num);
}


public void drawButton(int num) {
	frame = new JFrame();
	panel = new JPanel();
	
	frame.add(panel);
	frame.setSize(500,800);
	frame.setVisible(true);
	frame.setLayout(new GridLayout(8,3));
	for(int i=0; i<24; i++) {
	 JButton button = new JButton();
	
	 button.addActionListener(this);
	 panel.add(button);
	 if(i==num) {
		 mole = button;
		 mole.setText("Mole");
	 }
	 else {
		 button.setText("      ");
	 }
	 }
 }
 
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==mole) {
		System.out.println("Yes!");
		score++;
		if(score==10) {
		endGame(date,score);
		System.exit(0);
		}
	}
	else {
		System.out.println("Biff!");
		miss++;	
		if(miss==5) {
		endGame(date,score);
		System.exit(0);
		}
		
	}
	frame.dispose();
	drawButton(new Random().nextInt(24));
}
}
