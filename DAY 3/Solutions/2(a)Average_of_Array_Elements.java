package practice_ques;

import java.util.Scanner;

public class Average_of_Array_Elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int arr[], sum = 0, avg;
		 System.out.print ("Enter number of elements: ");
		 int n = sc.nextInt();
		 arr = new int [n];
		 for (int i=0; i<n; i++)
		 {
		 System.out.print ("Enter " + i + "th element: ");
		 arr[i] = sc.nextInt();
		 }
		 for (int i=0; i<n; i++)
		 sum += arr[i];
		 avg = sum/n;
		 System.out.println ("Average of Array Elements is: " + avg);

	}

}
