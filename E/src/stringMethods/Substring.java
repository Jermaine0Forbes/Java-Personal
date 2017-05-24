package stringMethods;

import basic.Actions;

/*string.substring
 * 
 * returns part of a string that was cut off based on the
 * position of the index number
 * 
 * Example: str = "Hello World"  str.substring(3) = "o World";
 */

public class Substring {
	
	public static void main (String args[]){
		
		String msg = "This is a very long winded message";
		
		Actions action = new Actions();
		
		msg = msg.substring(5);
		
		action.print(msg);
		
		
	}

}
