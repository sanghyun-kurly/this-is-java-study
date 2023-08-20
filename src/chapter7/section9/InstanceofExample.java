package chapter7.section9;

public class InstanceofExample {
    public static void personInfo(Person person) {
        System.out.println("name : " + person.name);
        person.walk();

        if (person instanceof Student) {
            Student student = (Student) person;

            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }

        // Java 12 부터는 조건이 true 일 경우 student 변수에 할당받아 사용 가능하다.
        if (person instanceof Student student) {
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
