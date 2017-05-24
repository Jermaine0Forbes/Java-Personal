package date;

import java.text.SimpleDateFormat;
import java.util.Date;

import basic.Actions;

/* Date
 * 
 * 	is an object where you can get the current date or change the date
 * 
 * Date.setTime(milliseconds)
 * 
 * 	Sets a new Time by providing the amount of milliseconds in the parameter
 * Here is an article talking about it https://docs.oracle.com/javase/8/docs/api/java/sql/Date.html#setTime-long-
 * 
 * SimpleDateFormat
 * 
 *	 is an object that creates a pattern of how you want to display the date. In order to create
 * a new pattern you have to always instantiate a new date  patter to a variable
 * in order for the patter to change
 * 
 * here is an article talking about it https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
 * 
 */

public class Date_Format {
	
	public static void main(String args[]){
		
		Date curDate = new Date();
		
		 long num  = 60000 * 12000 * 18000;
		 
		 curDate.setTime(num);
		
		SimpleDateFormat d = new SimpleDateFormat();
		
		Actions a = new Actions();
		
		String date1, date2, date3, date4;
		
		date1 = d.format(curDate);
		
		a.print("This is a date when you format a string with the Date object: "+date1);
		
		d = new SimpleDateFormat("dd-MM-yyyy");
		
		date2 = d.format(curDate);
		
		a.print("This is a date that is formatted: dd-MM-yyyy " +date2);
		
	    
		d = new SimpleDateFormat("M/d/Y");
		
		date3 = d.format(curDate);
		a.print("This is a date that is formatted: M/d/Y " +date3);
		
		// if you type four letters together for the month or weekday you will spell out
		// months like march instead of outputting 3, or Saturday as opposed to Sat
		d = new SimpleDateFormat("EEEE MMMM d Y");
		
		date4 = d.format(curDate);
		
		a.print("This is a date that is formatted: M/d/Y " +date4);
		
		
	}

}
