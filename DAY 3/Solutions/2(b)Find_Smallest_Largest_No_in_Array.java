package practice_ques;

import java.util.Scanner;

public class Find_Smallest_Largest_No_in_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int arr[], n, min, max;
		 System.out.print("Enter number of elements: ");
		 n = sc.nextInt();
		 arr = new int[n];
		 for (int i=0; i<n; i++)
		 {
		 System.out.print("Enter " + i + "th element: ");
		 arr[i] = sc.nextInt();
		 }
		 
		 //Smallest Number
		 min = arr[0];
		 for (int i=0; i<n; i++) {
			 if (arr[i]<min) {
				 min = arr[i];
			 }
		 }
		 System.out.println ("Smallest number in array is: " + min);
		 
		 //Largest Number
		 max = arr[0];
		 for (int i=0; i<n; i++) {
			 if (arr[i]>max) {
				 max = arr[i];
			 }
		 }
		 System.out.println ("Largest number in array is: " + max);
	}

}
