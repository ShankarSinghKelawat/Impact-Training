import java.util.Scanner;
public class InsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter place where you want to position the card");
        int p = sc.nextInt();
        System.out.print("Enter the element you want to insert: ");
        int e = sc.nextInt();
        
    }
    
}
