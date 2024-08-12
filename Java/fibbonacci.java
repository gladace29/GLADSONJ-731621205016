import java.util.*;
class fibbonacci{
    public static void main(String []args){
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size:");
        int size = sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=2;i<size;i++){
            int nxt=a+b;
            a=b;
            b= nxt;
            System.out.print(nxt + " ");
        }

    }
}