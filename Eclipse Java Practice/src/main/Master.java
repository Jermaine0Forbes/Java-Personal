package main;
import warrior.*;
public class Master {
	
	public static void main(String[] args){
		
		Warrior k = new Knight("Jason");
		
		Warrior a = new Archer("John");
		
		a.display();
		k.display();
		
		
//		System.out.println("hello world");
	}

}
