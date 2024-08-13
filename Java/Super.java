package glad1;

class A{
	int a = 10;
	A(String name){
		System.out.println("Welcome"+name);
	}
	void Meth() {
		System.out.println("Super class Method");
	}
}

class B extends A{
	B(){
		super("\"Glad\"");
	}
	
	void meth2() {
		System.out.println("Super class Variable"+super.a);
		super.Meth();
	}
}


public class Super {

	public static void main(String[] args) {
		B b = new B();
		b.meth2();

	}

}
