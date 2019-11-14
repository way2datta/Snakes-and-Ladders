package snakes_and_ladders;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void should_add_two_numbers() {
        Assert.assertEquals(9, Calculator.add(4, 5));
    }
}
