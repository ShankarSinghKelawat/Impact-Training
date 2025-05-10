import java.util.Scanner;
public class MinDiv{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value for Num: ");
        int num = sc.nextInt();
        System.out.print("Enter Value for m: ");
        int m = sc.nextInt();
        int q;
        int lb;
        int ub;
        if(num%m==0){
            System.out.println("The min distance is zero.");
        }else{
            q = num/m;
            lb = q*m;
            ub = (q+1)*m;
            int d1 = lb - num;
            int d2 = ub - num;
            if(d1==d2){
                System.out.println(d2);
            }else if(d1<d2){
                System.out.println(d1);
            }else{
                System.out.println(d2);
            }
            
        }
        
    }
}