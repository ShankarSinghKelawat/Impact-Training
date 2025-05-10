import java.util.Scanner;
public class Cindrella {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array1: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.print("Enter size of array2: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i =0;i<n;i++){
            System.out.print("Enter value for array1:");
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++){
            System.out.println("Enter value for array2:");
            arr2[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
        System.out.println(arr1[i]);
        }

        
        
            
        


    }
    
}
