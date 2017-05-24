package stringMethods;

import basic.Actions;

/* string.indexOf
 * 
 * a built in string method that tells you the numbered position the string is 
 * located in. The position number starts at 0
 */

public class IndexOf {
	
	public static void main(String args[]){
		
		String name = "my name is Jermaine Forbes";
		Actions action = new Actions();
		
		action.print(name.indexOf("s"));
		
		
	}

}
