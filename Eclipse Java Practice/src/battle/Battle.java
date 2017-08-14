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
		System.out.println("With "+w.getName()+" the "+w.getJob()+" and "+w2.getName()+" the "+w2.getJob());
		Warrior copy;
		for(int x = 0 ; x < 2; x++){
			copy = (x == 0)? w:w2;
			atkL[x] = copy.getAtk() ;
			defL[x] = copy.getDef() ;
			spdL[x] = copy.getSpd();
			evaL[x] = copy.getEva();
			
			
		}
	}

}
