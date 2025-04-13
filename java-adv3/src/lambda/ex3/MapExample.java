package lambda.ex3;

import lambda.ex2.StringFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapExample {

    public static List<String> map(List<String> list, Function<String, String> func) {
        //코드 작성
        List<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(func.apply(s));
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);

        //1. 대문자 변환
        //코드 작성
        Function<String, String> largeWord = s -> s.toUpperCase();
        List<String> word1 = map(words, largeWord);
        System.out.println("대문자 변환 결과: " + word1);

        //2. 앞뒤에 *** 붙이기 (람다로 작성)
        //코드 작성
        Function<String, String> decoWord = s -> "***" +s + "***";
        List<String> word2 = map(words, decoWord);
        System.out.println("특수문자 데코 결과: " + word2);
    }
}
