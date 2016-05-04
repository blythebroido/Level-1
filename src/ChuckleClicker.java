import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ChuckleClicker {
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		ChuckleClicker chuckle = new ChuckleClicker();
		chuckle.makeButtons();
	}

	void makeButtons() {
		frame.setVisible(true);
		JOptionPane.showMessageDialog(null, "");
	}
}
