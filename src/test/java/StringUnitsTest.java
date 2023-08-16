import learn.Jtestings.JUnitExamples.StringUnitsModTe;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yash
 * String units test class
 */
public class StringUnitsTest {
    @Test
    public void testConcatenate() {
        String result = StringUnitsModTe.concatenate("Hello", "World");
        Assert.assertEquals("HelloWorld", result);
    }

    @Test
    public void testIsPalindrome() {
        Assert.assertTrue(StringUnitsModTe.isPalindrome("radar"));
        Assert.assertFalse(StringUnitsModTe.isPalindrome("hello"));
    }
}
