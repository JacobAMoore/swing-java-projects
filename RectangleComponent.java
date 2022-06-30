package learningSwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent{

	
	public void paintComponent(Graphics g) {
		
		//recover graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		//construct a rectangle and draw it
		Rectangle box = new Rectangle(75,80,70,150);
		
		g2.setColor(Color.red);
		g2.fill(box);
		
		//move the box object
		box.translate(100, 100);
		
		//draw moved box
		g2.setColor(Color.white);
		g2.fill(box);
		
		//move the box again
		box.translate(100, 100);
		
		//draw again
		g2.setColor(Color.blue);
		g2.fill(box);
		
	}
}
