package warrior;

public class Knight extends Warrior {
   
	public Knight(String nam ){
		setName(nam);
		hp += 45;
		attack += 5;
		def += 10;
		
		mp -= 45;
		speed -=10;
		evasion -=5;
		job = "Knight";
		System.out.println("I am now a Knight");
	}
	
//	private void setWeapon(String weapon){
//		switch(weapon){
//		case "sword" : System.out.println("You have a sword");
//		break;
//			
//		}
//	}
	
	
	
	
}
