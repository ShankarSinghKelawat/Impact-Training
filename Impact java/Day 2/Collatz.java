import java.util.*;
public class Collatz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int x = 0;
        while(num!=1){
            if(num%2==0){
                num = num/2;
            }else{
                num = (3*num)+1;
            }
            x++;
            System.out.println(num);
        }
        System.out.println("The No. of iteration are: "+ x);
    }        
}
