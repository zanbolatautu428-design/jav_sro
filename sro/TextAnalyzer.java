import java.util.*;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Мәтін енгізіңіз:");
        String text = sc.nextLine();

        String[] words = text.toLowerCase().split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Сөз саны: " + words.length);
        System.out.println("Жиілік:");

        for (String word : map.keySet()) {
            System.out.println(word + " -> " + map.get(word));
        }
    }
}