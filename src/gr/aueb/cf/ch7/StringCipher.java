package gr.aueb.cf.ch7;

/**
 * Encrypts strings using the +1 method
 * Decrypts them similarly
 */
public class StringCipher {

    /**
     * test cases for the class methods
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(encrypt("ABC")); // "BCD"
        System.out.println(decrypt("BCD")); // "ABC"
        System.out.println(encrypt("ZYX!")); // "AZY!"
        System.out.println(decrypt("AXZ!")); // "ZWY!"
    }

    /**
     * encrypts a string by incrementing each char
     * @param str initial string
     * @return encrypted string
     * @throws NullPointerException if string is null
     */
    public static String encrypt(String str) {
        if (str == null) throw new NullPointerException("String is null");
        StringBuilder sb = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) sb.append(c);
            else if (c == 'Z') sb.append('A');
            else if (c == 'z') sb.append('a');
            else sb.append((char) (c + 1));
        }

        return sb.toString();
    }

    /**
     * decrypts a string by decrementing each char
     * @param str initial string
     * @return decrypted string
     * @throws NullPointerException if string is null
     */
    public static String decrypt(String str) {
        if (str == null) throw new NullPointerException("String is null");
        StringBuilder sb = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) sb.append(c);
            else if (c == 'A') sb.append('Z');
            else if (c == 'a') sb.append('z');
            else sb.append((char) (c - 1));
        }

        return sb.toString();
    }
}
