package battle;

import warrior.*;

public class Battle {
	 int[] atkL = new int[2],
	 	   defL = new int[2],
	 	   spdL = new int[2],
	 	   evaL = new int[2],
	 	   hpL  = new int[2],
	 	   mpL  = new int[2];
	
	public Battle( Warrior w , Warrior w2) {
		System.out.println("And the battle commences!");
		System.out.println("With "+w.name+" the "+w.job+" and "+w2.name+" the "+w2.job);
	}

}
