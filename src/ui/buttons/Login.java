package ui.buttons;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

    public JPanel createLoginPanel() {

        JPanel loginPanel = new JPanel();
		loginPanel.setBounds(750, 300, 400, 300);
		loginPanel.setLayout(new GridLayout(7, 1, 10, 10));

        JTextField verify = new JTextField("Please verify!");
		loginPanel.add(verify);

		//Login-Name
		JLabel askUsername = new JLabel("Username: ");
		loginPanel.add(askUsername);
		JTextField getUsername = new JTextField();
		loginPanel.add(getUsername);

		//Login-PW
		JLabel password = new JLabel("Password: ");
		loginPanel.add(password);
		JPasswordField pw = new JPasswordField();
		loginPanel.add(pw);

		loginPanel.setVisible(true);

		return loginPanel;
    }

}