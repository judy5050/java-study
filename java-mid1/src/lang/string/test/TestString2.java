package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        int sum = 0;
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        for (String s : arr) {
            int length = s.length();
            System.out.println(s + ":" + length);
            sum += length;
        }

        System.out.println("sum = " + sum);

    }
}
