package practice_ques;

import java.util.Scanner;

public class Even_Odd_Method {
	
	public String even_odd(int a)
	{
		return (a%2==0?"even":"odd");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Even_Odd_Method obj = new Even_Odd_Method();
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.println();
		System.out.println("The number is: "+obj.even_odd(a));

	}

}
