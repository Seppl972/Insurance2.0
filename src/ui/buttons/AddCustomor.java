package ui.buttons;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddCustomor {
    
    public AddCustomor() {

        createNewCustomor();

    }

    public void createNewCustomor() {

        JPanel createCustomor = new JPanel();

		//Gleiches Fenster, desshalb kein "JFrame frame = new JFrame();""
		JLabel Frage = new JLabel("Create new Customor");
			
		//Buttons, JLabels, JTextFields
		JLabel enterName = new JLabel("Enter full name:");
		JLabel enterAge = new JLabel("Enter age:");
		JLabel enterPlace = new JLabel("Enter place");

		JTextField name = new JTextField();
        JTextField Age = new JTextField();
		JTextField Place = new JTextField();

		//Enter & Back
		JButton enterButton = new JButton("enter");
		JButton backButton = new JButton("back");
		createCustomor.add(backButton);


		enterButton.addActionListener(l -> {
			int cusCounter = 0;
			cusCounter++;
			Frage.setText(name.getText() +" was created succesfully");
		});
		backButton.addActionListener(l -> {
			// showStartGUI();
		});

    }

}
