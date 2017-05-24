package maps;

import java.util.Map;
import java.util.HashMap;

/* Maps
 * http://www.javatpoint.com/java-hashmap
 * 
 * My defintion: maps are like objects that contains a key and value pair.
 * Similar to object literals in java, you can create  key , value pairs by 
 * initializing what type of data type you want to add into the map
 * 
 * Map.put
 * adds a new key, value pair into the map
 *
 * HashMap.values()
 * prints out all the values in the map object
 * 
 * Map.keySet
 * returns an array of the key values in the map
 * 
 * HashMap.isEmpty()
 * returns a boolean to determine if the map is empty or not
 * 
 * Map.Entry
 * receives the values in from the map.entrySet or map.keySet
 * 
 */


public class Maps_ {

	public static void main(String args[]){
		
		Map <String , Integer> animals = new HashMap <>();
		
		animals.put("whale", 5000);
		animals.put("cheetah", 230);
		animals.put("peacock", 40);
		animals.put("eagle", 15);
		animals.put("giraffe", 2350);
		
		
		//System.out.println(animals.values());
		System.out.println(animals.keySet());
		
		for(Map.Entry map : animals.entrySet()){
			
			System.out.println(map.getValue());
		}
		
	}
}
