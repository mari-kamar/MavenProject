import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void sillyTest() {
        System.out.println("hahaha");
        Calculator calc = new Calculator();
        assertEquals(calc.sum(1,1), 2);

    }
}
