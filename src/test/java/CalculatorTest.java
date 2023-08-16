import learn.Jtestings.JUnitExamples.CalculatorModTe;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * @author Yash
 * calculator test class
 */
public class CalculatorTest {

    @Test
    public void testAdditionWithPositiveNumbers() {
        CalculatorModTe calcModTeOb1 = new CalculatorModTe();
        int result = calcModTeOb1.addition(2,3);
        assertEquals(5, result);
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        CalculatorModTe calculatorModTe1 = new CalculatorModTe();
        int result = calculatorModTe1.addition(-5, -3);
        assertEquals(-8, result);
    }

}
