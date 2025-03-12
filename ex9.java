public class ex9 {

    public static boolean findSubStr(String str, String match) {
        if (str.length() < match.length()) {
            return false;
        } else {
            if (str.substring(0, match.length()).equals(match)) {
                return true;
            } else {
                return findSubStr(str.substring(1), match);
            }
        }
        
    }

    public static void main(String[] args) {
        System.out.println("find substring rec");
    }
    
}
