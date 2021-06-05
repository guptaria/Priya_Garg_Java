import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
    private ConverterIf convSwitch = new ConverterIf();

    @Test
    public void shouldReturnNameOfTheMonthWithCorrespondingNumberInSwitch() {
        String failMessage = "Expected Converter to handle Month Number.";
//        assertEquals(message,expected value,actual value)
        assertEquals(failMessage, "January", convSwitch.convertMonth(1));
        assertEquals(failMessage, "February", convSwitch.convertMonth(2));
        assertEquals(failMessage, "March", convSwitch.convertMonth(3));
        assertEquals(failMessage, "April", convSwitch.convertMonth(4));
        assertEquals(failMessage, "May", convSwitch.convertMonth(5));
        assertEquals(failMessage, "June", convSwitch.convertMonth(6));
        assertEquals(failMessage, "July", convSwitch.convertMonth(7));
        assertEquals(failMessage, "August", convSwitch.convertMonth(8));
        assertEquals(failMessage, "September", convSwitch.convertMonth(9));
        assertEquals(failMessage, "October", convSwitch.convertMonth(10));
        assertEquals(failMessage, "November", convSwitch.convertMonth(11));
        assertEquals(failMessage, "December", convSwitch.convertMonth(12));
    }

    @Test
    public void shouldReturnNameOfTheDayWithCorrespondingNumber() {
        String failMessage = "Expected Converter to handle WK DAY Number.";
//        assertEquals(message,expected value,actual value)
        assertEquals(failMessage, "Monday", convSwitch.convertDay(1));
        assertEquals(failMessage, "Tuesday", convSwitch.convertDay(2));
        assertEquals(failMessage, "Wednesday", convSwitch.convertDay(3));
        assertEquals(failMessage, "Thursday", convSwitch.convertDay(4));
        assertEquals(failMessage, "Friday", convSwitch.convertDay(5));
        assertEquals(failMessage, "Saturday", convSwitch.convertDay(6));
        assertEquals(failMessage, "Sunday", convSwitch.convertDay(7));

    }
}


