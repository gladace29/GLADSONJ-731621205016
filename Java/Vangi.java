package glad1;

class Bankaccount{
	int amount=0,amo;
	void deposit(int a) {
		amo+=a;
		System.out.println("New Deposit");
	}
	
	
	void withdraw(int b){
		System.out.println("First Salary");
	}
	

}


 class SavingsAccount extends Bankaccount{
	@Override
	void withdraw(int b) {
		if(amo<=100) {
			System.out.println("Your Account has Insufficient Balance");
	}
	 
 }
 }

public class Vangi {
public static void main(String[] args) {
	SavingsAccount obj=new SavingsAccount();
	obj.deposit(50);
	obj.withdraw(2000);
}
}

