package warrior;

public abstract class Warrior extends Base {
	
	
	protected Warrior(){
		
	  hp = 100;
	  mp = 100;
	  def = 10;
      attack = 10; 
      speed = 10; 
      evasion = 10;
		
	}
	
				  
	
	 public void display(){
		 System.out.println("\n"+name+" the " +job +" has HP:"+hp+" and MP:"+mp);
			System.out.println(" Attack: "+attack+"\n Defense:"+def+"\n Speed:"+speed+"\n Evasion:"+evasion);
	 };
	 
	 public String getName(){
			return this.name;
		}
	 
	 public String getJob(){
			return this.job;
		}
	 
	 
	 public void setName(String str){
			this.name = str;
		}
	 
	 public int getAtk(){
		 return this.attack;
	 }
	 
	 public int getDef(){
		 return this.def;
	 }
	 
	 public int getSpd(){
		 return this.speed;
	 }
	 public int getEva(){
		 return this.evasion;
	 }

}
