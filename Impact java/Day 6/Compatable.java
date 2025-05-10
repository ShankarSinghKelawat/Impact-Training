import java.util.Scanner;
public class Compatable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int count = 0;
        System.out.println("Enter Values for array1:");
        for(int i =0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Values for array2:");
        for(int j =0;j<n;j++){
            arr2[j] = sc.nextInt();
        }
        for(int k=0;k<n;k++){
            if(arr1[k]==arr2[k]){
                count++;
            }
        }
        if(count==n){
            System.out.println("Compatable Array");
        }
        else{
            System.out.println("Not Comapatable");
        }

    }

    
}
