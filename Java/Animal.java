package glad1;

class Animals{
void makeSound(int a){
	System.out.println("Bark");
}
}
class Cat extends Animals{
	void makeSound(int a) {
		System.out.println("meow");
	}
}




public class Animal {

	public static void main(String[] args) {
		Cat puna = new Cat();
		puna.makeSound(7);

	}

}
