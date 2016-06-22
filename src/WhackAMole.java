import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame;
	JPanel panel;
	int position;
	static Date timeAtStart;
	int tries = 0;
	int moles = 0;

	public static void main(String[] args) {
		WhackAMole w = new WhackAMole();
		timeAtStart = new Date();
		w.setUp();
		
	}
	
	public void setUp() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		frame.setSize(250, 300);
		frame.add(panel);
		frame.setLocation(800, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		position = new Random().nextInt(24);
		System.out.println(position);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			if(i == position){
				System.out.println(i + "i");
				button.setText("mole");
			}
		}

	}

	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		tries ++;
		JButton whichButton = (JButton) e.getSource();
		if(!whichButton.getText().equals("mole")){
			speak("Nope");
		}
		else if(whichButton.getText().equals("mole")){
			moles ++;
		}
		frame.removeAll();
		frame.dispose();
		setUp();
		if(tries >= 11){
			endGame(timeAtStart, moles);
		}
		
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}

}
