package hw4;
import java.util.*;

public class WordCountTest {
    public static void main(String[] args) {
        String text = "Это тестовый текст. Текст содержит слова, которые будут повторяться для этого теста." +
                "Текст не уникальный. Уникальный только я. А я пишу текст, в котором есть слова и буквы." +
                "Буквы создают слово, а слова создают текст.";
        Map<String, Integer> wordCount = new HashMap<>();

        // Split the text into words
        String[] words = text.split("\\s+");

        // Count each word
        for (String word : words) {
            word = word.toLowerCase();
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }

        // Print the word count
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
