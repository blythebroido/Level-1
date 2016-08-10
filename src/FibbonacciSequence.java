import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FibbonacciSequence implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel();

	public static void main(String[] args) {
		FibbonacciSequence a = new FibbonacciSequence();
		a.go();
	}

	void go() {
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(label);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int a = 0;
		int b = 1;
		int c = 1;
		JLabel label2 = new JLabel();
		panel.add(label2);
		label2.setText(a + " ");
		JLabel label3 = new JLabel();
		panel.add(label3);
		label3.setText(b + " ");
		JLabel label4 = new JLabel();
		panel.add(label4);
		label4.setText(c + " ");
		

		
		for (int i = 0; i < 20; i++) {
			a = b;
			b = c;
			c = a + b;
			JLabel label1 = new JLabel();
			panel.add(label1);
			label1.setText(c + " ");
		}
		frame.pack();
	}
}
