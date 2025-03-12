public class ex10 {

    public static int nroDigit(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + nroDigit(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("num dig int rec");

        System.out.println(nroDigit(5));
        System.out.println(nroDigit(10));
        System.out.println(nroDigit(100));
        System.out.println(nroDigit(1000));
    }
}
