import java.util.ArrayList;

public class ex7 {
    
    public static int sumArray(ArrayList<Integer> arr, int length) {
        if (length == 0) {
            return 0;
        } else {
            return arr.get(length-1) + sumArray(arr, length - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("sum array rec");

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());
        System.out.println(sumArray(list, list.size()));
    }

    /* 
    // Método sobrecarregado com valor padrão para length
    public static int sumArray(ArrayList<Integer> arr) {
        return sumArray(arr, arr.size());
    } 
        */
}
