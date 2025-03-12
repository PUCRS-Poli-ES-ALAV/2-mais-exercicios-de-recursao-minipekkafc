public class ex5 {

    public static boolean isPal(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return isPal(s.substring(1, s.length() - 1));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("palindrome rec");
        System.out.println(isPal("arara"));
        System.out.println(isPal("arar"));
        System.out.println(isPal("socorram me subino onibus em marrocos"));
    }
}