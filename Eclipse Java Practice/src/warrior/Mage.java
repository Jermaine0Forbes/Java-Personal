package warrior;

public class Mage extends Warrior {
	
	public Mage(String nam){
		name = nam;
		hp -= 15;
		attack -= 10;
		def -= 10;
		
		mp += 45;
		speed +=5;
		evasion +=10;
		System.out.println("I am now a Mage");
	}
	
	

}
