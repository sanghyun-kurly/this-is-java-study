package chapter6.section11.exam1;

public class Korean {
    final String nation = "대한민국";
    final String ssn; // 선언 시 혹은 생성자에서 초기회 되지 않으면 컴파일 에러가 발생한다.

    String name;

    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
