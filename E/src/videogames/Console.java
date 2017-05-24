package videogames;

 public abstract class Console {
	 
	 Console(){ System.out.println("This is a console");
	 
	 }
	 
	public void year(){
		 System.out.println("I came out in 2002");
	 }
	 
	 abstract String conColor(String value);

}
