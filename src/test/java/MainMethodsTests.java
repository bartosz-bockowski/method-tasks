import org.junit.Assert;
import org.junit.Test;
import pl.bartek.Main;

public class MainMethodsTests {

    @Test
    public void testGetBiggerDouble() {
        double result1 = Main.getBiggerDouble(4d, 9d);
        double result2 = Main.getBiggerDouble(3d, 3d);

        Assert.assertEquals(result1, 9d, 0.001f);
        Assert.assertEquals(result2, 0, 0.001f);
    }

    @Test
    public void testSumAndMultiply() {
        int result = Main.sumAndMultiply(3, 4, 2);

        Assert.assertEquals(result, 14);
    }

    @Test
    public void testIsEven() {
        boolean result1 = Main.isEven(6);
        boolean result2 = Main.isEven(5);

        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
    }

    @Test
    public void testSumWithCondition() {
        int result1 = Main.sumWithCondition(15, 30);
        int result2 = Main.sumWithCondition(28, 17);
        int result3 = Main.sumWithCondition(7, 30);

        Assert.assertEquals(result1, 19);
        Assert.assertEquals(result2, 19);
        Assert.assertEquals(result3, 37);
    }

    @Test
    public void testStringZAndY() {
        String result1 = Main.stringZAndY("zebra");
        String result2 = Main.stringZAndY("money");
        String result3 = Main.stringZAndY("zebry");

        Assert.assertEquals(result1, "zzz");
        Assert.assertEquals(result2, "yyy");
        Assert.assertEquals(result3, "zzyy");
    }

    @Test
    public void testContainsBad() {
        boolean result1 = Main.containsBad("badxxx");
        boolean result2 = Main.containsBad("xbadxx");
        boolean result3 = Main.containsBad("xxbadxxx");
        boolean result4 = Main.containsBad("xxxbadxx");

        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertTrue(result3);
        Assert.assertFalse(result4);
    }

    @Test
    public void testCountChar() {
        int result = Main.countChar("cadxjtgqxonvznx", 'x');

        Assert.assertEquals(result, 3);
    }

    @Test
    public void testGetFactorial() {
        int result1 = Main.getFactorial(6);
        int result2 = Main.getFactorial(0);
        int result3 = Main.getFactorial(1);

        Assert.assertEquals(result1, 720);
        Assert.assertEquals(result2, 0);
        Assert.assertEquals(result3, 1);
    }

    @Test
    public void testUnitsGreaterThanTens() {
        boolean result1 = Main.unitsGreaterThanTens(83);
        boolean result2 = Main.unitsGreaterThanTens(3);
        boolean result3 = Main.unitsGreaterThanTens(39);

        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testPower() {
        float result1 = Main.power(2, -3);
        float result2 = Main.power(8, 4);
        float result3 = Main.power(300, 0);

        Assert.assertEquals(result1, 0.125, 0.0001);
        Assert.assertEquals(result2, 4096, 0.0001);
        Assert.assertEquals(result3, 1, 0.0001);
    }

    @Test
    public void testIsSquared() {
        boolean result1 = Main.isSquared(16);
        boolean result2 = Main.isSquared(64);
        boolean result3 = Main.isSquared(63);
        boolean result4 = Main.isSquared(65);
        boolean result5 = Main.isSquared(13);

        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
        Assert.assertFalse(result4);
        Assert.assertFalse(result5);
    }

}
