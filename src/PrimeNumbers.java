import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrimeNumbers implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField textField = new JTextField(15);
	JLabel label = new JLabel();

	public static void main(String[] args) {
		PrimeNumbers a = new PrimeNumbers();
		a.go();
	}

	void go() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(label);
		panel.add(textField);
		frame.setSize(1000, 500);
		button.setText("Type a number less than 100 into the text field and click here to find out if" + " it is prime!");
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String string = textField.getText();
		int number = Integer.parseInt(string);
		for (int i = 1; i < 101; i++) {
			if (number % i == 1) {
				label.setText("no");
			} else {
				label.setText("yes");
			}
		}
		frame.pack();
	}
}
