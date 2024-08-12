import java.util.*;
class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
         StringBuffer sb = new StringBuffer(n);
         sb.reverse();
         String s2 = sb.toString();
         
         if (s2 .equals(n)){
             System.out.println("Palindrome");
         }
         else{
             System.out.println("Not a Palindrome");
         }
    }
}