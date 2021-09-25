package practice_ques;

import java.util.Scanner;

public class Calculate_Area {

	float area (float r)
	 {
	 return (22*r*r/7);
	 }
	 int area (int a)
	 {
	 return (a*a);
	 }
	 int area (int l, int b)
	 {
	 return (l*b);
	 }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Calculate_Area obj = new Calculate_Area();
		 
		 System.out.print("Enter side of sq: ");
		 int a = sc.nextInt();
		 System.out.println();
		 
		 System.out.print("Enter radius of circle: ");
		 float r = sc.nextInt();
		 System.out.println();
		 
		 System.out.print("Enter len & breadth of rect: ");
		 int l = sc.nextInt();
		 int b = sc.nextInt();
		 
		 float circle = obj.area(r);
		 int sq = obj.area (a);
		 int rect = obj.area (l, b);
		 
		 System.out.println ("Area of circle = " + circle);
		 System.out.println("Area of sq = " + sq);
		 System.out.println("Area of rect = " + rect);

	}

}
