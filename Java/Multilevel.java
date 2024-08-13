package glad1;
//Multilevel
class Vehicle{//class A
	void cc() {
		System.out.println("1000cc");
	}
}



class Twowheeler1 extends Vehicle{//class B
	void noofWheels() {
		System.out.println("Two Wheels");
	}
}

class Bike1 extends Twowheeler1{ //class C
	void brandname () {
		System.out.println("BMW");
	}
}

class Scooty extends Vehicle{ //class C
	void scooter() {
		System.out.println("Pulingo vandi");
	}
}




public class Multilevel{
  
	public static void main(String[] args) {
		Bike1 obj = new Bike1();
		obj.cc();
		obj.noofWheels();
		obj.brandname();
        
		Scooty obj1 = new Scooty();
		obj1.cc();
		obj1.scooter();
	}
}
