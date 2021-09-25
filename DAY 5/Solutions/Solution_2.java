package practice_ques;

class Solution_2{	
	
	 void multiply(int x)
	 {
		 System.out.println("Square of the number: " +(x*x));	 
	 }
	 
	 void multiply(int x, int y)
	 {
		 System.out.println("Multiplication of two numbers: " +(x*y));	 
	 }
	 
	 void multiply(int x, int y, int z)
	 {
		 System.out.println("Multiplication of three numbers: " +(x*y*z));	 
	 }
	 
	public static void main(String[] args){
	 Solution_2 a = new Solution_2();
	  a.multiply(20);
	  a.multiply(10, 20);
	  a.multiply(10, 20, 30);
	 }
}
