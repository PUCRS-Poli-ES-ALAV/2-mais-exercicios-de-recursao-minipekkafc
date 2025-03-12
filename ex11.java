import java.util.ArrayList;

public class ex11 {

    public static ArrayList<String> permutations(String s) {
        ArrayList<String> permutations = permutationsAux(s, s.length(), 0, 0);
        return permutations;
    }

    public static ArrayList<String> permutationsAux(String s, int length, int a, int b) {
        if (length == 1) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(s);
            return list;
        } else {
            ArrayList<String> list = new ArrayList<String>();
            if (b == length-1) {
                return permutationsAux(s, length, a + 1, 0);
            }
            if (a == length-1) {
                return list;
            }
            else {
                String str = s.substring(a,b)
                list.add(str);
                return permutationsAux(s, length, a, b + 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("permutations str rec");

        String str = "abc";
        System.out.println(permutations(str));
    }
}