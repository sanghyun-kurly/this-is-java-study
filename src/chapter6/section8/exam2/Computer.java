package chapter6.section8.exam2;

public class Computer {
    int sum(int ... values) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }
}
