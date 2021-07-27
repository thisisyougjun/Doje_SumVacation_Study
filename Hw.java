public class Hw {
    public static void main(String args[]) {
        int result = 0;
        for (int i = 1; i <= 20; i++) {
            if (i%2==0) {
                result +=i;
            }
        }
        System.out.println("1부터 20까지 짝수의 합은" + result + "입니다");
    }
}