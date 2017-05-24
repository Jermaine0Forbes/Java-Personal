
/**
 * Write a description of class console here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Console
{
    // instance variables - replace the example below with your own
   static String description = "this is a console";
   static int consolesProduced = 0;

    /**
     * Constructor for objects of class console
     */
    public Console()
    {
        System.out.println(description);
        
    }
      
    static void change(){
        description = "there is no console";
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void tellAmount()
    {
        // put your code here
       System.out.println( description+ " that has produced " + consolesProduced+" consoles");
    }
}
