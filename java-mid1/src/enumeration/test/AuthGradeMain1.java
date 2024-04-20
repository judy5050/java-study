package enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            printGrade(value);
        }
    }

    private static void printGrade(AuthGrade authGrade) {
        System.out.println("grade = " + authGrade.name() + " level = " + authGrade.getLevel() + " 설명 = " + authGrade.getDescription());
    }
}
