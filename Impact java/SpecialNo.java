import java.util.*;
public class SpecialNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Range from 10 To : ");
        int n = sc.nextInt();
        int i = 10;
        while(i<=n){
            int d1 = i/10;
            int d2 = i%10;
            int sum = d1+d2;
            System.out.println("The Sum of digits is: "+ sum);
            int product = d1*d2;
            System.out.println("The Product of digits is: "+ product);
            int special = sum + product;
            if(special == n){
            System.out.println(i + " The Number is Special Number: ");
            }else{
                System.out.println("The number is not a special number");
            }
            i++;
        
        }
        
    }
}