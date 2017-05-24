package reference;

/**
 * Created by J on 12/1/2016.
 */
public class Prostitute {
    String name;
   double rate;
    String race;

    public Prostitute(){

    }
    public Prostitute(String n, double rt, String rc){
        name = n;
        rate = rt;
        race = rc;
    }

    public String getName(){
        return name;
    }

    public String getRace(){
        return race;
    }

    public double getRate(){
        return rate;
    }
}
