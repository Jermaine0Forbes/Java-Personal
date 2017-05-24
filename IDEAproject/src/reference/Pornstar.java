package reference;


import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by J on 12/4/2016.
 */
public class Pornstar extends Prostitute {
    String bustSize;
    int weight;
    String pornName;
    String height;
   static int countEmUp = 0;

    public Pornstar(){output();}
    public Pornstar(String name, double rate, String race){
    super(name, rate, race);
        output();
        totalHoes();
        System.out.println("Her name is "+name+" and she is one cute whore!" );
        pornName = name;
    }

    public void blowJob(){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        double result = (rate/3)*2.75;
        System.out.println(name+" uses her blowjob skill!");
        System.out.println("That skill takes $"+df.format(result)+" an hour!");
    }

    static void totalHoes(){

        countEmUp++;
        System.out.println("There are a total of "+countEmUp+" pornstars ready for action");
    }

    void output(){
        System.out.println("A new Pornstar has been born! ");
    }
}
