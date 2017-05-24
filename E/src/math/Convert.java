package math;

import java.text.DecimalFormat;

public class Convert {
	
	
	protected String decimalBody(String value, int digits){
		String d ="#.";
		for(int x = 0 ; x < digits; x++){
			d +="0";
		}
		
		DecimalFormat df = new DecimalFormat(d);
		String s = df.format(value);
		System.out.println(s);
		return s;
	}
	
	protected String decimalBody(double value, int digits){
		String d ="#.";
		for(int x = 0 ; x < digits; x++){
			d +="0";
		}
		
		DecimalFormat df = new DecimalFormat(d);
		
		return df.format(value);
	}
	
	
	
	
	public String decimal(String value, int digits){
		
		 String result = decimalBody(value, digits);
			
		String nValue = result;
		
	  return nValue;
	}
	
	public double decimal(double value, int digits){
		
		String result = decimalBody(value, digits);
		
		double nValue = Double.parseDouble(result);
		
	  return nValue;
	}
	
	

}
