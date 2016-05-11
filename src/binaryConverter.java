import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField start = new JTextField(20);
	JTextField answer = new JTextField(20);
	JButton button = new JButton();

	public static void main(String[] args) {
		new binaryConverter().go();
	}

	private void go() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(panel);
		panel.add(answer);
		panel.add(start);
		panel.add(button);
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		int bl = convert(start.getText());
		JOptionPane.showMessageDialog(null, bl);
	}

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("\2", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return 0;
		}
	}

}
