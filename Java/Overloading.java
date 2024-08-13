package glad1;

public class Overloading {
	
	void method(String name) {
		System.out.println(name);
	}
	
	void method(int a , int b) {
		System.out.println(a+b);
	}
	
	void method(int n) {
		System.out.println(n+n);
	}
	

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.method("Ace");
		obj.method(10,20);
		obj.method(7);

	}

}
