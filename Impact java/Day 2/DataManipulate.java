import java.util.Scanner;
public class DataManipulate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            int r = n%10;
            System.out.println(r);
            n = n/10;
            if(r==9){
                count++;
            }
        }
        System.out.println("Count of 9 in num is: " + count);
    }
}