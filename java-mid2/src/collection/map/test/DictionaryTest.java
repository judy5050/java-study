package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        System.out.println("==단어 입력 단계==");
        Scanner sc = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();

        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String key = sc.nextLine();
            if(key.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String value = sc.nextLine();
            map.put(key, value);
        }

        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q')");
            String findWord = sc.nextLine();
            if(findWord.equals("q")) {
                break;
            }

            if(map.containsKey(findWord)) {
                System.out.println(findWord + "의 뜻: " + map.get(findWord));
            }else {
                System.out.println(findWord + "은(는) 사전에 없는 단어입니다.");
            }

        }


    }
}
