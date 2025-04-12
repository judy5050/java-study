package lambda.lambda1;

public class SamMain {

    public static void main(String[] args) {
        SamInterface samInterface = () -> {
            System.out.println("sam");
        };

        samInterface.run();

        //컴파일 오류
//        NotSameInterface notSameInterface = () -> {
//            System.out.println("not sam");
//        };
//
//        notSameInterface.go();
//        notSameInterface.run();
    }

}
