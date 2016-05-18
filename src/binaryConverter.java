import java.awt.Button;
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
		panel.add(start);
		panel.add(answer);
		panel.add(button);
		button.setText("convert from binary!");
		button.addActionListener(this);
		answer.setEditable(false);
	}

	public void actionPerformed(ActionEvent e) {
		String bl = convert(start.getText());
		JOptionPane.showMessageDialog(null, bl);
	}

	String convert(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}
}