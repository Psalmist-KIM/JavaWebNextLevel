package chapter2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
   /*
   * 테스트 순서에 따라 영향을 미칠 수 있기 때문에 필드로 구현, @Before 사용하는 경우 모두 테스트 메소드 실행 전 인스턴스를 매번 생성한다.
   * 굳이 @Before 어노테이션을 사용하는 것은, @RunWith, @Rule 같은 어노테이션을 통해 기능을 확장할 때
   * @Before 안이어야만 @RunWith, @Rule에서 초기화된 객에 접근할 수 있다.
   *
   * JUnit4's @Before == JUnit5's @BeforeEach // @After 역시 마찬가지
    */
//    private Calculator cal = new Calculator();
    private Calculator cal;

    @BeforeEach
    public void setup() {
        cal = new Calculator();
        System.out.println("BeforeEach");
    }

    /*
     * assertEquals(), assertTrue(), assertFalse(), assertNull(), assertNotNull(), assertArrayEquals() - 값이 같은가
     */
    @Test
    public void add() {
//         중복
//        Calculator cal = new Calculator();
        // 콘솔로 확인하기
//        System.out.println(cal.add(6, 3));
        // 결과 확인
        assertEquals(2, cal.add(1, 1));
        System.out.println("add");
    }

    @Test
    public void subtract() {
//        중복
//        Calculator cal = new Calculator();
        assertEquals(0, cal.subtract(1, 1));
        System.out.println("subtract");
    }

    @AfterEach
    public void teardown() {
        System.out.println("teardown");
    }
}
