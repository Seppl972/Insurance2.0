package ui;

import java.awt.*;
import javax.swing.*;
import ui.buttons.Buttons;

public final class Frame extends JFrame {

	// SWING GUI deklarieren
	public JFrame startFrame;
	public JPanel startPanel;

	// Konstruktor (Erzeugtes Frame-Objekt startet bestimmte Methoden)
	public Frame() {

		createFrame();
		createStartPanel();
		createStartButtons();

		setVisible(true);

	}

	public void createFrame() {

		// GUI Rahmen erstellen - 1920x1080		
		this.setTitle("Insurance CRM");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1920, 1080);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setLayout(null); // zwingend setBounds()!
		getContentPane().setBackground(Color.BLUE);

	}		
	
	public void createStartPanel() {

		startPanel = new JPanel();
		startPanel.setBounds(750, 300, 400, 300);
		startPanel.setLayout(new FlowLayout());
		startPanel.setBackground(Color.BLUE);
		this.add(startPanel);

	}

	public void createStartButtons() {

		Buttons startButtons = new Buttons(startPanel);

	}

} 