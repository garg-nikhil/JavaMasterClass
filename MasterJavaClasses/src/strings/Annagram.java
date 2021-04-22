package strings;

import java.util.Arrays;

public class Annagram {
	
	public static void main(String[] args) {
		Annagram abc = new Annagram();
		abc.isAnnagram();
	}
	
	public void isAnnagram() {
		String str1= "silent abc";
		String str2= "listen cabe";
		boolean flag=false;
		
		if(str1.length() != str2.length())
		{
			flag = false;
		}
		else
		{
			char[] ab = str1.toLowerCase().toCharArray();
			char[] bc = str2.toLowerCase().toCharArray();
			
			Arrays.sort(ab);
			Arrays.sort(bc);
			
			flag = Arrays.equals(ab, bc);
		}
		
		if(flag==true)
			System.out.println("Annagram");
		else
			System.out.println("Not anna");
			
	}

}
