import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotnull;
//import static org.junit.jupiter.api.Assertions.assertThrow;

public class ArithmeticCalculatorTest{

    @Test
    public void testThatGetAddition(){
    
        double first = 4;
        double second = 5;
        double expected = 9;
        double actual = ArithmeticCalculator.getAddition(first,second);
        assertEquals(actual,expected);
        }
     }
