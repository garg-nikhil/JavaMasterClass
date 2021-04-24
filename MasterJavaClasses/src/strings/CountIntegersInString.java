package strings;


//Count the sum of integers in a given string
//or Count the sum of integers in a string entered by used at runtime
//sum of only those numbers which are divisible by 2

public class CountIntegersInString {

	public static void main(String[] args) {
		

		CountIntegersInString abc = new CountIntegersInString();
		abc.Count();
		abc.count1();
		
	}
	
	public void Count() {
		String s = "Java123geek23upgraded234"; //Output:- 20
		 int sum = 0;
	        for(int i = 0; i < s.length() ; i++){
	            
	        	if( Character.isDigit(s.charAt(i)) ){
	                sum = sum + Character.getNumericValue(s.charAt(i));
	              	}
	        	
	        }
	        System.out.println(sum);
	    
	}
	
	public void count1() {
		// A temporary string
		String str= "12abc20yz68";	//O/p:-100 
        String temp = "0";
  
        // holds sum of all numbers present in the string
        int sum = 0;
  
        // read each character in input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
  
            // if current character is a digit
            if (Character.isDigit(ch))
                temp += ch;
  
            // if current character is an alphabet
            else {
                // increment sum by number found earlier
                // (if any)
                sum += Integer.parseInt(temp);
  
                // reset temporary string to empty
                temp = "0";
            }
        }
  
        // atoi(temp.c_str()) takes care of trailing
        // numbers
        System.out.println(sum + Integer.parseInt(temp));
    
		
	}

}
