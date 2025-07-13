package ui;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public final class Login {

	// Variablen
	private JTextField getUsername;
	private JPasswordField getPassword;
	private final String CORRECT_USER_NAME = "Sebastian";
	private final String CORRECT_USER_PASSWORD = "1234";

	// Konstruktor
	public Login() {

		createLoginFrame();
		//checkUserLogin();

	}

    public void createLoginFrame() {

		//JFrame Frame
		JFrame loginFrame = new JFrame();
		loginFrame.setTitle("Login");
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.setSize(400, 300);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setResizable(true);

		//Panel Layout
        JPanel loginPanel = new JPanel();
		loginPanel.setBounds(750, 300, 400, 300);
		loginPanel.setLayout(new GridLayout(5, 1));

		//JLabel Anzeigetext
        JLabel verify = new JLabel("Please verify!", SwingConstants.CENTER);
		loginPanel.add(verify);

		//Login-Name
		JLabel askUsername = new JLabel("Username: ");
		loginPanel.add(askUsername);
		getUsername = new JTextField();
		loginPanel.add(getUsername);

		//Login-PW
		JLabel password = new JLabel("Password: ");
		loginPanel.add(password);
		getPassword = new JPasswordField();
		loginPanel.add(getPassword);
		
		// Login ActionListener 
		ActionListener loginAction = e -> {
			String name = getUsername.getText();
			String checkPassword = new String(getPassword.getPassword());

			if (name.equals(CORRECT_USER_NAME) && (checkPassword.equals(CORRECT_USER_PASSWORD))) {
				
				loginFrame.dispose();
				Frame starteHauptmenü = new Frame();
				
			} else {
				
			}
		};

		getUsername.addActionListener(loginAction);
		getPassword.addActionListener(loginAction);

		//loginPanel.setVisible(true);
		loginFrame.add(loginPanel);
		loginFrame.setVisible(true);

    }

}