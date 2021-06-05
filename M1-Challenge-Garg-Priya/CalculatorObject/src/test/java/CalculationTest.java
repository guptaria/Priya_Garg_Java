import org.junit.Test;

import static org.junit.Assert.*;


public class CalculationTest {

    private Calculation calc = new Calculation();

    @Test
    public void shouldReturnSumOfTwoIntegersWhenGivenTwoIntegers() {
        String failMessage = "Expected calculator to handle integer addition.";
//        assertEquals(message,expected value,actual value)
        assertEquals(failMessage, 2, calc.addition(1, 1));
    }


    @Test
    public void shouldReturnSumOfTwoDoublesWhenGivenTwoDoubles() {
        String failMessage = "Expected calculator to handle double addition.";
//        assertEquals(message,expected value,actual value)
        assertEquals(failMessage, 5.7, calc.addition(3.4, 2.3),.0001);
    }

    @Test
    public void shouldReturnDifferenceOfTwoIntegersWhenGivenTwoIntegers() {
        String failMessage = "Expected calculator to handle integer addition.";
//        assertEquals(message,expected value,actual value)
        assertEquals(failMessage, -29, calc.subtraction(23, 52));
    }


    @Test
    public void shouldReturnDifferenceOfTwoDoublesWhenGivenTwoDoubles() {
        String failMessage = "Expected calculator to handle double addition.";
//        assertEquals(message,expected value,actual value)
        assertEquals(failMessage, 5.0, calc.subtraction(5.5, 0.5),.0001);
    }

    @Test
    public void shouldReturnMultiplicationOfTwoIntegersWhenGivenTwoIntegers() {
        String failMessage = "Expected calculator to handle integer addition.";
//        assertEquals(message,expected value,actual value)
        assertEquals(failMessage, 68, calc.multiplication(34, 2));
    }


    @Test
    public void shouldReturnMultiplicationOfTwoDoublesWhenGivenTwoDoubles() {
        String failMessage = "Expected calculator to handle double addition.";
//        assertEquals(message,expected value,actual value)
        assertEquals(failMessage, 29.48, calc.multiplication(6.7, 4.4),.0001);
    }

    @Test
    public void shouldReturnDivisionOfTwoIntegersWhenGivenTwoIntegers() {
        String failMessage = "Expected calculator to handle integer addition.";
//        assertEquals(message,expected value,actual value)
        assertEquals(failMessage, 4, calc.division(12, 3));
        assertEquals(failMessage, 1, calc.division(12, 7));
    }


    @Test
    public void shouldReturnDivisionOfTwoDoublesWhenGivenTwoDoubles() {
        String failMessage = "Expected calculator to handle double addition.";
//        assertEquals(message,expected value,actual value)
        assertEquals(failMessage, 4.9090, calc.division(10.8, 2.2),.0001);
    }
}

