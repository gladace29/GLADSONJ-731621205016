package glad1;
class AA{
	AA(){
		System.out.println("A");
	}
	
	AA(int a){
		super();
		System.out.println("A 1");
	}
}
class BB extends AA{
	BB(){
		super(5);
		System.out.println("B");
	}
	
	BB(int b){
		System.out.println("B 1");
	}
}
public class Invocation {
	public static void main(String[] args) {
		BB b = new BB(5);
	}

}
