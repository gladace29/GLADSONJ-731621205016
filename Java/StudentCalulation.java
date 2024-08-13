package glad1;
import java.util.*;

class student{

	int regno,sum,avg;

	String Studname,grade;

	int[] Mark=new int[5];

	

	

	student(String name, int regno) {

		this.regno=regno;

		this.Studname=name;

		System.out.println("your Reg no. " + regno);

	}

	void getmarks() {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your 5 Subject Marks :");

		for(int i=0;i<Mark.length;i++) {

			Mark[i]=sc.nextInt();

		}	

	}

	

	void calcgrade() {


		for(int j=0;j<Mark.length;j++) {

			 sum += Mark[j];

		}avg=sum/5;

		System.out.println(sum);

		System.out.println(avg);

		

		if(sum > 490 && sum <=500) {

			System.out.println("Your GRADE : A");

		}

		else if(sum > 480 && sum <=490) {

			System.out.println("Your GRADE : B");

		}

		else if(sum > 400 && sum <=480) {

			System.out.println("Your GRADE : C");

		}else {

			System.out.println("You are FAIL");

		}

	}

}



public class StudentCalulation {

	public static void main(String[] args) {
		
		student obj=new student("Glad",16);

    	obj.getmarks();

    	obj.calcgrade();

    }

	}


