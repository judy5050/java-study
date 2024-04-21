package time.test;

import java.time.LocalDateTime;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2024, 01, 01, 0, 0);
        date = date.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);

        System.out.println("1년 2개월 3일 4시간 후의 시각: "+ date);

    }
}
