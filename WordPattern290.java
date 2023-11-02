import java.util.HashMap;

public class WordPattern290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
        System.out.println("s = " + s);
        System.out.println("pattern = " + pattern);
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> patternToWord = new HashMap<>();
        HashMap<String, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (patternToWord.containsKey(ch)) {
                if (!patternToWord.get(ch).equals(word)) {
                    return false;
                }
            } else {
                patternToWord.put(ch, word);
            }

            if (wordToPattern.containsKey(word)) {
                if (wordToPattern.get(word) != ch) {
                    return false;
                }
            } else {
                wordToPattern.put(word, ch);
            }
        }

        return true;
    }
}
