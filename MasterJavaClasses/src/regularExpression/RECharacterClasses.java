package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//This program is a demo for character classes in java
public class RECharacterClasses {
	
public void CharacterClasses1(){
		
		//[abc]: either a or b or c
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher("a3b#k@9zc");
		System.out.println("Executing from [abc]");
		while(m.find())
		{
			System.out.println("Starting Index of "+m.group()+" is: "+m.start());
		}
		
/*		Output:Executing from [abc]
		Starting Index of a is: 0
		Starting Index of b is: 2
		Starting Index of c is: 8   	*/
}

public void CharacterClasses2(){
		
		//[^abc]: except a & b & c
		Pattern p = Pattern.compile("[^abc]");
		Matcher m = p.matcher("a3b#k@9zc");
		System.out.println("Executing from [^abc]");
		while(m.find())
		{
			System.out.println("Starting Index of "+m.group()+" is: "+m.start());
		}
	/*	    	Executing from [^abc]
				Starting Index of 3 is: 1
				Starting Index of # is: 3
				Starting Index of k is: 4
				Starting Index of @ is: 5
				Starting Index of 9 is: 6
				Starting Index of z is: 7				*/
}

public void CharacterClasses3(){
	
	//[a-z]: Any lower case alphabet from a to z
	Pattern p = Pattern.compile("[a-z]");
	Matcher m = p.matcher("a3b#k@9zcXOP");
	System.out.println("Executing from [a-z]");
	while(m.find())
	{
		System.out.println("Starting Index of "+m.group()+" is: "+m.start());
	}
/*
	Executing from [a-z]
	Starting Index of a is: 0
	Starting Index of b is: 2
	Starting Index of k is: 4
	Starting Index of z is: 7
	Starting Index of c is: 8		*/
}

public void CharacterClasses4(){
	
	//[A-Z]: Any upper case alphabet from A to Z
	Pattern p = Pattern.compile("[A-Z]");
	Matcher m = p.matcher("a3b#k@9zcXOP");
	System.out.println("Executing from [A-Z]");
	while(m.find())
	{
		System.out.println("Starting Index of "+m.group()+" is: "+m.start());
	}
	
/*  Executing from [A-Z]
	Starting Index of X is: 9
	Starting Index of O is: 10
	Starting Index of P is: 11			 */
}

public void CharacterClasses5(){
	
	//[a-zA-Z]: Any alphabet symbol
	Pattern p = Pattern.compile("[a-zA-Z]");
	Matcher m = p.matcher("a3b#k@9zcXOP");
	System.out.println("Executing from [a-zA-Z]");
	while(m.find())
	{
		System.out.println("Starting Index of "+m.group()+" is: "+m.start());
	}
/*	Executing from [a-zA-Z]
Starting Index of a is: 0
Starting Index of b is: 2
Starting Index of k is: 4
Starting Index of z is: 7
Starting Index of c is: 8
Starting Index of X is: 9
Starting Index of O is: 10
Starting Index of P is: 11				*/
}

public void CharacterClasses6(){
	
	//[0-9]: Any digit from 0-9
	Pattern p = Pattern.compile("[0-9]");
	Matcher m = p.matcher("a3b#k@9zcXOP");
	System.out.println("Executing from [0-9]");
	while(m.find())
	{
		System.out.println("Starting Index of "+m.group()+" is: "+m.start());
	}

	/*  Executing from [0-9]
		Starting Index of 3 is: 1
		Starting Index of 9 is: 6		*/
}

public void CharacterClasses7(){
	
	//[^0-9]: Any alphabet symbol including special characters
	Pattern p = Pattern.compile("[^0-9]");
	Matcher m = p.matcher("a3b#k@9zcXOP");
	System.out.println("Executing from [^0-9]");
	while(m.find())
	{
		System.out.println("Starting Index of "+m.group()+" is: "+m.start());
	}
/*	Executing from [^0-9]
Starting Index of a is: 0
Starting Index of b is: 2
Starting Index of # is: 3
Starting Index of k is: 4
Starting Index of @ is: 5
Starting Index of z is: 7
Starting Index of c is: 8
Starting Index of X is: 9
Starting Index of O is: 10
Starting Index of P is: 11			*/
}

public void CharacterClasses8(){
	
	//[a-zA-Z0-9]: Any alphanumeric symbol
	Pattern p = Pattern.compile("[a-zA-Z0-9]");
	Matcher m = p.matcher("a3b#k@9zcXOP");
	System.out.println("Executing from [a-zA-Z0-9]");
	while(m.find())
	{
		System.out.println("Starting Index of "+m.group()+" is: "+m.start());
	}
/*
Executing from [a-zA-Z0-9]
Starting Index of a is: 0
Starting Index of 3 is: 1
Starting Index of b is: 2
Starting Index of k is: 4
Starting Index of 9 is: 6
Starting Index of z is: 7
Starting Index of c is: 8
Starting Index of X is: 9
Starting Index of O is: 10
Starting Index of P is: 11
*/
}

public void CharacterClasses9(){
	
	//[^a-zA-Z0-9]: Except alphanumeric symbol i.e. special character
	Pattern p = Pattern.compile("[^a-zA-Z0-9]");
	Matcher m = p.matcher("a3b#k@9zcXOP");
	System.out.println("Executing from [^a-zA-Z0-9]");
	while(m.find())
	{
		System.out.println("Starting Index of "+m.group()+" is: "+m.start());
	}
	
/*	Executing from [^a-zA-Z0-9]
	Starting Index of # is: 3
	Starting Index of @ is: 5 
*/
}

public static void main(String[] args) {
		
	RECharacterClasses a = new RECharacterClasses();
	//	a.CharacterClasses1();
	//	a.CharacterClasses2();
    //	a.CharacterClasses3();
	//	a.CharacterClasses4();
	//	a.CharacterClasses5();
		a.CharacterClasses9();
}
}
