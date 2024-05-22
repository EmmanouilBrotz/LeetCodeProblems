public class reversePrefixOfWord {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println("Word: " + word);
        System.out.println("Character to reverse prefix: " + ch);
        System.out.println("Reversed word: " + reversePrefix(word, ch));
    }
    protected static String reversePrefix(String word, char ch) {
        int firstIndex = word.indexOf(ch); // finding where the first character is found
        if (firstIndex == -1) {
            // If the character ch is not found in the string, return the original word
            return word;
        }
        String subString = word.substring(0, firstIndex + 1); // Include the character ch
        String reversed = new StringBuilder(subString).reverse().toString(); // Use StringBuilder to reverse
        String remainder = word.substring(firstIndex + 1); // The rest of the word after ch
        return reversed + remainder; // Concatenate reversed part with the remainder
    }

}
