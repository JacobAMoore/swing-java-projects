package learningSwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class FaceComponent extends JComponent{
	
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.white);
		
		//draw head
		Ellipse2D.Double head = new Ellipse2D.Double(5, 15, 100, 150);
		g2.draw(head);
		
		
		//draw eyes
		g2.setColor(Color.blue);
		Rectangle eye = new Rectangle(25, 70, 15, 15);
		g2.fill(eye);
		eye.translate(50, 0);
		g2.fill(eye);
		
		//draw mouth
		Line2D.Double mouth = new Line2D.Double(30, 110, 80, 110);
		g2.setColor(Color.white);
		g2.draw(mouth);
		
		//draw the greeting
		g2.setColor(Color.yellow);
		g2.drawString("Hello Cassandra!", 5, 175);
	}

}
