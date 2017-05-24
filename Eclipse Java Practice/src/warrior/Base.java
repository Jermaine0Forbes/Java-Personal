package warrior;

public abstract class Base {
	protected String name, job;
	protected int hp,
				  mp,
				  def,
			      attack, 
			      speed, 
			      evasion;
	abstract public void display();

}
