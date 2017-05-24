package maps;

import java.util.*;

/* TreeMap
 * 
 * map.put
 * 	 Allows you to put the key and values into the map 
 * 
 * map.entrySet()
 * 	Transmits all the map and key values into another map that you can use to output
 * to the console.
 */

public class TreeMap_ {
	
	public static void main(String args[]){
		
		TreeMap<Integer,String> age  =  new TreeMap<>(); 
		String  tf = "Felt pretty hopeless at this stage, I needed a job really bad at this moment";
		age.put(17,"I want to be an engineer");
		age.put(21, "I left FAMU beated and defeated");
		age.put(25,tf);
		age.put(27,"I have finally gotten over smell condition, but I am still unemployed. I'm  not defeated yet but I still am unemployed");
		
		for(Map.Entry map : age.entrySet() ){
			
			System.out.println(map.getKey()+" "+map.getValue());
			
		}
		
	}

}
