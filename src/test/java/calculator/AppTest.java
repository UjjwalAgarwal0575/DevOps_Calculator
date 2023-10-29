package calculator;
// import calculator.App;


import org.junit.Test;
import org.junit.Assert;
// import org.junit.Before;
/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    
    App cal = new App();
    @Test
    public void testAddPositive() {
        App cal = new App();
        double a = 2;
        double b = 3;
        double expectedResult = 5;
        double result = cal.add(a, b);
        Assert.assertEquals(expectedResult, result, 0.001); // Adding a delta for double comparison
    }

    @Test
    public void testAddNegative() {
        App cal = new App();
        double a = 1;
        double b = 2;
        double expectedResult = 0;
        double result = cal.add(a, b);
        Assert.assertNotEquals(expectedResult, result, 0.001); // Adding a delta for double comparison
    }
}
