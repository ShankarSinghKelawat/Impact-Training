public class KajuKatli{
    public static void main(String[] args){
        int n = 7;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int x=1;x<=n;x++){
            for(int y=1;y<(n-x)+1;y++){
                System.out.print("*");
            }
            for(int z=1;z<=x;z++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}