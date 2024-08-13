package glad1;

public class ConsOverload {

	ConsOverload(String name) {
		System.out.println(name);
	}
	
	ConsOverload(int a , int b) {
		System.out.println(a+b);
	}
	
	ConsOverload(int n) {
		System.out.println(n+n);
	}
	

	public static void main(String[] args) {

		ConsOverload obj = new ConsOverload("Ace");
		ConsOverload obj1 = new ConsOverload(10,20);
		ConsOverload obj2 = new ConsOverload(5);
		

	}


}
