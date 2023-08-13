package chapter6.section4;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다. 참조주소 : " + System.identityHashCode(s1));

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다. 참조주소 : " + System.identityHashCode(s2));
    }
}
