package by.homework.lessens.task8;

public class BoxStatic1 {
    public static String stat1(int k, String text, String substring) {
        String[] words = text.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);

            if ((i + 1) % k == 0 && i < words.length - 1) {
                result.append(substring);
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}