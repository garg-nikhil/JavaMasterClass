package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Below code will check for Quantifiers in RE
//a  --> Exactly one 'a'
//a+ --> Atleast one 'a'
//a* --> Any no of   'a' including zero
//a? --> Atmost one 'a'
public class QuantifiersRE {

public void Quantifiers1(){
		
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher("abaabaaab");
		System.out.println("Executing from [Quantifiers1]");
		while(m.find())
		{
				System.out.println("Starting index of "+m.group()+" is:"+m.start());
		}

/* Output:
Executing from [Quantifiers1]
Starting index of a is:0
Starting index of a is:2
Starting index of a is:3
Starting index of a is:5
Starting index of a is:6
Starting index of a is:7
*/
}
	
public void Quantifiers2(){
	
	Pattern p = Pattern.compile("a+");
	Matcher m = p.matcher("abaabaaab");
	System.out.println("Executing from [Quantifiers2]");
	while(m.find())
	{
			System.out.println("Starting index of "+m.group()+" is:"+m.start());
	}

/* Output:
Executing from [Quantifiers2]
Starting index of a is:0
Starting index of aa is:2
Starting index of aaa is:5
*/
}

public void Quantifiers3(){
	
	Pattern p = Pattern.compile("a*");
	Matcher m = p.matcher("abaabaaab");
	System.out.println("Executing from [Quantifiers3]");
	while(m.find())
	{
			System.out.println("Starting index of "+m.group()+" is:"+m.start());
	}
	
/*Output:
Executing from [Quantifiers3]
Starting index of a is:0
Starting index of  is:1
Starting index of aa is:2
Starting index of  is:4
Starting index of aaa is:5
Starting index of  is:8
Starting index of  is:9
 */
}

public void Quantifiers4(){
	
	Pattern p = Pattern.compile("a?");
	Matcher m = p.matcher("abaabaaab");
	System.out.println("Executing from [Quantifiers4]");
	while(m.find())
	{
			System.out.println("Starting index of "+m.group()+" is:"+m.start());
	}

/*Output:
Executing from [Quantifiers4]
Starting index of a is:0
Starting index of  is:1
Starting index of a is:2
Starting index of a is:3
Starting index of  is:4
Starting index of a is:5
Starting index of a is:6
Starting index of a is:7
Starting index of  is:8
Starting index of  is:9
*/
}

public static void main(String[] args) {
		QuantifiersRE a = new QuantifiersRE();
		a.Quantifiers1();
		a.Quantifiers2();
		a.Quantifiers3();
		a.Quantifiers4();

	}

}
