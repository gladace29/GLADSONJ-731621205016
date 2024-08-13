package glad1;
import java.util.*;

public class Rectangle {

	public static void main(String[] args) {
		
	
		int width;
		int height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Width:");
		width = sc.nextInt();
		System.out.println("Enter Height:");
		height = sc.nextInt();
		
		int area = width*height;
		System.out.println("Area :"+area);
		
		int perimeter = 2*(width+height);
		System.out.println("Perimeter:"+perimeter);
		
	}


}
