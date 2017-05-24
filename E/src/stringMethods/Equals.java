package stringMethods;

import basic.Actions;
/* string.equals(string)
 * 
 * returns a boolean value to state if a string value is the same as other string value
 * Example: str.equals(str2)  // returns true or false
 * 
 */

/* string.equalsIgnoreCase(string)
 * 
 * does the same thing as string.equals() function but obviously ignores the upper or lower casing
 * of a value
 * 
 */
public class Equals {
	
	Actions act = new Actions();
	
	 public void answer(boolean val){
		
		if(val){
			 act.print("You are correct");
		 }else{
			 act.print("They don't match");
		 }
		 
	 }
	 
	
	 public static void main(String args[]){
		 
		 
		 String st1 = "Suck my ";
		 String st2 = "Penis";
		 String st3 = st1+st2;
		 String st4 = "Suck my Penis"; 
		 String st5 = "suck my penis";
		 
		 Equals e = new Equals();
		 
		 e.answer(st3.equals(st4));
		 
		 e.answer(st4.equals(st1+st2));
		 
		 e.answer(st5.equalsIgnoreCase(st4));
	 }
}
