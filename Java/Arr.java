import  java.util.*;
class Arr{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int arr[] = new int [size];


for(int i =0;i<size;i++){
arr[i] = sc.nextInt();
}
int sum = 0;
for(int j = 0;j<size;j++){
sum += arr[j];
}
System.out.println(sum);
}
}