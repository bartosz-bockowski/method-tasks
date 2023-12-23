import org.junit.Assert;
import org.junit.Test;
import pl.bartek.Main;

public class MainMethodsTests {

    @Test
    public void testGetBiggerDouble() {
        Assert.assertEquals(Main.getBiggerDouble(4d, 9d), 9d, 0.001f);
        Assert.assertEquals(Main.getBiggerDouble(3d, 3d), 0, 0.001f);
    }

    @Test
    public void testSumAndMultiply() {
        Assert.assertEquals(Main.sumAndMultiply(3, 4, 2), 14);
    }

    @Test
    public void testIsEven() {
        Assert.assertTrue(Main.isEven(6));
        Assert.assertFalse(Main.isEven(5));
    }

    @Test
    public void testSumWithCondition() {
        Assert.assertEquals(Main.sumWithCondition(15, 30), 19);
        Assert.assertEquals(Main.sumWithCondition(28, 17), 19);
        Assert.assertEquals(Main.sumWithCondition(7, 30), 37);
    }

    @Test
    public void testStringZAndY() {
        Assert.assertEquals(Main.stringZAndY("zebra"), "zzz");
        Assert.assertEquals(Main.stringZAndY("money"), "yyy");
        Assert.assertEquals(Main.stringZAndY("zebry"), "zzyy");
    }

    @Test
    public void testContainsBad() {
        Assert.assertTrue(Main.containsBad("badxxx"));
        Assert.assertTrue(Main.containsBad("xbadxx"));
        Assert.assertTrue(Main.containsBad("xxbadxxx"));
        Assert.assertFalse(Main.containsBad("xxxbadxx"));
    }

    @Test
    public void testCountChar() {
        Assert.assertEquals(Main.countChar("cadxjtgqxonvznx", 'x'), 3);
    }

    @Test
    public void testGetFactorial() {
        Assert.assertEquals(Main.getFactorial(6), 720);
        Assert.assertEquals(Main.getFactorial(0), 0);
        Assert.assertEquals(Main.getFactorial(1), 1);
    }

    @Test
    public void testUnitsGreaterThanTens() {
        Assert.assertTrue(Main.unitsGreaterThanTens(83));
        Assert.assertTrue(Main.unitsGreaterThanTens(3));
        Assert.assertFalse(Main.unitsGreaterThanTens(39));
    }

    @Test
    public void testPower() {
        Assert.assertEquals(Main.power(2, -3), 0.125, 0.0001);
        Assert.assertEquals(Main.power(8, 4), 4096, 0.0001);
        Assert.assertEquals(Main.power(300, 0), 1, 0.0001);
    }

    @Test
    public void testIsSquared() {
        Assert.assertTrue(Main.isSquared(16));
        Assert.assertTrue(Main.isSquared(64));
        Assert.assertFalse(Main.isSquared(63));
        Assert.assertFalse(Main.isSquared(65));
        Assert.assertFalse(Main.isSquared(13));
    }
    
}
