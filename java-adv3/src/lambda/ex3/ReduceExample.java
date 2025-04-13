package lambda.ex3;

import lambda.ex2.MyReducer;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceExample {

    public static int reduce(List<Integer> list, int initial,  BinaryOperator<Integer> reducer) {
        int result = initial;
        for (int i : list) {
            result = reducer.apply(result, i);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);

        //1. 합 구하기 (초기값 0, 덧셈로직)
        //코드 작성
        int sum = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("합(누적 +): " + sum);
        //2. 곱 구하기(초기값1, 곰셈로직)
        //코드 작성
        int product = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("곱(누적 *): " + product);
    }
}
