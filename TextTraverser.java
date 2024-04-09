public class TextTraverser {
    public static void traverseText(String text) {
        /**
         * Traverses through each character in the given text and prints it.
         *
         * @param text The input text to be traversed.
         */
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        String inputText = "Hello, World!";
        traverseText(inputText);
    }
}
