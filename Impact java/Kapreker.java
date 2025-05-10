import java.util.Scanner;
public class Kapreker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int n = sc.nextInt();
        int sq = n*n;
        int temp = n; 
        int digit = 0;
        while(n!=0){
            n = n/10;
            digit+=1;
        }
        int seprator = (int)Math.pow(10,digit);
        int right = sq%seprator;
        int left = sq/seprator;
        if((left+right)==temp){
            System.out.println("Yes The No. is Kapreker");
        }
        else{
            System.out.println("No The No. is Not Kapreker");
        }
    }
}