package learningSwing;



import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.black);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setTitle("Swing graphical drawings tech test");
		
		
		
		RectangleComponent rectangle = new RectangleComponent();
		frame.add(rectangle);
		
		
		//EllipseComponent ellipse = new EllipseComponent();
		//frame.add(ellipse);
		
		//LineComponent line = new LineComponent();
		//frame.add(line);
		
		//TextComponent words = new TextComponent();
		//frame.add(words);
		
		//FaceComponent helloMan = new FaceComponent();
		//frame.add(helloMan);
		
	}

}
