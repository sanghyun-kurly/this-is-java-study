package chapter6.section8.exam1;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("결과 값 1 : " + result1);

        double result2 = myCalc.divide(10, 4);
        System.out.println("결과 값 2 : " + result2);

        myCalc.powerOff();
    }
}
