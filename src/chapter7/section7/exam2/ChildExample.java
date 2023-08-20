package chapter7.section7.exam2;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        // 자동 타입 변환
        Parent parent = child;

        parent.method1();
        parent.method2(); // 오버라이드된 자식 메소드 호출
        // parent.method3(); // 호출 불가능
    }
}
