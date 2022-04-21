package quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityTest {

    private QuantityMeasurement quantityMeasurement;

    @Before
    public void init() {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET, 0.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullFeetValue_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 0.0);
        Assert.assertNotNull(value1);
    }

    @Test
    public void givenReferenceObject_WhenSame_ShouldReturnTrue() {
        Assert.assertSame(quantityMeasurement, quantityMeasurement);
    }

    @Test
    public void givenReferenceObject_WhenNotSame_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertNotSame(quantityMeasurement1, quantityMeasurement);
    }

    @Test
    public void giveSameTypesOfObjects_shouldReturnEqual() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement1, quantityMeasurement1);
    }

    @Test
    public void giveDifferentTypesOfObjects_shouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        QuantityTest quantityTest = new QuantityTest();
        Assert.assertNotEquals(quantityMeasurement1, quantityTest);
    }

    @Test
    public void givenSameValuesInDifferentObjects_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 0.0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        double value2 = quantityMeasurement1.unitConversion(Units.FEET, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenDifferentValuesInDifferentObjects_shouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 0.0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        double value2 = quantityMeasurement1.unitConversion(Units.FEET, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
    check for 0 inch and 0 inch
     */
    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
    0 inch and 1 inch not equal
     */
    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
    comparing the object with null
     */
    @Test
    public void givenInchObjectWhenComparedWithNullValue_shouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        Assert.assertNotNull(quantityMeasurement);
    }

    /*
    reference check
     */
    @Test
    public void givenInchReferenceObject_WhenSame_ShouldReturnTrue() {
        Assert.assertSame(quantityMeasurement, quantityMeasurement);
    }

    @Test
    public void givenInchReferenceObject_WhenNotSame_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertNotSame(quantityMeasurement1, quantityMeasurement);
    }

    /*
    type check for two objects
     */
    @Test
    public void givenTwoTypesOfObject_WhenNotEqual_ShouldReturnTrue() {
        QuantityTest quantityTest = new QuantityTest();
        Assert.assertNotEquals(quantityTest, quantityMeasurement);
    }

    /*
    value  equality check
     */
    @Test
    public void givenTwoSameValuesOfDifferentObjects_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        double value2 = new QuantityMeasurement().unitConversion(Units.INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwoDifferentValuesOfDifferentObjects_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        double value2 = new QuantityMeasurement().unitConversion(Units.INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
    after refactor cheching 0feet and 0inch equality
     */
    @Test
    public void given0Feetand0Inch_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test//0feet and 1 inch equality check
    public void given0Feetand1Inch_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test//1 feet and 0 inch equality check
    public void given1Feetand0Inch_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
    TC1.14 1ft!=1In
     */
    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
    TC1.14 1ft==12in
     */
    @Test
    public void given1Feetand12Inch_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 12.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
    as a math student i wish to compare lenghts 3ft ==1yd;
     */
    //0yd==0yd
    @Test
    public void given0yardand0yard_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test//0yd and 1yd
    public void given0yardand1yard_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
    3ft==1yd
     */
    @Test
    public void given3ftand1yd_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 3.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
    1 ft != 1 yd
     */
    @Test
    public void given1ftand1yd_shouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
    1 in != 1 yd
     */
    @Test
    public void given1inand1yd_shouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
    1 yd = 36 in
     */
    @Test
    public void given1ydand36in_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 36.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
    36 in = 1 yd
     */
    @Test
    public void given36inand1yd_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 36.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
         1 yd = 3 ft
     */
    @Test
    public void given1ydand3ft_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET, 3.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
    As a math student i wish to compare lengths 2 in ==5cm
     */
    /*
        0cm == 0cm
     */
    @Test
    public void given0cmAnd0cm_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.CM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
        0cm != 1cm
     */
    @Test
    public void given0cmAnd1cm_shouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.CM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
    check for null
     */
    @Test
    public void givenNullCm_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.CM, null);
        } catch (NullPointerException e) {
            Assert.assertEquals("Cannot invoke \"java.lang.Double.doubleValue()\" because \"value\" is null", e.getMessage());
        }
    }

    /*
        1in !=1cm
     */
    @Test
    public void given1inAnd1cm_shouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
        1ft !=1cm
     */
    @Test
    public void given1ftAnd1cm_shouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
        1yd !=1cm
     */
    @Test
    public void given1ydAnd1cm_shouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
        2in ==5cm
     */
    @Test
    public void given2inAnd5cm_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM, 5.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
        2feet ==60cm
     */
    @Test
    public void given2feetAnd60cm_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM, 60.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
        2yard ==180cm
     */
    @Test
    public void given2yardAnd180cm_shouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM, 180.0);
        Assert.assertEquals(value1, value2, 0.0);
    }
}
