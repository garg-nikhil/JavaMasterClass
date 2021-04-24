package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinedCharClasses{

	//  \\s will check for space character
	//  \\S will check everything except for space character
	//  \\d will check for digit from 0-9
	//  \\D except digit it will check for other character including space
	//  \\w will check for any word character i.e. [0-9a-zA-Z]
	//  \\W except word character i.e. special symbol
	//	. will check for all characters including space
	
public void PreDefChar1(){
		
		//   \\s will check for space character
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher("This is Master");
		while(m.find())
		{
			System.out.println("Index of "+m.group()+" is:"+m.start());
		}
    
/*Output:
		 Index of   is:4
		 Index of   is:7
 */
}

public void PreDefChar2(){
	
	//  \\S will check everything except for space character
	Pattern p = Pattern.compile("\\S");
	Matcher m = p.matcher("This is Master");
	while(m.find())
	{
		System.out.println("Index of "+m.group()+" is:"+m.start());
	}
  
/*Output:
Index of T is:0
Index of h is:1
Index of i is:2
Index of s is:3
Index of i is:5
Index of s is:6
Index of M is:8
Index of a is:9
Index of s is:10
Index of t is:11
Index of e is:12
Index of r is:13
*/
}

public void PreDefChar3(){
	
	//   \\d will check for digit from 0-9
	Pattern p = Pattern.compile("\\d");
	Matcher m = p.matcher("This10 is Master 101");
	while(m.find())
	{
		System.out.println("Index of "+m.group()+" is:"+m.start());
	}
  
/*Output:
Index of 1 is:4
Index of 0 is:5
Index of 1 is:17
Index of 0 is:18
Index of 1 is:19
*/
}

public void PreDefChar4(){
	
	//   \\D except digit it will check for other character including space
	Pattern p = Pattern.compile("\\D");
	Matcher m = p.matcher("This is Master");
	while(m.find())
	{
		System.out.println("Index of "+m.group()+" is:"+m.start());
	}
  
/*Output:
Index of T is:0
Index of h is:1
Index of i is:2
Index of s is:3
Index of   is:4
Index of i is:5
Index of s is:6
Index of   is:7
Index of M is:8
Index of a is:9
Index of s is:10
Index of t is:11
Index of e is:12
Index of r is:13
*/
}

public void PreDefChar5(){
	
	//   \\w will check for any word character
	Pattern p = Pattern.compile("\\w");
	Matcher m = p.matcher("This12 is&*( Master#@!");
	while(m.find())
	{
		System.out.println("Index of "+m.group()+" is:"+m.start());
	}
  
/*Output:
Index of T is:0
Index of h is:1
Index of i is:2
Index of s is:3
Index of 1 is:4
Index of 2 is:5
Index of i is:7
Index of s is:8
Index of M is:13
Index of a is:14
Index of s is:15
Index of t is:16
Index of e is:17
Index of r is:18
*/
}

public void PreDefChar6(){
	
	//   \\W except word character i.e. special symbol
	Pattern p = Pattern.compile("\\W");
	Matcher m = p.matcher("This!12 is&*( M#@!");
	while(m.find())
	{
		System.out.println("Index of "+m.group()+" is:"+m.start());
	}
  
/*Output:
Index of ! is:4
Index of   is:7
Index of & is:10
Index of * is:11
Index of ( is:12
Index of   is:13
Index of # is:15
Index of @ is:16
Index of ! is:17
*/
}

public void PreDefChar7(){
	
	//   . will check for all characters including space
	Pattern p = Pattern.compile(".");
	Matcher m = p.matcher("T@3s is Ma&0er");
	while(m.find())
	{
		System.out.println("Index of "+m.group()+" is:"+m.start());
	}
  
/*Output:
Index of T is:0
Index of @ is:1
Index of 3 is:2
Index of s is:3
Index of   is:4
Index of i is:5
Index of s is:6
Index of   is:7
Index of M is:8
Index of a is:9
Index of & is:10
Index of 0 is:11
Index of e is:12
Index of r is:13
*/
}

public static void main(String[] args) {
		
		PreDefinedCharClasses a = new PreDefinedCharClasses();
		a.PreDefChar7();
	}

}
