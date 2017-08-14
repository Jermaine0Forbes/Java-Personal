package jframe;


//import java.awt.BorderLayout;
import javax.swing.JFrame;

public class JframeEx {
	protected JFrame frame;

	public JframeEx(int height, int width, String title) {
		
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setTitle(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		System.out.println("Frame has been created");

	}
	
	public void display(){
		System.out.println("Frame will now be displayed");
		
		frame.setVisible(true);
	}

}
