package chapter6.section13.exam3.package2;

import chapter6.section13.exam3.package1.A;

public class C {

    public void method() {
        A a = new A();

        a.field1 = 1;
        // a.field2 = 1; // default 접근제한자의 필드는 접근 불가
        // a.field3 = 1; // private 접근제한자의 필드는 접근 불가

        a.method1();
        // a.method2(); // default 접근제한자의 메소드는 접근 불가
        // a.method3(); // private 접근제한자의 메소드는 접근 불가
    }
}
