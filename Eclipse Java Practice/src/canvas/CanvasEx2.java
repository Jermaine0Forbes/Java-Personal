package canvas;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class CanvasEx2 {
	protected int width, height;
	
	Frame frame = new Frame();

	public CanvasEx2(int width, int height, String title) {

		frame.setSize(width, height);
		frame.setTitle(title);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing( WindowEvent we){
				System.exit(0);
			}
		});
		System.out.println("Frame created");
	}
	
	public void display(){
		frame.setVisible(true);
	}

}
