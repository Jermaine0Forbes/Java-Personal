package test_java;

import basic.Actions;

public class Pokemon {

	public String type ;
	public String height;
	public int weight;
	protected String species = "pokemon";
	protected String name = "pokemon";
	protected static int count = 0;
	protected String[] skill = new String[3];
	
	Actions act = new Actions();
	
	public Pokemon(String sp, String ty, String he, int we){
	  this.type = ty;
	  this.height = he;
	  this.weight = we;
	  this.species = sp;
	  
	  act.print("A "+species+" has been created");
	}
	
	
	Pokemon(){
		count++;
		act.print("You have created "+count+"  new pokemon");
		
	}
	
	public void addName(String na){
		this.name = na;
	}
	
	public void writeName (){
		act.print("The "+species+"'s name is "+name);
	}
	
	public void addSkills(String[]sks){
		for(int x= 0 ; x < sks.length ; x++){
			
			this.skill[x] = sks[x];
		}
	}
	
	public void writeSkills(){
		act.print(this.species+"'s skills are");
		int x  = 0;
		for(String value : this.skill){
			x++;
			act.print("Skill "+x+": "+ value);
		}
	}
	
}
