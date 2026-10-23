import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "level, true",
            "hello, false",
            "'', true",
            "RaceCar, true"
    })
    public void isPalindrome_getsString_returnsCorrectBoolean(String input, boolean expected) {
        boolean actual = StringUtils.isPalindrome(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isPalindrome_getsNull_returnsFalse() {
        String input = null;
        boolean expected = false;

        boolean actual = StringUtils.isPalindrome(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "hello, 2",
            "xyz, 0",
            "'', 0",
            "AEIOU, 5"
    })
    public void countVowels_getsString_returnsCorrectQuantityOfVowels(String input, int expected) {
        int actual = StringUtils.countVowels(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countVowels_getsNull_returns0() {
        String input = null;
        int expected = 0;

        int actual = StringUtils.countVowels(input);

        Assertions.assertEquals(expected, actual);
    }

}
