package glad1;

class Animalu{
	void move() {
		System.out.println("Push Swetha Push");
	}
}

class Cheetah extends Animalu{
    @Override
    void move() {
    	System.out.println("Ah iva akka");
    }
}





public class Vilangu {

	public static void main(String[] args) {
		Cheetah chi = new Cheetah();
		chi.move();

	}

}
