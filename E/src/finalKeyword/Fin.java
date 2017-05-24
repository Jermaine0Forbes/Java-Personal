package finalKeyword;

import basic.Actions;

/* final keyword
 * 
 * Basically the final keyword is similar to const, but not exactly.
 * Whatever is declared final cannot be overidden or changed.
 * If you try to change it, you will recieve an error message. 
 * And the type of things that can use final is a variable, a method, and a class.
 */


class Skates{
	
	final public String  desc = "really fast";
	// If I try to change this variable I will get an error
	Skates(){
	  System.out.println("I'm riding with my skates and I'm going "+desc);
	}
}


class Bike{
	
	// If I try to override this method, I will receive an error
	final void complaint(){
		System.out.println("When I sit on a bike seat long enough my booty hurts");
	}
}


// if I try to extend this class I will get an error
final class Car{
   final void activate(){
	   System.out.println("I turned on the car, and went... VROOM!");
   }
}


public class Fin {
	
	
	
	public static void main(String args[]){
		
		Actions act = new Actions();
		
		Skates skate  = new Skates();
		
		Bike  bik = new Bike();
		
		Car car  = new Car();
		
		car.activate();
		
		bik.complaint();
		
		act.print(skate.desc);
	}

}
