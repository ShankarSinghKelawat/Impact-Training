import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value to be reverse: ");
        int x = sc.nextInt();
        int fd = x/100;
        int md = ((x/10)%10);
        int ld = x%10;
        int rev = (ld*100)+(md*10)+(fd*1);
        System.out.println(rev);
    }
}
