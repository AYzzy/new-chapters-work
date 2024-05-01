package fresh;

public class WordReverser {
    public static StringBuilder revereWords(String words) {
        return getStringBuilder(words);
    }

    public static StringBuilder getStringBuilder(String words) {
        StringBuilder builder = new StringBuilder();
        StringBuilder output = new StringBuilder();
        for (int counter = 0; counter < words.length(); counter++) {
            if (words.charAt(counter) != ' ') {
                output.append(words.charAt(counter));
                if (counter == words.length() - 1) {
                    builder.append(output).append(builder);
                    return builder.deleteCharAt(counter);
                }
            } else {
                builder.append(output).append(builder);
                output = new StringBuilder();
            }

        }
        return builder;
    }
}
