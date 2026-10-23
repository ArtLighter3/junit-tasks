import java.util.HashSet;
import java.util.Set;

public class StringUtils {

    public static boolean isPalindrome(String input) {
        if (input == null) return false;

        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    public static int countVowels(String input) {
        if (input == null) return 0;

        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int vowelsCount = 0;
        for (char c : input.toCharArray()) {
            if (vowels.contains(Character.toLowerCase(c)))
                vowelsCount++;
        }

        return vowelsCount;
    }

}
