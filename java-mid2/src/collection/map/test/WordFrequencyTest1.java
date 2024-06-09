package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String test = "orange banana apple apple banana apple";
        String[] words = test.split(" ");

        Map<String, Integer> map = new HashMap<>();
//        for (String l : words) {
//           if(map.containsKey(l)) {
//               map.put(l, map.get(l)+1);
//           }else {
//               map.put(l, 1);
//           }
//        }

        // 영한님이 강의에서 알려준 코드
        for (String word : words) {
            Integer count = map.get(word);
            if(count == null) {
                count = 0;
            }
            count ++;
            map.put(word, count);
        }


        System.out.println(map);
    }
}
