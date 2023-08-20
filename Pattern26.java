import java.util.Scanner;

public class Pattern26 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            int p=1;

            for(int col=row;col<n;col++){
                System.out.print(" ");

            }
            for(int col=1;col<=row;col++){
                System.out.print(p++);
            }

            for(int col=1;col<row;col++){
                System.out.print(p++);
            }
            System.out.println();
        }
        
    }
}
