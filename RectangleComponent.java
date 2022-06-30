package fourRectanglePrinter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class RectangleComponent extends JComponent{

	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.red);
		
		Rectangle rectangle = new Rectangle(50, 50, 50, 50);
		g2.fill(rectangle);
		
		
		
		g2.setColor(Color.green);
		g2.translate(50, 0);
		g2.fill(rectangle);
		
		
		g2.setColor(Color.blue);
		g2.translate(-50, 50);
		g2.fill(rectangle);
		
		
		g2.setColor(Color.yellow);
		g2.translate(50, 0);
		g2.fill(rectangle);
		
		
        Font textFont = new Font("Times New Roman", Font.PLAIN, 30);
		g2.setColor(Color.white);
		g2.setFont(textFont);
		g2.drawString("Microsoft Co.", 0, 125);
		
	}
}
