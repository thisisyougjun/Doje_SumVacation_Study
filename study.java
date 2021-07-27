import java.util.Scanner;

public class study {
    public static void main(String args[]) {
        
        Scanner in =new Scanner(System.in);

        System.out.println("HI");
        int a=in.nextInt();

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.println("*");
            }
        }
    }
}
