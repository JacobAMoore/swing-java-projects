package learningSwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class LineComponent extends JComponent{
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Point2D.Double from = new Point2D.Double(200,125);
		Point2D.Double to = new Point2D.Double(125,200);
		
		Line2D.Double line = new Line2D.Double(to, from);
		
		g2.setColor(Color.red);
		g2.draw(line);
		
		
	}

}
