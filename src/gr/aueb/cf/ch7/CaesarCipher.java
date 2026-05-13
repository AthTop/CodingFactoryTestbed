package gr.aueb.cf.ch7;

/**
 * Contains methods to encrypt and decrypt strings
 * using the Caesar cipher
 */
public class CaesarCipher {
    public static final int LETTERS_IN_ALPHABET = 26;
    public static void main(String[] args) {
        System.out.println(encrypt("~PIz Za!!", 3)); // ~SLc Cd!!
        System.out.println(decrypt("~SL cCd!", 3)); // ~PI zZa!
    }

    /**
     * encrypts a string by incrementing each char
     * @param str initial string
     * @param key int to increment chars by
     * @return encrypted string
     * @throws NullPointerException if string is null
     */
    public static String encrypt(String str, int key) {
        if (str == null) throw new NullPointerException("String is null");
        StringBuilder sb = new StringBuilder(str.length());
        key = key % 26; // handle edge case where user inputs higher than 26 offset
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) sb.append(c);
            else {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                sb.append((char) ((c - base + key) % LETTERS_IN_ALPHABET + base));
            }
        }

        return sb.toString();
    }

    /**
     * decrypts a string by calling encrypt and wrapping around, minus the offset
     * @param str initial string
     * @param key int to decrement chars by
     * @return decrypted string
     */
    public static String decrypt(String str, int key) {
        return encrypt(str, LETTERS_IN_ALPHABET - (key % LETTERS_IN_ALPHABET));
    }
}
