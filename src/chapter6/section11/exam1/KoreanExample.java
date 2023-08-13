package chapter6.section11.exam1;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567", "김자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // final 필드는 값 변경 불가능
        // k1.nation = "USA";
        // k1.ssn = "123-12-1234";

        k1.name = "박자바";
    }
}
