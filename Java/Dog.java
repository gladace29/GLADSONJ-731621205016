package glad1;

public class Dog {
 String name;
 String breed;
 
 Dog(String name,String breed){
	 this.name=name;
	 this.breed = breed;
 }
 
 String getname() {
	 return name;
 }
 
 public void setname(String Naainame) {
	 this.name=Naainame;
	 
 }
 
 
 String getbreed() {
	 return breed;
 }
 
 
 public void setbreed(String Vagai) {
	 this.breed = Vagai;
 }
	
 
 void display() {
	 System.out.println(name);
	 System.out.println(breed);
 }
	
	
	public static void main(String[] args) {
		Dog obj = new Dog("Jerry","Beagle");
		obj.setname("Buddy");
		obj.setbreed("Bomerian");
        obj.display();
	}

}
