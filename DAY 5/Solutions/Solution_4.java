package practice_ques;

public class Solution_4 {
	
	private String name;
	private String rollno;
	private int age;
	
	public String getName() {
		return name;
	}

	public String getRollno() {
		return rollno;
	}
	
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Solution_4 obj= new Solution_4();
		obj.setAge(20);
		obj.setName("Shubham");
		obj.setRollno("1902245");
		
		System.out.println("Name: "+obj.name);
		System.out.println("Age: "+obj.age);
		System.out.println("Roll No: "+obj.rollno);
	}
}
