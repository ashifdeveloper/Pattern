import java.util.Scanner;

public class Pattern30 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            int p=n;
            for(int col=1;col<=n;col++){
                System.out.print(p--);
            }
            System.out.println();
        }
    }
}
