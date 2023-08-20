import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for(int row = 1; row<=n/2; row++){
            for(int col = row;col<=n/2; col++){
                System.out.print("*");
            }

            for(int col=1;col<=row;col++){
                System.out.print(" ");
            }

            

              
            System.out.println();
            
        }


       
    }
    
}
