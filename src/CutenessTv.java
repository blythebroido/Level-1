import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton ducks = new JButton();
	JButton frog = new JButton();
	JButton unicorns = new JButton();

	public static void main(String[] args) {
		CutenessTv run = new CutenessTv();
		run.make();
	}

	void make() {
		frame.setVisible(true);
		frame.setSize(100, 150);
		frame.add(panel);
		panel.add(ducks);
		panel.add(frog);
		panel.add(unicorns);
		ducks.setText("Ducks!");
		unicorns.setText("Unicorns!");
		frog.setText("Froggie!");
		frog.addActionListener(this);
		unicorns.addActionListener(this);
		ducks.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ducks){
			showDucks();
		}
		if(e.getSource() == unicorns){
			showFluffyUnicorns();
		}
		if(e.getSource() == frog){
			showFrog();
		}
	}
	
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
