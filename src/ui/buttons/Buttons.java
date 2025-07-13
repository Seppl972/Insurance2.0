package ui.buttons;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Buttons implements ActionListener {
    
    JButton[] buttonArray = new JButton[6];
    JButton loginButton, searchButton, listButton, addButton, JTableButton, SQLButton;

    // Konstruktor 
    public Buttons(JPanel panel) {

        createStartButtons(panel);

    }

    public void createStartButtons(JPanel panel) {

        panel.setLayout(new GridLayout(7, 1));
        
        panel.setBackground(Color.WHITE);

        // GUI Button erzeugen
        loginButton = new JButton("Login");
        searchButton = new JButton("Search");
        listButton = new JButton("List View");
        addButton = new JButton("Add new Customor");
        JTableButton = new JButton("Teste JTable");
        SQLButton = new JButton("1.Versuch mit SQL");

        // GUI Buttons in Array speichern
        buttonArray[0] = loginButton;
        buttonArray[1] = searchButton;
        buttonArray[2] = listButton;
        buttonArray[3] = addButton;
        buttonArray[4] = JTableButton;
        buttonArray[5] = SQLButton;

        for (JButton btn : buttonArray) {
            btn.addActionListener(this);
            panel.add(btn);  
        }       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        // Login Objekt erzeugen über Unterklasse Login
        if (e.getSource() == loginButton) {

            
        }

        // Search Objekt erzeugen über Unterklasse Search
        if (e.getSource() == searchButton) {
            
        }

        // ListView Objekt erzeugen über Unterklasse ListView
        if (e.getSource() == loginButton) {
            
        }

        // AddCustomor Objekt erzeugen über Unterklasse AddCustomor
        if (e.getSource() == loginButton) {
            
        }

        // JTable Objekt erzeugen über Unterklasse JTable
        if (e.getSource() == loginButton) {
            
        }

        // SQL Objekt erzeugen über Unterklasse SQL
        if (e.getSource() == loginButton) {
            
        }

    }

}