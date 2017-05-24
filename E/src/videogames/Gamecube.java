package videogames;


public class Gamecube extends Console{
	
	String color;
	String val = "silver";
  String conColor( String col){
		
		String out = "The gamecube color is "+col;
		
		return out;
	}
	
	public void game(){ System.out.println("I AM Gamecube");
	}
  public Gamecube(){  color = conColor(val);
		System.out.println(color);
	
	}

};
