import java.util.*;
import java.lang.*;

class Armstrong{
public static void main(String []ha){

Scanner sc=new Scanner(System.in);

int input=sc.nextInt();
int count=0;
int comp=input;

//digit count

while(input>0){

input=input/10;
count++;

}

//logic

int last,sum=0;
int temp=input;

while(temp>0){
  last = temp %10;
  sum+=Math.pow(last,count);
  temp = temp/10;
}

if(comp == sum){
 System.out.println("armstrong number");
}
else{
 System.out.println("Not an armstrong");
}

}
}