public class ex6 {

    public static String convBase2(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return convBase2(n / 2) + n % 2;
        }
    }
    public static void main(String[] args) {
        System.out.println("num bi rec");

        System.out.println(convBase2(5));
        System.out.println(convBase2(10));
        System.out.println(convBase2(15));
    }
}
