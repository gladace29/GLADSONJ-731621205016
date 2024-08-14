package glad1;

class Personah{
	void getFirstname() {
		System.out.println("I am First");
	}
	void getLastname() {
		System.out.println("I am last");
	}
}

class Employ extends Personah{
	
	void Employeeid() {
		System.out.println("Emp ID is declared");
	}
	@Override
	void getLastname() {
		System.out.println("I am a SDE");
		super.getLastname();
	}
	
}
public class AtkalThevai {
public static void main(String []args) {
	Employ obj=new Employ();
	obj.Employeeid();
	obj.getFirstname();
	obj.getLastname();
}
}
