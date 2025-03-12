import java.util.ArrayList;

public class ex8 {

    public static int findBiggest(ArrayList<Integer> ar) {
        return findBiggestAux(ar, ar.size(), null);
    }

    public static int findBiggestAux(ArrayList<Integer> arr, int length, Integer max) {
        if (length == 0) {
            if (max == null) {
                return 0;
            } else {
                return max;
            }
        } else {
            if (max == null || arr.get(length-1) > max) {
                max = arr.get(length-1);
            }
            return findBiggestAux(arr, length - 1, max);
        }

    }
    public static void main(String[] args) {
        System.out.println("biggest num arr rec");

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(-12);
        list.add(4);
        list.add(-25);
        System.out.println(list.size());
        System.out.println(findBiggest(list));
    }
}
