package ui.buttons;

import data.SQLConnection;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Buttons implements ActionListener {
    
    JButton[] buttonArray = new JButton[5];
    JButton searchButton, listButton, addButton, JTableButton, SQLButton;

    // Konstruktor 
    public Buttons(JPanel panel) {

        createStartButtons(panel);

    }

    public void createStartButtons(JPanel panel) {

        panel.setLayout(new GridLayout(5, 1));
        
        panel.setBackground(Color.WHITE);

        // GUI Button erzeugen
        searchButton = new JButton("Search");
        listButton = new JButton("List View");
        addButton = new JButton("Add new Customer");
        JTableButton = new JButton("Teste JTable");
        SQLButton = new JButton("1.Versuch mit SQL");

        // GUI Buttons in Array speichern
        buttonArray[0] = searchButton;
        buttonArray[1] = listButton;
        buttonArray[2] = addButton;
        buttonArray[3] = JTableButton;
        buttonArray[4] = SQLButton;

        for (JButton btn : buttonArray) {
            btn.addActionListener(this);
            panel.add(btn);  
        }       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Search Objekt erzeugen über Unterklasse Search
        if (e.getSource() == searchButton) {
            
        }

        // ListView Objekt erzeugen über Unterklasse ListView
        if (e.getSource() == listButton) {
            
        }

        // AddCustomor Objekt erzeugen über Unterklasse AddCustomor
        if (e.getSource() == addButton) {
            
        }

        // JTable Objekt erzeugen über Unterklasse JTable
        if (e.getSource() == JTableButton) {
            JTableTest Test = new JTableTest();

        }

        // SQL Objekt erzeugen über Unterklasse SQLConnection
        if (e.getSource() == SQLButton) {
            SQLConnection connection = new SQLConnection();

       }

    }

}