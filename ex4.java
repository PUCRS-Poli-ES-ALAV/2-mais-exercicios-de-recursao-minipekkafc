public class ex4 {

    public static int sumBtw(int a, int b) {
        if (a == b) {
            return a;
        } else {
            return a + sumBtw(a + 1, b);
        }
    }

    public static void main(String[] args) {
        System.out.println("sum btw rec");

        System.out.println(sumBtw(1, 5));
    }

}