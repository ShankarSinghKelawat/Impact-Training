import java.util.*;
public class Treasurefind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a<c){
            System.out.println("Treasure is in Box A");
        }else if(a<b && b<c){
            System.out.println("Treasure is in Box B");
        }else{
            System.out.println("Treasure is in Box C");
        }
    }
}