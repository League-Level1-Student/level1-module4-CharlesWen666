package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter;
	JLabel label = new JLabel();
	int num =0;
	int numc=0;

	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		currentLetter = generateRandomLetter();
		label.setText(currentLetter+"");
		frame.addKeyListener(this);
		frame.add(panel);
		panel.add(label);
		frame.pack();
		
	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar()==currentLetter) {
			System.out.println("Correct");
			panel.setBackground(Color.GREEN);
			numc=numc+1;
		}
		else {
			panel.setBackground(Color.RED);
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: "+e.getKeyChar());
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter=generateRandomLetter();
		label.setText(currentLetter+"");
		num=num+1;
		if(num==20) {
			showTypingSpeed(numc);
			System.exit(0);
		}
	}
	Date timeAtStart = new Date();
    
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	    Date timeAtEnd = new Date();
	    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	    long gameInSeconds = (gameDuration / 1000) % 60;
	    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	    int charactersPerMinute = (int) (charactersPerSecond * 60);
	    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	} 
}

