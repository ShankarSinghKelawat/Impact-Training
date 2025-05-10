import java.util.*;
public class OddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int i = sc.nextInt();
        if(i==0){
            System.out.println("The Given No. is Zero.");
        }else if(i%2==0){
            if(i>2 && i<5){
                System.out.println("Not Wierd");
            }else if(i>6 && i<20){
                System.out.println("Wierd");
            }else if(i>20){
                System.out.println("Not Wierd");
            }
            
        }else{
            System.out.println("Wierd");
        }
    }
}