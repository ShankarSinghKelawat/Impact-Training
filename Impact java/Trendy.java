import java.util.*;
public class Trendy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int md = ((n/10)%10);
        if(md%3==0){
            System.out.println("The number is trendy ");
        }else{
            System.out.print("The number is not Trendy");
        }


    }
}