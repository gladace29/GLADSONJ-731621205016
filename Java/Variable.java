package glad1;

public class Variable {
	int b = 20; //Instance variable
	static int c =30; //Static variable
	
public static void main(String[] args) {
	int a = 10; //Local variable
	System.out.println("Local variable : " +a);
	
	Variable obj = new Variable();
	System.out.println(obj.b);
	
	System.out.println(Variable.c);
}
}
