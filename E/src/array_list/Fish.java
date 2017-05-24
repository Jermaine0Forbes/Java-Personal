package array_list;

import basic.Actions;

public class Fish {
	
	String[] types = {"salmon", "mackerel", "keystone"};
	
	int[] weight = {2, 75};
	
	String type ;
	int pounds;
	
	Actions a = new Actions();

	public static int count = 0;
	
	
	
	Fish(){
		
		count++;
		a.print(count+" fish have been created");
		caught();
	}
	
	public void caught(){
		type = types[a.random(2,0)];
		pounds =  a.random(weight[1], weight[0]); 
	}
	
	
	public void stats(int count){
		
		System.out.println("fish "+count+" is a "+type+" and weighs "+pounds+" pounds");
	}
}
