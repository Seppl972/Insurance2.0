package ui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackroundPanel extends JPanel {
    
    private Image backgroundImage;

    public BackroundPanel(String imagePath) {
        // Bild laden
        backgroundImage = new ImageIcon(getClass().getResource(imagePath)).getImage();
        setLayout(null); // Für absolute Positionierung
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }

}
