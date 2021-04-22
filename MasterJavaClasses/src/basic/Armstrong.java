package basic;

import java.util.Scanner;

//Check if the number is armstrong number
//Ex. 153 = (1^3)+(5^3)+(3^3) = 1+125+27 = 153

public class Armstrong {

	public static void main(String[] args) {
		
		Armstrong  a = new Armstrong();
		a.isArmStrong();
	}
	
	public void isArmStrong() {
		
		System.out.print("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int origin = num;
		int temp = num;
		int sum = 0;
		
		while(num != 0)
		{
			temp = num%10;
			num =  num/10;			
			sum = sum + temp*temp*temp;			
		}
		
		if (sum == origin )
			System.out.println("Armstrong");
		else
			System.out.println("Not armstrong");
		
	}

}
