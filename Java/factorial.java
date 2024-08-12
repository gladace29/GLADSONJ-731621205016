import java.util.*;
class factorial{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Factorial:");
        num = sc.nextInt();
        int res = 1;
        for (int i =2;i<=num;i++){
            res *= i;
        }
        System.out.println("The factorial of "+num+" is "+res);
    }
}