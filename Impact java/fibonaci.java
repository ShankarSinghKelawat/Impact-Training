import java.util.*;
public class fibonaci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int am = sc.nextInt();
        int month=1;
        int f = 0;
        int s = 1;
        int res = f+s;
        while(month<am){
            f = s;
            s = res;
            res = f + s;
            month++;
        }
        System.out.println(f);
        
    }
}