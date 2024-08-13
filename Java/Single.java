package glad1;


class Twowheeler{
	void noofWheels() {
		System.out.println("Two Wheels");
	}
}

class Bike extends Twowheeler{
	void brandname () {
		System.out.println("BMW");
	}
}




public class Single {

	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.noofWheels();
		obj.brandname();

	}

}
