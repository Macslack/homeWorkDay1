import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator testCalculator;

    @Before
    public void before() {
        testCalculator = new Calculator(10 , 5);
    }
    @Test
    public void canAdd() {
        assertEquals(15 ,testCalculator.add());
    }
    @Test
    public void canSubtract() {
        assertEquals(5, testCalculator.subtract());
    }
    @Test
    public void canMultiply() {
        assertEquals(50, testCalculator.multiply());
    }
    @Test
    public void canDivide() {
        assertEquals(2, testCalculator.divide());
    }
}
