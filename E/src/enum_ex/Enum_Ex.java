package enum_ex;

import enum_ex.Countries;
import enum_ex.Fruit;


/*enum
 * 
 *  My definition: enum is a class you can create a number of constant variables that
 *  cannot be changed. With a little bit of tweaking you can also make these variables
 *  hold different data types like strings, booleans, ints, etc. . If you don't add
 *  private variables to hold these new data types, you will ultimately print out
 *  the default constant variable
 *  
 *  In order to print out a new data type you have to create either a public method
 *  or public property that will read the new data type of the enum constant
 *  
 */

public class Enum_Ex {
	
	public enum Scooby{
		SCOOBYDOO,
		SHAGGY,
		FRED,
		LINDA
	}
	
	public static void main(String args[]){
		
		System.out.println(Scooby.SCOOBYDOO);
		
		
		System.out.println(Countries.JPN.getVal());
		
		System.out.println(Fruit.BANANA.read);
		
		System.out.println(Fruit.BANANA.val);
		
		
		for (Fruit f : Fruit.values()){
			
			System.out.println(f);
		}
		
		
	}

}
