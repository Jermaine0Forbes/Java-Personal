package warrior;

public class Archer extends Warrior{
	
	
	public Archer(String name) {
		this.name = name;
		hp += 15;
		attack += 5;
		def += 10;
		job = "Archer";
		mp -= 45;
		speed -=10;
		evasion -=5;
		System.out.println("I am now a Archer");
	}
	
	public void display(){
		System.out.println(name+" the " +job +" has HP:"+hp+" and MP:"+mp);
		System.out.println("Attack: "+attack+"\n Defense:"+def+"\n Speed:"+speed+"\n Evasion:"+evasion);
	}
	
	
}
