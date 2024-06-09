package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {

    public static void main(String[] args) {
        String test = "orange banana apple apple banana apple";
        String[] words = test.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word,  map.getOrDefault(word, 0) + 1);
        }


        System.out.println(map);
    }
}
