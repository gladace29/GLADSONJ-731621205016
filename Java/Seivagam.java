package glad1;

class Shape1{
	void getArea(int length,int breadth) {
		System.out.println(length*breadth);
	}
}

class Rect extends Shape1{
	void getArea(int length,int breadth) {
		System.out.println(length*breadth);
	}
}




public class Seivagam {

	public static void main(String[] args) {
		Rect porul = new Rect();
		porul.getArea(25,50);

	}

}
