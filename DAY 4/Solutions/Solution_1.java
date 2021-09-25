package practice_ques;

import java.util.Scanner;

public class Solution_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("prime numbers are: ");
		for (int i=m+1; i<n; i++)
		{
			if (prime_num(i)==true)
			{
				System.out.print(i + " ");
			}
		}
	}

	private static boolean prime_num(int number) {
		
		for (int i=2; i<=number/2; i++)
		{
			if (number%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
