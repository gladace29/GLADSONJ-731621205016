package glad1;

public class Methods {
	void mymethod() {
		System.out.println("Instance Method");
	}
	
	static void mymethod1() {
		System.out.println("Static Method");
	}
	
	
public static void main(String[] args) {
	Methods obj = new Methods();
	obj.mymethod();
	
	Methods.mymethod1();
}
}
