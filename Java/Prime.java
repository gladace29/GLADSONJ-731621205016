import java.util.*;

class Prime{
 public static void main(String []ag){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number:");
int num = sc.nextInt();
int count=1;

for(int i=2;i<=num;i++)
{
  if(num%i == 0)
	count++;
}

if(count == 2){
	System.out.println("Is Prime");
}
else{
	System.out.println("Not a Prime");
}
}
}