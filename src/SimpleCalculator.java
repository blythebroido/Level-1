import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text1 = new JTextField(20);
	JTextField text2 = new JTextField(20);
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	double answer;
	
	public static void main(String[] args) {
		SimpleCalculator a = new SimpleCalculator();
		a.go();
	}
	
	void go(){
		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(text1);
		panel.add(text2);
		button1.setText("Add");
		button2.setText("Subtract");
		button3.setText("Multiply");
		button4.setText("Divide");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(button1)){
			answer = Double.parseDouble(text1.getText()) + Double.parseDouble(text2.getText());
		}
		if(e.getSource().equals(button2)){
			answer = Double.parseDouble(text1.getText()) - Double.parseDouble(text2.getText());
		}
		if(e.getSource().equals(button3)){
			answer = Double.parseDouble(text1.getText()) * Double.parseDouble(text2.getText());
		}
		if(e.getSource().equals(button4)){
			answer = Double.parseDouble(text1.getText()) / Double.parseDouble(text2.getText());
		}
		System.out.println(answer);
	}
}
