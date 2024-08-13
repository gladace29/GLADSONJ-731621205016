package glad1;

public class Person {
  String name;
  int age;
  
  
  Person(String name,int age){
	  this.age=age;
	  this.name=name;
  }
  
  void display() {
	  System.out.println("Name:"+name);
	  System.out.println("Age:"+age);
  }
  
  
	public static void main(String[] args) {
		Person obj = new Person("Ace",22);
		obj.display();

	}

}

