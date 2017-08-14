package canvas;

import java.awt.*;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class CanvasEx {

//	protected Canvas canvas = new Canvas();
	protected Graphics g;
	protected BufferStrategy buffer;
	protected int height, width;
	protected JFrame frame;
	
	public CanvasEx(int height, int width) {
		
		frame = new JFrame();
		this.height = height;
		this.width = width;
		
		frame.setSize(width,height);
		frame.setTitle("Example 1");
		
//		canvas.setSize(width, height);
//		g = canvas.getGraphics();
//		g.drawString("this is a string",10,20);
//		g.setColor(Color.blue);
//		canvas.paint(g);
		
		
		System.out.println("canvas has commenced");
	}
	
	
	public void display(){
		
		frame.add(new myCanvas(width,height));
//		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	public class myCanvas extends Canvas{
		
		 
		private static final long serialVersionUID = 1L;

		public myCanvas(int width, int height){
		  
		  setSize(width, height);
			
		}
	  
	  public void paint(Graphics g){
		  System.out.println("Painting graphics");
		  g.setColor(Color.blue);
		  g.drawString("this is a string",10,20);
		  g.setColor(Color.cyan);
		  g.drawRect(30, 30, 100, 100);
		  g.setColor(Color.ORANGE);
		  g.fillOval(45, 45, 100, 100);
		  
	  }
	  
			
	}// myCanvas class

}// CanvasEx class
