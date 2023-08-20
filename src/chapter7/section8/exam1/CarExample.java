package chapter7.section8.exam1;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.tire = new Tire();
        car.run();

        car.tire = new HanKookTire();
        car.run();

        car.tire = new KumhoTire();
        car.run();
    }
}
