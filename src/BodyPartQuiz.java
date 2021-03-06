import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and
	// fill
	// in their paths here. To get the path, right click on the image, and copy
	// its Location.
	String secondImage = "/Users/league/Desktop/JamesMadison.jpg";
	String firstImage = "/Users/league/Desktop/JohnAdams.jpg";
	String thirdImage = "/Users/league/Desktop/ThomasJefferson.jpg";

	Frame window = new Frame();

	private void startQuiz() {
		int score = 0;
		String name1 = JOptionPane.showInputDialog(null, "Who is this?");
		if (name1.equals("John Adams")) {
			score = score + 1;
		} else {
			score = score - 1;
		}
		JOptionPane.showMessageDialog(null, score);
		// Set the size of the window so that you can only see part of the
		// image
		// Make an int variable to hold the score.
		// Ask the user who this person is and store their answer
		showNextImage();
		String name2 = JOptionPane.showInputDialog(null, "Who is this?");
		if (name2.equals("James Madison")) {
			score = score + 1;
		} else {
			score = score - 1;
		}
		JOptionPane.showMessageDialog(null, score);
		
		showNextImage();
		String name3 = JOptionPane.showInputDialog(null, "Who is this?");
		if (name3.equals("Thomas Jefferson")) {
			score = score + 1;
		} else {
			score = score - 1;
		}
		JOptionPane.showMessageDialog(null, score);

		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
		window.setBounds(100, 100, 100, 100);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
		window.setBounds(100, 100, 100, 100);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
