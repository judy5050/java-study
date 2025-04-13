package lambda.ex3;

import lambda.ex2.MyPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
    
    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int val : list) {
            if(predicate.test(val)) {
                result.add(val);
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트: "+ numbers);
        
        //1 음수(negative) 만 뽑아내기 
        // 코드 작성
        Predicate<Integer> negative = n -> n < 0;;
        List<Integer> filter1 = filter(numbers, negative);
        System.out.println("음수만: " + filter1);


        //2.짝수(even)만 뽑아내기 
        //코드작성
        Predicate<Integer> even = n -> n % 2 == 0;
        List<Integer> filter2 = filter(numbers, even);
        System.out.println("짝수만: " + filter2);
    }
}
