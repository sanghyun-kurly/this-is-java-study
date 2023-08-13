package chapter5.section11;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("프로그램 입력값이 부족합니다.");
            System.exit(0);
        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.valueOf(strNum1);  // Integer 반환
        int num2 = Integer.parseInt(strNum2); // int 반환
        int result = num1 + num2;

        System.out.println(num1 + " + " + num2 + " : " + result);
    }
}
