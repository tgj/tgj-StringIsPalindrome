
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromeTest {
    public static Palindrome p;
    @BeforeClass
    public static void setUp(){
        p = new Palindrome();
    }

    /**
     * "abcba" is a palindrome, so return true.
     */
    @Test
    public void palindromeTest1(){
        String input = "abcba";
        boolean expected = true;
        Assert.assertEquals(expected, p.pal(input) );
    }

    /**
     * "abcde" is not a palindrome, so return false.
     */
    @Test
    public void palindromeTest2(){
        String input = "abcde";
        boolean expected = false;
        Assert.assertEquals(expected, p.pal(input));
    }

    /**
     * "123454321" is a palindrome, so return true.
     */
    @Test
    public void palindromeTest3(){
        String input = "123454321";
        boolean expected = true;
        Assert.assertEquals( expected, p.pal(input));
    }

    /**
     * "saippuakivikauppias" is a palindrome, so return true.
     */
    @Test
    public void palindromeTest4(){
        String input = "saippuakivikauppias";
        boolean expected = true;
        Assert.assertEquals( expected, p.pal(input));
    }

    /**
     * "saippuakivikauppiasL" isn't a palindrome, so return false.
     */
    @Test
    public void palindromeTest5(){
        String input = "saippuakivikauppiasL";
        boolean expected = false;
        Assert.assertEquals( expected, p.pal(input));
    }

    /**
     * "a" is a palindrome, so return true.
     */
    @Test
    public void palindromeTest6(){
        String input = "a";
        boolean expected = true;
        Assert.assertEquals( expected, p.pal(input));
    }

    /**
     * "" or an empty string is a palindrome, so return true.
     */
    @Test
    public void palindromeTest7(){
        String input = "";
        boolean expected = true;
        Assert.assertEquals( expected, p.pal(input));
    }
}
