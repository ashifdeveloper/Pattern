import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of n");
         int n = sc.nextInt();

        for(int row = 1;row<(n/2)+1;row++){
            for(int col=row;col<(n/2)+1;col++){
                System.out.print(" ");
            }

            for(int col=1;col<row;col++){
                System.out.print("*");
            }

            for(int col=1;col<=row;col++){
                System.out.print("*");
            }

         
        System.out.println();

        }

        for(int row=1;row<=(n/2)+1;row++){
            for(int col=1;col<row;col++){
                System.out.print(" ");
            }
            for(int col=row;col<(n/2)+1;col++){
                System.out.print("*");
            }
            for(int col=row;col<=(n/2)+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }

       
    }
    
}
