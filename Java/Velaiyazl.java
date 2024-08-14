package glad1;

class Employee1{
	void work() {
		System.out.println("Hard Job");
	}
	
	void getsalary() {
		System.out.println("75000");
	}
}

class HRManager extends Employee1{
	
	void work() {
		System.out.println("Nice Job");
	}
	
	void addEmployee() {
		System.out.println("1500");
	}
}

public class Velaiyazl {

	public static void main(String[] args) {
		HRManager hr = new HRManager();
		hr.work();
		hr.getsalary();
		hr.addEmployee();

	}

}
