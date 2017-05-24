package basic;

public class Actions {
	
	
	 String color  = "silver";
	 String model = "mazda";
	
	public void print(String value){
		System.out.println(value);
	}
	
	public void print(int value){
		System.out.println(value);
	}

	void shoes(String size){
		
		print(size);
		
	}
	
	public int random (int max, int min){
		
		int value = (int) Math.round(Math.random()*max+min);
		return value;
	}
	
	public double random (double max, double min){
		
		double value =  Math.round(Math.random()*max+min);
		return value;
	}
	
	String msg( String message){
		if( color == "silver"  && model == "mazda"){
			
			message = "You have a silver colored mazda";
		}else if ( color == "blue"){
			message = "You have a blue car";
		}else{
			message = "You have an irregular car";
		}
		return message;
	}

}
