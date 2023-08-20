package chapter7.section6.package2;

import chapter7.section6.package1.A;

public class D extends A {

    public D() {
        super();
    }

    public void method1() {
        // protected 접근제한자는 자식 클래스인 경우에는 다른 패키지에 위치해도 필드, 메소드에 접근할 수 있다.
        this.field = "value";
        this.method();
    }


    public void method2() {
        // 단, 직접 생성자를 호출해서 객체 생성하는 것은 안됨.
        // A a  = new A();
        // a.field = "value";
        // a.method();
    }
}
