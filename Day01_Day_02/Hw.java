package Day01_Day_02;
public class Hw {
    public static void main(String args[]) {
        int result = 0;
        for (int i = 1; i <= 20; i++) {
            if (i%2==0) {
                result +=i;
            }
        }
        System.out.println("1�??�� 20까�?? 짝수?�� ?��???" + result + "?��?��?��");
    }
}