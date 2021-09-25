package practice_ques;

abstract class Salary{
	
	abstract void displaySalary();
	
	abstract void calculatePay(int pay);
	
}

class Employee extends Salary{

	@Override
	void calculatePay(int pay) {
		System.out.println("The salary is "+ pay+"rs");
	}

	@Override
	void displaySalary() {
		System.out.println("The salary is displayed");
	}
	
}

public class Solution_1 {
	
	public static void main(String[] args) {
		Employee obj= new Employee();
		int pay=1000;
		obj.displaySalary();
		obj.calculatePay(pay);

	}

}
