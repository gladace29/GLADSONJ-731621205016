import java.util.*;
class Pattern {
    public static void main(String []ar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int row=sc.nextInt();
        for(int i=0;i<row;i++){
            System.out.println();
            for(int j=0;j<=i;j++){
                System.out.print("*" +" ");
            }
        }
    }
}