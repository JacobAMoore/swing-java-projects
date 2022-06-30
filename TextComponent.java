package learningSwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class TextComponent extends JComponent{
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		Font stringFont = new Font("Times New Roman", Font.PLAIN, 30);
		

		g2.setColor(Color.green);
		g2.setFont(stringFont);
		
		g2.drawString("I AM GROOT!", 125, 250);
		
		
		
	}

}
