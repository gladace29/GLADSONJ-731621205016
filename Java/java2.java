package glad1;

class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	Employee(int employeeId,String employeeName,int employeeSalary){
		this.employeeId = employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	
	
	
	void display() {
		System.out.println("Employee Id" + employeeId);
		System.out.println("Employee Name" + employeeName);
		System.out.println("Employee Salary" + employeeSalary);
	}
}
public class java2 {
public static void main(String[] args) {
	Employee emp1 = new Employee(16,"Ace",7000);
	emp1.display();
}
}
