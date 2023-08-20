package chapter7.section7.exam3;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        // Parent 타입으로 필드와 메소드 사용
        parent.field1 = "data-1";
        parent.method1();
        parent.method2();

        // parent.field2 = "data-2"; // 불가능
        // parent.method3(); // 불가능

        // 강제 타입 변환
        Child child = (Child) parent;

        // Child 타입으로 필드와 메소드 사용
        child.field2 = "data-2";
        child.method3();
    }
}
