public class StringSymbolsCount {

    public static int countLetters(String input) {
        if (input == null) {
            return 0;
        }

        int count = 0;

        for (char c: input.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }
}
