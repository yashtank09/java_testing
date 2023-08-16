package learn.Jtestings.JUnitExamples;

/**
 * @author Yash
 * String units for string manipulations!
 */
public class StringUnitsModTe {
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
