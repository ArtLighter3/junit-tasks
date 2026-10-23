import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void isPalindrome_getsLevel_returnsTrue() {
        String input = "level";
        boolean expected = true;

        boolean actual = StringUtils.isPalindrome(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isPalindrome_getsHello_returnsFalse() {
        String input = "hello";
        boolean expected = false;

        boolean actual = StringUtils.isPalindrome(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isPalindrome_getsEmptyString_returnsTrue() {
        String input = "";
        boolean expected = true;

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

    @Test
    public void isPalindrome_getsRaceCar_returnsTrue() {
        String input = "RaceCar";
        boolean expected = true;

        boolean actual = StringUtils.isPalindrome(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countVowels_getsHello_returns2() {
        String input = "hello";
        int expected = 2;

        int actual = StringUtils.countVowels(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countVowels_getsXyz_returns0() {
        String input = "xyz";
        int expected = 0;

        int actual = StringUtils.countVowels(input);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countVowels_getsEmptyString_returns0() {
        String input = "";
        int expected = 0;

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

    @Test
    public void countVowels_getsAEIOU_returns5() {
        String input = "AEIOU";
        int expected = 5;

        int actual = StringUtils.countVowels(input);

        Assertions.assertEquals(expected, actual);
    }

}
