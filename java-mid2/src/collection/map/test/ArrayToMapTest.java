package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String [][] productArr = {{"java", "10000"}, {"spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> map = new HashMap<>();
        for (String[] product : productArr) {
            map.put(product[0], Integer.valueOf(product[1]));
        }

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println("제품: " + m.getKey() +  ", 가격: "+ m.getValue());
        }
    }
}
