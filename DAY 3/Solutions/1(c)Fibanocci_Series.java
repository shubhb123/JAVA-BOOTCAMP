package practice_ques;

import java.util.Scanner;

public class Fibanocci_Series {
	
	public void fibo(int a, int b)
	 {
		int first=0;
		int second=1;
		int sum=0;
		System.out.print(first+" "+second+" ");
		for(int i=a;i<b-2;i++) {
		sum=first+second;
		first=second;
		second=sum;
		System.out.print(sum+" ");
		}
		System.out.println();
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Fibanocci_Series obj = new Fibanocci_Series();
		 System.out.println("Enter last number:" );
		 int b = sc.nextInt();
		 obj.fibo(0, b);

	}

}
