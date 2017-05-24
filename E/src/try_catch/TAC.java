package try_catch;

import basic.Actions;

/* try & catch
 * 
 * try and catch is basically a function that try an action of code and if they are
 * any errors they will print them out. The problem is for me, is that there are so many
 * different errors for specific things that I will probably not use this. I don't think I
 * have ever used this in any code 
 */

public class TAC {
	
	public static void main(String args[]){
		String[] cats = new String[3];
		Actions act = new Actions();
		
		cats[0]="waffle";
		cats[1] = "dexter";
		cats[2] = "meow";
		
		act.print("My favorite cat is ...");
		try{
			act.print(cats[2]);
			
		}catch (IndexOutOfBoundsException e){
			act.print("Your shit is fucked up!");
		}
		
	}

}
