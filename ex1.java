public class ex1 {

    public static int fat(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fat(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("fat rec");

        System.out.println(fat(5));
    }
}