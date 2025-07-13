package ui.buttons;

import javax.swing.*;

public class BenutzerDaten {
    
    public BenutzerDaten() {

        createJTable();
    
    }

    public void createJTable() {

        // Spaltentitel
	    String[] title = new String[]{
	    	"First Name", "Last Name", "Age", "Place"
	    };
		
	    // Die Daten für das Table
	    String[][] data = new String[][]{
	    {"Sebastian", "Lindner", "23", "Java"},
	    {"", "", "", ""},
	    {"", "", "", ""},
	    {"", "", "", ""},
	    {"", "", "", ""},
				
	    };

	    // Das JTable initialisieren
	    JTable Daten = new JTable();
	
	    JFrame dataFrame = new JFrame( "Das ist ein JTable Test");
	    dataFrame.getContentPane().add( new JScrollPane() );

	    dataFrame.pack();
	    dataFrame.setSize(800, 200);
	    dataFrame.setLocationRelativeTo(null);
	    dataFrame.setVisible( true );
        
	}

    
}
