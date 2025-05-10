import java.util.*;
public class DuotoSolo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            int r  = n%10;
            sum = sum+r;
            n = n/10;
            if(sum>=10 && n==0){
                n = sum;
                sum = 0;
            }
        }
        System.out.println("The Sum is single digit: "+ sum);
    }
}