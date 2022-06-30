package fourRectanglePrinter;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.gray);
		frame.setSize(500, 500);
		frame.setTitle("Microsoft Circa 2012");
		
		RectangleComponent logo = new RectangleComponent();
		frame.add(logo);
		
		

	}

}
