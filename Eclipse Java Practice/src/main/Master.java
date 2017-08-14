package main;
//import javax.swing.JFrame;
//import jframe.JframeEx;
//import canvas.CanvasEx;
import canvas.CanvasEx2;
/* Java I Need To Know
 * 
 * JFrame : javax.swing.JFrame
 * 
 * Canvas : javax.awt.Canvas
 * 
 * synchronized
 * 
 * Thread
 * 
 * BufferStrategy
 * 
 * BufferedImage
 * 
 * 
 */


public class Master {
	
	public static void main(String[] args){
		
//		JframeEx f = new JframeEx(300,300,"This a frame");
//		
//		f.display();
		
		CanvasEx2 cv = new CanvasEx2(480,320, "This is a frame");
		
		cv.display();
		
		//Warrior k = new Knight("Jason");
		
		//Warrior a = new Archer("John");
		
		//a.display();
		//k.display();
		
		
//		System.out.println("hello world");
	}

}
