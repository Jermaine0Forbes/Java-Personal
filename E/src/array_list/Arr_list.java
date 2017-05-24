package array_list;

import java.util.*;

import basic.Actions;

import array_list.Fish;


/* ArrayList
 * 
 * Resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements,
 *  including null. In addition to implementing the List interface, this class provides methods to manipulate the size of 
 *  the array that is used internally to store the list. (This class is roughly equivalent to Vector, except 
 *  that it is unsynchronized.)
 * 
 * ArrayList.add()
 * 
 * 	adds an item to the array list that is based on the data type
 * 
 * ArrayList.get(int index)
 * 
 * 	 based on the index number you provide it will get the value of that item
 * 
 * ArrayList.listIterator()
 * 
 * returns the values in a iterator data type, if you assign these values into an iterator
 * you will be able to loop through these values with the hasNext() method
 * 
 * 
 */

public class Arr_list {
	public static void main(String args[]){
		
		
		Actions a = new Actions();
		
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ListIterator<Integer> l ;
       ages.add(14);
       ages.add(18);
       ages.add(22);
       ages.add(26);
       
        l = ages.listIterator();
       
       while( l.hasNext()){
    	   System.out.println(l.next());
       }
		
		
		
//		ArrayList<String> colors =  new ArrayList <String>();
//		
//		colors.add("red");
//		colors.add("blue");
//		colors.add("green");
//		colors.add("purple");
//		colors.add("black");
//		colors.add("yellow");
//		

		
//		for(String value : colors){
//			
//			a.print(value);
//		}
		
//		Iterator list =  colors.iterator();
//		
//		for(int x = 0 ; x < colors.size(); x++){
//			String b =(String)list.next();
//			a.print("element "+x+" "+ b);
//			
//		}
			
		
		
		
//		ArrayList<Fish> fish = new ArrayList <Fish>();
//		
//		
//		
//		fish.add(new Fish());
//		fish.add(new Fish());
//		fish.add(new Fish());
//		
//		int num  = 0;
//		for( Fish value : fish){
//			num++;
//			value.stats(num);
//		}
		
	
		
	}
}
