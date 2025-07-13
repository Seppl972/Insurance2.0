package ui;

import java.awt.*;
import javax.swing.*;
import ui.buttons.Buttons;

public final class Frame extends JFrame {

	// SWING GUI deklarieren
	public JFrame startFrame;
	public JPanel startPanel;
	public JPanel backroundPanel;

	// Konstruktor (Erzeugt Frame-Objekt mit vorgegeben Methoden)
	public Frame() {

		//Hauptmenü
		createFrame();
		createBackroundPanel();
		createStartPanel();
		createStartButtons();
		setVisible(true);

	}

	public void createFrame() {

		// GUI Rahmen erstellen - 1920x1080		
		this.setTitle("Insurance2.0");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1920, 1080);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setLayout(null); // zwingend setBounds()!
		getContentPane().setBackground(Color.BLUE);

	}		
	
	public void createBackroundPanel() {

		BackroundPanel backround = new BackroundPanel("/ui/HintergrundbildMedizin.jpg");
    	backround.setBounds(0, 0, getWidth(), getHeight()); // am besten ganze Fenstergröße
    	backround.setLayout(null);
    	setContentPane(backround);
	}

	public void createStartPanel() {

		startPanel = new JPanel();
		startPanel.setBounds(750, 300, 400, 300);
		startPanel.setLayout(new FlowLayout());
		startPanel.setBackground(Color.GREEN);
		this.add(startPanel);

	}

	public void createUserLogin() {

		Login userLogin = new Login();
	}

	public void createStartButtons() {

		Buttons startButtons = new Buttons(startPanel);

	}

	public void repaintFrame() {

		this.removeAll();
		this.revalidate();
		this.repaint();
	
	}

} 