package chapter6.section8.exam4;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double square1 = calculator.areaRectangle(10);
        double square2 = calculator.areaRectangle(10, 20);

        System.out.println("정사각형 넓이 = " + square1);
        System.out.println("직사각형 넓이 = " + square2);
    }
}
