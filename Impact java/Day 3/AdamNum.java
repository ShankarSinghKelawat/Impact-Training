import java.util.Scanner;
public class AdamNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqn = n*n;
        int rev = 0;
        int temp = n;
        while(temp!=0){
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        int sqrev = rev*rev;
        int revofsqrev = 0;
        temp = sqrev;
        while(temp!=0){
            revofsqrev = revofsqrev * 10 + temp % 10;
            temp = temp / 10;
        }
        if(sqn == revofsqrev){
            System.out.println("The Num is Adam Number");
        }
        else{
            System.out.println("The Num is Not Adam Number");
        }

    }
}