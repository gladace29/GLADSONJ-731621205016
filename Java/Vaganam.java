package glad1;

class Vehicles{
	void drive() {
		System.out.println("Vandi Mukiyam");
	}
}


class Car extends Vehicles{
	void drive(){
		System.out.println("Repairng a Car");
	}
}



public class Vaganam {

	public static void main(String[] args) {
		Car obj = new Car();
		obj.drive();

	}

}
