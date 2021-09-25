package practice_ques;


import java.util.Scanner;

public class Solution_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		armstrong (n);
	}

	private static void armstrong(int n) {
		int num = n, rem=0, x=0, cube=0;
		while (num!=0)
		{
			rem = num%10;
			num/=10;
			cube+=rem*rem*rem;
		}
		if (cube==n)
		{
			System.out.println(n + " is armstrong");
		}
		else
		{
			System.out.println(n + " is not armstrong");
		}
	}

}
