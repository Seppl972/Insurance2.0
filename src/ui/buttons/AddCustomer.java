package ui.buttons;

import javax.swing.*;

public class AddCustomer extends JPanel { // Wir machen die Klasse selbst zu einem JPanel
    
    public AddCustomer() {
        // Layout setzen, damit die Elemente untereinander stehen
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        createNewCustomer();
    }

    public void createNewCustomer() {
        // Wir fügen die Komponenten direkt "this" (dem Panel selbst) hinzu
        JLabel frage = new JLabel("Create new Customer");
        add(frage);
            
        JLabel enterName = new JLabel("Enter full name:");
        JTextField name = new JTextField(20); // Größe angeben
        add(enterName);
        add(name);

        JLabel enterAge = new JLabel("Enter age:");
        JTextField age = new JTextField(5);
        add(enterAge);
        add(age);

        JButton enterButton = new JButton("Enter");
        JButton backButton = new JButton("Back");
        
        add(enterButton);
        add(backButton);

        // Logik für den Button
        enterButton.addActionListener(l -> {
            if (!name.getText().isEmpty()) {
                frage.setText(name.getText() + " was created successfully");
            }
        });
    }
}