package learningSwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class EllipseComponent extends JComponent{

	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double ellipse = new Ellipse2D.Double(150, 150, 200, 75);
		g2.setColor(Color.yellow);
		g2.draw(ellipse);
	}
}
