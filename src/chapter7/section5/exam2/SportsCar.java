package chapter7.section5.exam2;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }

    // final 로 선언된 stop 메소드는 오버라이딩 할 수 없음.
    // public void stop() {
    //
    // }
}
