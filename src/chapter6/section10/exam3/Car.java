package chapter6.section10.exam3;

public class Car {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    static void simulate() {
        Car myCar = new Car();
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate();
        // run(); // run() 은 정적메소드가 아니므로 객체 생성 전에는 호출할 수 없다.

        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
