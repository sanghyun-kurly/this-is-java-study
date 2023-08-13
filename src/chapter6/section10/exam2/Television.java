package chapter6.section10.exam2;

public class Television {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model; // static 블록 안에서는 this 를 사용할 수 없다. (this 는 인스턴스 객체를 가리키는 것)
    }
}
