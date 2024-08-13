package glad1;

public class This {
	String name;
	This(String name){
		this(10,20);
		this.name = name;
		this.greeting();
		
	}
	
	This(int a,int b){
		System.out.println("Addtion : "+(a+b));
	}
	
	void greeting() {
		System.out.println("Welcome"+name);
	}

	public static void main(String[] args) {
	  This obj = new This("Glad");

	}

}
