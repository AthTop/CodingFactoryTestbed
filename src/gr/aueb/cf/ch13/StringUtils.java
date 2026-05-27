package gr.aueb.cf.ch13;

/**
 * Utility class containing methods for Strings
 */
public class StringUtils {

    private StringUtils() {}

    /**
     * reverses a string.
     * @param str input string.
     * @return reverse string.
     */
    public static String reverse(String str) {
        if (str == null) return "";
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * returns a string in uppercase.
     * @param str input string.
     * @return string in uppercase.
     */
    public static String toUpper(String str) {
        if (str == null) return "";
        return str.toUpperCase();
    }

    /**
     * checks if a string is a palindrome ignoring case.
     * @param str input string.
     * @return true if string is a palindrome, otherwise false.
     */
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        return reverse(str).equalsIgnoreCase(str);
    }
}
