package lambda.ex1;

import lambda.Procedure;

import java.util.Arrays;

public class M4MeasureTime {

    //공통: 실행 시간 측정 메서드
    public static void measure(Procedure procedure) {
        long startNs = System.nanoTime();

        procedure.run(); // 바뀌는 로직 실행 (익명 클래스 or 람다로 전달)

        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {
        measure(() -> {
            int sum = 0;
            int n = 100;
            for (int i = 1; i <= n; i++) {
                sum+=i;
            }

            System.out.println("[1 부터 " + n + "까지 합] 결과: " + sum);
        });

        // 람다로 배열 정렬
        measure(() -> {
            int[] arr = {4, 3, 2, 1};
            System.out.println("원본 배열: " + Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println("배열 정렬: " + Arrays.toString(arr));
        });
    }
}
