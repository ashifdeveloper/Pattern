import java.util.Scanner;

public class Pattern25 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
int p=1;
        for(int row=1;row<=n;row++){
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
