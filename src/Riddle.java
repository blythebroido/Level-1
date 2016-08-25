import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Riddle implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JTextField text = new JTextField(20);
	JLabel label = new JLabel();
	int question = 1;

	public static void main(String[] args) {
		Riddle riddle = new Riddle();
		riddle.go();
	}

	void go() {
		frame.setVisible(true);
		frame.setSize(1000, 100);
		frame.add(panel);
		panel.add(button1);
		panel.add(text);
		panel.add(button2);
		label.setText("I am taken from a mine, and shut up in a wooden case, " + "from which I am never released and yet I am used by almost " + "everybody. What am I?");
		panel.add(label);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button1.setText("Clue");
		button2.setText("Submit");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String answer = text.getText();
		if (e.getSource() == button1) {
			if (question == 1) {
				JOptionPane.showMessageDialog(null, "I am poisonous.");
			} else if (question == 2) {
				JOptionPane.showMessageDialog(null, "Shhhhh... ");
			}
		} else {
			if (question == 1) {

				if (answer.equalsIgnoreCase("pencil lead")) {
					JOptionPane.showMessageDialog(null, "Correct");
					label.setText("No sooner spoken than broken. What is it?");
					question = 2;
				} else {
					JOptionPane.showMessageDialog(null, "No, keep trying.");
				}
			}
			if (question == 2) {
				if (answer.equalsIgnoreCase("silence")) {
					JOptionPane.showMessageDialog(null, "Correct");
				} else {
					JOptionPane.showMessageDialog(null, "No, keep trying.");
				}

			}
		}

	}
}
