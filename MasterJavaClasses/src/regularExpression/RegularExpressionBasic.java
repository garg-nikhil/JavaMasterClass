package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionBasic {

	public static void main(String[] args) {
		int count = 0;
    	Pattern p = Pattern.compile("7");
    	Matcher m = p.matcher("7276561520");
    	
    	while(m.find())
    	{
    		count++;
    		
    		//m.start will print starting index
    		System.out.print("Starting Index:"+m.start());
    		
    		//m.end will print ending index
    		//m.group will print the pattern which we are trying to find
    		System.out.println(" Ending Index:"+m.end()+".....Pattern: "+m.group());
    	}
    	System.out.println("No of occurences of pattern:"+count);

	}

}
