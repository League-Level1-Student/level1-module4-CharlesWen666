package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nasty_surprise implements ActionListener {
	JFrame a = new JFrame();
	JPanel b = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();

	public void showButtons() {
	Boolean t = true;
		b1.setText("Trick");
	b2.setText("Treat");
	b1.addActionListener(this);
	b2.addActionListener(this);
	a.add(b);
	b.add(b1);
	b.add(b2);
	a.pack();
	a.setVisible(t);
	b.setVisible(t);
	b1.setVisible(t);
	b2.setVisible(t);
	}

private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1) {
		showPictureFromTheInternet("https://www.gannett-cdn.com/presto/2020/03/17/USAT/c0eff9ec-e0e4-42db-b308-f748933229ee-XXX_ThinkstockPhotos-200460053-001.jpg?crop=1170%2C658%2Cx292%2Cy120&width=1200");
	
	}
	else {
		showPictureFromTheInternet("https://i.ytimg.com/vi/RNoHcWE8tbQ/maxresdefault.jpg");

	}
}
}


