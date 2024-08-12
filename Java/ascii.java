import java.util.*;
class ascii{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any ASCII character :");
        char ch = sc.next().charAt(0);
        int value = (int) ch;
        System.out.println("The ASCII value of "+ch+" is "+value);
    }
}