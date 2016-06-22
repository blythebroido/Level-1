import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SpamALot implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField();
	JButton buttonGood = new JButton();
	JButton buttonBad = new JButton();
	Dimension d = new Dimension(1000, 20);
	static final String FAKE_USERNAME = "sallysmith072@gmail.com";
	static final String FAKE_PASSWORD = "code4life";
	
	public static void main(String[] args) {
		SpamALot spam = new SpamALot();
		spam.setUp();
	}
	
	public void setUp(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(buttonBad);
		buttonBad.setText("BAD");
		buttonGood.setText("GOOD");
		panel.add(buttonGood);
		text.setSize(100, 100);
		text.setPreferredSize(d);
		panel.add(text);
		frame.pack();
		buttonBad.addActionListener(this);
		buttonGood.addActionListener(this);
	}
	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean didItSend = true;
		JButton button = (JButton) e.getSource();
		if(button.getText().equals("BAD")){
			didItSend = sendSpam(text.getText(), "bad news", "you died");
		}
		if(button.getText().equals("GOOD")){
			didItSend = sendSpam(text.getText(), "good news", "you didn't die");
		}
		if(didItSend){
			text.setOpaque(false);
			text.setBackground(Color.GREEN);
		}
		else{
			text.setOpaque(false);
			text.setBackground(Color.RED);
		}
		
	}

}
