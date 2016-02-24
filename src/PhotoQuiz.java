 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the Internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String Smarties = "http://veganfoodlover.com/wp-content/uploads/2015/11/are-smarties-vegan.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component image1;
		// 3. use the "createImage()" method below to initialize your Component
image1 = createImage(Smarties);
		// 4. add the image to the quiz window
quizWindow.add(image1);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String SmartiesA = JOptionPane.showInputDialog("What candy is this? Use no capitals.");
		// 7. print "CORRECT" if the user gave the right answer
if(SmartiesA.equals("smarties")){
	JOptionPane.showMessageDialog(null, "Correct!");
}
		// 8. print "INCORRECT" if the answer is wrong
else{
	JOptionPane.showMessageDialog(null, "Incorrect...");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(image1);
		// 10. find another image and create it (might take more than one line of code)
String gummybears = "http://kidscreativearts.com/wp-content/uploads/2011/07/Gummy_Bears1.jpg";
		// 11. add the second image to the quiz window
image1 = createImage(gummybears);
		// 12. pack the quiz window
quizWindow.add(image1);
		// 13. ask another question
quizWindow.pack();
		// 14+ check answer, say if correct or incorrect, etc.
String gummybearsa = JOptionPane.showInputDialog("What candy is this? Use no capitals, and put it in the plural form.");
if(gummybearsa.equals("gummy bears")){
	JOptionPane.showMessageDialog(null, "Correct!");
}
else{
	JOptionPane.showMessageDialog(null, "Incorrect...");
}
if(SmartiesA.equals("smarties") && gummybearsa.equals("gummy bears")){
	JOptionPane.showMessageDialog(null, "Congratulations! You got an 100%");
}
else if(SmartiesA.equals("smarties") || gummybearsa.equals("gummy bears")){
	JOptionPane.showMessageDialog(null, "You should learn more candies. You got a 50%");
}
else{
	JOptionPane.showMessageDialog(null, "Wow. You got a 0%");
}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}


