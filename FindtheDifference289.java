public class FindtheDifference289 {
    //time taken is 3ms
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        int total = 0;
        for (int i = 0; i < t.length(); i++) {
            total = total + t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            total = total - s.charAt(i);
        }
        return (char) total;
    }
}
/*
//time taken is 2ms
public class FindtheDifference289 {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        int total = 0;
        for (int i = 0; i < t.length(); i++) {
            total = total + t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            total = total - s.charAt(i);
        }
        return (char) total;
    }
}

 */
