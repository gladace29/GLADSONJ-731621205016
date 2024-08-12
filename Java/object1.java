import java.util.*;

class object1{
    int x = 7;
    static void method(int y){
        System.out.println("y = "+y);
    }
    public static void main(String[] args) {
        object1 obb = new object1();
        object1.method(10);
        System.out.println("x = "+obb.x);
    }
}