package chapter2;

public class CalculatorTest {
    // 2. 메인 메소드 하나에서 프로덕션 코드의 여러 메소드를 동시에 테스트하고 잇다.
    // => 프로덕션 코드가 복잡해지면 이 역시 복잡해진다.
    // => JUnit!! 내가 관심있는 메소드에 대한 테스트만 하자. input/output 확익을 프로그래밍을 통해 자동화하자
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(3, 4));
        System.out.println(cal.subtract(5, 4));
        System.out.println(cal.multiply(2, 6));
        System.out.println(cal.divide(8, 4));
    }
}
