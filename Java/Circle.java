package glad1;
import java.util.*;

class Shape{
	  int radius;
	  int area;
	  int circum;	
	  Shape(int rad){

		  this.radius = rad;
	  }
	  
	  public int getRad() {

		  return radius;
	  }
	  
	  public void setRad(int newrad) {

		  this.radius = newrad;
	  }
	  void display() {
		  area= (int)Math.PI * radius * radius;
		  circum =(int) ((int) 2 * Math.PI * radius);
		  System.out.println("The area is:"+area);
		  System.out.println("The circumference is:"+circum);
	  }
	  
	}


	 class Circle {
		public static void main(String []args) {

			Shape sha=new Shape(13);
			sha.display();
			
			sha.setRad(25);
			sha.display();
			
		}
	}