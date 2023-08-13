package chapter6.section15;

public class SingletonExample {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton(); // private 생성자 접근 불가. 컴파일 에러.

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("같은 객체 입니다.");
        } else {
            System.out.println("다른 객체 입니다.");
        }
    }
}
