package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTemperatureTest {
    static QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    /*
    as math student i need to equate temperature in FAHRENHEIT andd CELSIOUS
     */
    /*
    0 celsious = 0 celsious
     */
    @Test
    public void given0celsiousAnd0cesious_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 0.0);
        double value2 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
    0 celsious != 1 celsious
     */
    @Test
    public void given0celsiousAnd1cesious_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 0.0);
        double value2 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
   1 celsious = 1 celsious
    */
    @Test
    public void given1celsiousAnd1cesious_ShouldReturnEqual() {
        double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 1.0);
        double value2 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /*
  0 celsious != 0 FAHRENHEIT
   */
    @Test
    public void given0celsiousAnd1faherenheit_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 0.0);
        double value2 = quantityMeasurement.unitConversion(TemperatureUnits.FAHRENHEIT, 0.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /*
 100 celsious == 212 FAHRENHEIT
  */
    @Test
    public void given100celsiousAnd212faherenheit_ShouldReturnNotEqual() {
        double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 100.0);
        double value2 = quantityMeasurement.unitConversion(TemperatureUnits.FAHRENHEIT, 212.0);
        Assert.assertEquals(value1, value2, 0.0);
    }
}
