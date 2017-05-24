package stringMethods;

import basic.Actions;

/* string.trim()
 * 
 * It returns a copy of this string with leading and trailing white space removed, 
 * or this string if it has no leading or trailing white space.
 */

public class Trim {
	
	public static void main (String args[]){
		
		Actions act = new Actions();
		String msg = "This is my sad World            ";
		String exc = "!@#$%^";
		
		String both = msg+exc;
		act.print("Without trim!");
		act.print(both);
		
		act.print("\n With trim");
		msg = msg.trim();
		both = msg+exc;
		act.print(both);
	}

}
