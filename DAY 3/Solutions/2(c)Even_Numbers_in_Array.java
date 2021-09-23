package practice_ques;

import java.util.Scanner;

public class Even_Numbers_in_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 System.out.print("Enter number of elements: ");
		 int arr[], n, i;
		 n = sc.nextInt();
		 arr = new int [n];
		 for (i=0; i<n; i++)
		 {
		 System.out.print("Enter " + i + "th element: ");
		 arr[i] = sc.nextInt();
		 }
		 System.out.print("Even numbers are: ");
		 for (i=0; i<n; i++) {
			 if (arr[i]%2==0) {
				 System.out.print(arr[i] + ", ");
			 }
		 }
	}

}
