import java.util.*;

public class Statistika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Мәтін енгізіңіз:");
        String text = sc.nextLine();

        String[] words = text.toLowerCase().split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        int totalLength = 0;

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
            totalLength += word.length();
        }

        String mostFrequentWord = "";
        int maxCount = 0;

        for (String word : map.keySet()) {
            if (map.get(word) > maxCount) {
                maxCount = map.get(word);
                mostFrequentWord = word;
            }
        }

        System.out.println("\n📊 Статистика:");
        System.out.println("Жалпы сөз саны: " + words.length);
        System.out.println("Бірегей сөздер саны: " + map.size());
        System.out.println("Ең жиі сөз: " + mostFrequentWord + " (" + maxCount + " рет)");
        System.out.println("Орташа сөз ұзындығы: " + (totalLength / (double) words.length));

        System.out.println("\n📌 Сөздер жиілігі:");
        for (String word : map.keySet()) {
            System.out.println(word + " -> " + map.get(word));
        }
    }
}