package warrior;

public class General extends Knight {
	
	public General(String n, int h, int m){
		super(n);
		hp = h;
		mp = m;
		System.out.println("I am now a General");
	}
	
//	public void info (){
//		System.out.println("Name:"+name+" HP:"+hp+" MP:"+mp+" and "+happy);
//	}

}
