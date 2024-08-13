package glad1;
import java.util.*;

class Employee {
    private String name;
    private String jobTitle;
    private double salary;

     Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void calculateSalaryIncrease(double percent) {
        if (percent > 0) {
            double increase = salary * percent / 100;
            salary += increase;
            System.out.println("Salary increased by " + percent + "%.");
            System.out.println("New Salary: " + salary);
        } else {
            System.out.println("Invalid percent");
        }
    }

    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
            System.out.println("Salary updated:" + salary);
        } else {
            System.out.println("Invalid salary");
        }
    }

    
   public   String toString() {
        return "Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary;
    }
}

class Emp {
    public static void main(String[] args) {
        Employee emp = new Employee("Glad", "Full Stack Developer", 50000);

        System.out.println(emp);
        emp.calculateSalaryIncrease(10);
        emp.updateSalary(85000);
        System.out.println(emp);
    }
}
