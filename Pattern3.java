import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = row;col<n; col++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
