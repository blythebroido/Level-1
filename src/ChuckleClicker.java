import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();

	public static void main(String[] args) {
		ChuckleClicker chuckle = new ChuckleClicker();
		chuckle.makeButtons();
	}

	void makeButtons() {
		frame.setVisible(true);
		frame.setSize(250, 100);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button1.setText("joke");
		button2.setText("punchline");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "Which dinosaur knew the most words?");
		}
		if(e.getSource() == button2){
			JOptionPane.showMessageDialog(null, "The thesaurus!");
		}
	}
}