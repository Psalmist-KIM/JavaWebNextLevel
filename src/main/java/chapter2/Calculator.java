package chapter2;

public class Calculator {
    int add(int i, int j) {
        return i + j;
    }
    int subtract(int i, int j) {
        return i - j;
    }
    int multiply(int i, int j) {
        return i * j;
    }
    int divide(int i, int j) {
        return i / j;
    }
    // 1. 프로덕션 코드와 테스트 코드가 같은 클래스에 위치하고 잇다. // 배포할 필요 없음
    //  => 테스트 코드 클래스를 분리하면? CalculatorTest.java

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(3, 4));
        System.out.println(cal.subtract(5, 4));
        System.out.println(cal.multiply(2, 6));
        System.out.println(cal.divide(8, 4));
    }

}
