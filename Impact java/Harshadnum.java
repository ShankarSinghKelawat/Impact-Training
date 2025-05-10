import java.util.Scanner;
public class Harshadnum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(n!=0){
            int r = n%10;
            sum+=r;
            n = n/10;
        }
        if(temp%sum==0){
            System.out.println("!Yes its a Harshad Number");
        }
        else{
            System.out.println("No its not a Harshad Number");
        }
        
    }
}