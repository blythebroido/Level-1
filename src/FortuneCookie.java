import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	static JFrame frame = new JFrame();
	JButton button = new JButton();

	public static void main(String[] args) {
		FortuneCookie cookie = new FortuneCookie();
		cookie.doStuff();
	}

	void doStuff() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(button);
		button.setText("Prepare to get your dangerous fortune... -Trevor Gile");
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int random = new Random().nextInt(5);
		
		if (random == 0) {
			JOptionPane.showMessageDialog(null, "Have the best day of your life today. Tomorrow, the sun won't rise.");
		} 
		else if (random == 1) {
			JOptionPane.showMessageDialog(null, "If you enter the lottery with 0010, you will win.");
		} 
		else if (random == 2) {
			JOptionPane.showMessageDialog(null, "You will fall out of the window.");
		} 
		else if (random == 3) {
			JOptionPane.showMessageDialog(null, "You will be drafted as a Kamikaze pilot.");
		} 
		else if (random == 4) {
			JOptionPane.showMessageDialog(null, "You will run out of pretzels.");
		}
	}
}
