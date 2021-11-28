package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel a;
	JLabel b;
	JLabel c;
	int a1 = 0;
	int b1 = 0;
	int c1 = 0;

	public SlotMachine() {
		button.setText("SPIN");
		spin();
		button.addActionListener(this);
	}

	public void spin() {
		frame = new JFrame();
		panel = new JPanel();
		

		a1 = new Random().nextInt(4);
		b1 = new Random().nextInt(4);
		c1 = new Random().nextInt(4);
		try {

			if (a1 == 0) {
				a = createLabelImage("7.jpg");

			}
			if (a1 == 1) {
				a = createLabelImage("apple.png");
			}

			if (a1 == 2) {
				a = createLabelImage("cherry.png");
			}

			if (a1 == 3) {
				a = createLabelImage("orange.png");
			}

			switch (b1) {
			case 0:
				b = createLabelImage("7.jpg");
				break;
			case 1:
				b = createLabelImage("apple.png");
				break;
			case 2:
				b = createLabelImage("cherry.png");
				break;
			default:
				b = createLabelImage("orange.png");
			}

			switch (c1) {
			case 0:
				c = createLabelImage("7.jpg");
				break;
			case 1:
				c = createLabelImage("apple.png");
				break;
			case 2:
				c = createLabelImage("cherry.png");
				break;
			default:
				c = createLabelImage("orange.png");
			}
		
			frame.add(panel);
			panel.add(a);
			panel.add(b);
			panel.add(c);
			panel.add(button);
			frame.setVisible(true);
			frame.pack();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.dispose();

		spin();
		if(a1==b1&&b1==c1) {
			JOptionPane.showMessageDialog(null,"YOU WIN!");
			System.exit(0);
		}
	}
}