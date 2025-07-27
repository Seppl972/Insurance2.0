package ui.buttons;

import javax.swing.*;

public class JTableTest {

    public JTableTest() {
        // Beispiel-Daten und Titel definieren
        String[] title = new String[] {
            "First Name", "Last Name", "Age", "Place"
        };

        String[][] data = new String[][] {
            {"Sebastian", "Lindner", "23", "Java"},
            {"Max", "Mustermann", "30", "Berlin"},
            {"Anna", "Schmidt", "28", "Hamburg"},
            {"", "", "", ""},
            {"", "", "", ""}
        };

        // Tabelle erstellen
        createJTable(title, data);
    }

    public void createJTable(String[] title, String[][] data) {
        // JTable erzeugen
        JTable table = new JTable(data, title);

        // Fenster erstellen
        JFrame dataFrame = new JFrame("Das ist ein JTable Test");
        dataFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // wichtig!

        // Tabelle in ScrollPane einbetten und zum Fenster hinzufügen
        JScrollPane scrollPane = new JScrollPane(table);
        dataFrame.getContentPane().add(scrollPane);

        // Fenster konfigurieren
        dataFrame.pack();
        dataFrame.setSize(800, 200);
        dataFrame.setLocationRelativeTo(null); // zentrieren
        dataFrame.setVisible(true);
    }

}