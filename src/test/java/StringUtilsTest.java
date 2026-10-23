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

}
