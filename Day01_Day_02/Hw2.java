package Day01_Day_02;
import java.util.Scanner;

public class Hw2 {

    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("?ˆ«?ë¥? ?…? ¥?•˜?„¸?š”");
        int a =in.nextInt();

        for (int i = 1; i <= a; i++) {
            if (i%3==0) {
               System.out.println("X");
           }
           else{
               System.out.println(i);
           }
    
        }
    }
}
